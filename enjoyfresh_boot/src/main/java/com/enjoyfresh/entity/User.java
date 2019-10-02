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
@Table(name = "user")
@DynamicUpdate
@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
public class User implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "user_id")
	private Long userId;
	
	@Column(name = "type")
	private String type;
	
	@Column(name = "first_name")
	private String firstName;
	
	@Column(name = "last_name")
	private String lastName;
	
	@Column(name = "username")
	private String userName;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "zip")
	private String zip;
	
	@Column(name = "password")
	private String password;
	
	@Column(name = "owns_restaurant_id")
	private int ownsRestaurantId;
	
	@Column(name = "notify_account")
	private int notifyAccount;
	
	@Column(name = "notify_receipt")
	private int notifyReceipt;
	
	@Column(name = "notify_favorites")
	private int notifyFavorites;
	
	@Column(name = "image")
	private String image;
	
	@Column(name = "notify_offer")
	private int notifyOffer;
	
	@Column(name = "facebook_id")
	private String facebookId;
	
	@Column(name = "facebook_email")
	private String facebookEmail;
	
	@Column(name = "facebook_birthday")
	private String facebookBirthday;
	
	@Column(name = "timezone")
	private String timezone;
	
	@Column(name = "banned")
	private int banned;
	
	@Column(name = "date_added")
	private String dateAdded;
	
	@Column(name = "rep_id")
	private String repId;
	
	@Column(name = "reset_password_code")
	private String resetPasswordCode;
	
	@Column(name = "user_phone")
	private String userPhone;
	
	@Column(name = "customerProfileId")
	private int customerProfileId;
	
	@Column(name = "stripe_customer_id")
	private String stripeCustomerId;
	
	@Column(name = "promo")
	private String promo;
	
	@Column(name = "is_discount_applied")
	private int isDiscountApplied;
	
	@Column(name = "asm_id")
	private int asmId;
	
	@Column(name = "is_sweep")
	private int isSweep;
	
	@Column(name = "ref_promo")
	private String refPromo;
	
	@Column(name = "ref_ID")
	private int refID;
	
	@Column(name = "ref_promo_count")
	private int refPromoCount;
	
	@Column(name = "is_free_sweep")
	private int isFreeSweep;
	
	@Column(name = "prospect_id")
	private int prospectId;
	
	@Column(name = "is_active")
	private int isActive;
	
	@Column(name = "devicetoken")
	private String devicetoken;
	
	@Column(name = "twitter_id")
	private String twitterId;
	
	@Column(name = "twitter_username")
	private String twitterUsername;
	
	@Column(name = "is_blogger_promo")
	private int isBloggerPromo;
	
	@Column(name = "free_dish_claimed")
	private int freeDishClaimed;
	
	@Column(name = "is_intro_mail_sent")
	private int isIntroMailSent;
	
	@Column(name = "is_special_signup_owner")
	private int isSpecialSignupOwner;
	
	@Column(name = "is_special_signup_promo_applied")
	private int isSpecialSignupPromoApplied;
	
	@Column(name = "is_special_signup_promo_used")
	private int isSpecialSignupPromoUsed;
	
	@Column(name = "verification_code")
	private String verificationCode;
	
	@Column(name = "is_verified")
	private int isVerified;
	
	@Column(name = "pin")
	private String pin;
	
	@Column(name = "apn_device_token")
	private String apnDeviceToken;

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getOwnsRestaurantId() {
		return ownsRestaurantId;
	}

	public void setOwnsRestaurantId(int ownsRestaurantId) {
		this.ownsRestaurantId = ownsRestaurantId;
	}

	public int getNotifyAccount() {
		return notifyAccount;
	}

	public void setNotifyAccount(int notifyAccount) {
		this.notifyAccount = notifyAccount;
	}

	public int getNotifyReceipt() {
		return notifyReceipt;
	}

	public void setNotifyReceipt(int notifyReceipt) {
		this.notifyReceipt = notifyReceipt;
	}

	public int getNotifyFavorites() {
		return notifyFavorites;
	}

	public void setNotifyFavorites(int notifyFavorites) {
		this.notifyFavorites = notifyFavorites;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public int getNotifyOffer() {
		return notifyOffer;
	}

	public void setNotifyOffer(int notifyOffer) {
		this.notifyOffer = notifyOffer;
	}

	public String getFacebookId() {
		return facebookId;
	}

	public void setFacebookId(String facebookId) {
		this.facebookId = facebookId;
	}

	public String getFacebookEmail() {
		return facebookEmail;
	}

	public void setFacebookEmail(String facebookEmail) {
		this.facebookEmail = facebookEmail;
	}

	public String getFacebookBirthday() {
		return facebookBirthday;
	}

	public void setFacebookBirthday(String facebookBirthday) {
		this.facebookBirthday = facebookBirthday;
	}

	public String getTimezone() {
		return timezone;
	}

	public void setTimezone(String timezone) {
		this.timezone = timezone;
	}

	public int getBanned() {
		return banned;
	}

	public void setBanned(int banned) {
		this.banned = banned;
	}

	public String getDateAdded() {
		return dateAdded;
	}

	public void setDateAdded(String dateAdded) {
		this.dateAdded = dateAdded;
	}

	public String getRepId() {
		return repId;
	}

	public void setRepId(String repId) {
		this.repId = repId;
	}

	public String getResetPasswordCode() {
		return resetPasswordCode;
	}

	public void setResetPasswordCode(String resetPasswordCode) {
		this.resetPasswordCode = resetPasswordCode;
	}

	public String getUserPhone() {
		return userPhone;
	}

	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}

	public int getCustomerProfileId() {
		return customerProfileId;
	}

	public void setCustomerProfileId(int customerProfileId) {
		this.customerProfileId = customerProfileId;
	}

	public String getStripeCustomerId() {
		return stripeCustomerId;
	}

	public void setStripeCustomerId(String stripeCustomerId) {
		this.stripeCustomerId = stripeCustomerId;
	}

	public String getPromo() {
		return promo;
	}

	public void setPromo(String promo) {
		this.promo = promo;
	}

	public int getIsDiscountApplied() {
		return isDiscountApplied;
	}

	public void setIsDiscountApplied(int isDiscountApplied) {
		this.isDiscountApplied = isDiscountApplied;
	}

	public int getAsmId() {
		return asmId;
	}

	public void setAsmId(int asmId) {
		this.asmId = asmId;
	}

	public int getIsSweep() {
		return isSweep;
	}

	public void setIsSweep(int isSweep) {
		this.isSweep = isSweep;
	}

	public String getRefPromo() {
		return refPromo;
	}

	public void setRefPromo(String refPromo) {
		this.refPromo = refPromo;
	}

	public int getRefID() {
		return refID;
	}

	public void setRefID(int refID) {
		this.refID = refID;
	}

	public int getRefPromoCount() {
		return refPromoCount;
	}

	public void setRefPromoCount(int refPromoCount) {
		this.refPromoCount = refPromoCount;
	}

	public int getIsFreeSweep() {
		return isFreeSweep;
	}

	public void setIsFreeSweep(int isFreeSweep) {
		this.isFreeSweep = isFreeSweep;
	}

	public int getProspectId() {
		return prospectId;
	}

	public void setProspectId(int prospectId) {
		this.prospectId = prospectId;
	}

	public int getIsActive() {
		return isActive;
	}

	public void setIsActive(int isActive) {
		this.isActive = isActive;
	}

	public String getDevicetoken() {
		return devicetoken;
	}

	public void setDevicetoken(String devicetoken) {
		this.devicetoken = devicetoken;
	}

	public String getTwitterId() {
		return twitterId;
	}

	public void setTwitterId(String twitterId) {
		this.twitterId = twitterId;
	}

	public String getTwitterUsername() {
		return twitterUsername;
	}

	public void setTwitterUsername(String twitterUsername) {
		this.twitterUsername = twitterUsername;
	}

	public int getIsBloggerPromo() {
		return isBloggerPromo;
	}

	public void setIsBloggerPromo(int isBloggerPromo) {
		this.isBloggerPromo = isBloggerPromo;
	}

	public int getFreeDishClaimed() {
		return freeDishClaimed;
	}

	public void setFreeDishClaimed(int freeDishClaimed) {
		this.freeDishClaimed = freeDishClaimed;
	}

	public int getIsIntroMailSent() {
		return isIntroMailSent;
	}

	public void setIsIntroMailSent(int isIntroMailSent) {
		this.isIntroMailSent = isIntroMailSent;
	}

	public int getIsSpecialSignupOwner() {
		return isSpecialSignupOwner;
	}

	public void setIsSpecialSignupOwner(int isSpecialSignupOwner) {
		this.isSpecialSignupOwner = isSpecialSignupOwner;
	}

	public int getIsSpecialSignupPromoApplied() {
		return isSpecialSignupPromoApplied;
	}

	public void setIsSpecialSignupPromoApplied(int isSpecialSignupPromoApplied) {
		this.isSpecialSignupPromoApplied = isSpecialSignupPromoApplied;
	}

	public int getIsSpecialSignupPromoUsed() {
		return isSpecialSignupPromoUsed;
	}

	public void setIsSpecialSignupPromoUsed(int isSpecialSignupPromoUsed) {
		this.isSpecialSignupPromoUsed = isSpecialSignupPromoUsed;
	}

	public String getVerificationCode() {
		return verificationCode;
	}

	public void setVerificationCode(String verificationCode) {
		this.verificationCode = verificationCode;
	}

	public int getIsVerified() {
		return isVerified;
	}

	public void setIsVerified(int isVerified) {
		this.isVerified = isVerified;
	}

	public String getPin() {
		return pin;
	}

	public void setPin(String pin) {
		this.pin = pin;
	}

	public String getApnDeviceToken() {
		return apnDeviceToken;
	}

	public void setApnDeviceToken(String apnDeviceToken) {
		this.apnDeviceToken = apnDeviceToken;
	}
	
}