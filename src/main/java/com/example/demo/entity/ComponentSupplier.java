package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "component_supplier")
public class ComponentSupplier {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	//Component
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "fk_component_id", referencedColumnName = "componentId")
	private Component component;
	
	//Supplier
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "fk_supplier_id", referencedColumnName = "supplierId")
	private Supplier supplier;
	
	public ComponentSupplier() {
		
	}
	public ComponentSupplier(Integer Id) {
		super();
		this.id = Id;
	}
	public Component getComponent() {
		return component;
	}
	public void setComponent(Component component) {
		this.component = component;
	}
	public Supplier getSupplier() {
		return supplier;
	}
	public void setSupplier(Supplier supplier) {
		this.supplier = supplier;
	}
	
	

}