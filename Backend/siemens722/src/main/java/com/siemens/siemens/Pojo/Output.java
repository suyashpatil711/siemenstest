package com.siemens.siemens.Pojo;

import org.springframework.stereotype.Component;

@Component
public class Output {

	private double volume;
	private double weight;
	private double ucost;
	private double tmatcost;
	public double getVolume() {
		return volume;
	}
	public void setVolume(double volume) {
		this.volume = volume;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public double getUcost() {
		return ucost;
	}
	public void setUcost(double ucost) {
		this.ucost = ucost;
	}
	public double getTmatcost() {
		return tmatcost;
	}
	public void setTmatcost(double tmatcost) {
		this.tmatcost = tmatcost;
	}
	public Output(double volume, double weight, double ucost, double tmatcost) {
		super();
		this.volume = volume;
		this.weight = weight;
		this.ucost = ucost;
		this.tmatcost = tmatcost;
	}
	public Output() {
		super();
	}
	@Override
	public String toString() {
		return "Output [volume=" + volume + ", weight=" + weight + ", ucost=" + ucost + ", tmatcost=" + tmatcost + "]";
	}
	
	
	
}
