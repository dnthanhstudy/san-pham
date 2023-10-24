package com.laptrinhjavaweb.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.laptrinhjavaweb.dto.ThuocTinhDTO;
import com.laptrinhjavaweb.service.IThuocTinhService;

@RestController
@RequestMapping("/api/thuoctinhs")

public class ThuocTinhAPI {

	@Autowired
	private IThuocTinhService thuocTinhService;
	
	@PostMapping
	public ResponseEntity<?> createdThuocTinh(@RequestBody ThuocTinhDTO thuocTinhDTO){
		ThuocTinhDTO result = thuocTinhService.save(thuocTinhDTO);	
		return new ResponseEntity<>(result, HttpStatus.CREATED);
	}
}
