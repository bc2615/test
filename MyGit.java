import java.util.*;
import java.text.*;
class MyGit {
	public static void myGit() {
		// today's date 
        Date date = new Date();
        SimpleDateFormat dateFormatter = new SimpleDateFormat("MMMM d, yyyy");
        System.out.println("Date: " + dateFormatter.format(date));
        // 20,000 days later
        Calendar calendar = new GregorianCalendar();
        calendar.add(Calendar.DATE, 20000);
        System.out.println("After 20,000 days: " + dateFormatter.format(calendar.getTime()));
        // your info
        System.out.println("biqing");
        System.out.println("I love Cloud Computing");
	}

    
    public static void main(String[] args) {
        myGit();
    }
}