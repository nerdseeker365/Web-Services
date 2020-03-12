package in.nit.test;

import com.fasterxml.jackson.databind.ObjectMapper;

import in.nit.model.Product;

public class TestRead {

	public static void main(String[] args) {
		try {
			String json="{\"pid\":100,\"pcode\":\"7869\",\"pcost\":88.00}";
			//String json="{}";
			ObjectMapper om=new ObjectMapper();
			Product p=om.readValue(json,Product.class);
			System.out.println(p);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
