package com.demo.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.sun.istack.NotNull;

@Entity
@Table(name="product")
public class Product {
	// pls add constructor ,toStringMethod ,,gettt and setter

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="id")
	private long id;


	@NotNull
	@Column(name="category")
	private String category;


	@NotNull
	@Column(name="description")
	private String description;

	@Column(name="manufacturer")
	private String manufacturer;


	@Column(name="name")
	private String name;

	@NotNull
	@Column(name="unit")
	private String unit;

	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUnit() {
		return unit;
	}
	public void setUnit(String unit) {
		this.unit = unit;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", category=" + category + ", description=" + description + ", manufacturer="
				+ manufacturer + ", name=" + name + ", unit=" + unit + ", getId()=" + getId() + ", getCategory()="
				+ getCategory() + ", getDescription()=" + getDescription() + ", getManufacturer()=" + getManufacturer()
				+ ", getName()=" + getName() + ", getUnit()=" + getUnit() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
}