package event_management;



public class Venue {
	//public
	String name;
	int venue_id;
	String address;
	String contact_num;
	//boolean availability;
	Packages pack;
	boolean custom;
	int price;
	Venue(){
		
	}
	Venue(String name,int id,String address,String contact_num,Packages pack,boolean x){
		this.name=name;
		this.venue_id=id;
		this.address=address;
		this.contact_num=contact_num;
		//this.availability=ava;
		this.pack=pack;
		this.custom=x;
		this.price=10000;
		
	}
	/*void about() {
		System.out.println("Welcome to "+name+"\n");
		//System.out.println();
	}*/
	/*void choose_packages() {
		
	}*/
	/*void remove() {
		
	}*/
	
	
}
