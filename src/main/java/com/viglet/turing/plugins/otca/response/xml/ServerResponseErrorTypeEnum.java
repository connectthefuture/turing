//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.2-147 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.02.24 at 09:29:47 AM BRT 
//


package com.viglet.turing.plugins.otca.response.xml;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ServerResponseErrorTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ServerResponseErrorTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Status"/>
 *     &lt;enumeration value="Error"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ServerResponseErrorTypeEnum")
@XmlEnum
public enum ServerResponseErrorTypeEnum {

    @XmlEnumValue("Status")
    STATUS("Status"),
    @XmlEnumValue("Error")
    ERROR("Error");
    private final String value;

    ServerResponseErrorTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ServerResponseErrorTypeEnum fromValue(String v) {
        for (ServerResponseErrorTypeEnum c: ServerResponseErrorTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
