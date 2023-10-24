package com.laptrinhjavaweb.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.laptrinhjavaweb.converter.SanPhamConverter;
import com.laptrinhjavaweb.dto.SanPhamDTO;
import com.laptrinhjavaweb.entity.SanPhamEntity;
import com.laptrinhjavaweb.repository.SanPhamRepository;
import com.laptrinhjavaweb.service.ISanPhamService;

@Service
public class SanPhamServiceImpl implements ISanPhamService{
	
	@Autowired
	private SanPhamConverter sanPhamConvert;
	
	@Autowired
	private SanPhamRepository sanPhamRepository;

	@Override
	@Transactional
	public SanPhamDTO save(SanPhamDTO sanPhamDTO) {
		SanPhamEntity sanPhamEntity = sanPhamConvert.convertToEntity(sanPhamDTO);
		sanPhamRepository.save(sanPhamEntity);
		sanPhamDTO.setId(sanPhamEntity.getId());
		return sanPhamDTO;
	}

}
