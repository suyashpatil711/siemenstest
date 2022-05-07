package com.siemens.siemens.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.siemens.siemens.Dao.MaterialDao;
import com.siemens.siemens.Pojo.Input;
import com.siemens.siemens.Pojo.Material;
import com.siemens.siemens.Pojo.Output;


@Service
@Transactional
public class UserService {

	@Autowired 
	private Output o;
	
	@Autowired
	private MaterialDao mdao;
	
	public int getDensitymat(String material) {
		
		//Material m=mdao.findByMaterial(material);
		Material m=mdao.getById(4);
		return m.getDensity();
	}
	
public int getCostmat(String material) {
		
		//Material m=mdao.findByMaterial(material);
		Material m=mdao.getById(4);
		
		return m.getCost();
	}
	public Output calculations(Input i) {
		
		double dia=i.getDia()*.01;
		double length=i.getLength()*.01;
		double vol= 0.785*(dia)*(dia)*(length);
		
		o.setVolume(vol);
		
		double wght= vol*getDensitymat(i.getMaterial());
		
		double costperunit=wght*getCostmat(i.getMaterial());
		
		o.setWeight(wght);
		o.setUcost(costperunit);
		
		double totalmatcost =costperunit*i.getQty();
		o.setTmatcost(totalmatcost);
		return o;
		
	}
}
