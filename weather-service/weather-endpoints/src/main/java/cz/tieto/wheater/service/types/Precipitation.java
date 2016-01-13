
package cz.tieto.wheater.service.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Are precipitation present ?
 * 
 * <p>Java class for Precipitation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Precipitation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ArePresent" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Precipitation", propOrder = {
    "arePresent"
})
public class Precipitation {

    @XmlElement(name = "ArePresent")
    protected boolean arePresent;

    /**
     * Gets the value of the arePresent property.
     * 
     */
    public boolean isArePresent() {
        return arePresent;
    }

    /**
     * Sets the value of the arePresent property.
     * 
     */
    public void setArePresent(boolean value) {
        this.arePresent = value;
    }

}
