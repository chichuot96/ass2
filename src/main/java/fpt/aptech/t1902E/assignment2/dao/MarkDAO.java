package fpt.aptech.t1902E.assignment2.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import fpt.aptech.t1902E.assignment2.entity.StudentMark;

public class MarkDAO {
	public static void insert(StudentMark sm,Connection con) {
		String sql="insert into student_mark (student_id,subject_id,semester_id,mark) values (?,?,?,?)";
		try {
			PreparedStatement stmt=con.prepareStatement(sql);
			stmt.setInt(1, sm.getStudentId());
			stmt.setInt(2, sm.getSubjectId());
			stmt.setInt(3, sm.getSemesterId());
			stmt.setInt(4, sm.getMark());
			stmt.execute();
			System.out.println("insert sucess");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("insert failed");
		}
	}
}
