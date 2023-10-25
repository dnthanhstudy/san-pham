package com.laptrinhjavaweb.converter;

import com.laptrinhjavaweb.dto.*;
import com.laptrinhjavaweb.repository.SanPhamRepository;
import com.laptrinhjavaweb.service.IBienTheService;
import com.laptrinhjavaweb.service.IGiaTriThuocTinhService;
import com.laptrinhjavaweb.service.ISanPhamHinhAnhService;
import com.laptrinhjavaweb.service.IThuocTinhService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.laptrinhjavaweb.entity.DanhMucEntity;
import com.laptrinhjavaweb.entity.SanPhamEntity;
import com.laptrinhjavaweb.entity.ThuongHieuEntity;
import com.laptrinhjavaweb.repository.DanhMucRepository;
import com.laptrinhjavaweb.repository.ThuongHieuRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class SanPhamConverter {

	@Autowired
    private ModelMapper modelMapper;
	
	@Autowired
	private DanhMucRepository danhMucRepository;
	
	@Autowired
	private ThuongHieuRepository thuongHieuRepository;

	@Autowired
	private ThuocTinhConverter thuocTinhConverter;

	@Autowired
	private SanPhamRepository sanPhamRepository;

	@Autowired
	private ISanPhamHinhAnhService sanPhamHinhAnhService;

	@Autowired
	private IThuocTinhService thuocTinhService;

	@Autowired
	private IBienTheService bienTheService;

	@Autowired
	private IGiaTriThuocTinhService giaTriThuocTinhService;
	
	public SanPhamEntity convertToEntity(SanPhamDTO dto) {
		SanPhamEntity entity = modelMapper.map(dto, SanPhamEntity.class);
		DanhMucEntity danhMucEntity = danhMucRepository.findBySlug(dto.getDanhmucslug());
		ThuongHieuEntity thuongHieuEntity = thuongHieuRepository.findBySlug(dto.getThuonghieuslug());
		entity.setDanhmucs(danhMucEntity);
		entity.setThuonghieus(thuongHieuEntity);
		return entity;
	}

}
