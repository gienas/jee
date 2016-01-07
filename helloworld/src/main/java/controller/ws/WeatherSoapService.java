package controller.ws;

import javax.annotation.PostConstruct;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.interceptor.Interceptors;
import javax.jws.WebService;

import business.WeatherServiceLocal;
import domain.Place;
import domain.Weather;

@Stateless
@WebService
@Interceptors({TestInterceptor.class})
public class WeatherSoapService {
	
	@Inject
	private WeatherServiceLocal weatherService;
	
//	@PostConstruct
//	public void init()
//	{
//		System.out.println("-- Bean " + getClass().getName() + " created");
//	}

	
	public Weather getWeather(String placeName) {
		System.out.println("-- getWeather call " );
		return weatherService.getWeather(new Place(placeName));
	}
	
	
}
