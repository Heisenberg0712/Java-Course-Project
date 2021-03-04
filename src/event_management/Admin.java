package event_management;

import java.util.ArrayList;

public class Admin {
	
	 String name;
	 String mobile_num;
	 String email_id;
	//String address;
	ArrayList<Venue> venue_list = new ArrayList<Venue>();
	Admin(){
		
	}
	Admin(String name,String mobile_num,String email_id){
		this.name=name;
		this.mobile_num=mobile_num;
		this.email_id=email_id;
		//this.address=address;
		
	}
	void add_venue(Venue vp) {
		
		venue_list.add(vp);
	}
	void show_venue() {
		for(int i=0;i<this.venue_list.size();i++) {
			System.out.println(this.venue_list.get(i).name+" "+this.venue_list.get(i).contact_num);
		}
	}
	int remove(int vid) {
		for(int i=0;i<this.venue_list.size();i++) {
			if(venue_list.get(i).venue_id==vid) {
				venue_list.remove(i);
				return 1;
			}
		}
		return 0;
	}

}
