package classesWithAttributes;

public class Main {

	public static void main(String[] args) {
		Product product = new Product(1, "Laptop", "Asus Laptop", 5000, 3, null, null);
		

		ProductManager productmanager = new ProductManager();
		productmanager.Add(product);
		System.out.println(product.getKod());

	}

}