import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class StreapAPI {

	public static void main(String[] args) {
		 List<Product> productsList = new ArrayList<Product>();  
	        //Adding Products  
	        productsList.add(new Product(1,"HP Laptop"));  
	        productsList.add(new Product(2,"Dell Laptop"));  
	        productsList.add(new Product(3,"Lenevo Laptop"));  
	        productsList.add(new Product(4,"Sony Laptop"));  
	        productsList.add(new Product(5,"Apple Laptop"));  
	 
	        System.out.println("-----------------------------"); 
	        
	        List<String> productPrice = new ArrayList<String>();
	        for (int i = 0; i < productsList.size(); i++) {
	        	if(productsList.get(i).getId()>3)
	        	{
	        		productPrice.add(productsList.get(i).getName());
	        	}
			}
	        List<Product> productPriceList = productsList.stream().filter(x->x.getId()>3).collect(Collectors.toList());  // collecting as list  
	        System.out.println(productPriceList);  

	}

}
