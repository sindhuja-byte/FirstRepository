package Collection;

import java.util.ArrayList;

public class Datatypes {
	public static void main(String[]args) {
		ArrayList<Float> age=new ArrayList<>();
		age.add(2.0f);
		age.add(22.0f);
		age.add(20.0f);
		age.add(27.0f);
		age.add(9.0f);

		
		float a=0;
		for(Float x:age) {
			if(x%2==0) {
				a=a+x;
			}
		}
		System.out.println(a);
				
//	 float a=0;
//		for(int i=0;i<age.size();i++) {
//			if(age.get(i)%2==0) {
//				a=a+age.get(i);
//			}
			
		
//			System.out.println(a);
//		
		
	

}
}

