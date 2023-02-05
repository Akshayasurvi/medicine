package com.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/*import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Medicine {
	@Id
	@GeneratedValue
	private int medicineId;
	private String medicineName;
	//private int minimumStockQuatity;
	private int availableStock;
	private float price;
	public Medicine() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Medicine(int medicineId, String medicineName, int availableStock, float price) {
		super();
		this.medicineId = medicineId;
		this.medicineName = medicineName;
		this.availableStock = availableStock;
		this.price = price;
	}
	
	public int getMedicineId() {
		return medicineId;
	}

	public void setMedicineId(int medicineId) {
		this.medicineId = medicineId;
	}

	public String getMedicineName() {
		return medicineName;
	}
	public void setMedicineName(String medicineName) {
		this.medicineName = medicineName;
	}
	public int getAvailableStock() {
		return availableStock;
	}
	public void setAvailableStock(int availableStock) {
		this.availableStock = availableStock;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Medicine [medicineId=" + medicineId + ", medicineName=" + medicineName + ", availableStock="
				+ availableStock + ", price=" + price + "]";
	}
	
	
	

}*/
@Entity
@Table(name = "medicine")
public class Medicine { 
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "name")
	private String name;
	@Column(name = "price")
	private Double price;
	@Column(name = "quantity")
	private int quantity;
	public Medicine() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Medicine(Long id, String name, Double price, int quantity) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "Medicine [id=" + id + ", name=" + name + ", price=" + price + ", quantity=" + quantity + "]";
	}
	
	
}
