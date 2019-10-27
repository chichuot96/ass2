package fpt.aptech.t1902E.assignment2.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import fpt.aptech.t1902E.assignment2.entity.Semester;

public class SemesterDAO {
	public static void insert(Semester sm,Connection con) {
		String sql="insert into semester (name,year) values (?,?)";
		try {
			PreparedStatement stmt=con.prepareStatement(sql);
			stmt.setString(1, sm.getName());
			stmt.setInt(2, sm.getYear());
			stmt.execute();
			System.out.println("insert sucess");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("insert failed");
		}
	}
}
