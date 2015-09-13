package files;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class DummyDB {
	private int totalCountries;
	
//	String data2 = DummyDB1.give1();
//	System.out.println(data2+"--is data 2");
	
	//System.out.println("line 13");
	
	private String data = null;
	//System.out.println(data);
	private List<String> countries;
	
	
	
	
	public DummyDB() throws IOException {
		
System.out.println("inside method");
data = DummyDB1.give1();
System.out.println("data 2 is : "+data);
		
		countries = new ArrayList<String>();
		StringTokenizer st = new StringTokenizer(data, ",");
		
		while(st.hasMoreTokens()) {
			countries.add(st.nextToken().trim());
		}
		totalCountries = countries.size();
	}
	
	public List<String> getData(String query) {
		String country = null;
		query = query.toLowerCase();
		List<String> matched = new ArrayList<String>();
		for(int i=0; i<totalCountries; i++) {
			country = countries.get(i).toLowerCase();
			if(country.startsWith(query)) {
				matched.add(countries.get(i));
			}
		}
		return matched;
	}
}