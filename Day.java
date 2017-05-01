public class Day {
    private String [] days = {"sunday","monday","tuesday","wednesday","thursday","friday","saturday"};
    private String day;

    public String getDay(){
        return this.day=day;
    }

    public void setDay(String day){
        this.day=day;
    }

    public String nextDay(String day ){
    	String nextDay="";
    	for(int i=0;i<day.length();i++){
    	if(day.equals(days[i])){
    		nextDay=days[((i+1)%7)];
    		break;
    	}
    	}
        return nextDay; 
    }
    
    public String PreviousDay(String day ){
    	String previousDay="";
    	for(int i=1;i<day.length();i++){
    	if(day.equals(days[i])){
    		previousDay=days[(i-1)];
    		break;
    	}
    	else if(day.equals(days[0])){
    		previousDay=days[6];
    		break;
    	}
    	}
        return previousDay; 
    }
    public String CalculateDay(String day, int num ){
    	String CalculateDay="";
    	for(int i=0;i<day.length();i++){
    	if(day.equals(days[i])){
    		CalculateDay=days[(i+num)%7];
    		break;
    	}
    	}
        return CalculateDay; 
    }

    public String toString() {
        return "the current day is"+this.day;
    }
}