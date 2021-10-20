package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import com.bean.Student;

@Repository  //this is Dao layer specific annotation
public class StudentDao {
// Using Data Source
//	@Autowired
//	DataSource ds; //before spring framework look up from application serverusing JDNI
//	public int storeStudentRecord(Student std) {
//		try{Connection con=ds.getConnection();
//		PreparedStatement pstmt=con.prepareStatement("insert into student values (?,?,?)");
//		pstmt.setInt(1, std.getId());
//		pstmt.setString(2, std.getName());
//		pstmt.setInt(3, std.getAge());
//		return pstmt.executeUpdate();
//		}catch( Exception e)
//		{
//			System.out.println(e);
//			return 0;
//		}
 @Autowired
JdbcTemplate jdbcTemplate;
 
 public int storeStudentRecord(Student std) {
	 try {
		//return jdbcTemplate .update("insert into student values (?,?,?)",new Object[] {std.setId(),std.setName(),std.setAge()});
		  return jdbcTemplate.update("insert into student values (?,?,?)",std.getId(),std.getName(),std.getAge());
	 }catch (Exception e)
	 {System.out.println(e); return 0;}
 } 
public List<Map<String,Object>>retrieveStudentInfo(){
	try {
		return jdbcTemplate.queryForList("select * from student");
	}catch (Exception e)
	{System.out.println(e); }
	return null;
}
}
