package Collection;

import java.util.ArrayList;

public class UseBike {
	public static void main(String[] args) {
		
	
		Bike b1=new Bike("SUZUKI",70000,"BLACK",true);
		Bike b2=new Bike("Maruti",40000,"Brown",false);
		Bike b3=new Bike("KIA",30000,"BLACK",true);
		Bike b4=new Bike("AUDI",20000,"white",false);
		Bike b5=new Bike("MEMO",10000,"Yellow",true);
		
		ArrayList<Bike> bikes=new ArrayList<>();
		bikes.add(b1);
		bikes.add(b2);
		bikes.add(b3);
		bikes.add(b4);
		bikes.add(b5);
		//for(Bike x:bikes) {
			//System.out.println(x);
			//System.out.println(x.getBrand());
		//}
		
		 bikes.forEach(x-> {if(x.getPrice()>50000) {
			 System.out.println(x.getPrice()+(x.getPrice()*5)/100);
		 }
		 else {
			 System.out.println("NETPRICE= "+x.getPrice());
		 }
		 }	
	
	  )	;
	}
}

class Bike {
	private String brand;
	private int price;
	private String color;
	private boolean isAutomatic;
	
	public Bike(String brand,int price,String color,boolean isAutomatic) {
		this.brand=brand;		
		this.price=price;
		this.color=color;
		this.isAutomatic=isAutomatic;
		
	}
	
	public void setBrand(String brand) {
		this.brand=brand;
	}
	public String getBrand() {
		return brand;
	}
	public void setPrice(int price) {
		this.price=price;
	}
	public int getPrice() {
		return price;
	}

	public void setColor(String color) {
		this.color=color;
	}
	
	public String getColor() {
		return color;
	}
	public void setIsAutomatic(Boolean isAutomatic) {
		this.isAutomatic= isAutomatic;
	}
	
	public Boolean getIsAutomatic() {
		return isAutomatic;
	}
	public String toString() {
		return brand+" "+price+" "+color+" "+isAutomatic;
	}
}
