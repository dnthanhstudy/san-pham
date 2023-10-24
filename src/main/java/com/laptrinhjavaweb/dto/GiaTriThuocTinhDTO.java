package com.laptrinhjavaweb.dto;

import java.util.List;

public class GiaTriThuocTinhDTO extends AbstractDTO<GiaTriThuocTinhDTO> {

	private Long sanphamid;
	
	private Long thuoctinhid;
	
	private List<String> giatris;

	public Long getSanphamid() {
		return sanphamid;
	}

	public void setSanphamid(Long sanphamid) {
		this.sanphamid = sanphamid;
	}

	public Long getThuoctinhid() {
		return thuoctinhid;
	}

	public void setThuoctinhid(Long thuoctinhid) {
		this.thuoctinhid = thuoctinhid;
	}

	public List<String> getGiatris() {
		return giatris;
	}

	public void setGiatris(List<String> giatris) {
		this.giatris = giatris;
	}
}
