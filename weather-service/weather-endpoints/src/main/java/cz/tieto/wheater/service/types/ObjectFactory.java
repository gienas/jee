
package cz.tieto.wheater.service.types;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the cz.tieto.wheater.service.types package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Observation_QNAME = new QName("http://tieto.cz/wheater/service/types", "Observation");
    private final static QName _Locations_QNAME = new QName("http://tieto.cz/wheater/service/types", "Locations");
    private final static QName _GetWeatherError_QNAME = new QName("http://tieto.cz/wheater/service/types", "GetWeatherError");
    private final static QName _GetWeatherOutput_QNAME = new QName("http://tieto.cz/wheater/service/types", "GetWeatherOutput");
    private final static QName _Location_QNAME = new QName("http://tieto.cz/wheater/service/types", "Location");
    private final static QName _Temperature_QNAME = new QName("http://tieto.cz/wheater/service/types", "Temperature");
    private final static QName _Precipitation_QNAME = new QName("http://tieto.cz/wheater/service/types", "Precipitation");
    private final static QName _Weather_QNAME = new QName("http://tieto.cz/wheater/service/types", "Weather");
    private final static QName _Wind_QNAME = new QName("http://tieto.cz/wheater/service/types", "Wind");
    private final static QName _GetWeatherInput_QNAME = new QName("http://tieto.cz/wheater/service/types", "GetWeatherInput");
    private final static QName _Humidity_QNAME = new QName("http://tieto.cz/wheater/service/types", "Humidity");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: cz.tieto.wheater.service.types
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Wind }
     * 
     */
    public Wind createWind() {
        return new Wind();
    }

    /**
     * Create an instance of {@link Precipitation }
     * 
     */
    public Precipitation createPrecipitation() {
        return new Precipitation();
    }

    /**
     * Create an instance of {@link Humidity }
     * 
     */
    public Humidity createHumidity() {
        return new Humidity();
    }

    /**
     * Create an instance of {@link GetWeatherError }
     * 
     */
    public GetWeatherError createGetWeatherError() {
        return new GetWeatherError();
    }

    /**
     * Create an instance of {@link GetWeatherInput }
     * 
     */
    public GetWeatherInput createGetWeatherInput() {
        return new GetWeatherInput();
    }

    /**
     * Create an instance of {@link Locations }
     * 
     */
    public Locations createLocations() {
        return new Locations();
    }

    /**
     * Create an instance of {@link GetWeatherOutput }
     * 
     */
    public GetWeatherOutput createGetWeatherOutput() {
        return new GetWeatherOutput();
    }

    /**
     * Create an instance of {@link Location }
     * 
     */
    public Location createLocation() {
        return new Location();
    }

    /**
     * Create an instance of {@link Weather }
     * 
     */
    public Weather createWeather() {
        return new Weather();
    }

    /**
     * Create an instance of {@link Observation }
     * 
     */
    public Observation createObservation() {
        return new Observation();
    }

    /**
     * Create an instance of {@link Temperature }
     * 
     */
    public Temperature createTemperature() {
        return new Temperature();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Observation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tieto.cz/wheater/service/types", name = "Observation")
    public JAXBElement<Observation> createObservation(Observation value) {
        return new JAXBElement<Observation>(_Observation_QNAME, Observation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Locations }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tieto.cz/wheater/service/types", name = "Locations")
    public JAXBElement<Locations> createLocations(Locations value) {
        return new JAXBElement<Locations>(_Locations_QNAME, Locations.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetWeatherError }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tieto.cz/wheater/service/types", name = "GetWeatherError")
    public JAXBElement<GetWeatherError> createGetWeatherError(GetWeatherError value) {
        return new JAXBElement<GetWeatherError>(_GetWeatherError_QNAME, GetWeatherError.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetWeatherOutput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tieto.cz/wheater/service/types", name = "GetWeatherOutput")
    public JAXBElement<GetWeatherOutput> createGetWeatherOutput(GetWeatherOutput value) {
        return new JAXBElement<GetWeatherOutput>(_GetWeatherOutput_QNAME, GetWeatherOutput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Location }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tieto.cz/wheater/service/types", name = "Location")
    public JAXBElement<Location> createLocation(Location value) {
        return new JAXBElement<Location>(_Location_QNAME, Location.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Temperature }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tieto.cz/wheater/service/types", name = "Temperature")
    public JAXBElement<Temperature> createTemperature(Temperature value) {
        return new JAXBElement<Temperature>(_Temperature_QNAME, Temperature.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Precipitation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tieto.cz/wheater/service/types", name = "Precipitation")
    public JAXBElement<Precipitation> createPrecipitation(Precipitation value) {
        return new JAXBElement<Precipitation>(_Precipitation_QNAME, Precipitation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Weather }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tieto.cz/wheater/service/types", name = "Weather")
    public JAXBElement<Weather> createWeather(Weather value) {
        return new JAXBElement<Weather>(_Weather_QNAME, Weather.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Wind }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tieto.cz/wheater/service/types", name = "Wind")
    public JAXBElement<Wind> createWind(Wind value) {
        return new JAXBElement<Wind>(_Wind_QNAME, Wind.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetWeatherInput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tieto.cz/wheater/service/types", name = "GetWeatherInput")
    public JAXBElement<GetWeatherInput> createGetWeatherInput(GetWeatherInput value) {
        return new JAXBElement<GetWeatherInput>(_GetWeatherInput_QNAME, GetWeatherInput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Humidity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tieto.cz/wheater/service/types", name = "Humidity")
    public JAXBElement<Humidity> createHumidity(Humidity value) {
        return new JAXBElement<Humidity>(_Humidity_QNAME, Humidity.class, null, value);
    }

}
