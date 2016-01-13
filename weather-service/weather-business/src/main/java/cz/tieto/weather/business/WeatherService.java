package cz.tieto.weather.business;

import java.util.Random;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.ejb.Stateless;
import javax.inject.Inject;

import cz.tieto.weather.model.PlaceDO;
import cz.tieto.weather.model.WeatherDO;

@Stateless
public class WeatherService implements WeatherServiceLocal, WeatherServiceRemote {

	@Inject
	WeatherBeanCounter counter;
	
	@PostConstruct
	public void init() {
		counter.addOne();
	}

	public WeatherDO getWeather(PlaceDO place) {
		// TODO Auto-generated method stub
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//FIXME call connectors layer
		Random gen = new Random();
		int temp = gen.nextInt(10);
		return new WeatherDO(temp);
	}

	@PreDestroy
	public void destroy()
	{
		counter.subOne();
	}
}
