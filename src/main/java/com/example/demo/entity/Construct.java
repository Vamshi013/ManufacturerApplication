package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

@Entity
@Table(name = "construction")

public class Construct {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	//Number of Components
	private String numberOfComp;
	
	//Component 
	@ManyToOne(fetch = FetchType.LAZY)
	@OnDelete(action = OnDeleteAction.CASCADE)
	@JoinColumn (name = "fk_component_id", referencedColumnName = "componentId")
	private Component component;
	
	//Product
	@ManyToOne(fetch = FetchType.LAZY)
	@OnDelete(action = OnDeleteAction.CASCADE)
	@JoinColumn (name = "fk_product_id", referencedColumnName = "productId")
	private Product product;

	public String getNumberOfComp() {
		return numberOfComp;
	}
	
	public Construct() {
		
	}
	public Construct(String NumberOfComp) {
		super();
		this.numberOfComp = NumberOfComp;
	}

	public void setNumberOfComp(String numberOfComp) {
		this.numberOfComp = numberOfComp;
	}

	public Component getComponent() {
		return component;
	}

	public void setComponent(Component component) {
		this.component = component;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}
	
	

}