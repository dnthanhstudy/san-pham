package com.laptrinhjavaweb.service;

import com.laptrinhjavaweb.dto.ThuocTinhDTO;

import java.util.List;

public interface IThuocTinhService {

	List<ThuocTinhDTO> save(List<ThuocTinhDTO> thuocTinhsDTO);
}
