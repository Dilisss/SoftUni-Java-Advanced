import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  
        
        HashMap<Integer, BankAccount> accounts = new HashMap<>();

        String line = scanner.nextLine();
        while (!line.equals("End")) {
            
            String[] tokens = line.split("\\s+");
            
            String result = "";
            String command = tokens[0];
            
            switch (command) {
                case "Create":
                    BankAccount account = new BankAccount();
                    accounts.put(account.getId(), account);
                    
                    result = "Account ID" + account.getId() + " created";
                    break;
                   
                case "Deposit":
                    int accountId = Integer.parseInt(tokens[1]);
                    double amount = Double.parseDouble(tokens[2]);
                    
                    BankAccount currentAccount = accounts.get(accountId);
                    if (currentAccount == null) {
                        result = "Account does not exist";
                        break;
                    }
                    
                    currentAccount.deposit(amount);
                    
                    accounts.put(accountId, currentAccount);
		    result = String.format("Deposited %.0f to ID%d", amount, accountId);
                    
                    break;    
                    
                case "SetInterest":
                    double interestRate = Double.parseDouble(tokens[1]);
                    
                    BankAccount.setInterestRate(interestRate);
                    break;
                    
                case "GetInterest":
                    int accountId2 = Integer.parseInt(tokens[1]);
                    int years = Integer.parseInt(tokens[2]);
                    
                    BankAccount currentAccount2 = accounts.get(accountId2);
                    if (currentAccount2 == null) {
                        result = "Account does not exist";
                        break;
                    }
                    
                    double currentAccountInterest = currentAccount2.getInterestRate(years);
                    
                    result = String.format("%.2f", currentAccountInterest);             

                    break;
                
            }
            
            if (!result.isEmpty()) {
                System.out.println(result);
            }
            line = scanner.nextLine();
        }       
      
    }
}
