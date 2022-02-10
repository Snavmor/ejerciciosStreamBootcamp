/**
 * 
 */
package product;

import java.util.List;

/**
 * @author Usuario
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<Product> productos = List.of(new Product("Ropa", 17.58), new Product("Coche", 17.58),
				new Product("Moto", 17.58), new Product("Casa", 17.58), new Product("Ocio", 17.58),
				new Product("Netflix", 17.58));
		
		
		Double suma = productos.stream().mapToDouble(n -> n.getPrice()).sum();
		
		System.out.println(suma);

	}
}
