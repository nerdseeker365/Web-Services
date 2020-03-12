package in.nit;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Test {

	public static void main(String[] args) {
		try {
			
			Address add=new Address();
			add.setHno("2-62");
			add.setLoc("Razole");
			
			Employee emp=new Employee();
			emp.setEid(123);
			emp.setEname("Sankar");
			emp.setAdd(add);
			
			ObjectMapper om=new ObjectMapper();
			String json=om.writeValueAsString(emp);
			System.out.println(json);
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
