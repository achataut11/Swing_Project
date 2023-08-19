package com.service;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.db.DB;
import com.model.Student;


public class StudentServiceImpl implements StudentService {

	@Override
	public boolean addStudent(Student s) {
		String sql = "insert into student(fname,lname,email,college,faculty,rollno,age,country,city,state,phone,dob,gender)values(?,?,?,?,?,?,?,?,?,?,?,?,?)";
		try {
			PreparedStatement pstm = DB.getDbCon().prepareStatement(sql);
			pstm.setString(1, s.getFname());
			pstm.setString(2, s.getLname());
			pstm.setString(3, s.getEmail());
			pstm.setString(4, s.getCollege());
			pstm.setString(5, s.getFaculty());
			pstm.setInt(6, s.getRollno());
			pstm.setInt(7, s.getAge());
			pstm.setString(8, s.getCountry());
			pstm.setString(9, s.getCity());
			pstm.setString(10, s.getState());
			pstm.setString(11, s.getPhone());
			pstm.setString(12, s.getDob());
			pstm.setString(13, s.getGender());
			pstm.execute();
			return true;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return false;
	}

	@Override
	public boolean deleteStudent(int id) {
		String sql = "delete from student where id = "+id;
		Statement stm;
		try {
			stm = DB.getDbCon().createStatement();
			int res = stm.executeUpdate(sql);
			if(res !=0)
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return false;
	}

	@Override
	public boolean updateStudent(Student s) {
		String sql = "Update student set fname=?,lname=?,email=?,college=?,faculty=?,rollno=?,age=?,country=?,city=?,state=?,phone=?,dob=?,gender=? where id = ?";
		try {
			PreparedStatement pstm = DB.getDbCon().prepareStatement(sql);
			pstm.setString(1, s.getFname());
			pstm.setString(2, s.getLname());
			pstm.setString(3, s.getEmail());
			pstm.setString(4, s.getCollege());
			pstm.setString(5, s.getFaculty());
			pstm.setInt(6, s.getRollno());
			pstm.setInt(7, s.getAge());
			pstm.setString(8, s.getCountry());
			pstm.setString(9, s.getCity());
			pstm.setString(10, s.getState());
			pstm.setString(11, s.getPhone());
			pstm.setString(12, s.getDob());
			pstm.setString(13, s.getGender());
			pstm.setInt(14, s.getId());
			pstm.execute();
			return true;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return false;
	}

	@Override
	public Student getStudentById(int id) {
		Student s = new Student();
		String sql = "select * from student where id = "+id;
		try {
			Statement stm = DB.getDbCon().createStatement();
			ResultSet rs = stm.executeQuery(sql);
			
			if(rs.next()) {
				s.setId(rs.getInt("id"));
				s.setFname(rs.getString("fname"));
				s.setLname(rs.getString("lname"));
				s.setEmail(rs.getString("email"));
				s.setCollege(rs.getString("college"));
				s.setFaculty(rs.getString("faculty"));
				s.setRollno(rs.getInt("rollno"));
				s.setAge(rs.getInt("age"));
				s.setCountry(rs.getString("country"));
				s.setState(rs.getString("state"));
				s.setPhone(rs.getString("phone"));
				s.setDob(rs.getString("dob"));
				s.setGender(rs.getString("gender"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return s;
	}

	@Override
	public List<Student> getAllStudent() {
		List<Student> slist = new ArrayList<>();
		String sql = "select * from student ";
		try {
			Statement stm= DB.getDbCon().createStatement();
			ResultSet rs = stm.executeQuery(sql);
			while(rs.next()) {
				Student s= new Student();
				s.setId(rs.getInt("id"));
				s.setFname(rs.getString("fname"));
				s.setLname(rs.getString("lname"));
				s.setEmail(rs.getString("email"));
				s.setCollege(rs.getString("college"));
				s.setFaculty(rs.getString("faculty"));
				s.setRollno(rs.getInt("rollno"));
				s.setAge(rs.getInt("age"));
				s.setCountry(rs.getString("country"));
				s.setState(rs.getString("state"));
				s.setPhone(rs.getString("phone"));
				s.setDob(rs.getString("dob"));
				s.setGender(rs.getString("gender"));
				slist.add(s);
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return slist;
	}

	@Override
	public List<Student> searchStudent(String sdata) {
		List<Student> slist = new ArrayList<>();
		String sql = "select * from student where fname like '%"+sdata+"%' OR college like '%\"+sdata+\"%'";
		try {
			Statement stm= DB.getDbCon().createStatement();
			ResultSet rs = stm.executeQuery(sql);
			while(rs.next()) {
				Student s= new Student();
				s.setId(rs.getInt("id"));
				s.setFname(rs.getString("fname"));
				s.setLname(rs.getString("lname"));
				s.setEmail(rs.getString("email"));
				s.setCollege(rs.getString("college"));
				s.setFaculty(rs.getString("faculty"));
				s.setRollno(rs.getInt("rollno"));
				s.setAge(rs.getInt("age"));
				s.setCountry(rs.getString("country"));
				s.setState(rs.getString("state"));
				s.setPhone(rs.getString("phone"));
				s.setDob(rs.getString("dob"));
				s.setGender(rs.getString("gender"));
				slist.add(s);
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return slist;
	}

}
