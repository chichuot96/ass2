package fpt.aptech.t1902E.assignment2.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import fpt.aptech.t1902E.assignment2.entity.Student;

public class StudentDao{

	public static void insert(Student st,Connection con) {
		String sql="insert into student (name,address,phone,birth_year,class_id) values (?,?,?,?,?)";
		try {
			PreparedStatement stmt=con.prepareStatement(sql);
			stmt.setString(1, st.getName());
			stmt.setString(2, st.getAddress());
			stmt.setString(3, st.getPhoneNumber());
			stmt.setInt(4, st.getYearOfBirth());
			stmt.setInt(5, st.getClassId());
			stmt.execute();
			System.out.println("insert sucess");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("insert failed");
		}
	}

	public static ArrayList<Student> getAll(Connection con) {
		String sql="select * from student";
		ArrayList<Student> listS=new ArrayList<Student>();
		try {
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery(sql);
			while(rs.next()) {
				Student st=new Student(rs.getInt("id"),rs.getString("name"),rs.getInt("birth_year"),rs.getString("address"),rs.getString("phone"),rs.getInt("class_id"));
				listS.add(st);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return listS;
	}

	public static Student get(int id,Connection con) {
		// TODO Auto-generated method stub
		String sql="select * from student where id="+id;
		Student st=null;
		try {
			PreparedStatement stmt=con.prepareStatement(sql);
//			stmt.setInt(1, id);
			ResultSet rs=stmt.executeQuery(sql);
			while(rs.next()) {
				st=new Student(rs.getInt("id"),rs.getString("name"),rs.getInt("birth_year"),rs.getString("address"),rs.getString("phone"),rs.getInt("class_id"));
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return st;
	}
	public static void getInfomation(Connection con,int studentId) {
		String sql="select s.name as stName,su.name as suName,m.mark from "
				+ "student_mark as m "
				+ "join student as s on s.id=m.student_id"
				+ " join subject as su on m.subject_id=su.id"
				+ " where m.student_id="+studentId;
		try {
			PreparedStatement stmt=con.prepareStatement(sql);
//			stmt.setInt(1, studentId);
			ResultSet rs=stmt.executeQuery(sql);
			while(rs.next()) {
				System.out.println("Student "+ rs.getString("stName") +" : "+ rs.getString("suName")+" -- "+rs.getInt("mark"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
