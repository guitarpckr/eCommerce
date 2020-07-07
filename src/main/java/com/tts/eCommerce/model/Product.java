package com.tts.eCommerce.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.PositiveOrZero;

import org.hibernate.annotations.CreationTimestamp;

@Entity
public class Product {
	 @Id
	  @GeneratedValue(strategy = GenerationType.AUTO)
	  @Column(name = "product_id")
	 
	private Long id;
	
	@NotBlank(message = "Product name cannot be blank") //what is being sold?
	private String name;
	
	@PositiveOrZero(message = "Product wholesale price cannot be negative") //but is zero really ok?
	private Double wholesalePrice;
	
	@PositiveOrZero(message = "Product retail price cannot be negative") //but is zero really ok?
	private Double retailPrice;
	
	@NotBlank(message = "Product brand cannot be blank") //somebody made it, right?
	private String brand;
	
	
	private String description;
	
	private Integer inventory;
	
	private String image; //image attribute is a string representing the path where the image file is stored
	
	@CreationTimestamp
	private Date createdAt;
	
	@UpdatedTimestamp
	private Date updatedAt;
}
