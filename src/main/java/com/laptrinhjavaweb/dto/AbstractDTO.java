package com.laptrinhjavaweb.dto;

import java.util.Date;

public class AbstractDTO<T> {

	private Long id;
	
	private Date ngaytao;
	
	private String nguoitao;
	
	private Date ngaysua;
	
	private String nguoisua;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getNgaytao() {
		return ngaytao;
	}

	public void setNgaytao(Date ngaytao) {
		this.ngaytao = ngaytao;
	}

	public String getNguoitao() {
		return nguoitao;
	}

	public void setNguoitao(String nguoitao) {
		this.nguoitao = nguoitao;
	}

	public Date getNgaysua() {
		return ngaysua;
	}

	public void setNgaysua(Date ngaysua) {
		this.ngaysua = ngaysua;
	}

	public String getNguoisua() {
		return nguoisua;
	}

	public void setNguoisua(String nguoisua) {
		this.nguoisua = nguoisua;
	}
}
