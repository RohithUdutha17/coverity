package ProductSystem1.productapp1;

public class ProductInformationSystem {
	
	ProductDB productDB;
	
	public ProductInformationSystem(ProductDB productDB) {
		this.productDB = productDB;
	}
	
	public Product getProductInfo(int productId) {
		return productDB.getProduct(productId);
	}
	
}
