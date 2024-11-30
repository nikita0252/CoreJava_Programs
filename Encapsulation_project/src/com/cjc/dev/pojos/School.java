package com.cjc.dev.pojos;

public class School {
	private String scname;
	private boolean scstatus;
	private String scaddr;
	private Teacher th;
	public String getScname() {
		return scname;
	}
	public void setScname(String scname) {
		this.scname = scname;
	}
	public boolean isScstatus() {
		return scstatus;
	}
	public void setScstatus(boolean scstatus) {
		this.scstatus = scstatus;
	}
	public String getScaddr() {
		return scaddr;
	}
	public void setScaddr(String scaddr) {
		this.scaddr = scaddr;
	}
	public Teacher getTh() {
		return th;
	}
	public void setTh(Teacher th) {
		this.th = th;
	}

}
