package in.nit.model;

import java.util.List;
import java.util.Set;

public class Student {
	private int stdId;
	private String stdname;
	private double stdFee;
	private List<Integer> marks;
	private Set<String> subJects;
	private String grades[];
	
	
	public int getStdId() {
		return stdId;
	}
	public void setStdId(int stdId) {
		this.stdId = stdId;
	}
	
	public String getStdname() {
		return stdname;
	}
	public void setStdname(String stdname) {
		this.stdname = stdname;
	}
	public double getStdFee() {
		return stdFee;
	}
	public void setStdFee(double stdFee) {
		this.stdFee = stdFee;
	}
	public List<Integer> getMarks() {
		return marks;
	}
	public void setMarks(List<Integer> marks) {
		this.marks = marks;
	}
	public Set<String> getSubJects() {
		return subJects;
	}
	public void setSubJects(Set<String> subJects) {
		this.subJects = subJects;
	}
	public String[] getGrades() {
		return grades;
	}
	public void setGrades(String[] grades) {
		this.grades = grades;
	}



}
