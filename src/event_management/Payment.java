package event_management;
public class Payment {
int venue_id;
int payment_id;
int user_id;
String method;
String card_num;
Book_venue book;
int final_price;
Payment(){
	
}
Payment(int vid,int uid,String method,String card_num,Book_venue book,int final_price){
	this.payment_id=(int)Math.random()*(99999-100+1)*100+1;
	this.user_id=uid;
	this.venue_id=vid;
	this.method=method;
	this.card_num=card_num;
	this.book=book;
	this.final_price=final_price;
	
}


void about() {
	System.out.println("Payment successful");
	System.out.println("Thanks for booking through our Application");
	System.out.println("Please visit again");
}
}
