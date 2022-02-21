import java.util.*; 

public class SimpleTextEditor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = Integer.parseInt(scanner.nextLine());
        ArrayDeque<String> stack = new ArrayDeque<>();
        StringBuilder currentText = new StringBuilder();
        
        for (int i = 0; i < n; i++) {
            String[] tokens = scanner.nextLine().split(" ");
            String command = tokens[0];

            switch (command) {

                case "1":
                    String textToAdd = tokens[1];
                    currentText.append(textToAdd);
                    stack.push(currentText.toString());
                    break;
                
                case "2":
                    int count = Integer.parseInt(tokens[1]);
                    int startIndex = currentText.length() - count;
                    currentText.delete(startIndex, startIndex + count);
                    stack.push(currentText.toString());
                    break;  
                
                
                case "3":
                    int index = Integer.parseInt(tokens[1]);
                    System.out.println(currentText.charAt(index - 1));
                    break; 
                    
     			case "4":
                    if (stack.size() > 1) {
                         stack.pop();
                         currentText = new StringBuilder(stack.peek());
                    } else {
                       currentText = new StringBuilder();
                    }
                    break;                
            }
            
        }

    }
}
