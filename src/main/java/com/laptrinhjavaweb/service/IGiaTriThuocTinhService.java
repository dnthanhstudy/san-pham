package com.laptrinhjavaweb.service;

import com.laptrinhjavaweb.dto.GiaTriThuocTinhDTO;

import java.util.List;

public interface IGiaTriThuocTinhService {

	List<GiaTriThuocTinhDTO> save(List<GiaTriThuocTinhDTO> giaTriThuocTinhsDTO);
}
