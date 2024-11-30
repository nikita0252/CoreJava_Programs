package setter_getter_ex;

public class Patient {
private int id;
private String name;
private String address;
private long mob_no;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public long getMob_no() {
	return mob_no;
}
public void setMob_no(long mob_no) {
	this.mob_no = mob_no;
}
}
