//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.2-147 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.02.24 at 09:29:47 AM BRT 
//


package com.viglet.turing.plugins.otca.response.xml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ServerResponseSentimentResultSentenceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServerResponseSentimentResultSentenceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Text" type="{}ServerResponseSentimentResultSentenceTextType" minOccurs="0"/>
 *         &lt;element name="Subjectivity" type="{}ServerResponseSentimentResultSentenceSubjectivityType" minOccurs="0"/>
 *         &lt;element name="PositiveTone" type="{}ServerResponseSentimentResultSentenceToneType" minOccurs="0"/>
 *         &lt;element name="NegativeTone" type="{}ServerResponseSentimentResultSentenceToneType" minOccurs="0"/>
 *         &lt;element name="Tone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServerResponseSentimentResultSentenceType", propOrder = {
    "text",
    "subjectivity",
    "positiveTone",
    "negativeTone",
    "tone"
})
public class ServerResponseSentimentResultSentenceType {

    @XmlElement(name = "Text")
    protected ServerResponseSentimentResultSentenceTextType text;
    @XmlElement(name = "Subjectivity")
    protected ServerResponseSentimentResultSentenceSubjectivityType subjectivity;
    @XmlElement(name = "PositiveTone")
    protected ServerResponseSentimentResultSentenceToneType positiveTone;
    @XmlElement(name = "NegativeTone")
    protected ServerResponseSentimentResultSentenceToneType negativeTone;
    @XmlElement(name = "Tone")
    protected String tone;

    /**
     * Gets the value of the text property.
     * 
     * @return
     *     possible object is
     *     {@link ServerResponseSentimentResultSentenceTextType }
     *     
     */
    public ServerResponseSentimentResultSentenceTextType getText() {
        return text;
    }

    /**
     * Sets the value of the text property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServerResponseSentimentResultSentenceTextType }
     *     
     */
    public void setText(ServerResponseSentimentResultSentenceTextType value) {
        this.text = value;
    }

    /**
     * Gets the value of the subjectivity property.
     * 
     * @return
     *     possible object is
     *     {@link ServerResponseSentimentResultSentenceSubjectivityType }
     *     
     */
    public ServerResponseSentimentResultSentenceSubjectivityType getSubjectivity() {
        return subjectivity;
    }

    /**
     * Sets the value of the subjectivity property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServerResponseSentimentResultSentenceSubjectivityType }
     *     
     */
    public void setSubjectivity(ServerResponseSentimentResultSentenceSubjectivityType value) {
        this.subjectivity = value;
    }

    /**
     * Gets the value of the positiveTone property.
     * 
     * @return
     *     possible object is
     *     {@link ServerResponseSentimentResultSentenceToneType }
     *     
     */
    public ServerResponseSentimentResultSentenceToneType getPositiveTone() {
        return positiveTone;
    }

    /**
     * Sets the value of the positiveTone property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServerResponseSentimentResultSentenceToneType }
     *     
     */
    public void setPositiveTone(ServerResponseSentimentResultSentenceToneType value) {
        this.positiveTone = value;
    }

    /**
     * Gets the value of the negativeTone property.
     * 
     * @return
     *     possible object is
     *     {@link ServerResponseSentimentResultSentenceToneType }
     *     
     */
    public ServerResponseSentimentResultSentenceToneType getNegativeTone() {
        return negativeTone;
    }

    /**
     * Sets the value of the negativeTone property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServerResponseSentimentResultSentenceToneType }
     *     
     */
    public void setNegativeTone(ServerResponseSentimentResultSentenceToneType value) {
        this.negativeTone = value;
    }

    /**
     * Gets the value of the tone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTone() {
        return tone;
    }

    /**
     * Sets the value of the tone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTone(String value) {
        this.tone = value;
    }

}
