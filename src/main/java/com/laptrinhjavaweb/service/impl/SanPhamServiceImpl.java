package com.laptrinhjavaweb.service.impl;

import com.laptrinhjavaweb.converter.ThuocTinhConverter;
import com.laptrinhjavaweb.dto.*;
import com.laptrinhjavaweb.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.laptrinhjavaweb.converter.SanPhamConverter;
import com.laptrinhjavaweb.entity.SanPhamEntity;
import com.laptrinhjavaweb.repository.SanPhamRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class SanPhamServiceImpl implements ISanPhamService{
	
	@Autowired
	private SanPhamConverter sanPhamConvert;

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


	@Override
	@Transactional
	public SanPhamDTO save(SanPhamDTO sanPhamDTO) {
		SanPhamEntity sanPhamEntity = sanPhamConvert.convertToEntity(sanPhamDTO);
		sanPhamRepository.save(sanPhamEntity);
		sanPhamDTO.setId(sanPhamEntity.getId());
		List<SanPhamHinhAnhDTO> newListSanPhamHinhAnh = sanPhamHinhAnhService.save(sanPhamDTO.getSanphamhinhanh());
		List<GiaTriThuocTinhDTO> listGiaTriThuocTinhDTO = new ArrayList<>();
		List<ThuocTinhDTO> listThuocTinhDTO = sanPhamDTO.getThuoctinh().stream().map(
				item -> {
					item.setSanphamid(sanPhamDTO.getId());
					GiaTriThuocTinhDTO giaTriThuocTinhDTO = thuocTinhConverter.convertToGiaTriThuocTinhDTo(item);
					giaTriThuocTinhDTO.setThuoctinhid(item.getId());
					listGiaTriThuocTinhDTO.add(giaTriThuocTinhDTO);
					return item;
				}).collect(Collectors.toList());

		List<BienTheDTO> listBienTheDTO = sanPhamDTO.getBienthe().stream().map(
				item -> {
					item.setSanphamid(sanPhamDTO.getId());
					return item;
				}).collect(Collectors.toList());

		List<ThuocTinhDTO> newListThuocTinhDTO = thuocTinhService.save(listThuocTinhDTO);
		List<GiaTriThuocTinhDTO> newListGiaTriThuocTinhDTO = giaTriThuocTinhService.save(listGiaTriThuocTinhDTO);
		List<BienTheDTO> newListBienTheDTO = bienTheService.save(listBienTheDTO);

		sanPhamDTO.setSanphamhinhanh(newListSanPhamHinhAnh);
		sanPhamDTO.setThuoctinh(newListThuocTinhDTO);
		sanPhamDTO.setBienthe(newListBienTheDTO);
		return sanPhamDTO;
	}

}
