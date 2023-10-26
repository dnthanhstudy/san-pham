package com.laptrinhjavaweb.service;

import com.laptrinhjavaweb.dto.SanPhamDTO;

import java.util.Map;

public interface ISanPhamService {

	SanPhamDTO save(SanPhamDTO sanPhamDTO);
	
	SanPhamDTO findBySlug(String slug);

	Map<String, Object> pageAble(Integer page, Integer limit);
}
