package com.laptrinhjavaweb.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.laptrinhjavaweb.dto.GiaTriThuocTinhDTO;
import com.laptrinhjavaweb.service.IGiaTriThuocTinhService;

@RestController
@RequestMapping("/api/giatrithuoctinhs")
public class GiaTriThuocTinhAPI {
	
	@Autowired
	private IGiaTriThuocTinhService giaTriThuocTinhService;

	@PostMapping
	public ResponseEntity<?> createdGiaTriThuocTinh(@RequestBody GiaTriThuocTinhDTO giaTriThuocTinhDTO){
		GiaTriThuocTinhDTO result = giaTriThuocTinhService.save(giaTriThuocTinhDTO);
		return new ResponseEntity<>(result, HttpStatus.CREATED);
	}
}
