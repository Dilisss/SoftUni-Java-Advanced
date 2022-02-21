import java.util.*;
import java.util.List;
import java.util.stream.Collectors;

public class ProductShop {
    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);

    	TreeMap<String, LinkedHashMap<String, Double>> shops = new TreeMap<>();
    
    	String input = scanner.nextLine();
    	while (!input.equals("Revision")) {
    	    String[] data = input.split(", ");
    	    String shop = data[0];
    	    String product = data[1];
    	    Double price = Double.parseDouble(data[2]);
    	    
    	    LinkedHashMap<String, Double> products = new LinkedHashMap<>();
    	    if (shops.containsKey(shop)) {
    	        products = shops.get(shop);
    	    }
    	    
    	    products.put(product, price);
    	    shops.put(shop, products);
    
    	    input = scanner.nextLine();
    	}
    	
    	for (String shopName : shops.keySet()) {
    	    System.out.println(shopName + "->");
    	    LinkedHashMap<String, Double> products = shops.get(shopName);
    	    
    	    for (String productName :products.keySet()) {
    	        System.out.printf("Product: %s, Price: %.1f%n", productName, products.get(productName));
    	    }
    	}

    }
}