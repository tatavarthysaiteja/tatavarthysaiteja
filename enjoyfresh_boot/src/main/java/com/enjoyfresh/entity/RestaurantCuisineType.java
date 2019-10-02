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
@Table(name = "restaurant_cuisine_type")
@DynamicUpdate
@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
public class RestaurantCuisineType implements Serializable {
		
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "type_id")
	private long typeId;
	
	@Column(name = "title")
	private String title;
	
	@Column(name = "description")
	private String description;
	
	
	@Column(name = "custom")
	private int custom;
	
	public long getTypeId() {
		return typeId;
	}

	public void setTypeId(long typeId) {
		this.typeId = typeId;
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

	public int getCustom() {
		return custom;
	}

	public void setCustom(int custom) {
		this.custom = custom;
	}


}
