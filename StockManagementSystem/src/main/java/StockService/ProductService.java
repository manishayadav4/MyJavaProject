package StockService;

import java.util.List;

import com.example.entities.Product;

public interface ProductService {
	public boolean saveProduct(Product product);

	List<Product> getProduct(Product product);

	public Product getProductById(int Productid);

	public boolean updateProduct(int ProductId);

	public boolean deleteProduct(int productId);

}


