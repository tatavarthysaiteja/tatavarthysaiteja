package com.enjoyfresh.service;

import org.springframework.stereotype.Service;

import com.enjoyfresh.entity.RestaurantDishReview;
import com.enjoyfresh.model.RespBean;
import com.enjoyfresh.model.RestaurantDishReviewUpdateReq;


@Service
public interface RestaurantDishReviewService {

	
	RespBean addRestaurantDishReview(RestaurantDishReview review)throws Exception;
	
	RespBean updateRestaurantDishReview(RestaurantDishReview req)throws Exception;
	
	RespBean  getRestaurantDishReview(Long reviewId)throws Exception;
	
	RespBean getAllRestaurantDishReviews(int page, int size)throws Exception;
	
	
	RespBean deleteRestaurantDishReview(Long reviewId);
	
	
	
	
}
