package com.enjoyfresh.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.enjoyfresh.constants.Constants;
import com.enjoyfresh.constants.Messages;
import com.enjoyfresh.entity.RestaurantDishReview;
import com.enjoyfresh.exception.CustomException;
import com.enjoyfresh.model.RespBean;
import com.enjoyfresh.model.RestaurantDishReviewUpdateReq;
import com.enjoyfresh.repository.RestaurantDishReviewRepository;
import com.enjoyfresh.service.RestaurantDishReviewService;
import com.enjoyfresh.util.RespBuilder;
import com.enjoyfresh.util.ValChecker;

@Service
public class RestaurantDishReviewServiceImpl implements RestaurantDishReviewService {

	
	@Autowired
	private RespBuilder builder;
	
	
	@Autowired
	private RestaurantDishReviewRepository restaurantDishReviewRepository;
	
	
	
	@Override
	public RespBean addRestaurantDishReview(RestaurantDishReview review)throws Exception {
		
		
		
//		RestaurantDishReview review1=new RestaurantDishReview();
//		
//
//	
//			if (!ValChecker.isEmptyOrNull(review.getDateAdded())) {
//				review1.setDateAdded(review.getDateAdded());
//			}
//			if (!ValChecker.isEmptyOrNull(review.getReview())) {
//				review1.setReview(review.getReview());
//			}
//		
//			if (review.getDishId()!=null) {
//				review1.setDishId(review.getDishId());
//			}
//			else { throw new CustomException("please enter Dish id");}
//			
//			if (review.getUserId()!=null) {
//				review1.setDishId(review.getDishId());
//			}			
//			else 
//			{ throw new CustomException("please enter User  id");}
// 
//		    if(review.getReviewId()!=null) {
//		    	review1.setReviewId(review.getReviewId());
//		    }else
//		    {throw new CustomException("please enter review Id");}
//		    
//		    
//		    
//		    if(review.getRating()<0) {
//		    	throw new CustomException("please enter rating");
//		    }
//		    else {
//		    	review1.setRating(review.getRating());
//		    }
		
		
		
		RestaurantDishReview review2 =restaurantDishReviewRepository.save(review);
		

		
		return builder.get(Constants.success, Messages.REVIEW_ADDED, review2);
	}

	@Override
	public RespBean updateRestaurantDishReview( RestaurantDishReview req)throws Exception {
		
		
		RestaurantDishReview review =restaurantDishReviewRepository.getOne(req.getReviewId());
		
		
		
		if(review==null) {
			return builder.get(Constants.success, Messages.REVIEW_NOT_FOUND, null);
		}
		else {
			if (!ValChecker.isEmptyOrNull(review.getDateAdded())) {
				review.setDateAdded(review.getDateAdded());
			}
			if (!ValChecker.isEmptyOrNull(review.getReview())) {
				review.setReview(review.getReview());
			}
		
			if (req.getDishId()!=null) {
				review.setDishId(req.getDishId());
			}
			else { throw new CustomException("please enter Dish id");}
			
			if (req.getUserId()!=null) {
				review.setDishId(req.getDishId());
			}			else { throw new CustomException("please enter Dish id");}

		
		}
		
		
		RestaurantDishReview updatedReview=restaurantDishReviewRepository.save(review);
		
		return builder.get(Constants.success, Messages.REVIEW_UPDATED, updatedReview);
	}

	@Override
	public RespBean getRestaurantDishReview(Long reviewId)throws Exception {
		RestaurantDishReview review=restaurantDishReviewRepository.getOne(reviewId);

		if(review==null) {	
			return builder.get(Constants.success, Messages.REVIEW_NOT_FOUND, null);
		}
		
		return builder.get(Constants.success, Messages.REVIEW_FOUND, review);
	}

	@Override
	public RespBean getAllRestaurantDishReviews( int page, int size)throws Exception {

		Pageable paging=PageRequest.of(page, size);
		
		Page<RestaurantDishReview> reviews= restaurantDishReviewRepository.findAll(paging);
		
		if(reviews==null) 
		    { 		
			return builder.get(Constants.success, Messages.REVIEWS_UNAVAILABLE, null);
             }
	
		return builder.get(Constants.success, Messages.REVIEWS_AVAILABLE, reviews);
	}

	
	
	
	
	
	
	
	@Override
	public RespBean deleteRestaurantDishReview(Long reviewId) {

		
		RestaurantDishReview review=restaurantDishReviewRepository.getOne(reviewId);
		
		if(review==null) {
			return builder.get(Constants.success,Messages.NOT_REG, null);
		}
		else {
		restaurantDishReviewRepository.delete(review);
		return builder.get(Constants.success, Messages.REVIEW_DELETED,review);
		}

		
	}

}
