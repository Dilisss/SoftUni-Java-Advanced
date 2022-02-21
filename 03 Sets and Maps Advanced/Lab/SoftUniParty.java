import java.util.*; 

public class SoftUniParty {
    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);
    	
    	Set<String> reservations = new TreeSet<>();
    	
    	String reservation = scanner.nextLine();
    	
    	while (!reservation.equals("PARTY")) {
    	    int size = reservation.length();
    	    if (size == 8) {
        	reservations.add(reservation);
    	    }
   
    	    reservation = scanner.nextLine();
    	}
    	
    	String guests = scanner.nextLine();
    	while (!guests.equals("END")) {
            if (reservations.contains(guests)) {
                reservations.remove(guests);
            }
    	    
    	    guests = scanner.nextLine();
    	}
    	
    System.out.println(reservations.size());	
    for (String s : reservations) {
        System.out.println(s);
    }  	

    
    }
}
