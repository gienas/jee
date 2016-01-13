package cz.tieto.weather.model;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;


public class WeatherDO implements Serializable {
	
	public WeatherDO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public WeatherDO(Integer temperature) {
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
