package com.laptrinhjavaweb.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "danhmuc")

public class DanhMucEntity extends BaseEntity {

	@Column(name = "slug", unique = true)
	private String slug;

	@Column(name = "ten")
	private String ten;

	@ManyToOne
	@JoinColumn(name = "danhmuccha")
	private DanhMucEntity danhmuccha;

	@OneToMany(mappedBy = "danhmuccha", fetch = FetchType.LAZY)
	private List<DanhMucEntity> danhmuccons = new ArrayList<>();
	
	@Column(name = "isshowhomepage")
    private Integer isshowhomepage;
	
	@OneToMany(mappedBy = "danhmucs", fetch = FetchType.LAZY)
    private List<SanPhamEntity> sanPhamEntities = new ArrayList<>();

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

	public DanhMucEntity getDanhmuccha() {
		return danhmuccha;
	}

	public void setDanhmuccha(DanhMucEntity danhmuccha) {
		this.danhmuccha = danhmuccha;
	}

	public List<DanhMucEntity> getDanhmuccons() {
		return danhmuccons;
	}

	public void setDanhmuccons(List<DanhMucEntity> danhmuccons) {
		this.danhmuccons = danhmuccons;
	}

	public Integer getIsshowhomepage() {
		return isshowhomepage;
	}

	public void setIsshowhomepage(Integer isshowhomepage) {
		this.isshowhomepage = isshowhomepage;
	}

	public List<SanPhamEntity> getSanPhamEntities() {
		return sanPhamEntities;
	}

	public void setSanPhamEntities(List<SanPhamEntity> sanPhamEntities) {
		this.sanPhamEntities = sanPhamEntities;
	}
}
