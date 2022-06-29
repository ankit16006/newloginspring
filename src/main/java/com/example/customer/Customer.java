package com.example.customer;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@Entity
@Table(name="akashuser")


public class Customer { 
    
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	 private int customer_id;
	
	@Column(name="cust_name")
	 private String  cust_name;
	
	@Column(name="app_id")
	 private String  app_id;
	
	@Column(name="completed_date")
	 private String  completed_date;
	
	@Column(name="city")
	 private String  city;
	
	@Column(name="loan_product")
	 private String  loan_product;
	
	@Column(name="beaure_score")
	 private double  beaure_score;
	
	@Column(name="user_stage")
	 private String  user_stage;
	
	@Column(name="loan_offered")
	 private double  loan_offered;
	

	public Customer() {
		super();
	}


	public Customer(int customer_id, String cust_name, String app_id, String completed_date, String city, String loan_product,
			double beaure_score, String user_stage, double loan_offered) {
		super();
		this.customer_id = customer_id;
		this.cust_name = cust_name;
		this.app_id = app_id;
		this.completed_date = completed_date;
		this.city = city;
		this.loan_product = loan_product;
		this.beaure_score = beaure_score;
		this.user_stage = user_stage;
		this.loan_offered = loan_offered;
	}
	

	public int getCustomer_id() {
		return customer_id;
	}

	public void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
	}

	public String getCust_name() {
		return cust_name;
	}

	public void setCust_name(String cust_name) {
		this.cust_name = cust_name;
	}

	public String getApp_id() {
		return app_id;
	}

	public void setApp_id(String app_id) {
		this.app_id = app_id;
	}
	
	public String getCompleted_date() {
		return completed_date;
	}

	public void setCompleted_date(String completed_date) {
		this.completed_date = completed_date;
	}
	
	

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getLoan_product() {
		return loan_product;
	}

	public void setLoan_product(String loan_product) {
		this.loan_product = loan_product;
	}

	public double getBeaure_score() {
		return beaure_score;
	}

	public void setBeaure_score(double beaure_score) {
		this.beaure_score = beaure_score;
	}

	public String getUser_stage() {
		return user_stage;
	}

	public void setUser_stage(String user_stage) {
		this.user_stage = user_stage;
	}

	public double getLoan_offered() {
		return loan_offered;
	}

	public void setLoan_offered(double loan_offered) {
		this.loan_offered = loan_offered;
	}
	
//	@Column(name="user")
//	 private String  user;
	 
	 
	
	 
	
}
