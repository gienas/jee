package cz.tieto.weather.business;

import javax.ejb.Local;

import cz.tieto.weather.model.PlaceDO;
import cz.tieto.weather.model.WeatherDO;

@Local
public interface WeatherServiceLocal {
	/**
	 * 
	 * @param place
	 * @return
	 */
	WeatherDO getWeather(PlaceDO place);
}
