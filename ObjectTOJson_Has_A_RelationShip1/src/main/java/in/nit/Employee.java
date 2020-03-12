package in.nit;

public class Employee {
	private int eid;
	private String ename;
	private Address add;
	public int getEid() {
		return eid;
	}
	public String getEname() {
		return ename;
	}
	public Address getAdd() {
		return add;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public void setAdd(Address add) {
		this.add = add;
	}
	

}
