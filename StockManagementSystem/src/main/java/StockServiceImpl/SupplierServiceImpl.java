package StockServiceImpl;

import java.util.List;

import com.example.DAO.SupplierDAO;
import com.example.DAOImpl.SupplierDAOImpl;
import com.example.entities.Supplier;
import com.example.entities.WareHouse;

public class SupplierServiceImpl {
	SupplierDAO Supplierdao = new SupplierDAOImpl();

	public boolean saveSupplier(Supplier supplier) {
		return Supplierdao.saveSupplier(supplier);
	}

	public List<Supplier> getSupplier(Supplier supplier) {
		 return Supplierdao.getSupplier(supplier);
	}

	public Supplier getSupplierById(int supplierid) {
		return Supplierdao.getSupplierById(supplierid);
	}

	public boolean updateSupplier(int SupplierId) {
		return Supplierdao.updateSupplier(SupplierId);
	}

	public boolean deleteSupplier(int SupplierId) {
		 return Supplierdao.deleteSupplier(SupplierId);
	}
}
