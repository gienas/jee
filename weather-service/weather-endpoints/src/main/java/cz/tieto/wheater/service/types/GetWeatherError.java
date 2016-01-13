
package cz.tieto.wheater.service.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetWeatherError complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetWeatherError">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ClientErrorDescription" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="TechicalDetails" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ErrorCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetWeatherError", propOrder = {
    "clientErrorDescription",
    "techicalDetails",
    "errorCode"
})
public class GetWeatherError {

    @XmlElement(name = "ClientErrorDescription", required = true)
    protected String clientErrorDescription;
    @XmlElement(name = "TechicalDetails")
    protected String techicalDetails;
    @XmlElement(name = "ErrorCode")
    protected String errorCode;

    /**
     * Gets the value of the clientErrorDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientErrorDescription() {
        return clientErrorDescription;
    }

    /**
     * Sets the value of the clientErrorDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientErrorDescription(String value) {
        this.clientErrorDescription = value;
    }

    /**
     * Gets the value of the techicalDetails property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTechicalDetails() {
        return techicalDetails;
    }

    /**
     * Sets the value of the techicalDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTechicalDetails(String value) {
        this.techicalDetails = value;
    }

    /**
     * Gets the value of the errorCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorCode() {
        return errorCode;
    }

    /**
     * Sets the value of the errorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorCode(String value) {
        this.errorCode = value;
    }

}
