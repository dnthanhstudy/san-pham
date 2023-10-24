package com.laptrinhjavaweb.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.laptrinhjavaweb.dto.BienTheDTO;
import com.laptrinhjavaweb.service.IBienTheService;

@RestController
@RequestMapping("/api/bienthes")
public class BienTheAPI {
	
	@Autowired
	private IBienTheService bienTheService;

	@PostMapping
	public ResponseEntity<?> createdSanPham(@RequestBody List<BienTheDTO> bienThesDTO){
		List<BienTheDTO> results = bienTheService.save(bienThesDTO);
		return new ResponseEntity<>(results, HttpStatus.CREATED);
	}
}
