package com.laptrinhjavaweb.dto;

import java.util.LinkedHashMap;

public class SanPhamDTO extends AbstractDTO<SanPhamDTO>{

	private String slug;

	private String ten;

	private Double gia;

	private String chitietsanpham;

	private String motasanpham;
	
	private Integer isnew;

	private Integer ispopular;

	private Integer ismostviewed;

	private Integer isbestseller;
	
    private String danhmucslug;
	
    private String thuonghieuslug;
    
    private LinkedHashMap<String , Object> thuoctinh;
    
    private LinkedHashMap<String , Object> bienthe;

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

	public Double getGia() {
		return gia;
	}

	public void setGia(Double gia) {
		this.gia = gia;
	}

	public String getChitietsanpham() {
		return chitietsanpham;
	}

	public void setChitietsanpham(String chitietsanpham) {
		this.chitietsanpham = chitietsanpham;
	}

	public String getMotasanpham() {
		return motasanpham;
	}

	public void setMotasanpham(String motasanpham) {
		this.motasanpham = motasanpham;
	}

	public Integer getIsnew() {
		return isnew;
	}

	public void setIsnew(Integer isnew) {
		this.isnew = isnew;
	}

	public Integer getIspopular() {
		return ispopular;
	}

	public void setIspopular(Integer ispopular) {
		this.ispopular = ispopular;
	}

	public Integer getIsmostviewed() {
		return ismostviewed;
	}

	public void setIsmostviewed(Integer ismostviewed) {
		this.ismostviewed = ismostviewed;
	}

	public Integer getIsbestseller() {
		return isbestseller;
	}

	public void setIsbestseller(Integer isbestseller) {
		this.isbestseller = isbestseller;
	}

	public String getDanhmucslug() {
		return danhmucslug;
	}

	public void setDanhmucslug(String danhmucslug) {
		this.danhmucslug = danhmucslug;
	}

	public String getThuonghieuslug() {
		return thuonghieuslug;
	}

	public void setThuonghieuslug(String thuonghieuslug) {
		this.thuonghieuslug = thuonghieuslug;
	}

	public LinkedHashMap<String, Object> getThuoctinh() {
		return thuoctinh;
	}

	public void setThuoctinh(LinkedHashMap<String, Object> thuoctinh) {
		this.thuoctinh = thuoctinh;
	}

	public LinkedHashMap<String, Object> getBienthe() {
		return bienthe;
	}

	public void setBienthe(LinkedHashMap<String, Object> bienthe) {
		this.bienthe = bienthe;
	}
}
