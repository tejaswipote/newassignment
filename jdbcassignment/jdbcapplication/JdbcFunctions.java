package jdbcapplication;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JdbcFunctions {
	Connection con;

	public void connection() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		con = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/test?characterEncoding=latin1&useConfigs=maxPerformance", "root",
				"geek@Geek123");
	}

	public void addStudent(Student student) throws ClassNotFoundException, SQLException {
		connection();

		int id = student.getId();
		String name = student.getName();
		int age = student.getAge();
		int mobile = student.getMobile_number();
		String address = student.getAddress();
		PreparedStatement ps = con.prepareStatement("insert into student values(?,?,?,?,?)");

		ps.setInt(1, id);
		ps.setString(2, name);
		ps.setInt(3, age);
		ps.setInt(4, mobile);
		ps.setString(5, address);
		int i = ps.executeUpdate();
		if (i > 0)
			System.out.println("You are successfully registered...");

	}

	public void getAllStudent() throws ClassNotFoundException, SQLException {
		connection();

		PreparedStatement ps = con.prepareStatement("select * from student");

		ResultSet rs = ps.executeQuery();
		while (rs.next()) {
			Student s = new Student(rs.getInt("id"));

			s.setName(rs.getString("name"));
			s.setAge(rs.getInt("age"));
			s.setMobile_number(rs.getInt("mobile"));
			s.setAddress(rs.getString("address"));
			System.out.println(s.toString());
		}
	}

	public void searchByName(String sName) throws SQLException, ClassNotFoundException {
		connection();

		PreparedStatement ps = con.prepareStatement("select * from student where name=?");

		ps.setString(1, sName);
		ResultSet rs = ps.executeQuery();
		while (rs.next()) {
			Student s = new Student(rs.getInt("id"));
			s.setName(rs.getString("name"));
			s.setAge(rs.getInt("age"));
			s.setMobile_number(rs.getInt("mobile"));
			s.setAddress(rs.getString("address"));
			System.out.println(s.toString());
		}
	}

	public void updateByName(String oldname, String newname) throws SQLException, ClassNotFoundException {
		connection();

		PreparedStatement ps = con.prepareStatement("UPDATE student SET name = ?WHERE name=?");

		ps.setString(1, newname);
		ps.setString(2, oldname);
		int i = ps.executeUpdate();
		if (i > 0) {
			System.out.println("updated successfully");
		}

	}

	public void searchByAddress(String address) throws SQLException, ClassNotFoundException {
		connection();

		PreparedStatement ps = con.prepareStatement("select * from student where address=?");

		ps.setString(1, address);
		ResultSet rs = ps.executeQuery();
		while (rs.next()) {
			Student s = new Student(rs.getInt("id"));
			s.setName(rs.getString("name"));
			s.setAge(rs.getInt("age"));
			s.setMobile_number(rs.getInt("mobile"));
			s.setAddress(rs.getString("address"));
			System.out.println(s.toString());
		}

	}

	public void searchById(int id) throws SQLException, ClassNotFoundException {
		connection();

		PreparedStatement ps = con.prepareStatement("select * from student where id=?");

		ps.setInt(1, id);
		ResultSet rs = ps.executeQuery();
		while (rs.next()) {
			Student s = new Student(rs.getInt("id"));
			s.setName(rs.getString("name"));
			s.setAge(rs.getInt("age"));
			s.setMobile_number(rs.getInt("mobile"));
			s.setAddress(rs.getString("address"));
			System.out.println(s.toString());
		}
	}

	public void deleteAllStudent() throws ClassNotFoundException, SQLException {
		connection();

		PreparedStatement ps = con.prepareStatement("delete from student");

		int i = ps.executeUpdate();
		if (i > 0) {
			System.out.println("deleted successfully....");

		}
	}

	public void deleteById(int id) throws ClassNotFoundException, SQLException {
		connection();

		PreparedStatement ps = con.prepareStatement("delete from student where id=?");
		ps.setInt(1, id);
		int i = ps.executeUpdate();
		if (i > 0) {
			System.out.println("deleted 1 row  successfully....");

		}
	}

}
