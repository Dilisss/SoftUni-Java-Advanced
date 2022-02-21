import java.util.*;
import java.util.List;
import java.util.stream.Collectors;

public class CitiesByContinentAndCountry {
    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);
    	
    	int rowCount = Integer.parseInt(scanner.nextLine());
    	LinkedHashMap<String, LinkedHashMap<String, List<String>>> continentData = new LinkedHashMap<>();
    	
    	for (int i = 0; i < rowCount; i++) {
    	    String[] parts = scanner.nextLine().split("\\s+");
    	    String continent = parts[0];
    	    String country = parts[1];
    	    String city = parts[2];
    	    
    	    if (continentData.containsKey(continent)) {
    	        LinkedHashMap<String, List<String>> countriesData = continentData.get(continent);
    	        
    	        if (countriesData.containsKey(country)) {
    	            List<String> cities = countriesData.get(country);
    	            cities.add(city);
    	            countriesData.put(country, cities);
    	        } else {
    	            List<String> cities = new ArrayList<>();
    	            cities.add(city);
    	            countriesData.put(country, cities);
    	        }
    	        
    	        continentData.put(continent, countriesData);
    	        
    	    } else {
    	       LinkedHashMap<String, List<String>> countriesData = new LinkedHashMap<>();
    	       List<String> cities = new ArrayList<>();
    	       cities.add(city);
    	       countriesData.put(country, cities);
    	       continentData.put(continent, countriesData);
    	    }
    	}
    	
    	for (String continentName : continentData.keySet()) {
    	    System.out.println(continentName + ":");
    	    LinkedHashMap<String, List<String>> countriesData = continentData.get(continentName);
    	    for (String countryName : countriesData.keySet()) {
    	        System.out.print(countryName + " -> ");
    	        String countriesNames = String.join(", ", countriesData.get(countryName));
    	        System.out.println(countriesNames);
    	    }
    	}
	
    	
    }
}