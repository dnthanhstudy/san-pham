package com.laptrinhjavaweb.dto;

public class DanhMucDTO extends AbstractDTO<DanhMucDTO>{

	private String slug;
	
	private String name;
	
	public String getSlug() {
		return slug;
	}

	public void setSlug(String slug) {
		this.slug = slug;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
