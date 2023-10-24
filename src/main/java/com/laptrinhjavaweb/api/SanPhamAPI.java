package com.laptrinhjavaweb.api;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.laptrinhjavaweb.dto.BienTheDTO;
import com.laptrinhjavaweb.dto.SanPhamDTO;
import com.laptrinhjavaweb.dto.SanPhamHinhAnhDTO;
import com.laptrinhjavaweb.dto.ThuocTinhDTO;
import com.laptrinhjavaweb.service.ISanPhamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/sanphams")
public class SanPhamAPI {
	
	@Autowired
	private ISanPhamService sanPhamService;
	
//	@PostMapping
//	public ResponseEntity<?> createdSanPham(@RequestBody SanPhamDTO sanPhamDTO){
//		SanPhamDTO result = sanPhamService.save(sanPhamDTO);
//		return new ResponseEntity<>(result, HttpStatus.CREATED);
//	}

	@PostMapping
	public ResponseEntity<?> createdSanPham(@RequestBody Map<String, Object> params){
		ObjectMapper mapper = new ObjectMapper();
		params.forEach((key, value) -> {
			if(key.equals("sanpham")) {
				SanPhamDTO sanPhamDTO = mapper.convertValue(value, SanPhamDTO.class);
				System.out.println(sanPhamDTO);
			}else if(key.equals("sanphamhinhanh")) {

			}else if(key.equals("thuoctinh")) {
				Map<String, List<ThuocTinhDTO>> thuocTinhMap = null;
				try {
					thuocTinhMap = mapper.readValue(value.toString(), new TypeReference<Map<String, List<ThuocTinhDTO>>>() {});
				} catch (IOException e) {
					e.printStackTrace();
				}
				List<ThuocTinhDTO> thuocTinhList = thuocTinhMap.get("thuoctinh");
			}else if(key.equals("bienthe")) {
				//List<BienTheDTO> bienTheDTOS = Arrays.asList(mapper.convertValue(value, BienTheDTO.class));
				//System.out.println(bienTheDTOS);
			}
		});
		return null;
	}

}
