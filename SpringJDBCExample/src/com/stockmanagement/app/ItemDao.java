package com.stockmanagement.app;

import java.util.List;

import javax.sql.DataSource;





/**
 * @author Rupesh Bharuka
 *
 */
public interface ItemDao {

	public void setDataSource(DataSource dataSource);

	
	/**
	 * This method is used to store the item details in database table
	 * 
	 * @param itemName Name of Item to be stored
	 * @param quantityOfItem Total Quantity of Item 
	 * @param rateOfItem Rate of Item
	 */
	public void insertItemDetails(String itemName, Integer quantityOfItem, Double rateOfItem);
	
	
	/**
	 * Method to retrieve details of specific item by its id
	 * @param itemId Item Id To be passed in order to retrieve the item details 
	 * @return returns item details if its matches with the specified id 
	 */
	public Item getItemById(Integer itemId);
	
	/**
	 * @return returns list of all available items
	 */
	public List<Item> getListOfItems();
	
	/**
	 * @param itemId Pass Item Id to delete the item details 
	 */
	public void deleteItem(Integer itemId);
	
	/**
	 * @param itemId Item Id passed to update item details of specified item id
	 * @param itemName Item Name to be updated
	 * @param quantityOfItem Quantity to be updated
	 * @param rateOfItem Rate of item to be updated
	 */
	public void updateItem(Integer itemId, String itemName, Integer quantityOfItem, Double rateOfItem);
}

