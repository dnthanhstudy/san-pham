package com.laptrinhjavaweb.dto;

public class GiaTriThuocTinhBienTheDTO extends AbstractDTO<GiaTriThuocTinhBienTheDTO> {
	
	private Long giatrithuoctinhid;
	
	private Long bientheid;

	public Long getGiatrithuoctinhid() {
		return giatrithuoctinhid;
	}

	public void setGiatrithuoctinhid(Long giatrithuoctinhid) {
		this.giatrithuoctinhid = giatrithuoctinhid;
	}

	public Long getBientheid() {
		return bientheid;
	}

	public void setBientheid(Long bientheid) {
		this.bientheid = bientheid;
	}
}
