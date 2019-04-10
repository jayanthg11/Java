package com.foodApp.dao;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.foodApp.entity.FoodEntity;

public interface Repository extends JpaRepository<FoodEntity, Long> {

}
