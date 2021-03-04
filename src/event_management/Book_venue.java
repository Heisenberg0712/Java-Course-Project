package event_management;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;  
public class Book_venue {
	
	int booking_id;
	int user_id;
	LocalDate date;
	LocalTime time;
	Venue selected_venue;
	int duration;
	User user;
	Book_venue(){
		
	}
	Book_venue(int bid,int uid,Venue ven,int dur,User user){
		this.booking_id=bid;
		this.user_id=uid;
		this.selected_venue=ven;
		this.duration=dur;
		this.date=java.time.LocalDate.now();
		this.time=java.time.LocalTime.now();
		this.user=user;
	}
	
	
	

}
