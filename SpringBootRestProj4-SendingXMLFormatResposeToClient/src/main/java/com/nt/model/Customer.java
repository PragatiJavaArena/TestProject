package com.nt.model;

public class Customer {

	private Integer cno;
	private String cname;
	private String add;
	private Float billAmt;
	public Customer() {
		// TODO Auto-generated constructor stub
	}
	public Customer(Integer cno, String cname, String add, Float billAmt) {
		super();
		this.cno = cno;
		this.cname = cname;
		this.add = add;
		this.billAmt = billAmt;
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
	public String getAdd() {
		return add;
	}
	public void setAdd(String add) {
		this.add = add;
	}
	public Float getBillAmt() {
		return billAmt;
	}
	public void setBillAmt(Float billAmt) {
		this.billAmt = billAmt;
	}
	@Override
	public String toString() {
		return "Customer [cno=" + cno + ", cname=" + cname + ", add=" + add + ", billAmt=" + billAmt + "]";
	}
}
