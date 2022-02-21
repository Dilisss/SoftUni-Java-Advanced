import java.util.*; 

public class ParkingLot {
    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);
    	
    	Set<String> parkingLot = new LinkedHashSet<>();
    	
    	String input = scanner.nextLine();
    	while(!input.equals("END")) {
    	    String[] tokens = input.split(", ");
    	    String direction = tokens[0];
    	    String carsNumber = tokens[1];
    	    
    	    if (direction.equals("IN")) {
    	        parkingLot.add(carsNumber);
    	    } else if (direction.equals("OUT")) {
    	        parkingLot.remove(carsNumber);
    	    }
    	    
    	    input = scanner.nextLine();
    	}
    
    if (parkingLot.isEmpty()) {
        System.out.println("Parking Lot is Empty");
    }
    
    for (String s : parkingLot) {
        System.out.println(s);
    }

   }
}
