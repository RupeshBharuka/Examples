package com.stockmanagement.app;




//import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	private static ApplicationContext context;

	public static void main(String[] args) {
		context = new ClassPathXmlApplicationContext("SpringConfig.xml");
		
		ItemJdbcTemplate itemJdbcTemplate = (ItemJdbcTemplate) context.getBean("itemJdbcTemplate");

//		itemJdbcTemplate.insertItemDetails("Book", 100, 20.0D);
		
		/*System.out.println("------- List of Items Available -------");
		List<Item>listOfItem = itemJdbcTemplate.getListOfItems();
		for(Item item : listOfItem)
		{
			System.out.println("Item Id : " +item.getItemId() +", Item Name : " +item.getItemName()
							   +", Quantity : " +item.getQuantityOfItem() +", Rate of Item : " +item.getRateOfItem());	
		}*/ 
		
		/*System.out.println("----- Update Item Details -----");
		itemJdbcTemplate.updateItem(12, "Book", 50, 25.0D);*/
		
		/*System.out.println("--- Get Item Details By Id ---");
		Item item = itemJdbcTemplate.getItemById(2); //Auto-Boxing will happen automatically
		System.out.println("Item Id : " +item.getItemId() +", Item Name : " +item.getItemName()
		   				   +", Quantity : " +item.getQuantityOfItem() +", Rate of Item : " +item.getRateOfItem());
		*/
				
		System.out.println("--- Deleting the item ---");
		itemJdbcTemplate.deleteItem(12);//Auto-Boxing will happen automatically
	}

}
