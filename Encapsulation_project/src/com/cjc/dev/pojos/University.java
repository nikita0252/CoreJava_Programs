package com.cjc.dev.pojos;

public class University {
	private int uid;
	private boolean ustatus;
	private long uno;
	private String uaddr;
	private College clg;
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public boolean isUstatus() {
		return ustatus;
	}
	public void setUstatus(boolean ustatus) {
		this.ustatus = ustatus;
	}
	public long getUno() {
		return uno;
	}
	public void setUno(long uno) {
		this.uno = uno;
	}
	public String getUaddr() {
		return uaddr;
	}
	public void setUaddr(String uaddr) {
		this.uaddr = uaddr;
	}
	public College getClg() {
		return clg;
	}
	public void setClg(College clg) {
		this.clg = clg;
	}

}
