package com.laptrinhjavaweb.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.laptrinhjavaweb.converter.GiaTriThuocTinhConverter;
import com.laptrinhjavaweb.dto.GiaTriThuocTinhDTO;
import com.laptrinhjavaweb.entity.GiaTriThuocTinhEntity;
import com.laptrinhjavaweb.repository.GiaTriThuocTinhRepository;
import com.laptrinhjavaweb.service.IGiaTriThuocTinhService;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class GiaTriThuocTinhServiceImpl implements IGiaTriThuocTinhService {

	@Autowired
	private GiaTriThuocTinhRepository giaTriThuocTinhRepository;

	@Autowired
	private GiaTriThuocTinhConverter giaTriThuocTinhConvert;

	@Override
	@Transactional
	public List<GiaTriThuocTinhDTO> save(List<GiaTriThuocTinhDTO> giaTriThuocTinhsDTO) {

		List<GiaTriThuocTinhDTO> results = giaTriThuocTinhsDTO.stream().map(
				item -> {
					GiaTriThuocTinhEntity giaTriThuocTinhEntity = giaTriThuocTinhConvert.convertToEntity(item);
					giaTriThuocTinhRepository.save(giaTriThuocTinhEntity);
					item.setId(giaTriThuocTinhEntity.getId());
					return item;
				}
		).collect(Collectors.toList());
		return results;
	}

}
