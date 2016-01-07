package controller.jsf;

import javax.faces.bean.ManagedBean;
import javax.inject.Inject;

import business.WeatherServiceLocal;
import domain.Place;
import domain.Weather;

@ManagedBean
public class WeatherBean {

	Weather weather = new Weather();
	Place place = new Place();
	
	@Inject
	WeatherServiceLocal weatherServiceLocal;
	
	
	public void ask()
	{
		weather = weatherServiceLocal.getWeather(place);
		System.out.println(weather.getTemperature());
	}
	
	
	public Weather getWeather() {
		return weather;
	}
	public void setWeather(Weather weather) {
		this.weather = weather;
	}
	public Place getPlace() {
		return place;
	}
	public void setPlace(Place place) {
		this.place = place;
	}
	
	
}
