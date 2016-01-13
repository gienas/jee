package cz.tieto.weather.business;

import javax.ejb.Remote;

import cz.tieto.weather.model.PlaceDO;
import cz.tieto.weather.model.WeatherDO;

@Remote
public interface WeatherServiceRemote {
	/**
	 * 
	 * @param place
	 * @return
	 */
	WeatherDO getWeather(PlaceDO place);
}
