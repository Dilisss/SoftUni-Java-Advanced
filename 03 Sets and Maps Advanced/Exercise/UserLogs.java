import java.util.*; 

public class UserLogs {
    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);

        TreeMap<String, LinkedHashMap<String, Integer>> data = new TreeMap<>();
        String input = scanner.nextLine();
        
        while (!input.equals("end")) {
            String[] inputParts = input.split("\\s+");
            String ip = inputParts[0].split("=")[1];
            String username = inputParts[2].split("=")[1];

            if (!data.containsKey(username)) {
                data.put(username, new LinkedHashMap<>(){{
                    put(ip, 1);
                }});
                
            } else {
                Map<String, Integer> currentIps = data.get(username);
                if (currentIps.containsKey(ip)) {
                    int currentTimes = currentIps.get(ip);
                    currentIps.put(ip, currentTimes + 1);
                } else {

                     currentIps.put(ip, 1);
                }
            }
 
            input = scanner.nextLine();
        }

    data.entrySet().stream().forEach(e -> {
        System.out.println(e.getKey() + ": ");
        int count = 1;
        for (Map.Entry<String, Integer> entry : e.getValue().entrySet()) {
            if (count == e.getValue().entrySet().size()) {
                System.out.println(entry.getKey() + " => " + entry.getValue() + ". ");
            } else {
                System.out.print(entry.getKey() + " => " + entry.getValue() + ", ");   
            }
            count++;
        }
    });
        

    }
}