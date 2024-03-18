package StockServiceImpl;

import java.util.List;

import com.example.DAO.ProductDAO;
import com.example.DAOImpl.ProductDAOImpl;
import com.example.entities.Product;

import StockService.ProductService;

public class ProductServiceImpl implements ProductService {
	ProductDAO productdao = new ProductDAOImpl();

	public boolean saveProduct(Product product) {
		return productdao.saveProduct(product);
	}

	public List<Product> getProduct(Product product) {
		return productdao.getProduct(product);
	}

	public Product getProductById(int Productid) {
		return productdao.getProductById(Productid);
	}

	public boolean updateProduct(int ProductId) {
		return productdao.updateProduct(ProductId);
	}

	public boolean deleteProduct(int productId) {
		return productdao.deleteProduct(productId);
	}

}
