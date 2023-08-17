package util;

import java.util.List;
import java.util.function.Predicate;

import entities.Product;

public class ProductService {

	public double filteredSum(List<Product> prodList, Predicate<Product> criteria) {
		double sum = 0.0;
		for (Product p : prodList) {
			if (criteria.test(p)) {
				sum = sum + p.getPrice();
			}
		}
		return sum;
	}
}
