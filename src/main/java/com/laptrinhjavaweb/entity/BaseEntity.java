package com.laptrinhjavaweb.entity;

import javax.persistence.*;
import java.util.Date;

@MappedSuperclass
public abstract class BaseEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "ngaytao", columnDefinition = "TIMESTAMP")
	private Date ngaytao;

	@Column(name = "nguoitao")
	private String nguoitao;

	@Column(name = "ngaysua", columnDefinition = "TIMESTAMP")
	private Date ngaysua;

	@Column(name = "nguoisua")
	private String nguoisua;

	@Column(name = "trangthai", columnDefinition = "INTEGER DEFAULT 1")
	private Integer trangthai;

	@Column(name = "ordering", columnDefinition = "INTEGER DEFAULT 1")
	private Integer ordering;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getCreateddate() {
		return ngaytao;
	}

	public void setCreateddate(Date createddate) {
		this.ngaytao = createddate;
	}

	public String getCreatedby() {
		return nguoitao;
	}

	public void setCreatedby(String createdby) {
		this.nguoitao = createdby;
	}

	public Date getModifieddate() {
		return ngaysua;
	}

	public void setModifieddate(Date modifieddate) {
		this.ngaysua = modifieddate;
	}

	public String getModifiedby() {
		return nguoisua;
	}

	public void setModifiedby(String modifiedby) {
		this.nguoisua = modifiedby;
	}

	public Integer getStatus() {
		return trangthai;
	}

	public void setStatus(Integer status) {
		this.trangthai = status;
	}

	public Integer getOrdering() {
		return ordering;
	}

	public void setOrdering(Integer ordering) {
		this.ordering = ordering;
	}
}
