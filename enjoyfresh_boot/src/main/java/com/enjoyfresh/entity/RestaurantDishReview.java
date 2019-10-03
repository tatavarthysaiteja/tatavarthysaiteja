package com.enjoyfresh.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicUpdate;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@SuppressWarnings("serial")
@Entity
@Table(name = "restaurant_dish_review")
@DynamicUpdate
@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
public class RestaurantDishReview implements Serializable {
	
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="review_id")
	private Long reviewId;
    
    @Column(name = "dish_id")
	private Long dishId;
	
	
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



	@Column(name = "user_id")
	private Long userId;
	
	
    @Column(name = "review")
	private String review;
	
	
    @Column(name = "rating")
	private int rating;
	
	
	
    @Column(name = "date_added")
	private String dateAdded;
	
	
	
    public Long getReviewId() {
		return reviewId;
	}



	public void setReviewId(Long reviewId) {
		this.reviewId = reviewId;
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
	
}
