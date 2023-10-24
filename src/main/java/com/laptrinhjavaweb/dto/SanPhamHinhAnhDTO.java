package com.laptrinhjavaweb.dto;

public class SanPhamHinhAnhDTO extends AbstractDTO<SanPhamHinhAnhDTO>{
	
	private String hinhanh;
	
	private String hinhanhbase64;
	
	private Long sanphamid;

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

	public Long getSanphamid() {
		return sanphamid;
	}

	public void setSanphamid(Long sanphamid) {
		this.sanphamid = sanphamid;
	}
}
