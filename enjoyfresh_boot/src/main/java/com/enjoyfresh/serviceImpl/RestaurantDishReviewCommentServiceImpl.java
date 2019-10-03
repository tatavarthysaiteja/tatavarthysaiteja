package com.enjoyfresh.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.enjoyfresh.constants.Constants;
import com.enjoyfresh.constants.Messages;
import com.enjoyfresh.entity.RestaurantDishReview;
import com.enjoyfresh.entity.RestaurantDishReviewComment;
import com.enjoyfresh.exception.CustomException;
import com.enjoyfresh.model.RespBean;
import com.enjoyfresh.model.RestaurantDishReviewCommentUpdateReq;
import com.enjoyfresh.model.RestaurantDishReviewUpdateReq;
import com.enjoyfresh.repository.RestaurantDishReviewCommentRepository;
import com.enjoyfresh.service.RestaurantDishReviewCommentService;
import com.enjoyfresh.util.RespBuilder;
import com.enjoyfresh.util.ValChecker;



@Service
public class RestaurantDishReviewCommentServiceImpl implements  RestaurantDishReviewCommentService{

	
	
	
	
	
	
	
	
	@Autowired
	private RespBuilder builder;
	
	
	@Autowired
	private RestaurantDishReviewCommentRepository  restaurantDishReviewCommentRepository;
	
	
	
	@Override
	public RespBean addRestaurantDishReviewComment(RestaurantDishReviewComment req)throws Exception {
		
		
//		
//		RestaurantDishReviewComment comment=new RestaurantDishReviewComment();
//		
//	          	
//		
//		
//		
//		
//	
//			if (!ValChecker.isEmptyOrNull(req.getDateAdded())) {
//				comment.setDateAdded(req.getDateAdded());
//			}
//			if (!ValChecker.isEmptyOrNull(req.getComment())) {
//				comment.setComment(req.getComment());
//			}
//		
//			if (req.getReviewId()!=null) {
//				comment.setReviewId(req.getReviewId());
//			}
//			else { throw new CustomException("please enter review id");}
//			
//			if (req.getUserId()!=null) {
//				comment.setUserId(req.getUserId());
//			}			
//			else 
//			{ throw new CustomException("please enter User  id");}
// 
//		    if(req.getCommentId()!=null) {
//		    	comment.setReviewId(req.getCommentId());
//		    }else
//		    {throw new CustomException("please enter Comment Id");}
		    
		    
		   
		
		
		
		RestaurantDishReviewComment addedComment =restaurantDishReviewCommentRepository.save(req);
		
		
	
		
		
		return builder.get(Constants.success, Messages.COMMENT_ADDED, addedComment);
	}

	@Override
	public RespBean updateRestaurantDishReviewComment( RestaurantDishReviewComment req)throws Exception {
		
		
		RestaurantDishReviewComment comment=restaurantDishReviewCommentRepository.getOne(req.getCommentId());
		
      	
		
		
		
		
		
		if (!ValChecker.isEmptyOrNull(req.getDateAdded())) {
			comment.setDateAdded(req.getDateAdded());
		}
		if (!ValChecker.isEmptyOrNull(req.getComment())) {
			comment.setComment(req.getComment());
		}
	
		if (req.getReviewId()!=null) {
			comment.setReviewId(req.getReviewId());
		}
		else { throw new CustomException("please enter review id");}
		
		if (req.getUserId()!=null) {
			comment.setUserId(req.getUserId());
		}			
		else 
		{ throw new CustomException("please enter User  id");}

	    if(req.getCommentId()!=null) {
	    	comment.setReviewId(req.getCommentId());
	    }else
	    {throw new CustomException("please enter Comment Id");}

	RestaurantDishReviewComment addedComment =restaurantDishReviewCommentRepository.save(comment);
	
	
		return builder.get(Constants.success, Messages.COMMENT_UPDATED, addedComment);
	}

	@Override
	public RespBean getRestaurantDishReviewComment(Long commentId)throws Exception {
		RestaurantDishReviewComment comment=restaurantDishReviewCommentRepository.getOne(commentId);

		if(comment==null) {	
			return builder.get(Constants.success, Messages.COMMENT_NOT_FOUND, null);
		}
		
		return builder.get(Constants.success, Messages.COMMENT_FOUND, comment);
	}

	@Override
	public RespBean getAllRestaurantDishReviewComments( int page, int size)throws Exception {

		Pageable paging=PageRequest.of(page, size);
		
		Page<RestaurantDishReviewComment> comments= restaurantDishReviewCommentRepository.findAll(paging);
		
		if(comments==null) 
		    { 		
			return builder.get(Constants.success, Messages.COMMENTS_UNAVAILABLE, null);
             }
	
		return builder.get(Constants.success, Messages.COMMENTS_AVAILABLE, comments);
	}


	
	@Override
	public RespBean deleteRestaurantDishReviewComment(Long commentId) {

		
		RestaurantDishReviewComment comment=restaurantDishReviewCommentRepository.getOne(commentId);
		
		if(comment==null) {
			return builder.get(Constants.success,Messages.COMMENT_NOT_FOUND, null);
		}
		else {
			restaurantDishReviewCommentRepository.delete(comment);
		return builder.get(Constants.success, Messages.COMMENT_DELETED,null);
		}

		
	}
	
	
	
	
	
	
	
	
	
	
}
