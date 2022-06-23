package com.nt.model;

public class Company {

	private String name;
	private String add;
	private String type;
	private Integer size;

	public Company(String name, String type, Integer size, String add) {
		super();
		this.name = name;
		this.type = type;
		this.size = size;
		this.add = add;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAdd() {
		return add;
	}

	public void setAdd(String add) {
		this.add = add;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Integer getSize() {
		return size;
	}

	public void setSize(Integer size) {
		this.size = size;
	}

	@Override
	public String toString() {
		return "Company [name=" + name + ", add=" + add + ", type=" + type + ", size=" + size + "]";
	}

}
