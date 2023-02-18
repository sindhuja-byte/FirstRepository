package Collection;

import java.util.ArrayList;

public class UseCollege {
	public static void main(String[] args) {
      
		ArrayList<College> clg=new ArrayList<>();
		
		College c1=new College("Ram",15,"MATHS",true);
		College c2=new College("Ramu",16,"Science",true);
		College c3=new College("Raju",15,"English",true);
		College c4=new College("Anu",18,"MATHS",false);
		College c5=new College("ramya",15,"science",false);
		College c6=new College("Rani",15,"tamil",false);
		
		clg.add(c1);
		clg.add(c2);
		clg.add(c3);
		clg.add(c4);
		clg.add(c5);
		clg.add(c6);
		
		ArrayList<College> maleList=new ArrayList<>();	
//		
//		for(College c: clg) {
//			if(c.getIsMale()==true) {
//				maleList.add(c);
//			}
//		}
//		maleList.forEach(x->System.out.println(x));
		
	ArrayList<College> subList=new ArrayList<>();	
		
		for(College c: clg) {
			if(c.getSubject().equalsIgnoreCase("Science")) {
				subList.add(c);
			}
		}
		subList.forEach(x->System.out.println(x));
	}
}

class College {
	private String studentname;
	private int age;
	private String subject;
	private boolean isMale;
	
	public College(String studentname,int age,String subject,boolean isMale) {
		this.studentname= studentname;		
		this.age=age;
		this.subject= subject;
		this.isMale=isMale;
		
	}
	
	public void setStudentname(String studentname) {
		this.studentname=studentname;
	}
	public String getStudent() {
		return studentname;
	}
	public void setPrice(int age) {
		this.age=age;
	}
	public int getAge() {
		return age;
	}

	public void setSubject(String subject) {
		this.subject=subject;
	}
	
	public String getSubject() {
		return subject;
	}
	public void setIsMale(Boolean isMale) {
		this.isMale= isMale;
	}
	
	public Boolean getIsMale() {
		return isMale;
	}
	public String toString() {
		return studentname+" "+age+" "+subject+" "+isMale;
	}

}
