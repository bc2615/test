import java.util.*;
import java.text.*;
class MyGit {
	public static void myGit() {
    Date date = new Date();
	String your_name = "biqing";
    SimpleDateFormat dateFormatter = new SimpleDateFormat("MMMM d, yyyy");
    System.out.println("Date: " + dateFormatter.format(date));
    System.out.println(your_name);
    System.out.println("I love Cloud Computing");
	}

    
    public static void main(String[] args) {
        myGit();
    }
}