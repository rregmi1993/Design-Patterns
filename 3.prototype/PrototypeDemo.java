package prototype;

import java.util.ArrayList;
import java.util.List;

public class PrototypeDemo  {
	
	public static void main(String[] args) {
		String sql = "SELECT * FROM movie WHERE title = ?";
		List<String> parameters = new ArrayList<String>();
		parameters.add("3 idiots");
		
		Records record = new Records();
		
		Statement firstStatement = new Statement(sql, parameters, record);
		System.out.println(firstStatement.getSql());
		System.out.println(firstStatement.getParameters());
		System.out.println(firstStatement.getRecord());
		
		Statement secondStatement = new Statement(sql, parameters, record);
		System.out.println(secondStatement.getSql());
		System.out.println(secondStatement.getParameters());
		System.out.println(secondStatement.getRecord());
		
		//this above example is shallow copy
	}

}
