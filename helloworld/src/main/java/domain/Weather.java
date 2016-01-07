package domain;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement( name = "wheather")
public class Weather implements Serializable {
	
	public Weather() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Weather(Integer temperature) {
		super();
		this.temperature = temperature;
	}

	private Integer temperature;

	@XmlElement(name = "temperature")
	public Integer getTemperature() {
		return temperature;
	}

	public void setTemperature(Integer temperature) {
		this.temperature = temperature;
	}
	
	
}
