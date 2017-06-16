package com.stockmanagement.app;

public class Item {
	private Integer itemId;
	private String itemName;
	private Integer quantityOfItem;
	private Double rateOfItem;

	public Item(){
		this.itemId = 0;
		this.itemName = null;
		this.quantityOfItem = 0;
		this.rateOfItem = 0.0D;
	}
	public Item(Integer itemId, String itemName, 
			   Integer quantityOfItem, Double rateOfItem){
		
		this.itemId = itemId;
		this.itemName = itemName;
		this.quantityOfItem = quantityOfItem;
		this.rateOfItem = rateOfItem;
	}
	
	public Integer getItemId() {
		return itemId;
	}

	public void setItemId(Integer itemId) {
		this.itemId = itemId;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public Integer getQuantityOfItem() {
		return quantityOfItem;
	}

	public void setQuantityOfItem(Integer quantityOfItem) {
		this.quantityOfItem = quantityOfItem;
	}

	public Double getRateOfItem() {
		return rateOfItem;
	}

	public void setRateOfItem(Double rateOfItem) {
		this.rateOfItem = rateOfItem;
	}

	public String toString(){
		return "Item Details[ " +"Item ID : " +itemId +", Item Name : " +itemName 
				+", Quantity : " +quantityOfItem +", Rate : " +rateOfItem;
	}
}
