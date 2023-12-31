package com.laptrinhjavaweb.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.laptrinhjavaweb.converter.GiaTriThuocTinhConverter;
import com.laptrinhjavaweb.dto.GiaTriThuocTinhDTO;
import com.laptrinhjavaweb.entity.GiaTriThuocTinhEntity;
import com.laptrinhjavaweb.repository.GiaTriThuocTinhRepository;
import com.laptrinhjavaweb.service.IGiaTriThuocTinhService;

@Service
public class GiaTriThuocTinhServiceImpl implements IGiaTriThuocTinhService {

    @Autowired
    private GiaTriThuocTinhRepository giaTriThuocTinhRepository;

    @Autowired
    private GiaTriThuocTinhConverter giaTriThuocTinhConvert;

    @Override
    @Transactional
    public void save(GiaTriThuocTinhDTO giaTriThuocTinhDTO) {
        for (String giatri : giaTriThuocTinhDTO.getGiatris()) {
        	giaTriThuocTinhDTO.setGiatri(giatri);
        	GiaTriThuocTinhEntity giaTriThuocTinhEntity = giaTriThuocTinhConvert.convertToEntity(giaTriThuocTinhDTO);
            giaTriThuocTinhRepository.save(giaTriThuocTinhEntity);
        }

    }

}
