package com.siemens.siemens.Pojo;

import org.springframework.stereotype.Component;


public class Input {

	
	private int qty;
	private String material;
	private int length;
	private int dia;
	
	
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public int getDia() {
		return dia;
	}
	public void setDia(int dia) {
		this.dia = dia;
	}
	public Input(int qty, String material, int length, int dia) {
		super();
		this.qty = qty;
		this.material = material;
		this.length = length;
		this.dia = dia;
	}
	public Input() {
		super();
	}
	@Override
	public String toString() {
		return "Input [qty=" + qty + ", material=" + material + ", length=" + length + ", dia=" + dia + "]";
	}
	
	
}
