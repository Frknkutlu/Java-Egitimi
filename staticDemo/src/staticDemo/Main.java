package staticDemo;

public class Main {

	public static void main(String[] args) {
		
		ProductManager productManager= new ProductManager();
		Product product = new Product();
		product.id=1;
		product.name="";
		
		productManager.add(product);
		
		
		DatabaseHelper.Connection.createConnection();
		
		
	}

}
