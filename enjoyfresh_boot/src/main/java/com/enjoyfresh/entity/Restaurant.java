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
@Table(name = "restaurant")
@DynamicUpdate
@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
public class Restaurant implements Serializable {
		
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "restaurant_id")
	private long restaurantId;
	
	@Column(name = "title")
	private String title;
	
	@Column(name = "description")
	private String description;
	
	@Column(name = "category")
	private String category;
	
	@Column(name = "owner_name")
	private String ownerName;
		
	@Column(name = "phone")
	private String phone;
	
	@Column(name = "dishes")
	private int dishes;
	
	@Column(name = "address")
	private String address;
	
	@Column(name = "suite")
	private String suite;
	
	@Column(name = "city")
	private String city;
	
	@Column(name = "state")
	private String  state;
	
	@Column(name = "zip")
	private String  zipcode;
	
	@Column(name = "payment_method")
	private String  paymentMethod;
	
	@Column(name = "ach_name")
	private String  achName;
	
	@Column(name = "ach_account_number")
	private String  achAccountNumber;
	
	@Column(name = "ach_routing_number")
	private String  achRoutingNumber;
	
	@Column(name = "paypal_name")
	private String  paypalName;
	
	@Column(name = "paypal_email")
	private String  paypalEmail;
	
	@Column(name = "check_name")
	private String  checkName;
	
	@Column(name = "check_address")
	private String  checkAddress;
	
	@Column(name = "check_suite")
	private String  checkSuite;
	
	@Column(name = "check_city")
	private String  checkCity;
	
	@Column(name = "check_zip")
	private String  checkZip;
	
	@Column(name = "check_state")
	private String  checkState;
	
	@Column(name = "notifications")
	private int notifications;
	
	@Column(name = "city_tax")
	private Double  cityTax;
	
	@Column(name = "state_tax")
	private Double  stateTax;
	
	@Column(name = "website_url")
	private String  websiteUrl;
	
	@Column(name = "facebook_url")
	private String  facebookUrl;
	
	@Column(name = "twitter_url")
	private String  twitterUrl;
	
	@Column(name = "gplus_url")
	private String  gplusUrl;
	
	@Column(name = "yelp_url")
	private String  yelpUrl;
	
	@Column(name = "urbanspoon_url")
	private String  urbanspoonUrl;
	
	@Column(name = "date_added")
	private String  dateAdded;
	
	@Column(name = "fax")
	private String  fax;
	
	@Column(name = "isprospect")
	private int  isprospect;
	
	@Column(name = "asm_id")
	private int  asmId;
	
	@Column(name = "sm_id")
	private int  smId;
	
	@Column(name = "comm_user_id")
	private int  commUserId;
	
	@Column(name = "opentable_id")
	private int  opentableId;
	
	@Column(name = "email_ntfn")
	private int  emailNtfn;
	
	@Column(name = "txt_ntfn")
	private int  txtNtfn;
	
	@Column(name = "fax_ntfn")
	private int  faxNtfn;
	
	@Column(name = "dine_in")
	private int  dineIn;
	
	@Column(name = "pick_up")
	private int  pickUp;
	
	@Column(name = "logo")
	private String  logo;
	
	@Column(name = "enable_promo")
	private int  enablePromo;
	
	@Column(name = "slug")
	private String  slug;
	
	@Column(name = "isThemePark")
	private int  isThemePark;

	public long getRestaurantId() {
		return restaurantId;
	}

	public void setRestaurantId(long restaurantId) {
		this.restaurantId = restaurantId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public int getDishes() {
		return dishes;
	}

	public void setDishes(int dishes) {
		this.dishes = dishes;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getSuite() {
		return suite;
	}

	public void setSuite(String suite) {
		this.suite = suite;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZipcode() {
		return zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	public String getPaymentMethod() {
		return paymentMethod;
	}

	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}

	public String getAchName() {
		return achName;
	}

	public void setAchName(String achName) {
		this.achName = achName;
	}

	public String getAchAccountNumber() {
		return achAccountNumber;
	}

	public void setAchAccountNumber(String achAccountNumber) {
		this.achAccountNumber = achAccountNumber;
	}

	public String getAchRoutingNumber() {
		return achRoutingNumber;
	}

	public void setAchRoutingNumber(String achRoutingNumber) {
		this.achRoutingNumber = achRoutingNumber;
	}

	public String getPaypalName() {
		return paypalName;
	}

	public void setPaypalName(String paypalName) {
		this.paypalName = paypalName;
	}

	public String getPaypalEmail() {
		return paypalEmail;
	}

	public void setPaypalEmail(String paypalEmail) {
		this.paypalEmail = paypalEmail;
	}

	public String getCheckName() {
		return checkName;
	}

	public void setCheckName(String checkName) {
		this.checkName = checkName;
	}

	public String getCheckAddress() {
		return checkAddress;
	}

	public void setCheckAddress(String checkAddress) {
		this.checkAddress = checkAddress;
	}

	public String getCheckSuite() {
		return checkSuite;
	}

	public void setCheckSuite(String checkSuite) {
		this.checkSuite = checkSuite;
	}

	public String getCheckCity() {
		return checkCity;
	}

	public void setCheckCity(String checkCity) {
		this.checkCity = checkCity;
	}

	public String getCheckZip() {
		return checkZip;
	}

	public void setCheckZip(String checkZip) {
		this.checkZip = checkZip;
	}

	public String getCheckState() {
		return checkState;
	}

	public void setCheckState(String checkState) {
		this.checkState = checkState;
	}

	public int getNotifications() {
		return notifications;
	}

	public void setNotifications(int notifications) {
		this.notifications = notifications;
	}

	public Double getCityTax() {
		return cityTax;
	}

	public void setCityTax(Double cityTax) {
		this.cityTax = cityTax;
	}

	public Double getStateTax() {
		return stateTax;
	}

	public void setStateTax(Double stateTax) {
		this.stateTax = stateTax;
	}

	public String getWebsiteUrl() {
		return websiteUrl;
	}

	public void setWebsiteUrl(String websiteUrl) {
		this.websiteUrl = websiteUrl;
	}

	public String getFacebookUrl() {
		return facebookUrl;
	}

	public void setFacebookUrl(String facebookUrl) {
		this.facebookUrl = facebookUrl;
	}

	public String getTwitterUrl() {
		return twitterUrl;
	}

	public void setTwitterUrl(String twitterUrl) {
		this.twitterUrl = twitterUrl;
	}

	public String getGplusUrl() {
		return gplusUrl;
	}

	public void setGplusUrl(String gplusUrl) {
		this.gplusUrl = gplusUrl;
	}

	public String getYelpUrl() {
		return yelpUrl;
	}

	public void setYelpUrl(String yelpUrl) {
		this.yelpUrl = yelpUrl;
	}

	public String getUrbanspoonUrl() {
		return urbanspoonUrl;
	}

	public void setUrbanspoonUrl(String urbanspoonUrl) {
		this.urbanspoonUrl = urbanspoonUrl;
	}

	public String getDateAdded() {
		return dateAdded;
	}

	public void setDateAdded(String dateAdded) {
		this.dateAdded = dateAdded;
	}

	public String getFax() {
		return fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}

	public int getIsprospect() {
		return isprospect;
	}

	public void setIsprospect(int isprospect) {
		this.isprospect = isprospect;
	}

	public int getAsmId() {
		return asmId;
	}

	public void setAsmId(int asmId) {
		this.asmId = asmId;
	}

	public int getSmId() {
		return smId;
	}

	public void setSmId(int smId) {
		this.smId = smId;
	}

	public int getCommUserId() {
		return commUserId;
	}

	public void setCommUserId(int commUserId) {
		this.commUserId = commUserId;
	}

	public int getOpentableId() {
		return opentableId;
	}

	public void setOpentableId(int opentableId) {
		this.opentableId = opentableId;
	}

	public int getEmailNtfn() {
		return emailNtfn;
	}

	public void setEmailNtfn(int emailNtfn) {
		this.emailNtfn = emailNtfn;
	}

	public int getTxtNtfn() {
		return txtNtfn;
	}

	public void setTxtNtfn(int txtNtfn) {
		this.txtNtfn = txtNtfn;
	}

	public int getFaxNtfn() {
		return faxNtfn;
	}

	public void setFaxNtfn(int faxNtfn) {
		this.faxNtfn = faxNtfn;
	}

	public int getDineIn() {
		return dineIn;
	}

	public void setDineIn(int dineIn) {
		this.dineIn = dineIn;
	}

	public int getPickUp() {
		return pickUp;
	}

	public void setPickUp(int pickUp) {
		this.pickUp = pickUp;
	}

	public String getLogo() {
		return logo;
	}

	public void setLogo(String logo) {
		this.logo = logo;
	}

	public int getEnablePromo() {
		return enablePromo;
	}

	public void setEnablePromo(int enablePromo) {
		this.enablePromo = enablePromo;
	}

	public String getSlug() {
		return slug;
	}

	public void setSlug(String slug) {
		this.slug = slug;
	}

	public int getIsThemePark() {
		return isThemePark;
	}

	public void setIsThemePark(int isThemePark) {
		this.isThemePark = isThemePark;
	}

}
