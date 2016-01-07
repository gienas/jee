package domain;

import java.io.Serializable;

public class Place implements Serializable {
	
	public Place() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Place(String name) {
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
