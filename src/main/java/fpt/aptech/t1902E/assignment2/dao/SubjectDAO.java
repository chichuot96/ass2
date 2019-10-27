package fpt.aptech.t1902E.assignment2.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import fpt.aptech.t1902E.assignment2.entity.Subject;

public class SubjectDAO {
	public static void insert(Subject sb,Connection con) {
		String sql="insert into subject (name) values (?)";
		try {
			PreparedStatement stmt=con.prepareStatement(sql);
			stmt.setString(1, sb.getName());
			stmt.execute();
			System.out.println("insert sucess");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("insert failed");
		}
	}
}
