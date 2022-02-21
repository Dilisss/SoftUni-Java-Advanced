import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int carCount = Integer.parseInt(scanner.nextLine());
        
        for (int i = 0; i < carCount; i++) {
            String[] carParts = scanner.nextLine().split(" ");
            Car current;

            if (carParts.length == 3) {
                current = new Car(carParts[0], carParts[1], Integer.parseInt(carParts[2]));
            } else {
                current = new Car(carParts[0]);
            }
            
            System.out.println(current.getInfo());
        }

    }
}
