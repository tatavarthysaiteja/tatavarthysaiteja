package com.enjoyfresh.service;

import org.springframework.stereotype.Service;

import com.enjoyfresh.entity.RestaurantDishReviewComment;
import com.enjoyfresh.model.RespBean;
import com.enjoyfresh.model.RestaurantDishReviewCommentUpdateReq;


@Service
public interface RestaurantDishReviewCommentService {

	
	
RespBean addRestaurantDishReviewComment(RestaurantDishReviewComment req)throws Exception;
	
	RespBean updateRestaurantDishReviewComment(RestaurantDishReviewComment req)throws Exception;
	
	RespBean  getRestaurantDishReviewComment(Long commentId)throws Exception;
	
	RespBean getAllRestaurantDishReviewComments(int page, int size)throws Exception;
	
	
	RespBean deleteRestaurantDishReviewComment(Long commentId);
	
	
	
	
}
