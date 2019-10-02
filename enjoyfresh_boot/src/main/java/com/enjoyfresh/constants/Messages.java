package com.enjoyfresh.constants;

public enum Messages {
	
	AdminFound("Admin record found"), 
	
	AdminRegistered("Admin registered"),
	UserRegistered("User registered"),
	DineinFound("Dinein records found"), 
	DineinRegistered("Dinein registered"),
	updatedDinein("Dinein records updated"),
	ALR_REGSTRD("Already Registered"),
	NOT_REG("Not Registered"),
	ADMIN_DOES_NOT_EXIST("Admin does not exist"),
	
	
	PROMO_CODE_ALREADY_EXISTS("Promo code already exists"),
	EMAIL_ALREADY_EXISTS("Email already exists."),
	MOBILE_ALREADY_EXISTS("Mobile already exists"),
	DISH_ALREADY_EXISTS("Dish already exists"),
	UPDATE_SUCCESS("Update Success"),
	SUCCESSFUL("Successfull"),
	INVALID_REQ("Invald request"),
	REQ_PRCS_FAILED("Request process failed"), 
	PASSWORD_MISMATCH("Password mismatch"),
	
	
	RESTAURANT_DOES_NOT_EXIST("Restaurant does not exist"),
	RESTAURANTS_NOT_FOUND("Restaurants not found"),
	RESTAURANTS_FOUND("Restaurants found"),
	RESTAURANT_FOUND("Restaurant found"), 
	RESTAURANT_DELETED("Restaurant deleted"),
	RESTAURANT_REGISTERED("Restaurant registered"), 
	RESTAURANT_LOGIN_SUCCESS("Restaurant login success"),
		
	DISH_DOES_NOT_EXIST("Dish does not exist"),
	DISHES_NOT_FOUND("Dishes not found"),
	DISHES_FOUND("Dishes found"),
	DISH_FOUND("Dish found"),
	DISH_DELETED("Dish deleted"),	
	DISH_ADDED("Dish added"), 
	
	USER_DOES_NOT_EXIST("User does not exist"),	
	USERS_NOT_FOUND("Users Not Found"),
	USERS_FOUND("users found"),
	USER_FOUND("User found"),
	USER_DELETED("User Deleted"),
	USER_REGISTERED("User Registered"), 
	USER_LOGIN_SUCCESS("User login success"), 
	ORDERS_AVAILABLE("orders found"), OrdersFound("")
	
	
	
	
	;
	
	private String value;
	
	Messages(String value){
		this.value = value;
	}
	
	public String getValue() {
		return value;
	}

}
