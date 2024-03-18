package com.example.DAO;

import java.util.List;

import com.example.entities.Supplier;
import com.example.entities.WareHouse;

public interface WareHouseDAO {
	public boolean saveWareHouse(WareHouse wareHouse);

	List<WareHouse> getWareHouse(WareHouse wareHouse);

	public WareHouse getWareHouseById(int wareHouserid);

	public boolean updateWareHouse(int wareHouseId);

	public boolean deleteWareHouse(int wareHouseId);

}
