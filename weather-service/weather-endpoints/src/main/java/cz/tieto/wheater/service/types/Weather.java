
package cz.tieto.wheater.service.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Location name
 * 
 * <p>Java class for Weather complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Weather">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CityName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Observation" type="{http://tieto.cz/wheater/service/types}Observation"/>
 *         &lt;element name="Temperature" type="{http://tieto.cz/wheater/service/types}Temperature"/>
 *         &lt;element name="Wind" type="{http://tieto.cz/wheater/service/types}Wind"/>
 *         &lt;element name="Humidity" type="{http://tieto.cz/wheater/service/types}Humidity"/>
 *         &lt;element name="Precipitation" type="{http://tieto.cz/wheater/service/types}Precipitation"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Weather", propOrder = {
    "cityName",
    "description",
    "observation",
    "temperature",
    "wind",
    "humidity",
    "precipitation"
})
public class Weather {

    @XmlElement(name = "CityName", required = true)
    protected String cityName;
    @XmlElement(name = "Description", required = true)
    protected String description;
    @XmlElement(name = "Observation", required = true)
    protected Observation observation;
    @XmlElement(name = "Temperature", required = true)
    protected Temperature temperature;
    @XmlElement(name = "Wind", required = true)
    protected Wind wind;
    @XmlElement(name = "Humidity", required = true)
    protected Humidity humidity;
    @XmlElement(name = "Precipitation", required = true)
    protected Precipitation precipitation;

    /**
     * Gets the value of the cityName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCityName() {
        return cityName;
    }

    /**
     * Sets the value of the cityName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCityName(String value) {
        this.cityName = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the observation property.
     * 
     * @return
     *     possible object is
     *     {@link Observation }
     *     
     */
    public Observation getObservation() {
        return observation;
    }

    /**
     * Sets the value of the observation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Observation }
     *     
     */
    public void setObservation(Observation value) {
        this.observation = value;
    }

    /**
     * Gets the value of the temperature property.
     * 
     * @return
     *     possible object is
     *     {@link Temperature }
     *     
     */
    public Temperature getTemperature() {
        return temperature;
    }

    /**
     * Sets the value of the temperature property.
     * 
     * @param value
     *     allowed object is
     *     {@link Temperature }
     *     
     */
    public void setTemperature(Temperature value) {
        this.temperature = value;
    }

    /**
     * Gets the value of the wind property.
     * 
     * @return
     *     possible object is
     *     {@link Wind }
     *     
     */
    public Wind getWind() {
        return wind;
    }

    /**
     * Sets the value of the wind property.
     * 
     * @param value
     *     allowed object is
     *     {@link Wind }
     *     
     */
    public void setWind(Wind value) {
        this.wind = value;
    }

    /**
     * Gets the value of the humidity property.
     * 
     * @return
     *     possible object is
     *     {@link Humidity }
     *     
     */
    public Humidity getHumidity() {
        return humidity;
    }

    /**
     * Sets the value of the humidity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Humidity }
     *     
     */
    public void setHumidity(Humidity value) {
        this.humidity = value;
    }

    /**
     * Gets the value of the precipitation property.
     * 
     * @return
     *     possible object is
     *     {@link Precipitation }
     *     
     */
    public Precipitation getPrecipitation() {
        return precipitation;
    }

    /**
     * Sets the value of the precipitation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Precipitation }
     *     
     */
    public void setPrecipitation(Precipitation value) {
        this.precipitation = value;
    }

}
