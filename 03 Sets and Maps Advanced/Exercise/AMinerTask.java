import java.util.*; 

public class AMinerTask {
    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);
        
        Map<String, Integer> resources = new LinkedHashMap<>();
        
        String resource = scanner.nextLine(); 
        while (!resource.equals("stop")) {
            int quantity = Integer.parseInt(scanner.nextLine());
            
            if (!resources.containsKey(resource)) {
                resources.put(resource, quantity);
            } else {
                resources.put(resource, resources.get(resource) + quantity);
            }

            resource = scanner.nextLine();
        }
        
    resources.entrySet().forEach(e -> System.out.println(e.getKey() + " -> " + e.getValue()));
    
    }
}