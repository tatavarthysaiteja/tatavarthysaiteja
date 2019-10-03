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
@Table(name = "restaurant_dish_review_comment")
@DynamicUpdate
@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
public class RestaurantDishReviewComment implements Serializable {

	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)

	@Column(name="comment_id")
	private Long commentId;
	
	
	@Column(name="user_id")
	private Long userId;
	
	@Column(name = "review_id")
    private Long reviewId;
	
	
	
	@Column(name="comment")
	private String comment;
	
	
	@Column(name="date_added")
	private String dateAdded;
	
	
	
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
	
}
