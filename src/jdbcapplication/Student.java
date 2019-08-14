package jdbcapplication;

import java.util.Scanner;

public class Student {
	
	private int id;
	private String name;
	private int age;
	private int mobile_number;
	private String address;
	public Student() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter id of student");
		id=sc.nextInt();
		System.out.println("Enter name of student");
		name=sc.nextLine();
		name=sc.nextLine();
		System.out.println("Enter age of student");
		age=sc.nextInt();
		System.out.println("Enter Mobilenumber of student");
		mobile_number=sc.nextInt();
		System.out.println("Enter Address of student");
		address=sc.nextLine();
		address=sc.nextLine();
	}
	public Student(int id)
	{
		this.id=id;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getMobile_number() {
		return mobile_number;
	}
	public void setMobile_number(int mobile_number) {
		this.mobile_number = mobile_number;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + ", mobile_number=" + mobile_number +" address= "+ address+" ]";
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	
	

}
