package com.laptrinhjavaweb.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.laptrinhjavaweb.dto.SanPhamHinhAnhDTO;
import com.laptrinhjavaweb.service.ISanPhamHinhAnhService;

@RestController
@RequestMapping("/api/sanphamhinhanhs")

public class SanPhamHinhAnhAPI {

	@Autowired
	private ISanPhamHinhAnhService sanPhamHinhAnhService;

	@PostMapping
	public ResponseEntity<?> createdHinhAnh(@RequestBody List<SanPhamHinhAnhDTO> sanPhamHinhAnhsDTO) {
		List<SanPhamHinhAnhDTO> results = sanPhamHinhAnhService.save(sanPhamHinhAnhsDTO);
		return new ResponseEntity<>(results, HttpStatus.CREATED);
	}
}
