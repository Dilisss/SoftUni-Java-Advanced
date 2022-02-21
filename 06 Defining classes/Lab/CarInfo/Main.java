import java.util.*;

public class Main {    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int carCount = Integer.parseInt(scanner.nextLine());
        
        for (int i = 0; i < carCount; i++) {
            String[] carParts = scanner.nextLine().split(" ");
            Car current = new Car();
            
            current.setMake(carParts[0]);
            current.setModel(carParts[1]);
            current.setHorsePower(Integer.parseInt(carParts[2]));

            System.out.printf("The car is: %s %s - %d HP.%n",
                    current.getMake(), current.getModel(), current.getHorsePower());
        }

    }
}
