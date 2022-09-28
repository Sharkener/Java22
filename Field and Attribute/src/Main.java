
public class Main {

	public static void main(String[] args) {
		
		Product product= new Product();
		
		
		product.name="laptop";
		product.setDescription("Best Quality");
		product.amount=5;
		product.price=15000;
		
		ProductManager productmanager=new ProductManager();
		
		productmanager.Add1(product);
		productmanager.amountInfo(product);
		
		
		
		
	}

}
