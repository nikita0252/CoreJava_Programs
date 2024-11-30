package com.cjc.dev.pojos;

public class College {
	private boolean cstatus;
	private String cname;
	private long cno;
	private String caadr;
	private School sch;
	public boolean isCstatus() {
		return cstatus;
	}
	public void setCstatus(boolean cstatus) {
		this.cstatus = cstatus;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public long getCno() {
		return cno;
	}
	public void setCno(long cno) {
		this.cno = cno;
	}
	public String getCaadr() {
		return caadr;
	}
	public void setCaadr(String caadr) {
		this.caadr = caadr;
	}
	public School getSch() {
		return sch;
	}
	public void setSch(School sch) {
		this.sch = sch;
	}

}
