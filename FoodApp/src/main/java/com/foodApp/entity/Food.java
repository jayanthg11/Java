package com.foodApp.entity;

public class Food {
private String dishName;
private double price;
private double rating;
private String desc;

public Food() {
	// TODO Auto-generated constructor stub
}

public Food(String dishName, double price, double rating, String desc) {
	super();
	this.dishName = dishName;
	this.price = price;
	this.rating = rating;
	this.desc = desc;
}

public String getDishName() {
	return dishName;
}
public void setDishName(String dishName) {
	this.dishName = dishName;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
public double getRating() {
	return rating;
}
public void setRating(double rating) {
	this.rating = rating;
}
public String getDesc() {
	return desc;
}
public void setDesc(String desc) {
	this.desc = desc;
}

}
