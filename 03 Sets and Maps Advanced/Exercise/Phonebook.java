import java.util.*; 
import java.util.Collections;

public class Phonebook {
    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);

    	Map<String, String> contacts = new LinkedHashMap<>();
    	
    	String input = scanner.nextLine();
    	while (!input.equals("search")) {
    	    String[] info = input.split("-");
    	    String name = info[0];
    	    String number = info[1];
    	    
    	    contacts.put(name, number);
    	    
    	    input = scanner.nextLine();
    	}
    	
    	String searchName = scanner.nextLine();
    	while (!searchName.equals("stop")) {
    	    
        	if (contacts.containsKey(searchName)) {
           	    System.out.printf("%s -> %s%n", searchName, contacts.get(searchName));
        	} else {
        	    System.out.printf("Contact %s does not exist.%n", searchName);
        	}
        	
        	searchName = scanner.nextLine();
    	}
    
    }
}