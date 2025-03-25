package com.training.spring;

public class Department {
	
	private int deptId;
	private String deptName;
	private String deptCode;
	public int getDeptId() {
		return deptId;
	}
	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	public String getDeptCode() {
		return deptCode;
	}
	public void setDeptCode(String deptCode) {
		this.deptCode = deptCode;
	}
	
	public String getDeptDetails() {
		return this.deptCode + ":"+this.deptName;
	}

}
