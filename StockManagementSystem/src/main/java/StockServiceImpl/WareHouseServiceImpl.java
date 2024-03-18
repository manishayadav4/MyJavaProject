package StockServiceImpl;

import java.util.List;

import com.example.DAO.WareHouseDAO;
import com.example.DAOImpl.WareHouseDAOImpl;
import com.example.entities.WareHouse;

import StockService.WareHouseService;

public class WareHouseServiceImpl implements WareHouseService {
	WareHouseDAO wareHousedao = new WareHouseDAOImpl();

	public boolean saveWareHouse(WareHouse wareHouse) {
		return wareHousedao.saveWareHouse(wareHouse);
	}

	public List<WareHouse> getWareHouse(WareHouse wareHouse) {
		 return wareHousedao.getWareHouse(wareHouse);
	}

	public WareHouse getWareHouseById(int wareHouserid) {
		return wareHousedao.getWareHouseById(wareHouserid);
	}

	public boolean updateWareHouse(int wareHouseId) {
		return wareHousedao.updateWareHouse(wareHouseId);
	}

	public boolean deleteWareHouse(int wareHouseId) {
		 return wareHousedao.deleteWareHouse(wareHouseId);
	}
}