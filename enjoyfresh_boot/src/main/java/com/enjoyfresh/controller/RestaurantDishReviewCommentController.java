package com.enjoyfresh.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.enjoyfresh.constants.Controller;
import com.enjoyfresh.entity.RestaurantDishReviewComment;
import com.enjoyfresh.exception.CustomException;
import com.enjoyfresh.model.RespBean;
import com.enjoyfresh.model.RestaurantDishReviewCommentUpdateReq;
import com.enjoyfresh.service.RestaurantDishReviewCommentService;


@RestController
@RequestMapping("/ReviewComment")
public class RestaurantDishReviewCommentController {

	
	
	
	
	@Autowired
	private RestaurantDishReviewCommentService  restaurantDishReviewCommentService;
	
	
	
	
	
	@RequestMapping(method = RequestMethod.POST, produces = "application/json", consumes = "application/json",value = Controller.ADD_COMMENT)
	public ResponseEntity<RespBean> addRestaurantDishReviewComment(@RequestBody RestaurantDishReviewComment req) throws Exception{
		
		
		
		
	return new ResponseEntity<RespBean>(restaurantDishReviewCommentService.addRestaurantDishReviewComment(req),HttpStatus.OK);	
	}
	

	@RequestMapping(method = RequestMethod.PUT, produces = "application/json", consumes = "application/json",value = Controller.UPDATE_COMMENT)
	public ResponseEntity<RespBean> updateRestaurantDishReviewComment(@RequestBody RestaurantDishReviewComment req) throws Exception{
		
		
		
		
	return new ResponseEntity<RespBean>(restaurantDishReviewCommentService.updateRestaurantDishReviewComment(req),HttpStatus.OK);	
	}
	
	
	
	@RequestMapping(method = RequestMethod.GET, produces = "application/json", consumes = "application/json",value =Controller.GET_COMMENT )
	public ResponseEntity<RespBean> getRestaurantDishReviewComment(@RequestParam("commentId")  Long commentId)throws Exception {
		
		if(commentId==null && commentId <0) {
			throw new CustomException("please enter commentId");
		}
		
		
	return new ResponseEntity<RespBean>(restaurantDishReviewCommentService.getRestaurantDishReviewComment(commentId),HttpStatus.OK);	
	}
	
	
	@RequestMapping(method = RequestMethod.GET, produces = "application/json", consumes = "application/json",value = Controller.GET_ALL_COMMENTS)
	public ResponseEntity<RespBean> getAllRestaurantDishReviews(   @RequestParam(defaultValue = "0") Integer page,
                                                                  @RequestParam(defaultValue = "10") Integer size) throws Exception {
		
		
		
		
	return new ResponseEntity<RespBean>(restaurantDishReviewCommentService.getAllRestaurantDishReviewComments( page, size),HttpStatus.OK);	
	}
	
	
	

	@RequestMapping(method = RequestMethod.DELETE, produces = "application/json", consumes = "application/json",value = Controller.DELETE_COMMENT)
	public ResponseEntity<RespBean> deleteRestaurantDishReview(@RequestParam("reviewId")  Long commentId)throws Exception {
		
		if(commentId==null && commentId < 0) {
			throw new CustomException("please enter commentId");
		}
		
		
	return new ResponseEntity<RespBean>(restaurantDishReviewCommentService.deleteRestaurantDishReviewComment(commentId),HttpStatus.OK);	
	}
	
}
