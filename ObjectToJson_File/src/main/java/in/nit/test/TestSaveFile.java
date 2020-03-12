package in.nit.test;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;

import in.nit.model.Student;

public class TestSaveFile {

	public static void main(String[] args) {
		try {
			Student s=new Student();
			s.setSid(100);
			s.setSname("sankar");
			s.setCourse("cse");
			s.setSfee(400);
			ObjectMapper om=new ObjectMapper();
			File fob=new File("E:\\java\\Web_Services\\file.json");
		    om.writeValue(fob,s);
		    System.out.println("Done");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
