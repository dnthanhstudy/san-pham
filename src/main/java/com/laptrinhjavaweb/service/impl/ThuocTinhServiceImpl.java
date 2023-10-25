package com.laptrinhjavaweb.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.laptrinhjavaweb.converter.ThuocTinhConverter;
import com.laptrinhjavaweb.dto.ThuocTinhDTO;
import com.laptrinhjavaweb.entity.ThuocTinhEntity;
import com.laptrinhjavaweb.repository.ThuocTinhRepository;
import com.laptrinhjavaweb.service.IThuocTinhService;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ThuocTinhServiceImpl implements IThuocTinhService {

	@Autowired
	private ThuocTinhRepository thuocTinhRepository;

	@Autowired
	private ThuocTinhConverter thuocTinhConvert;

	@Override
	@Transactional
	public List<ThuocTinhDTO> save(List<ThuocTinhDTO> thuocTinhsDTO) {
		List<ThuocTinhDTO> results = thuocTinhsDTO.stream().map(
				item -> {
						ThuocTinhEntity thuocTinhEntity = thuocTinhConvert.convertToEntity(item);
						thuocTinhRepository.save(thuocTinhEntity);
						item.setId(thuocTinhEntity.getId());
						return item;
				}
		).collect(Collectors.toList());

		return results;
	}

}
