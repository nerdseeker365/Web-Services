package in.nit.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import com.fasterxml.jackson.databind.ObjectMapper;

import in.nit.model.Product;

public class Test {

	public static void main(String[] args) {
		try {
			//JDK 1.7 type Inference
			Map<String,String> map=new HashMap<>();
			map.put("M1","RED");
			map.put("M2","Blue");
			map.put("M3","Orange");
			
			Properties p=new Properties();
			p.put("v1","3.2");
			p.put("ReL","Aug2020");
			
			Product pob=new Product();
			pob.setPid(89);
			pob.setPcode("abc");
			pob.setModels(map);
			pob.setInfo(p);
			
			ObjectMapper om=new ObjectMapper();
			String json=om.writeValueAsString(pob);
			System.out.println(json);
			
		} catch (Exception e) {
		e.printStackTrace();
		}

	}

}
