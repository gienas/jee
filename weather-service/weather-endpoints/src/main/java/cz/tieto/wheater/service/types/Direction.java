
package cz.tieto.wheater.service.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Direction.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Direction">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="East"/>
 *     &lt;enumeration value="East-Northeast"/>
 *     &lt;enumeration value="East-Southeast"/>
 *     &lt;enumeration value="North"/>
 *     &lt;enumeration value="North-Northeast"/>
 *     &lt;enumeration value="North-Northwest"/>
 *     &lt;enumeration value="Northeast"/>
 *     &lt;enumeration value="Northwest"/>
 *     &lt;enumeration value="South"/>
 *     &lt;enumeration value="South-Southeast"/>
 *     &lt;enumeration value="South-Southwest"/>
 *     &lt;enumeration value="Southeast"/>
 *     &lt;enumeration value="Southwest"/>
 *     &lt;enumeration value="West"/>
 *     &lt;enumeration value="West-Northwest"/>
 *     &lt;enumeration value="West-Southwest"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Direction")
@XmlEnum
public enum Direction {

    @XmlEnumValue("East")
    EAST("East"),
    @XmlEnumValue("East-Northeast")
    EAST_NORTHEAST("East-Northeast"),
    @XmlEnumValue("East-Southeast")
    EAST_SOUTHEAST("East-Southeast"),
    @XmlEnumValue("North")
    NORTH("North"),
    @XmlEnumValue("North-Northeast")
    NORTH_NORTHEAST("North-Northeast"),
    @XmlEnumValue("North-Northwest")
    NORTH_NORTHWEST("North-Northwest"),
    @XmlEnumValue("Northeast")
    NORTHEAST("Northeast"),
    @XmlEnumValue("Northwest")
    NORTHWEST("Northwest"),
    @XmlEnumValue("South")
    SOUTH("South"),
    @XmlEnumValue("South-Southeast")
    SOUTH_SOUTHEAST("South-Southeast"),
    @XmlEnumValue("South-Southwest")
    SOUTH_SOUTHWEST("South-Southwest"),
    @XmlEnumValue("Southeast")
    SOUTHEAST("Southeast"),
    @XmlEnumValue("Southwest")
    SOUTHWEST("Southwest"),
    @XmlEnumValue("West")
    WEST("West"),
    @XmlEnumValue("West-Northwest")
    WEST_NORTHWEST("West-Northwest"),
    @XmlEnumValue("West-Southwest")
    WEST_SOUTHWEST("West-Southwest");
    private final String value;

    Direction(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Direction fromValue(String v) {
        for (Direction c: Direction.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
