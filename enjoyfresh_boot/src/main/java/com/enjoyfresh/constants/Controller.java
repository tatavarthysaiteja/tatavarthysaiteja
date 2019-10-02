package com.enjoyfresh.constants;

public interface Controller extends Constants {
	
	 String LOGIN = "/login";
	 String ADMIN_REGISTER = "/admin/reg";
	 
	 String GET = "/get/{id}";
	 String UPDATE = "/update/{id}";
	 String GET_ALL = "/get/all";
	 String VERIFY_USER = "/verify/user";
	 String VERIFY_ADMIN = "/verify/admin";
	 String RES_REGISTER = "/restaurant/add";
	 
	 
	 String REGISTER_Dinein = "/registerdinein";
	 String UPDATE_Dinein = "/updatedinein";
	 String GET_Dinein = "/getdinein";
	 String GET_AllDinein = "/getAlldinein";
	 String ADD = "/add";
	
	 
	 String RESTAURANT_REGISTER = "/restaurantRegister";
	 String GET_RESTAURANT = "/restaurantInfo/{restaurant_id}";
	 String UPDATE_RESTAURANT = "/editRestaurant/{restaurant_id}";
	 String GET_ALLRESTAURANTS = "/getAllRestaurants";
	 String DELETE_RESTAURANT = "/deleteRestaurant/{restaurant_id}";
	 String LOGIN_RESTAURANT = "/restaurantLogin";
	 String RESTAURANT_ORDERS="/getOrdersByRestaurant";
	 String RESTAURANT_PENDING_ORDERS="/getOrdersByRestaurantAndStatus";
	 String RESTAURANT_CONFIRMATION_ORDERS="/getConfirmationOrders";
	 
	 String ADD_DISH = "/addDish";
	 String GET_DISH = "/dishInfo/{dishId}";
	 String UPDATE_DISH = "/editDish/{dishId}";
	 String GET_ALLDISHES = "/getAllDishes";
	 String DELETE_DISH = "/deleteDish/{dishId}";
	 String GET_ALL_DISHES_BY_RESTAURANTID = "/getAllDishesByRestaurantId";
	
	 String USER_REGISTER = "/userRegister";
	 String GET_USER = "/userInfo/{userId}";
	 String UPDATE_USER =  "/editUser/{userId}";
	 String GET_ALLUSERS = "/getAllUsers";
	 String DELETE_USER = "/deleteUser/{userId}";	 
	 String LOGIN_USER = "/userLogin";
	 
	 String REGISTER = "/register";
	 
	 
	 
	 
	 
	 
		
}
