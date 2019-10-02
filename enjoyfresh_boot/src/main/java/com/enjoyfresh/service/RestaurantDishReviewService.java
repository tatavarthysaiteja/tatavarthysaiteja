package com.enjoyfresh.service;

import org.springframework.stereotype.Service;

import com.enjoyfresh.entity.RestaurantDishReview;
import com.enjoyfresh.model.RespBean;


@Service
public interface RestaurantDishReviewService {

	
	RespBean addRestaurantDishReview(RestaurantDishReview review)throws Exception;
	
	RespBean updateRestaurantDishReview(RestaurantDishReview review)throws Exception;
	
	RespBean  getRestaurantDishReview()throws Exception;
	
	RespBean getAllRestaurantDishReviews()throws Exception;
	
	
	
	
	
}
