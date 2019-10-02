package com.enjoyfresh.model;


import org.springframework.stereotype.Component;

@Component
public class RestaurantDishReviewCommentUpdateReq {

	
	
	private Long commentId;
	
	
	private Long userId;
	
    private Long reviewId;
	
	
	
	private String comment;
	
	
	public Long getCommentId() {
		return commentId;
	}


	public void setCommentId(Long commentId) {
		this.commentId = commentId;
	}


	public Long getUserId() {
		return userId;
	}


	public void setUserId(Long userId) {
		this.userId = userId;
	}


	public Long getReviewId() {
		return reviewId;
	}


	public void setReviewId(Long reviewId) {
		this.reviewId = reviewId;
	}


	public String getComment() {
		return comment;
	}


	public void setComment(String comment) {
		this.comment = comment;
	}


	public String getDateAdded() {
		return dateAdded;
	}


	public void setDateAdded(String dateAdded) {
		this.dateAdded = dateAdded;
	}


	private String dateAdded;
}
