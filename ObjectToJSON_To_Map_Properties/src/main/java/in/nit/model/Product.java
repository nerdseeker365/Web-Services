package in.nit.model;

import java.util.Map;
import java.util.Properties;

public class Product {
private int pid;
private String pcode;
private Map<String,String> models;
private Properties info;
public int getPid() {
	return pid;
}
public String getPcode() {
	return pcode;
}
public Map<String, String> getModels() {
	return models;
}
public Properties getInfo() {
	return info;
}
public void setPid(int pid) {
	this.pid = pid;
}
public void setPcode(String pcode) {
	this.pcode = pcode;
}
public void setModels(Map<String, String> models) {
	this.models = models;
}
public void setInfo(Properties info) {
	this.info = info;
}

}
