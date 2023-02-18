package Collection;

import java.util.ArrayList;

public class UseObject {
	public static void main(String[]args) {
		Object o1=new Object("titan",4500,true,"silver",9.0f);
		Object o2=new Object("fasttrack",1500,false,"silver",7.0f);
		Object o3=new Object("rolex",3500,true,"silver",10.0f);
		ArrayList<Object> o=new ArrayList<>();
		o.add(o1);
		o.add(o2);
		o.add(o3);
		
	 //   int z=o1.getPrice();
		for(Object x:o) {
			if(x.getPrice()>o3.getPrice()) {
				System.out.println(x);
			}
		
		}
		
		
		
	}

}

class Object {
private	String brand;
private	int price;
private	boolean isAutomatic;
private	String color;
private	float rating;
	
	public Object(String brand,int price,boolean isAutomatic,String color,float rating) {
		this.brand=brand;
		this.price=price;
		this.isAutomatic=isAutomatic;
		this.color=color;
		this.rating=rating;
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
	public void setIsAutomatic(boolean isAutomatic) {
		this.isAutomatic=isAutomatic;
	}
	public boolean getIsAutomatic() {
		return isAutomatic;
	}
	public void setColor(String color) {
		this.color=color;
	}
	public String getColor() {
		return color;
	}
	public void setRating(int rating) {
		this.rating=rating;
	}
	public float getRating() {
		return rating;
	}
	public String toString() {
		return brand+price+isAutomatic+color+rating;
	}
	
}
