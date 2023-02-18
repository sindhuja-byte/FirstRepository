package Collection;

import java.util.ArrayList;

public class AList {
 public static void main(String[] args) {
	 ArrayList<Integer> ages=new ArrayList<>();
	 ages.add(28);
	 ages.add(27);
	 ages.add(27);
	 ages.add(29);
	 ages.add(22);
	 ages.add(25);
	 ages.add(25);
	 ages.add(26);
	 ages.add(24);
	 ages.add(26);
	 ages.remove(7);
	 ages.set(2,50);
	 
	 for(int i=0; i<ages.size(); i++) {
		 System.out.println(ages.get(i));
	 
	 }
 }
}
