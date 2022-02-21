import java.util.*;
import java.util.List;
import java.util.stream.Collectors;

public class CountRealNumbers {
    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);

	double[] numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
    	                    .mapToDouble(Double::parseDouble)
    	                    .toArray();

	Map<Double, Integer> occurrences = new LinkedHashMap<>();

	for (int i = 0; i < numbers.length; i++) {
	    if (occurrences.containsKey(numbers[i])) {
		int currentOccurrences = occurrences.get(numbers[i]);
	        currentOccurrences++;
		occurrences.put(numbers[i], currentOccurrences);		
	    } else {
                occurrences.put(numbers[i], 1);
	    }
	}	

     for (Map.Entry<Double, Integer> entry : occurrences.entrySet()) {
         System.out.printf("%.1f -> %d%n", entry.getKey(), entry.getValue());
     }

    }
}