package com.tutorialspoint;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.*;

//import com.sun.istack.internal.NotNull;

public class Student {
	
	
	//@org.jetbrains.annotations.NotNull
	@NotEmpty(message="Enter Name")
	private String name;
	//@Size(min=10,max=20,message="Enter Id in between 10 and 20")
	
	 @Min(18) @Max(100)
	private Integer id;
	 @Min(18)
	private Integer age;
	
	@Email(message="Enter Well formed email id")
	@NotEmpty(message="Enter Email id")
	private String Email;

	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	
}
