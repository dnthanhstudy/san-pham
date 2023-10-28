package com.laptrinhjavaweb.converter;

import com.laptrinhjavaweb.entity.SanPhamHinhAnhEntity;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.laptrinhjavaweb.dto.BienTheDTO;
import com.laptrinhjavaweb.dto.GiaTriThuocTinhBienTheDTO;
import com.laptrinhjavaweb.entity.BienTheEntity;
import com.laptrinhjavaweb.entity.SanPhamEntity;
import com.laptrinhjavaweb.repository.SanPhamRepository;

@Component
public class BienTheConverter {

	@Autowired
    private ModelMapper modelMapper;
	
	@Autowired
	private SanPhamRepository sanPhamRepository;

    @Autowired
    private GiaTriThuocTinhBienTheConverter giaTriThuocTinhBienTheConverter;

	public BienTheEntity convertToEntity(BienTheDTO dto) {
		BienTheEntity entity = modelMapper.map(dto, BienTheEntity.class);
		SanPhamEntity sanPhamEntity = sanPhamRepository.findById(dto.getSanphamid()).get();
		entity.setSanphams(sanPhamEntity);
		return entity;
	}
	
	public BienTheDTO convertToDTO(BienTheEntity entity) {
		BienTheDTO dto = modelMapper.map(entity, BienTheDTO.class);
		dto.setSanphamid(entity.getSanphams().getId());
		List<GiaTriThuocTinhBienTheDTO> listGiaTriBienTheThuocTinhsDTO = entity.getGiaTriThuocTinhBienTheEntities().stream().map(
                itemGiaTriBienThe -> giaTriThuocTinhBienTheConverter.convertToDTO(itemGiaTriBienThe)
        ).collect(Collectors.toList());
        dto.setListGiaTriThuocTinhBienThesDTO(listGiaTriBienTheThuocTinhsDTO);
		return dto;
	}

	public SanPhamHinhAnhEntity convertToSanPhamHinhAnhEntity(BienTheDTO dto){
		SanPhamHinhAnhEntity entity = modelMapper.map(dto, SanPhamHinhAnhEntity.class);
		SanPhamEntity sanPhamEntity = sanPhamRepository.findById(dto.getSanphamid()).get();
		entity.setSanphams(sanPhamEntity);
		return entity;
	}
}
