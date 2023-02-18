package Collection;

import java.util.ArrayList;

public class Pen {
	public static void main(String[] args) {
		
		 ArrayList<String> pens=new ArrayList<>();
		 pens.add("CELLO");
		 pens.add("HERO");
		 pens.add("PILOT");
		 pens.add("BALLPOINT");
		 pens.add("PENTONIC");
		 
		 String temp=" ";
		 for(int i=0; i<pens.size(); i++) {
			// System.out.println(pens.get(i));	
			 temp=temp+pens.get(i)+" ";
		
		 }
		 System.out.println(temp);	
	}
}
