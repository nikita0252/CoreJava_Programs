package Comparable_Ex;

public class CustomerTask1 implements Comparable<CustomerTask1>
{
	private int cid;
	private String cname;
	private long mobno;
	
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public long getMobno() {
		return mobno;
	}
	public void setMobno(long mobno) {
		this.mobno = mobno;
	}
	
	public int compareTo(CustomerTask1 c)
	{
		return this.cid-c.cid;
	}
	

}
