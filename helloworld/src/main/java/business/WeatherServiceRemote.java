package business;

import javax.ejb.Local;
import javax.ejb.Remote;

import domain.Place;
import domain.Weather;

@Remote
public interface WeatherServiceRemote {
	/**
	 * 
	 * @param place
	 * @return
	 */
	Weather getWeather(Place place);
}
