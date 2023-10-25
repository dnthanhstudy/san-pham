package com.laptrinhjavaweb.api;

import com.laptrinhjavaweb.dto.SanPhamDTO;
import com.laptrinhjavaweb.service.ISanPhamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/sanphams")
public class SanPhamAPI {
	
	@Autowired
	private ISanPhamService sanPhamService;

	@PostMapping
	public ResponseEntity<?> createdSanPham(@RequestBody SanPhamDTO sanPhamDTO){
		SanPhamDTO newSanPhamDTO = sanPhamService.save(sanPhamDTO);
		return new ResponseEntity<>(newSanPhamDTO, HttpStatus.CREATED);
	}

}
