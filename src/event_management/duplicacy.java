package event_management;

import java.util.Map;

public class duplicacy {
	Map<Integer,User> maplist;
	duplicacy(Map<Integer,User> maplist){
		this.maplist=maplist;
	}
	int detect_duplicate(String username) { //detects duplicate username
		for (Map.Entry<Integer,User> expression : this.maplist.entrySet()) {
			if(expression.getValue().name==username) {
				return 1;
			}
		}
		return 0;
	}

}
