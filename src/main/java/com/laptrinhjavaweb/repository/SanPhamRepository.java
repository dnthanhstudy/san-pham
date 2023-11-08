package com.laptrinhjavaweb.repository;

import com.laptrinhjavaweb.entity.SanPhamEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SanPhamRepository extends JpaRepository<SanPhamEntity, Long>{

	SanPhamEntity findBySlug(String slug);
}
