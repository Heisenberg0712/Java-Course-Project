package event_management;

import java.util.ArrayList;

public class User {
	
	int user_id;
	String name;
	String mobile_num;
	String email_id;
	String address;
	
	ArrayList<Book_venue> booked = new ArrayList<Book_venue>();
	User(){
		
	}
	User(int uid,String name,String mob,String email,String address){
		this.user_id=uid;
		this.name=name;
		this.mobile_num=mob;
		this.email_id=email;
		this.address=address;
		//this.password=pass;
	}
	void add_venue(Book_venue vpn) {
		this.booked.add(vpn);
	}
	
}
