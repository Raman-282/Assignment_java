package com.mapping.database.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "sales_order")
public class SalesOrder {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String cart_Id;
	private String shippinaddress_Id;
	private String billingaddress_Id;
	
	@OneToOne
	private Customer customer_id ;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCart_Id() {
		return cart_Id;
	}

	public void setCart_Id(String cart_Id) {
		this.cart_Id = cart_Id;
	}


	public String getShippinaddress_Id() {
		return shippinaddress_Id;
	}

	public void setShippinaddress_Id(String shippinaddress_Id) {
		this.shippinaddress_Id = shippinaddress_Id;
	}

	public Customer getCustomer_id() {
		return customer_id;
	}

	public void setCustomer_id(Customer customer_id) {
		this.customer_id = customer_id;
	}

	public String getBillingaddress_Id() {
		return billingaddress_Id;
	}

	public void setBillingaddress_Id(String billingaddress_Id) {
		this.billingaddress_Id = billingaddress_Id;
	}
	
}
