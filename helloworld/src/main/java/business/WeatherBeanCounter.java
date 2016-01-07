package business;

import javax.ejb.Schedule;
import javax.ejb.Singleton;
import javax.ejb.Startup;

@Startup
@Singleton
public class WeatherBeanCounter {

	int count = 0;
	
	public void addOne()
	{
		count++;
		System.out.println(" -- Container added bean, current we have " + count);
	}
	
	public void subOne()
	{
		count--;
		System.out.println(" -- Container substracted bean, current we have " + count);
	}
	
	@Schedule(month="*", dayOfMonth="*", dayOfWeek="*",hour="*", minute="*", second="0")
	public void showCurrentBeanNumber()
	{
		System.out.println(" -- Current number of weather beans " + count);
	}
}
