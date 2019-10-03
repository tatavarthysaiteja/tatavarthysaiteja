package com.enjoyfresh.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.enjoyfresh.entity.RestaurantDishReview;
import com.enjoyfresh.exception.CustomException;
import com.enjoyfresh.model.RespBean;
import com.enjoyfresh.model.RestaurantDishReviewUpdateReq;
import com.enjoyfresh.service.RestaurantDishReviewService;

@RestController
@RequestMapping("/Review")
public class RestaurantDishReviewController {

	@Autowired
	private RestaurantDishReviewService  restaurantDishReviewService;
	
	
	
	
	
	@PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE,value = "/addRestaurantDishReview")
	public ResponseEntity<RespBean> addRestaurantDishReview(@RequestBody RestaurantDishReview review) throws Exception{
		
		
		
		
	return new ResponseEntity<RespBean>(restaurantDishReviewService.addRestaurantDishReview(review),HttpStatus.OK);	
	}
	

	@PutMapping(consumes = MediaType.APPLICATION_JSON_VALUE,value = "/updateRestaurantDishReview")
	public ResponseEntity<RespBean> updateRestaurantDishReview(@RequestBody RestaurantDishReview req) throws Exception{
		
		
		
		
	return new ResponseEntity<RespBean>(restaurantDishReviewService.updateRestaurantDishReview(req),HttpStatus.OK);	
	}
	
	
	
	@GetMapping(consumes = MediaType.APPLICATION_JSON_VALUE,value = "/getRestaurantDishReview")
	public ResponseEntity<RespBean> getRestaurantDishReview(@RequestParam("reviewId")  Long reviewId)throws Exception {
		
		if(reviewId==null && reviewId <0) {
			throw new CustomException("please enter review id");
		}
		
		
	return new ResponseEntity<RespBean>(restaurantDishReviewService.getRestaurantDishReview(reviewId),HttpStatus.OK);	
	}
	
	
	@GetMapping(consumes = MediaType.APPLICATION_JSON_VALUE,value = "/getAllRestaurantDishReview")
	public ResponseEntity<RespBean> getAllRestaurantDishReviews( @RequestParam(defaultValue = "0") Integer page,
            @RequestParam(defaultValue = "10") Integer size)throws Exception {
		
		
		
		
	return new ResponseEntity<RespBean>(restaurantDishReviewService.getAllRestaurantDishReviews( page, size),HttpStatus.OK);	
	}
	
	
	

	@DeleteMapping(consumes = MediaType.APPLICATION_JSON_VALUE,value = "/deleteRestaurantDishReview")
	public ResponseEntity<RespBean> deleteRestaurantDishReview(@RequestParam("reviewId")  Long reviewId)throws Exception {
		
		if(reviewId==null && reviewId < 0) {
			throw new CustomException("please enter review id");
		}
		
		
	return new ResponseEntity<RespBean>(restaurantDishReviewService.deleteRestaurantDishReview(reviewId),HttpStatus.OK);	
	}
	
	
	
	
	
	
	
}
