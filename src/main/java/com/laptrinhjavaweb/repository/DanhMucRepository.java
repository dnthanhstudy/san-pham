package com.laptrinhjavaweb.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.laptrinhjavaweb.entity.DanhMucEntity;

public interface DanhMucRepository extends JpaRepository<DanhMucEntity, Long>{
	
	DanhMucEntity findBySlug(String slug);

}
