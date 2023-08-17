package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Predicate;

import entities.Product;
import util.ProductService;

public class App05 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		
		List<Product> prodList = new ArrayList<>();
		
		prodList.add(new Product("TV", 900.0));
		prodList.add(new Product("Mouse", 50.0));
		prodList.add(new Product("HD Case", 80.90));
		prodList.add(new Product("Tablet", 350.50));
		
		ProductService ps = new ProductService();
		
		Predicate<Product> criteria = p -> p.getName().charAt(0) == 'T';
		
		double sum = ps.filteredSum(prodList, criteria);
		
		//double sum = ps.filteredSum(prodList, p -> p.getName().charAt(0) == 'T');
		// We could also do like this, it would work.
		
		System.out.println("Sum = " + sum);

	}

}
