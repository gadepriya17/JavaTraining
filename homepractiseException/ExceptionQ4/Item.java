package com.yash.javatraning.homepractise.ExceptionQ4;

public class Item 
{
  private String ItemName;
  private float price;
  private int MaximumNoOfItem; 

public Item()
{}
  
  public Item(String itemName, float price, int maximumNoOfItem) {
	super();
	ItemName = itemName;
	this.price = price;
	MaximumNoOfItem = maximumNoOfItem;
}
@Override
public String toString() {
	return "Item [ItemName=" + ItemName + ", price=" + price + ", MaximumNoOfItem=" + MaximumNoOfItem + "]";
}
public String getItemName() {
	return ItemName;
}
public void setItemName(String itemName) {
	ItemName = itemName;
}
public float getPrice() {
	return price;
}
public void setPrice(float price) {
	this.price = price;
}
public int getMaximumNoOfItem() {
	return MaximumNoOfItem;
}
public void setMaximumNoOfItem(int maximumNoOfItem) {
	MaximumNoOfItem = maximumNoOfItem;
}
  
}
