package Collection;

import java.util.ArrayList;

public class Alist2 {
	public static void main(String[] args) {
		 ArrayList<String> names=new ArrayList<>();
		 names.add("Sindhu");
		 names.add("balaji");
		 names.add("shiva");
		 names.add("ari");
		 names.add("arun");
		 names.remove(4);
		 names.set(3,"kavin");
		
		 
		 //for(String x:names) {
			 //System.out.println(x);
		 //names.forEach(x-> System.out.println(x));
		
		 names.forEach(x-> {if(x.startsWith("S")) {
			 System.out.println(x);
		 }
		 else {
			 System.out.println("INVALID");
		 }
		 }	
	
	  )	;
	}
}