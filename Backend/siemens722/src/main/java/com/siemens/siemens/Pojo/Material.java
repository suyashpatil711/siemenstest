package com.siemens.siemens.Pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Material {

	@Id
	private int matid;
	
	@Column
	private String material;
	
	@Column
	private int density;
	
	@Column
	private int cost;

	public int getMatid() {
		return matid;
	}

	public void setMatid(int matid) {
		this.matid = matid;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public int getDensity() {
		return density;
	}

	public void setDensity(int density) {
		this.density = density;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public Material(int matid, String material, int density, int cost) {
		super();
		this.matid = matid;
		this.material = material;
		this.density = density;
		this.cost = cost;
	}

	public Material() {
		super();
	}

	@Override
	public String toString() {
		return "Material [matid=" + matid + ", material=" + material + ", density=" + density + ", cost=" + cost + "]";
	}
	
	
	
}
