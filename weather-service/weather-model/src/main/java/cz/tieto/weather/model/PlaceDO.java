package cz.tieto.weather.model;

import java.io.Serializable;

public class PlaceDO implements Serializable {
	
	public PlaceDO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PlaceDO(String name) {
		super();
		this.name = name;
	}

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
