import java.util.*;
import java.util.List;
import java.util.stream.Collectors;

public class AverageStudentsGrades {
    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);
  	    
  	    int n = Integer.parseInt(scanner.nextLine());
  	    Map<String, List<Double>> record = new TreeMap<>();
  	    
  	    for (int i = 0; i < n; i++) {
  	        String[] parts = scanner.nextLine().split("\\s+");
  	        String nameStudent = parts[0];
  	        double grade = Double.parseDouble(parts[1]);
  	        
  	        if (!record.containsKey(nameStudent)) {
                record.put(nameStudent, new ArrayList<>());
  	        }
  	        
  	        record.get(nameStudent).add(grade);
  	    }
  	    
  	    record.forEach((key, value) -> {
            System.out.print(key + " -> ");
            value.forEach(g -> System.out.printf("%.2f ", g));
            System.out.printf("(avg: %.2f)%n", getAverage(value));
        });
    }

    private static double getAverage(List<Double> value) {
        double result = 0;
        for (double v : value) {
            result += v;
        }
        return result / value.size();
    }
}