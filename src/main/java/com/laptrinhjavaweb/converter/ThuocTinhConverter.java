package com.laptrinhjavaweb.converter;

import com.laptrinhjavaweb.dto.GiaTriThuocTinhDTO;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.laptrinhjavaweb.dto.ThuocTinhDTO;
import com.laptrinhjavaweb.entity.SanPhamEntity;
import com.laptrinhjavaweb.entity.ThuocTinhEntity;
import com.laptrinhjavaweb.repository.SanPhamRepository;

@Component
public class ThuocTinhConverter {

	@Autowired
    private ModelMapper modelMapper;
	
	@Autowired
	private SanPhamRepository sanPhamRepository;
	
	public ThuocTinhEntity convertToEntity(ThuocTinhDTO dto) {
		ThuocTinhEntity entity = modelMapper.map(dto, ThuocTinhEntity.class);
		SanPhamEntity sanPhamEntity = sanPhamRepository.findById(dto.getSanphamid()).get();
		entity.setSanphams(sanPhamEntity);
		return entity;
	}

	public GiaTriThuocTinhDTO convertToGiaTriThuocTinhDTo(ThuocTinhDTO dto){
		GiaTriThuocTinhDTO giaTriThuocTinhDTO = modelMapper.map(dto, GiaTriThuocTinhDTO.class);
		return giaTriThuocTinhDTO;
	}
}
