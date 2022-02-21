import java.util.*;
import java.util.List;
import java.util.stream.Collectors;

public class Voina {
    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);
  	    
  	    List<Integer> firstPlayerInput = Arrays.stream(scanner.nextLine().split(" "))
  	                                .map(Integer::parseInt)
  	                                .collect(Collectors.toList());
  	                                
  	    LinkedHashSet<Integer> firstPlayer = new LinkedHashSet<>(firstPlayerInput);
  	    firstPlayer.addAll(firstPlayerInput);
  	    
  	    List<Integer> secondPlayerInput = Arrays.stream(scanner.nextLine().split(" "))
  	                                .map(Integer::parseInt)
  	                                .collect(Collectors.toList());
  	                           
  	    LinkedHashSet<Integer> secondPlayer = new LinkedHashSet<>(secondPlayerInput);
  	    secondPlayer.addAll(secondPlayerInput);
  	    
  	    for (int round = 0; round < 50; round++) {
   	        if (firstPlayer.isEmpty()) {
  	            System.out.println("Second player win!");
  	            return;
  	        } 
  	        
  	        if (secondPlayer.isEmpty()) {
  	            System.out.println("First player win!");
  	            return;
  	        }
  	        
  	        Integer firstPlayerCard = getTopValue(firstPlayer);
  	        Integer secondPlayerCard = getTopValue(secondPlayer);
  	        
  	        firstPlayer.remove(firstPlayerCard);
  	        secondPlayer.remove(secondPlayerCard);
  	        
  	        if (firstPlayerCard > secondPlayerCard) {
  	            firstPlayer.add(firstPlayerCard);
  	            firstPlayer.add(secondPlayerCard);
  	        } else if (secondPlayerCard > firstPlayerCard) {
  	            secondPlayer.add(firstPlayerCard);
  	            secondPlayer.add(secondPlayerCard);
  	        } else {
  	            firstPlayer.add(firstPlayerCard);
  	            secondPlayer.add(secondPlayerCard);
  	        }
  	        
  	    }
  	    
      	Integer firstPlayerDeckSize = firstPlayer.size();
      	Integer secondPlayerDeckSize = secondPlayer.size();
    
        if (firstPlayerDeckSize > secondPlayerDeckSize) {
            System.out.println("First player win!");
        } else if (secondPlayerDeckSize > firstPlayerDeckSize) {
            System.out.println("Second player win!"); 
        } else {
            System.out.println("Draw!");
        }
    
    }

    private static Integer getTopValue(LinkedHashSet<Integer> set) {
        for (Integer integer : set) {
            return integer;
        }
        
        return 0;
    }
    
}