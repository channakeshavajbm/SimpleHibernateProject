package com.xworkz.irctc.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;


@Entity
@Table(name="traintable")
public class TrainDTO implements Serializable {

	@Id
	@GenericGenerator(name="xyz",strategy="increment")
	@GeneratedValue(generator="xyz")
	@Column(name="t_id")
	private int tid;
	@Column(name="t_name")
	private String tname;
	@Column(name="t_number")
	private int tnumber;
	@Column(name="no_coaches")
	private int noOfCoaches;
	@Column(name="t_type")
	private String type;

	public TrainDTO() {
		// TODO Auto-generated constructor stub
		System.out.println("traindto has created..\t");
	}

	public int getTid() {
		return tid;
	}

	public void setTid(int tid) {
		this.tid = tid;
	}

	public String getTname() {
		return tname;
	}

	public void setTname(String tname) {
		this.tname = tname;
	}

	public int getTnumber() {
		return tnumber;
	}

	public void setTnumber(int tnumber) {
		this.tnumber = tnumber;
	}

	public int getNoOfCoaches() {
		return noOfCoaches;
	}

	public void setNoOfCoaches(int noOfCoaches) {
		this.noOfCoaches = noOfCoaches;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "TrainDTO [tid=" + tid + ", tname=" + tname + ", tnumber=" + tnumber + ", noOfCoaches=" + noOfCoaches
				+ ", type=" + type + "]";
	}

}
