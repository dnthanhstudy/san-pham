package com.laptrinhjavaweb.entity;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "giatrithuoctinhbienthe")

public class GiaTriThuocTinhBienTheEntity extends BaseEntity{
	
	@ManyToOne
    @JoinColumn(name = "bientheid")
    private BienTheEntity bienthes;
	
	@ManyToOne
    @JoinColumn(name = "giatrithuoctinhid")
    private GiaTriThuocTinhEntity giatrithuoctinhs;

	public BienTheEntity getBienthes() {
		return bienthes;
	}

	public void setBienthes(BienTheEntity bienthes) {
		this.bienthes = bienthes;
	}

	public GiaTriThuocTinhEntity getGiatrithuoctinhs() {
		return giatrithuoctinhs;
	}

	public void setGiatrithuoctinhs(GiaTriThuocTinhEntity giatrithuoctinhs) {
		this.giatrithuoctinhs = giatrithuoctinhs;
	}
}
