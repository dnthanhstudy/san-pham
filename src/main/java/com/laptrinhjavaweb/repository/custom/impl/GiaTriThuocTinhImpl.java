package com.laptrinhjavaweb.repository.custom.impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Repository;

import com.laptrinhjavaweb.repository.custom.GiaTriThuocTinhBienTheCustomJDBC;
import com.laptrinhjavaweb.utils.ConnectionUtils;

@Repository
public class GiaTriThuocTinhImpl implements GiaTriThuocTinhBienTheCustomJDBC{

	
	@Override
	public Long findBienThe(List<Long> giaTriThuocTinhs) {
		Long bienTheId = null;
		String query = buildQuery(giaTriThuocTinhs);
		try (Connection conn = ConnectionUtils.getConection();
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery(query);) {
			while (rs.next()) {
				bienTheId = rs.getLong("bientheid");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return bienTheId;
	}
	
	private String buildQuery(List<Long> giaTriThuocTinhsId) {
		List<String> giaTriThuocTinhs = new ArrayList<>();
		for (Long item : giaTriThuocTinhsId) {
			giaTriThuocTinhs.add(String.valueOf(item));
		}
		String results = giaTriThuocTinhs.stream().map(item -> item).collect(Collectors.joining(" , ", "(", ")"));
		String query = "SELECT t1.bientheid " + 
				"FROM giatrithuoctinhbienthe AS t1 " + 
				"WHERE giatrithuoctinhid IN " + results + " AND " +
				" t1.bientheid IN (" + 
				" SELECT t2.bientheid " + 
				" FROM giatrithuoctinhbienthe AS t2 " + 
				" WHERE t2.giatrithuoctinhid IN " + results + " AND " + 
				" t2.bientheid = t1.bientheid AND " + 
				" t2.giatrithuoctinhid <> t1.giatrithuoctinhid " + 
				" )" + 
				" GROUP BY t1.bientheid" + 
				" HAVING COUNT(t1.bientheid) >= " + giaTriThuocTinhsId.size();
		return query;
	}

}
