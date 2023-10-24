package com.laptrinhjavaweb.converter;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.laptrinhjavaweb.dto.SanPhamHinhAnhDTO;
import com.laptrinhjavaweb.entity.SanPhamEntity;
import com.laptrinhjavaweb.entity.SanPhamHinhAnhEntity;
import com.laptrinhjavaweb.repository.SanPhamRepository;

@Component
public class SanPhamHinhAnhConverter {

	@Autowired
    private ModelMapper modelMapper;
	
	@Autowired
	private SanPhamRepository sanPhamRepository;
	
	public SanPhamHinhAnhEntity convertToEntity(SanPhamHinhAnhDTO dto) {
		SanPhamHinhAnhEntity entity = modelMapper.map(dto, SanPhamHinhAnhEntity.class);
		SanPhamEntity sanPhamEntity = sanPhamRepository.findById(dto.getSanphamid()).get();
		entity.setSanphams(sanPhamEntity);
		return entity;
	}
}
