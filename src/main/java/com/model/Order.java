package com.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "orders")
public class Order {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@ManyToOne
	@JoinColumn(name = "user_id")
	private User user;
	@ManyToOne
	@JoinColumn(name = "medicine_id")
	private Medicine medicine;
	@Column(name = "quantity")
	private Integer quantity;
	@Column(name = "total_price")
	private Double totalPrice;
	public Order(Long id, User user, Medicine medicine, Integer quantity, Double totalPrice) {
		super();
		this.id = id;
		this.user = user;
		this.medicine = medicine;
		this.quantity = quantity;
		this.totalPrice = totalPrice;
	}
	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Medicine getMedicine() {
		return medicine;
	}
	public void setMedicine(Medicine medicine) {
		this.medicine = medicine;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	public Double getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(Double totalPrice) {
		this.totalPrice = totalPrice;
	}
	@Override
	public String toString() {
		return "Order [id=" + id + ", user=" + user + ", medicine=" + medicine + ", quantity=" + quantity
				+ ", totalPrice=" + totalPrice + "]";
	}
}
