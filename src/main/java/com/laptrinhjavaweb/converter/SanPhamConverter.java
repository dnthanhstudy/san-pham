package com.laptrinhjavaweb.converter;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.laptrinhjavaweb.dto.SanPhamDTO;
import com.laptrinhjavaweb.entity.DanhMucEntity;
import com.laptrinhjavaweb.entity.SanPhamEntity;
import com.laptrinhjavaweb.entity.ThuongHieuEntity;
import com.laptrinhjavaweb.repository.DanhMucRepository;
import com.laptrinhjavaweb.repository.ThuongHieuRepository;

@Component
public class SanPhamConverter {

	@Autowired
    private ModelMapper modelMapper;
	
	@Autowired
	private DanhMucRepository danhMucRepository;
	
	@Autowired
	private ThuongHieuRepository thuongHieuRepository;
	
	public SanPhamEntity convertToEntity(SanPhamDTO dto) {
		SanPhamEntity entity = modelMapper.map(dto, SanPhamEntity.class);
		DanhMucEntity danhMucEntity = danhMucRepository.findBySlug(dto.getDanhmucslug());
		ThuongHieuEntity thuongHieuEntity = thuongHieuRepository.findBySlug(dto.getThuonghieuslug());
		entity.setDanhmucs(danhMucEntity);
		entity.setThuonghieus(thuongHieuEntity);
		return entity;
	}
}
