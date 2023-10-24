package com.laptrinhjavaweb.service.impl;

import java.util.List;
import java.util.Random;

import com.laptrinhjavaweb.entity.SanPhamHinhAnhEntity;
import com.laptrinhjavaweb.repository.SanPhamHinhAnhRepository;
import com.laptrinhjavaweb.utils.UploadFileUtils;
import org.apache.commons.codec.binary.Base64;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.laptrinhjavaweb.converter.BienTheConverter;
import com.laptrinhjavaweb.dto.BienTheDTO;
import com.laptrinhjavaweb.entity.BienTheEntity;
import com.laptrinhjavaweb.repository.BienTheRepository;
import com.laptrinhjavaweb.service.IBienTheService;

@Service
public class BienTheServiceImpl implements IBienTheService{
	
	@Autowired
	private BienTheRepository bienTheRepository;
	
	@Autowired
	private BienTheConverter bienTheConverter;

	@Autowired
	private UploadFileUtils uploadFileUtils;

	@Autowired
	private SanPhamHinhAnhRepository sanPhamHinhAnhRepository;

	@Override
	@Transactional
	public List<BienTheDTO> save(List<BienTheDTO> bienThesDTO) {
		for (BienTheDTO bienTheDTO : bienThesDTO) {
			if(bienTheDTO.getHinhanhbase64() != null && bienTheDTO.getHinhanh() != null){
				bienTheDTO.setHinhanh(generateString());
				saveImage(bienTheDTO);
				SanPhamHinhAnhEntity sanPhamHinhAnhEntity = bienTheConverter.convertToSanPhamHinhAnhEntity(bienTheDTO);
				sanPhamHinhAnhRepository.save(sanPhamHinhAnhEntity);
			}

			BienTheEntity bienTheEntity = bienTheConverter.convertToEntity(bienTheDTO);
			bienTheRepository.save(bienTheEntity);
			bienTheDTO.setId(bienTheEntity.getId());
		}
		return bienThesDTO;
	}

	public void saveImage(BienTheDTO bienTheDTO) {
		String path = "F:/Workspace/DATN/spring-boot-web-fix-bug/src/main/webapp/assets/images/sanphams/" + bienTheDTO.getHinhanh();
		if (bienTheDTO.getHinhanhbase64() != null) {
			byte[] bytes = Base64.decodeBase64(bienTheDTO.getHinhanhbase64().getBytes());
			uploadFileUtils.writeOrUpdate(path, bytes);
		}
	}

	private String generateString() {
		String res = "";
		Random random = new Random();
		for (int i = 1; i < 11; ++i) {
			int randomNumber = random.nextInt(10) + 1;
			res += randomNumber;
		}
		res += ".jpg";
		return res;
	}

}
