package com.stockmanagement.app;

import java.util.List;

import javax.sql.DataSource;

//import org.apache.log4j.Logger;
import org.springframework.jdbc.core.JdbcTemplate;



public class ItemJdbcTemplate implements ItemDao {
	
	private DataSource dataSource;
	private JdbcTemplate jdbcTemplateObject;
//	final static Logger logger = Logger.getLogger(ItemJdbcTemplate.class);
	
	@Override
	public void setDataSource(DataSource ds) {
		this.dataSource = ds;				
		this.jdbcTemplateObject = new JdbcTemplate(this.dataSource);
	}

	@Override
	public void insertItemDetails(String itemName, Integer quantityOfItem, Double rateOfItem) {
		String query = "insert into Item(itemname,quantity,rate) values (?,?,?)";
		jdbcTemplateObject.update(query,itemName, quantityOfItem, rateOfItem);
		System.out.println("Record inserted successfully !");
//		logger.info("Record inserted successfully !");
		return ;
	}

	@Override
	public Item getItemById(Integer itemId) {
		String query = "select * from Item where itemid=?";
		Item item = jdbcTemplateObject.queryForObject(query, new Object[] {itemId}, new ItemMapper());
		return item;
	}

	@Override
	public List<Item> getListOfItems() {
		String query = "select * from Item";
		List<Item>listOfItem = jdbcTemplateObject.query(query, new ItemMapper());
		return listOfItem;
	}

	@Override
	public void deleteItem(Integer itemId) {
		String query = "DELETE FROM Item where itemid = ?";
		jdbcTemplateObject.update(query, itemId);
		System.out.println("Record deleted successfully !");
		return ;		
	}

	@Override
	public void updateItem(Integer itemId, String itemName, Integer quantityOfItem, Double rateOfItem) {
		String query = "UPDATE Item SET itemname = ?, quantity = ?, rate = ? WHERE itemid = ?";
		jdbcTemplateObject.update(query, itemName, quantityOfItem, rateOfItem, itemId);
		System.out.println("Record updated successfully !");
		return ;		
	}

}
