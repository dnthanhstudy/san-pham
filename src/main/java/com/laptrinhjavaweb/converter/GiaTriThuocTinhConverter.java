package com.laptrinhjavaweb.converter;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.laptrinhjavaweb.dto.GiaTriThuocTinhDTO;
import com.laptrinhjavaweb.entity.GiaTriThuocTinhEntity;
import com.laptrinhjavaweb.entity.SanPhamEntity;
import com.laptrinhjavaweb.entity.ThuocTinhEntity;
import com.laptrinhjavaweb.repository.SanPhamRepository;
import com.laptrinhjavaweb.repository.ThuocTinhRepository;

@Component
public class GiaTriThuocTinhConverter {

	@Autowired
    private ModelMapper modelMapper;
	
	@Autowired
	private SanPhamRepository sanPhamRepository;
	
	@Autowired
	private ThuocTinhRepository thuocTinhRepository;
	
	public GiaTriThuocTinhEntity convertToEntity(GiaTriThuocTinhDTO dto) {
		GiaTriThuocTinhEntity entity = modelMapper.map(dto, GiaTriThuocTinhEntity.class);
		SanPhamEntity sanPhamEntity = sanPhamRepository.findById(dto.getSanphamid()).get();
		ThuocTinhEntity thuocTinhEntity = thuocTinhRepository.findById(dto.getThuoctinhid()).get();
		entity.setSanphams(sanPhamEntity);
		entity.setThuoctinhs(thuocTinhEntity);
		return entity;
	}
}
