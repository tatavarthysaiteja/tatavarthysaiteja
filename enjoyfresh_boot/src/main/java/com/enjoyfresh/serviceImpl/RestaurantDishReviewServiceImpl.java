package com.enjoyfresh.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.enjoyfresh.constants.Constants;
import com.enjoyfresh.constants.Messages;
import com.enjoyfresh.entity.RestaurantDishReview;
import com.enjoyfresh.exception.CustomException;
import com.enjoyfresh.model.RespBean;
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
		
		RestaurantDishReview review1 =restaurantDishReviewRepository.save(review);
		
		
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		
		
		
		
		return builder.get(Constants.success, null, review1);
	}

	@Override
	public RespBean updateRestaurantDishReview( RestaurantDishReview review1)throws Exception {
		
		
		RestaurantDishReview review =restaurantDishReviewRepository.getOne(review1.getReviewId());
		if(review==null) {
			throw new CustomException(Messages.RESTAURANT_DOES_NOT_EXIST);
		}
		
		
		if(review==null) {
			return builder.get(Constants.success, Messages.AdminFound, null);
		}
		else {
			if (!ValChecker.isEmptyOrNull(review.getDateAdded())) {
				review.setDateAdded(review.getDateAdded());
			}
			if (!ValChecker.isEmptyOrNull(review.getReview())) {
				review.setReview(review.getReview());
			}
		
			if (review.getDishId()<1) {
				review.setDishId(review.getDishId());
			}
			
			
			
			
			
		
		}
		
		
		RestaurantDishReview updatedReview=restaurantDishReviewRepository.save(review);
		
		return builder.get(Constants.success, null, updatedReview);
	}

	@Override
	public RespBean getRestaurantDishReview()throws Exception {
		// TODO Auto-generated method stub
		return builder.get(Constants.success, null, null);
	}

	@Override
	public RespBean getAllRestaurantDishReviews()throws Exception {
		// TODO Auto-generated method stub
		return builder.get(Constants.success, null, null);
	}

}
