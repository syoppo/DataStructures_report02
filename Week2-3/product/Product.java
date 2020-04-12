
public class Product implements Comparable<Product>{
	
	private String ProductName;
	private int productNum;
	
	public Product(String productName, int productNum) {
		this.ProductName = productName;
		this.productNum = productNum;
	}
	
	public int compareTo(Product compareProduct) {
		return this.productNum - compareProduct.productNum;
	}
	
	public String toString() {
		return "productName: " + ProductName + "productNum: " + productNum;
	}

	public String getProductName() {
		return ProductName;
	}

	public void setProductName(String productName) {
		ProductName = productName;
	}

	public int getProductNum() {
		return productNum;
	}

	public void setProductNum(int productNum) {
		this.productNum = productNum;
	}
}
