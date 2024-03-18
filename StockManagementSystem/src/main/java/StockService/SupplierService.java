package StockService;

import java.util.List;

import com.example.entities.Supplier;

public interface SupplierService {
	public boolean saveSupplier(Supplier supplier);

	List<Supplier> getSupplier(Supplier supplier);

	public Supplier getSupplierById(int supplierid);

	public boolean updateSupplier(int supplierId);

	public boolean deleteSupplier(int supplierId);

}
