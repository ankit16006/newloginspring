package com.example.login;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="login")
public class Login {
   
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name="email")
	private String email;
	
	@Column(name="pass")
	private String pass;
	
	
	
	public Login() {
		super();
	}




	public Login( String email, String pass) {
		super();

		this.email = email;
		this.pass = pass;
	}
	
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}




//	@Override
//	public String toString() {
//		return "Login [id=" + id + ", email=" + email + ", pass=" + pass + "]";
//	}

	
	
	
}
