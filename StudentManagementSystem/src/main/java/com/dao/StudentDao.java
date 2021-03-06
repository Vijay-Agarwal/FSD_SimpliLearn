package com.dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import com.bean.Student;
import com.resource.DbConnection;
public class StudentDao {
	Connection con;
	public StudentDao() {
		con  = DbConnection.getDbConnection();		// only one time connection get loaded...
	}
	public int storeStudentRecord(Student student) {
		try {
			PreparedStatement pstmt = con.prepareStatement("insert into student values(?,?,?)");
			pstmt.setInt(1,student.getSid());		
			pstmt.setString(2, student.getName());
			pstmt.setInt(3, student.getAge());
			int res = pstmt.executeUpdate();
			return res;			// return 1
		}catch (Exception e) {
			System.out.println(e);
			return 0;
		}
	}
	public List<Student> retrieveStudentRecord() {
		List<Student> listOfStd = new ArrayList<>();
		try {
			PreparedStatement pstmt = con.prepareStatement("select * from student");
			ResultSet rs = pstmt.executeQuery(); //return type is ResultSet
			while(rs.next()) {
				Student ss = new Student();
				ss.setId(rs.getInt(1));				// rs.getInt("id");
				ss.setName(rs.getString(2));
				ss.setAge(rs.getInt(3));
				listOfStd.add(ss);
			}
		}catch (Exception e) {
			System.out.println(e);
		}
		return listOfStd;
	}
	
	
}
