import java.util.*; 

public class SetsOfElements {
    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);
    	
        String input = scanner.nextLine();
        int sizeFirstSet = Integer.parseInt(input.split("\\s+")[0]);
        int sizeSecondtSet = Integer.parseInt(input.split("\\s+")[1]);
        
        Set<Integer> firstSet = new LinkedHashSet<>();
        Set<Integer> secondSet = new LinkedHashSet<>();
        
    	for (int i = 0; i < sizeFirstSet; i ++) {
    	    firstSet.add(Integer.parseInt(scanner.nextLine()));
    	}
    	
    	for (int i = 0; i < sizeSecondtSet; i ++) {
    	    secondSet.add(Integer.parseInt(scanner.nextLine()));
    	}
    	
    firstSet.retainAll(secondSet);   	
    firstSet.forEach(el -> System.out.print(el + " "));
    
    }
}