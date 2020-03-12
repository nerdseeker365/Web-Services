package in.nit.model;

public class Student {
private int sid;
private String sname;
private String course;
private double sfee;
public int getSid() {
	return sid;
}
public String getSname() {
	return sname;
}
public String getCourse() {
	return course;
}
public double getSfee() {
	return sfee;
}
public void setSid(int sid) {
	this.sid = sid;
}
public void setSname(String sname) {
	this.sname = sname;
}
public void setCourse(String course) {
	this.course = course;
}
public void setSfee(double sfee) {
	this.sfee = sfee;
}


}
