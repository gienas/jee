package standalone.client;

import java.util.Properties;

import javax.naming.Context;
import javax.naming.InitialContext;

import business.WeatherServiceRemote;
import domain.Place;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello Weather");
		try {

			Properties props = new Properties();
			props.put(Context.INITIAL_CONTEXT_FACTORY, "org.jboss.naming.remote.client.InitialContextFactory");
			props.put(Context.PROVIDER_URL, "http-remoting://localhost:8080");
			//props.put(Context.SECURITY_PRINCIPAL, "admin");
			//props.put(Context.SECURITY_CREDENTIALS, "admin123");
			props.put(Context.URL_PKG_PREFIXES, "org.jboss.ejb.client.naming");
			props.put("jboss.naming.client.ejb.context", true);
			InitialContext ctx = new InitialContext(props);

			WeatherServiceRemote service = (WeatherServiceRemote) ctx
					.lookup("helloworld/WeatherService!business.WeatherServiceRemote");
			if (service == null) {
				System.out.println("lookup is null");
				return;
			}
			System.out.println("Temperature in ostrava " + service.getWeather(new Place("Ostrava")).getTemperature() );

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

// final Hashtable jndiProperties = new Hashtable();
// jndiProperties.put(Context.URL_PKG_PREFIXES,
// "org.jboss.ejb.client.naming")

// Properties clientProperties = new Properties();
// clientProperties.put("remote.connectionprovider.create.options.org.xnio.Options.SSL_ENABLED",
// "false");
// clientProperties.put("remote.connections", "default");
// clientProperties.put("remote.connection.default.port", "8080");
// clientProperties.put("remote.connection.default.host", "localhost");
//// clientProperties.put("remote.connection.default.username", "ejb");
//// clientProperties.put("remote.connection.default.password",
// "wuqian@891210");
// clientProperties.put("remote.connection.default.connect.options.org.xnio.Options.SASL_POLICY_NOANONYMOUS",
// "false");
// EJBClientContext.setSelector(new ConfigBasedEJBClientContextSelector(new
// PropertiesBasedEJBClientConfiguration(clientProperties)));
