package com.stockmanagement.app;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class ItemMapper implements RowMapper<Item>{

	@Override
	public Item mapRow(ResultSet rs, int rowNumber) throws SQLException {
		Item item = new Item();
		item.setItemId(rs.getInt("itemid"));
		item.setItemName(rs.getString("itemname"));
		item.setQuantityOfItem(rs.getInt("quantity"));
		item.setRateOfItem(rs.getDouble("rate"));
		
		return item;
	}

}
