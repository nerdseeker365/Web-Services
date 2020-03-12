package in.nit.test;

import java.util.List;
import java.util.Set;

import com.fasterxml.jackson.databind.ObjectMapper;

import in.nit.model.Student;

public class ObjectToJsonConversionTest {

	public static void main(String[] args) {
		try {
			Student s=new Student();
			s.setStdId(777);
			s.setStdname("sankar");
			s.setStdFee(88777.77);
			
			/*
			 * //JDK1.7-type interface for collection
			 *  List<Integer> list=new ArrayList<>();
			 * list.add(80); 
			 * list.add(90); 
			 * list.add(99); 
			 * list.add(98); 
			 * s.setMarks(list);
			 */
			
			/*//JDk1.2 Arrays ,List
			List<Integer> list=Arrays.asList(98,90,66,45);
			s.setMarks(list);*/
			
			//JDK9 Factory Collections
			//or Immutable Collections
			List<Integer> list=List.of(77,87,90,97);
			s.setMarks(list);
			
			//JDK9
			Set<String> subjects=Set.of("Eng","Mat","Sci","Soc");
			s.setSubJects(subjects);
			
			s.setGrades(new String[] {"A","B","C","D" });
		
			ObjectMapper om=new ObjectMapper();
			String json=om.writeValueAsString(s);
			System.out.println(json);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
