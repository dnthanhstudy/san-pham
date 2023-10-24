package com.laptrinhjavaweb.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.laptrinhjavaweb.entity.ThuongHieuEntity;

public interface ThuongHieuRepository extends JpaRepository<ThuongHieuEntity, Long>{
	
	ThuongHieuEntity findBySlug(String slug);

}
