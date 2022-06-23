package com.nt.model;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Customer {

	private Integer cno;
	private String cname;
	private Double billAmt;
	// array data sending as Json format data to client
	private String[] favColor;

	// List data sending as Json format data to client
	private List<String> studies;

	// Set collection data sending as Json format data to client
	private Set<Long> phNo;

	// Map data sending as Json format data Key :Value format to client
	private Map<String, Object> idDetails;

	// HAS-A property
	private Company company;

	public Customer() {
		// TODO Auto-generated constructor stub
	}

	public Customer(Integer cno, String cname, Double billAmt) {
		super();
		this.cno = cno;
		this.cname = cname;
		this.billAmt = billAmt;
	}

	public Customer(Integer cno, String cname, Double billAmt, String[] favColor, List<String> studies, Set<Long> phNo,
			Map<String, Object> idDetails, Company company) {
		super();
		this.cno = cno;
		this.cname = cname;
		this.billAmt = billAmt;
		this.favColor = favColor;
		this.studies = studies;
		this.phNo = phNo;
		this.idDetails = idDetails;
		this.company = company;
	}

	public Integer getCno() {
		return cno;
	}

	public void setCno(Integer cno) {
		this.cno = cno;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public Double getBillAmt() {
		return billAmt;
	}

	public void setBillAmt(Double billAmt) {
		this.billAmt = billAmt;
	}

	public String[] getFavColor() {
		return favColor;
	}

	public void setFavColor(String[] favColor) {
		this.favColor = favColor;
	}

	public List<String> getStudies() {
		return studies;
	}

	public void setStudies(List<String> studies) {
		this.studies = studies;
	}

	public Set<Long> getPhNo() {
		return phNo;
	}

	public void setPhNo(Set<Long> phNo) {
		this.phNo = phNo;
	}

	public Map<String, Object> getIdDetails() {
		return idDetails;
	}

	public void setIdDetails(Map<String, Object> idDetails) {
		this.idDetails = idDetails;
	}

	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

	@Override
	public String toString() {
		return "Customer [cno=" + cno + ", cname=" + cname + ", billAmt=" + billAmt + ", favColor="
				+ Arrays.toString(favColor) + ", studies=" + studies + ", phNo=" + phNo + ", idDetails=" + idDetails
				+ ", company=" + company + "]";
	}

}
