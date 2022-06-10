import java.util.*;
public class Countries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String>country = new HashSet<String>();
		
		country.add("Philippines");
		country.add("Japan");
		country.add("United States of America");
		country.add("Ukraine");
		country.add("Russia");
		country.add("Greece");
		
		Iterator<String> it = country.iterator();
		while(it.hasNext()) {
			System.out.println(it.next()); 
		}

	}

}