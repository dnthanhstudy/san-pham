package com.laptrinhjavaweb.service;

import java.util.List;

import com.laptrinhjavaweb.dto.SanPhamHinhAnhDTO;

public interface ISanPhamHinhAnhService {

	List<SanPhamHinhAnhDTO> save(List<SanPhamHinhAnhDTO> sanPhamHinhAnhsDTO);
}
