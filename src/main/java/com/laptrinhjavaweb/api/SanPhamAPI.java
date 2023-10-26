package com.laptrinhjavaweb.api;

import com.laptrinhjavaweb.dto.SanPhamDTO;
import com.laptrinhjavaweb.exception.DataAlreadyExistException;
import com.laptrinhjavaweb.exception.EntityNotFoundException;
import com.laptrinhjavaweb.service.ISanPhamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/sanphams")
public class SanPhamAPI {
	
	@Autowired
	private ISanPhamService sanPhamService;

	@PostMapping
	public ResponseEntity<?> createdSanPham(@RequestBody SanPhamDTO sanPhamDTO){
		SanPhamDTO newSanPhamDTO = sanPhamService.save(sanPhamDTO);
		if(newSanPhamDTO == null){
			throw new DataAlreadyExistException("Slug này đã tồn tại. Xin kiểm tra lại!");
		}
		return new ResponseEntity<>(newSanPhamDTO, HttpStatus.CREATED);
	}
	
	@GetMapping("/{slug}")
	public ResponseEntity<?> findBySlug(@PathVariable("slug") String slug){
		SanPhamDTO results = sanPhamService.findBySlug(slug);
		if(results == null){
			throw new EntityNotFoundException();
		}
		return new ResponseEntity<>(results, HttpStatus.OK);
	}

	@GetMapping
	public ResponseEntity<?> pagination(@RequestParam(name = "page", required = false, defaultValue = "1") Integer page,
										@RequestParam(name = "limit", required = false, defaultValue = "2") Integer limit
										){
		Map<String, Object> results = sanPhamService.pageAble(page, limit);
		return new ResponseEntity<>(results, HttpStatus.OK);
	}

}
