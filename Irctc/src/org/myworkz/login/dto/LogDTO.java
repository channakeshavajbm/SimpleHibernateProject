package org.myworkz.login.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "login")
public class LogDTO implements Serializable {

	@Id
	@GenericGenerator(name = "login", strategy = "increment")
	@GeneratedValue(generator = "login")
	@Column(name = "L_id")
	private int id;
	@Column(name = "L_fname")
	private String fname;
	@Column(name = "L_lname")
	private String lname;
	@Column(name = "L_mobileNumer")
	private long mobeliNo;
	@Column(name = "L_email")
	private String email;
	@Column(name = "L_state")
	private String state;
	@Column(name = "L_nationality")
	private String nationality;
	@Column(name = "L_pincode")
	private int pincode;
	@Column(name = "L_gender")
	private String gender;

	public LogDTO() {
		// TODO Auto-generated constructor stub
		System.out.println("logDTO has created ......\t");
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public long getMobeliNo() {
		return mobeliNo;
	}

	public void setMobeliNo(long mobeliNo) {
		this.mobeliNo = mobeliNo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "LogDTO [id=" + id + ", fname=" + fname + ", lname=" + lname + ", mobeliNo=" + mobeliNo + ", email="
				+ email + ", state=" + state + ", nationality=" + nationality + ", pincode=" + pincode + ", gender="
				+ gender + "]";
	}

}
