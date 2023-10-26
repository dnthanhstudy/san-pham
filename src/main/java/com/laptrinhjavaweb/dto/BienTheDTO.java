package com.laptrinhjavaweb.dto;

import java.util.List;

public class BienTheDTO extends AbstractDTO<BienTheDTO>{

	private String ten;
	
	private Long sanphamid;
	
	private String gia;
	
	private String hinhanh;

	private String hinhanhbase64;

	private List<GiaTriThuocTinhBienTheDTO> listGiaTriThuocTinhBienThesDTO;

	public String getTen() {
		return ten;
	}

	public void setTen(String name) {
		this.ten = name;
	}

	public Long getSanphamid() {
		return sanphamid;
	}

	public void setSanphamid(Long sanphamid) {
		this.sanphamid = sanphamid;
	}

	public String getGia() {
		return gia;
	}

	public void setGia(String gia) {
		this.gia = gia;
	}

	public String getHinhanh() {
		return hinhanh;
	}

	public void setHinhanh(String hinhanh) {
		this.hinhanh = hinhanh;
	}

	public String getHinhanhbase64() {
		if (hinhanhbase64 != null) {
			return hinhanhbase64.split(",")[1];
		}
		return hinhanhbase64;
	}

	public void setHinhanhbase64(String hinhanhbase64) {
		this.hinhanhbase64 = hinhanhbase64;
	}

	public List<GiaTriThuocTinhBienTheDTO> getListGiaTriThuocTinhBienThesDTO() {
		return listGiaTriThuocTinhBienThesDTO;
	}

	public void setListGiaTriThuocTinhBienThesDTO(List<GiaTriThuocTinhBienTheDTO> listGiaTriThuocTinhBienThesDTO) {
		this.listGiaTriThuocTinhBienThesDTO = listGiaTriThuocTinhBienThesDTO;
	}
}
