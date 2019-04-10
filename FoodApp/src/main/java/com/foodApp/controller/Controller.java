package com.foodApp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.fasterxml.jackson.annotation.JsonView;
import com.foodApp.entity.Food;
import com.foodApp.entity.FoodEntity;
import com.foodApp.entity.FoodMenu;
import com.foodApp.entity.View;
import java.util.Optional;

@RestController
public class Controller {
	@Autowired
	com.foodApp.dao.Repository dao;
	
	 @PostMapping("/api/file/upload")
	    public String uploadMultipartFile(@RequestParam("file") MultipartFile file,@RequestParam("dishName") String dishName,
	    		@RequestParam("price") double price,@RequestParam("rating") double rating,@RequestParam("desc") String desc) {
	      try {
	        // save file to PostgreSQL
	    	  FoodMenu fd=new FoodMenu(dishName,price,rating,desc);
	        FoodEntity filemode = new FoodEntity(file.getOriginalFilename(), file.getContentType(), file.getBytes(),fd);
	        dao.save(filemode);
	        return "File uploaded successfully! -> filename = " + file.getOriginalFilename();
	    } catch (  Exception e) {
	      return "FAIL! Maybe You had uploaded the file before or the file's size > 500KB";
	    }    
	    }
	 
	  @JsonView(View.FileInfo.class)
	  @GetMapping("/api/file/all")
	  public List<FoodEntity> getListFiles() {
	    return dao.findAll();
	  }
	  
	    /*
	     * Download Files
	     */
	  @RequestMapping(value = "/api/file/{id}", method = RequestMethod.GET,
	            produces = MediaType.IMAGE_JPEG_VALUE)
	  public ResponseEntity<byte[]> getFile(@PathVariable Long id) {
	    Optional<FoodEntity> fileOptional = dao.findById(id);
	    
	    if(fileOptional.isPresent()) {
	      FoodEntity file = fileOptional.get();
	      byte[] bytes = file.getPic();
	      return  ResponseEntity
	                .ok()
	                .contentType(MediaType.IMAGE_JPEG)
	                .body(bytes); 
	    }
	    
	    return ResponseEntity.status(404).body(null);
	  }

}
