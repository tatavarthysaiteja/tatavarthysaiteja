package com.enjoyfresh.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.enjoyfresh.entity.RestaurantDishReviewComment;

public interface RestaurantDishReviewCommentRepository extends JpaRepository<RestaurantDishReviewComment, Long> {

}
