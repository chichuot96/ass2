package fpt.aptech.t1902E.assignment2;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.Scanner;

import fpt.aptech.t1902E.assignment2.connectDB.ConnectDB;
import fpt.aptech.t1902E.assignment2.dao.*;
import fpt.aptech.t1902E.assignment2.entity.*;

/**
 * Hello world!
 *
 */
public class App 
{	
	public static int showMenu(Scanner sc) {
		System.out.println("---- MENU ----");
		System.out.println("1.Add student");
		System.out.println("2.Add subject");
		System.out.println("3.Add class");
		System.out.println("4.Add semester");
		System.out.println("5.Add mark");
		System.out.println("6.Get all student");
		System.out.println("7.Get all mark of student");
		System.out.println("8.Find student");
		int ans=sc.nextInt();
		sc.nextLine();
		return ans;
	}
	public static boolean exit(Scanner sc) {
		System.out.println("Do you want to continue in menu");
		
		String a=sc.nextLine();
		boolean ans=false;
		if(a.equalsIgnoreCase("y")) {
			ans=true;
		}
		return ans;
	}
	public static void addStu(Scanner sc,Connection con) {
		System.out.println("Enter name");
		String name=sc.nextLine();
		System.out.println("Enter address");
		String address=sc.nextLine();
		System.out.println("Enter phone number");
		String phone=sc.nextLine();
		System.out.println("Enter year of birth");
		int year=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter class id");
		int classId=sc.nextInt();
		sc.nextLine();
		Student st=new Student(name,year,address,phone,classId);
		StudentDao.insert(st, con);
	}
	public static void addSubj(Scanner sc,Connection con) {
		System.out.println("Enter name");
		String name=sc.nextLine();
		SubjectDAO.insert(new Subject(name), con);
	}
	public static void addClas(Scanner sc,Connection con) {
		System.out.println("Enter name");
		String name=sc.nextLine();
		ClassDAO.insert(new ClassZ(name), con);
	}
	public static void addSem(Scanner sc,Connection con) {
		System.out.println("Enter name");
		String name=sc.nextLine();
		System.out.println("Enter year");
		int year=sc.nextInt();
		sc.nextLine();
		SemesterDAO.insert(new Semester(name,year), con);
	}
	public static void addMark(Scanner sc,Connection con) {
		System.out.println("Enter student id");
		int studentId=sc.nextInt();
		System.out.println("Enter subject id");
		int subjectId=sc.nextInt();
		System.out.println("Enter semester id");
		int semesterId=sc.nextInt();
		System.out.println("Enter mark");
		int mark=sc.nextInt();
		sc.nextLine();
		MarkDAO.insert(new StudentMark(studentId,subjectId,semesterId,mark), con);
		
	}
    public static void main( String[] args )
    {	Connection con=ConnectDB.getConnect();
        Scanner sc=new Scanner(System.in);
        boolean ans=true;
        while(ans) {
        	switch(showMenu(sc)) {
            case 1:{
            	addStu(sc,con);
            	ans=exit(sc);
            	break;
            }
            case 2:{
            	addSubj(sc,con);
            	ans=exit(sc);
            	break;
            }
            case 3:{
            	addClas(sc, con);
            	ans=exit(sc);
            	break;
            }
            case 4:{
            	addSem(sc, con);
            	ans=exit(sc);
            	break;
            }
            case 5:{
            	addMark(sc, con);
            	ans=exit(sc);
            	break;
            }
            case 6: {
            	ArrayList<Student> listS=StudentDao.getAll(con);
            	for(Student s: listS) {
            		System.out.println(s.toString());
            	}
            	ans=exit(sc);
            	break;
            }
            case 7:{
            	System.out.println("Enter student id");
            	int id=sc.nextInt();
            	sc.nextLine();
            	StudentDao.getInfomation(con, id);
            	ans=exit(sc);
            	break;
            }
            case 8:{
            	System.out.println("Enter student id");
            	int id=sc.nextInt();
            	sc.nextLine();
            	Student st=StudentDao.get(id, con);
            	System.out.println(st.toString());
            	ans=exit(sc);
            	break;
            }
            default: ans=exit(sc); break;
            }
        }
        
    }
}
