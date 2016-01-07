package business;

import javax.ejb.Local;

import domain.Place;
import domain.Weather;

@Local
public interface WeatherServiceLocal {
	/**
	 * 
	 * @param place
	 * @return
	 */
	Weather getWeather(Place place);
}
