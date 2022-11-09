package com.examplesDemoProjectEntity;

import java.io.Serializable;

public class Student implements Serializable{

	private static final long serialVersionUID = 1L;

	private Integer sId;
	private String sName;
	private String sCity;
	private String sGmail;
	private String sDistrict;
	public Integer getsId() {
		return sId;
	}
	public void setsId(Integer sId) {
		this.sId = sId;
	}
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	public String getsCity() {
		return sCity;
	}
	public void setsCity(String sCity) {
		this.sCity = sCity;
	}
	public String getsGmail() {
		return sGmail;
	}
	public void setsGmail(String sGmail) {
		this.sGmail = sGmail;
	}
	public String getsDistrict() {
		return sDistrict;
	}
	public void setsDistrict(String sDistrict) {
		this.sDistrict = sDistrict;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "Student [sId=" + sId + ", sName=" + sName + ", sCity=" + sCity + ", sGmail=" + sGmail + ", sDistrict="
				+ sDistrict + "]";
	}
	public Student(Integer sId, String sName, String sCity, String sGmail, String sDistrict) {
		super();
		this.sId = sId;
		this.sName = sName;
		this.sCity = sCity;
		this.sGmail = sGmail;
		this.sDistrict = sDistrict;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
     
}