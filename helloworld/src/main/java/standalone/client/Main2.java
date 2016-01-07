package standalone.client;

import java.util.Properties;

import javax.naming.Context;
import javax.naming.InitialContext;

import org.jboss.ejb.client.EJBClientContext;
import org.jboss.ejb.client.PropertiesBasedEJBClientConfiguration;
import org.jboss.ejb.client.remoting.ConfigBasedEJBClientContextSelector;

import business.WeatherServiceRemote;
import domain.Place;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello Weather");
		try {

			
			Properties props = new Properties();
			props.put(Context.URL_PKG_PREFIXES, "org.jboss.ejb.client.naming");
	        props.put(Context.PROVIDER_URL, "http-remoting://localhost:8080");
	        props.put(Context.INITIAL_CONTEXT_FACTORY, "org.jboss.naming.remote.client.InitialContextFactory");
	        props.put(Context.SECURITY_PRINCIPAL, "guest");
	        props.put(Context.SECURITY_CREDENTIALS, "guest");
	        props.put("jboss.naming.client.ejb.context", true);
	        
			//props.put("jboss.naming.client.ejb.context", true);
			InitialContext ctx = new InitialContext(props);

			WeatherServiceRemote service = (WeatherServiceRemote) ctx
					.lookup("helloworld/WeatherService!business.WeatherServiceRemote");
			if (service == null) {
				System.out.println("lookup is null");
				return;
			}

			System.out.println(service.getWeather(new Place("Ostrava")));

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
