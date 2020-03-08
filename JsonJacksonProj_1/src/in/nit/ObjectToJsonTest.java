package in.nit;

import org.codehaus.jackson.map.ObjectMapper;

import in.nit.model.Employee;

public class ObjectToJsonTest {

	public static void main(String[] args) {
		//1.Create Model class Object
		try {
		Employee emp=new Employee();
		emp.setEdi(100);
		emp.setEname("Sankar");
		emp.setEsal(68990.88);
		//2.Create ObjectMapper Object
		ObjectMapper om=new ObjectMapper();
		//3. call WriteValueAsString() method
		String json=om.writeValueAsString(emp);
		//4.print JSON
		System.out.println(json);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
