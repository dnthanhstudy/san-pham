package com.laptrinhjavaweb.dto;

public class ThuocTinhDTO extends AbstractDTO<ThuocTinhDTO> {

	private String slug;
	
	private String ten;
	
	private Long sanphamid;

	public String getSlug() {
		return slug;
	}

	public void setSlug(String slug) {
		this.slug = slug;
	}

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public Long getSanphamid() {
		return sanphamid;
	}

	public void setSanphamid(Long sanphamid) {
		this.sanphamid = sanphamid;
	}
}
