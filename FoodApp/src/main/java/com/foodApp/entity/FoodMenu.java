 
   package com.foodApp.entity;
   
   import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
   
   @Entity 
   
   public class FoodMenu implements Serializable {
	   @Id
	   @GeneratedValue
	  private long FoodMenuid;
	   private String dishName;
	   private double price;
	   private double rating;
	  private String descr;
	  
	  @OneToOne(mappedBy ="foodMenu",cascade=CascadeType.ALL)
	  
	    private FoodEntity foodEntity;
	  
	  public FoodEntity getFoodEntity() {
		return foodEntity;
	}

	public void setFoodEntity(FoodEntity foodEntity) {
		this.foodEntity = foodEntity;
	}

	public FoodMenu() {
		// TODO Auto-generated constructor stub
	}
	   
	   public FoodMenu(String dishName, double price, double rating, String desc) {
		super();
		
		this.dishName = dishName;
		this.price = price;
		this.rating = rating;
		this.descr = desc;
	}

	public FoodMenu( String dishName, double price, double rating, String desc, FoodEntity foodEntity) {
		super();
		
		this.dishName = dishName;
		this.price = price;
		this.rating = rating;
		this.descr = desc;
		this.foodEntity = foodEntity;
	}

	public long getId() {
		return FoodMenuid;
	}
	public void setId(long id) {
		this.FoodMenuid = id;
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
		return descr;
	}
	public void setDesc(String desc) {
		this.descr = desc;
	}
	
	   
   
   
   }
  