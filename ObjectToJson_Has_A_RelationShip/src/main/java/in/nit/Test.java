package in.nit;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Test {

	public static void main(String[] args) {
		try {


			Model m=new Model();
			m.setMid(100);
			m.setMcode("332200");

			Product p=new Product();
			p.setPid(200);
			p.setPname("Sankar");
			p.setMob(m);//Link

			ObjectMapper om=new ObjectMapper();
			String json=om.writeValueAsString(p);
			System.out.println(json);
		} 
		catch (Exception e) {
			e.printStackTrace();
		}

	}

}
