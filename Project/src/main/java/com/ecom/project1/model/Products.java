package com.ecom.project1.model;

import java.math.BigInteger;
import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Products 
{
	@Id
	private int id;
	private String name;
	private String description;
	private String brand;
	private BigInteger prive;
	private String catagory;
	private Date date;
	private boolean available;
	private int quantity;
	
}
