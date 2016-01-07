package controller.ws;

import javax.annotation.PostConstruct;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

import business.WeatherServiceLocal;
import domain.Place;
import domain.Weather;

//@Stateless
@Path("/weather")
public class WeatherRestService {

	@Inject
	WeatherServiceLocal weatherService;

	@PostConstruct
	public void init()
	{
		System.out.println("-- Bean " + getClass().getName() + " created");
	}

	
	@GET
	@Path("/xml")
	@Produces("application/xml")
	public Weather getWeather(@QueryParam("placeName") @DefaultValue("Ostrava") String placeName) {
		return weatherService.getWeather(new Place(placeName));

	}

}
