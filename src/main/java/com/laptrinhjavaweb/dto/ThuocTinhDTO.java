package com.laptrinhjavaweb.dto;

import java.util.List;

public class ThuocTinhDTO extends AbstractDTO<ThuocTinhDTO> {

	private String slug;
	
	private String ten;
	
	private Long sanphamid;

	private List<String> giatris;

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

	public List<String> getGiatris() {
		return giatris;
	}

	public void setGiatris(List<String> giatris) {
		this.giatris = giatris;
	}
}
