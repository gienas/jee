package business;

import java.util.Random;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.xml.ws.spi.WebServiceFeatureAnnotation;

import domain.Place;
import domain.Weather;

@Stateless
public class WeatherService implements WeatherServiceLocal, WeatherServiceRemote {

	@Inject
	WeatherBeanCounter counter;
	
	@PostConstruct
	public void init() {
		counter.addOne();
	}

	public Weather getWeather(Place place) {
		// TODO Auto-generated method stub
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Random gen = new Random();
		int temp = gen.nextInt(10);
		return new Weather(temp);
	}

	@PreDestroy
	public void destroy()
	{
		counter.subOne();
	}
}
