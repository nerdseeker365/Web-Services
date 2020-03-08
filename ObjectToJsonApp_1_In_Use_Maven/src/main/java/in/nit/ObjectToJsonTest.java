package in.nit;

import com.fasterxml.jackson.databind.ObjectMapper;

import in.nit.model.Employee;

public class ObjectToJsonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			//1.Create Model Class Object
			Employee emp=new Employee();
			emp.setEid(1001);
			emp.setEname("Sankar");
			emp.setEsal(10000.889);
			//2.Create ObjectMapper Object
			ObjectMapper om=new ObjectMapper();
			//3.call WriteValueASString method
			String json=om.writeValueAsString(emp);
			//4.print json
			System.out.println(json);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
