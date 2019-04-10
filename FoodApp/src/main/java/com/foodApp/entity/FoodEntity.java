package com.foodApp.entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.OneToOne;
import javax.persistence.Table;
 
import com.fasterxml.jackson.annotation.JsonView;

@Entity
public class FoodEntity implements Serializable {
	
	  @Id
	  @GeneratedValue	  
	    private long Picid;
	  
	    
	  
	  private String name;
	    
	   
	  private String mimetype;
	  
	  @Lob
	    
	    private byte[] pic;
	  
	  @OneToOne(fetch = FetchType.LAZY,cascade=CascadeType.ALL)
	  @JoinColumn(name="food_menu_id")
	   
	    private FoodMenu foodMenu;

	  public FoodMenu getFoodMenu() {
		return foodMenu;
	}

	public void setFoodMenu(FoodMenu foodMenu) {
		this.foodMenu = foodMenu;
	}

	public FoodEntity() {
		// TODO Auto-generated constructor stub
	}
	  
	 public FoodEntity(String name, String mimetype, byte[] pic,FoodMenu foodMenu) {
		super();
		
		this.name = name;
		this.mimetype = mimetype;
		this.pic = pic;
		this.foodMenu=foodMenu;
	}

	public long getId() {
		return Picid;
	}

	public void setId(long id) {
		this.Picid = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMimetype() {
		return mimetype;
	}

	public void setMimetype(String mimetype) {
		this.mimetype = mimetype;
	}

	public byte[] getPic() {
		return pic;
	}

	public void setPic(byte[] pic) {
		this.pic = pic;
	}

	

}
