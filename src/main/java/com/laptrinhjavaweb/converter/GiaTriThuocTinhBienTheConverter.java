package com.laptrinhjavaweb.converter;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.laptrinhjavaweb.dto.GiaTriThuocTinhBienTheDTO;
import com.laptrinhjavaweb.entity.BienTheEntity;
import com.laptrinhjavaweb.entity.GiaTriThuocTinhBienTheEntity;
import com.laptrinhjavaweb.entity.GiaTriThuocTinhEntity;
import com.laptrinhjavaweb.repository.BienTheRepository;
import com.laptrinhjavaweb.repository.GiaTriThuocTinhRepository;

@Component
public class GiaTriThuocTinhBienTheConverter {
	
	@Autowired
    private ModelMapper modelMapper;
	
	@Autowired
	private GiaTriThuocTinhRepository giaTriThuocTinhRepository;
	
	@Autowired
	private BienTheRepository bienTheRepository;
	
	public GiaTriThuocTinhBienTheEntity convertToEntity(GiaTriThuocTinhBienTheDTO dto) {
		GiaTriThuocTinhBienTheEntity entity = modelMapper.map(dto, GiaTriThuocTinhBienTheEntity.class);
		GiaTriThuocTinhEntity giaTriThuocTinhEntity = giaTriThuocTinhRepository.findById(dto.getGiatrithuoctinhid()).get();
		BienTheEntity bienTheEntity = bienTheRepository.findById(dto.getBientheid()).get();
		entity.setGiatrithuoctinhs(giaTriThuocTinhEntity);
		entity.setBienthes(bienTheEntity);
		return entity;
	}

	public GiaTriThuocTinhBienTheDTO convertToDTO(GiaTriThuocTinhBienTheEntity entity){
		GiaTriThuocTinhBienTheDTO dto = modelMapper.map(entity, GiaTriThuocTinhBienTheDTO.class);
		dto.setBientheid(entity.getBienthes().getId());
		dto.setGiatrithuoctinhid(entity.getGiatrithuoctinhs().getId());
		return dto;
	}

}
