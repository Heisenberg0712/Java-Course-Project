package event_management;


public class Food {
	public
	int price;
	Food(){
		this.price=100;
	}
}
class Non_veg extends Food{
	public
	String food_name ;
	Non_veg(String fname,int price){
		this.food_name=fname;
		super.price=price;
	}
	
}
class Veg extends Food{
	public
	String food_name ;
	Veg(String fname,int price){
		this.food_name=fname;
		super.price=price;
	}
}
