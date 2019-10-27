package fpt.aptech.t1902E.assignment2.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import fpt.aptech.t1902E.assignment2.entity.ClassZ;

public class ClassDAO {
	public static void insert(ClassZ cl,Connection con) {
		String sql="insert into class (name) values (?)";
		try {
			PreparedStatement stmt=con.prepareStatement(sql);
			stmt.setString(1, cl.getName());
			stmt.execute();
			System.out.println("insert sucess");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("insert failed");
		}
	}
}
