package com.enjoyfresh.model;



import org.springframework.stereotype.Component;

@Component
public class RestaurantDishReviewUpdateReq  {

	
	
	private Long reviewId;
    
	private Long dishId;
	
	
	private Long userId;
	
	
	private String review;
	
	
	private int rating;
	
	
	
	public Long getReviewId() {
		return reviewId;
	}



	public void setReviewId(Long reviewId) {
		this.reviewId = reviewId;
	}



	public Long getDishId() {
		return dishId;
	}



	public void setDishId(Long dishId) {
		this.dishId = dishId;
	}



	public Long getUserId() {
		return userId;
	}



	public void setUserId(Long userId) {
		this.userId = userId;
	}



	public String getReview() {
		return review;
	}



	public void setReview(String review) {
		this.review = review;
	}



	public int getRating() {
		return rating;
	}



	public void setRating(int rating) {
		this.rating = rating;
	}



	public String getDateAdded() {
		return dateAdded;
	}



	public void setDateAdded(String dateAdded) {
		this.dateAdded = dateAdded;
	}



	private String dateAdded;
	
	
	
}
