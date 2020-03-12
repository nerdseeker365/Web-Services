package in.nit.model;

public class Product {
private int pid;
private String pcode;
private double pcost;
public int getPid() {
	return pid;
}
public String getPcode() {
	return pcode;
}
public double getPcost() {
	return pcost;
}
public void setPid(int pid) {
	this.pid = pid;
}
public void setPcode(String pcode) {
	this.pcode = pcode;
}
public void setPcost(double pcost) {
	this.pcost = pcost;
}
@Override
public String toString() {
	return "Product [pid=" + pid + ", pcode=" + pcode + ", pcost=" + pcost + "]";
}


}
