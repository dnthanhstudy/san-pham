package com.laptrinhjavaweb.service;

import java.util.List;

import com.laptrinhjavaweb.dto.BienTheDTO;

public interface IBienTheService {

	List<BienTheDTO> save(List<BienTheDTO> bienThesDTO);
	
	BienTheDTO findByGiaTriThuocTinh(List<Long> giaTriThuocTinhsId);
}
