package cz.tieto.weather.endpoints;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.jws.WebService;

import cz.tieto.weather.business.WeatherService;
import cz.tieto.weather.business.WeatherServiceLocal;
import cz.tieto.weather.model.PlaceDO;
import cz.tieto.weather.model.WeatherDO;
import cz.tieto.wheater.service.GetWeatherError;
import cz.tieto.wheater.service.WeatherPortTypeSOAP;
import cz.tieto.wheater.service.types.GetWeatherInput;
import cz.tieto.wheater.service.types.GetWeatherOutput;
import cz.tieto.wheater.service.types.Weather;


@WebService(targetNamespace = "http://tieto.cz/wheater/service", name = "WeatherPortTypeSOAP")
public class WeatherPortTypeSOAPImpl implements WeatherPortTypeSOAP {

	// inject servic from business layer
	@Inject
	WeatherServiceLocal service;

	@Override
	public GetWeatherOutput getWeather(GetWeatherInput getWeatherInput) throws GetWeatherError {
		// prepare and map input from XML do business domain
		PlaceDO input =  mapFromXml(getWeatherInput);
		//call service
		WeatherDO businessOutput =  service.getWeather(input);
		//map output to XML from business domain
		GetWeatherOutput xmlOutput = mapToXml(businessOutput);
		
//		GetWeatherOutput out = new GetWeatherOutput();
//		Weather weather = new Weather();
//		weather.setCityName("Ostrava");
//		weather.setDescription("Temperature in Ostrava +2");
//		out.getWeather().add(weather);
		
		return xmlOutput;
	}

	private PlaceDO mapFromXml( GetWeatherInput xmlInput )
	{
		PlaceDO placeDO = new PlaceDO();
		//FIXME multi flocations
		placeDO.setName(xmlInput.getLocations().getLocation().get(0).getCityName());
		return placeDO;
	}

	
	private GetWeatherOutput mapToXml( WeatherDO businessOutput)
	{
		GetWeatherOutput out = new GetWeatherOutput();
		Weather weather = new Weather();
		weather.setDescription("Temperature is " + businessOutput.getTemperature());
		out.getWeather().add(weather);
		return out;
	}
//	
	
}
