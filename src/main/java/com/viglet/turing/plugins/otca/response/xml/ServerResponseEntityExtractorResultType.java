//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.2-147 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.02.24 at 09:29:47 AM BRT 
//


package com.viglet.turing.plugins.otca.response.xml;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ServerResponseEntityExtractorResultType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServerResponseEntityExtractorResultType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice maxOccurs="unbounded" minOccurs="0">
 *           &lt;element name="nfExtract" type="{}ServerResponseEntityExtractorResultExtractResultType"/>
 *           &lt;element name="nfFullTextSearch" type="{}ServerResponseEntityExtractorResultFullTextSearchResultType"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServerResponseEntityExtractorResultType", propOrder = {
    "nfExtractOrNfFullTextSearch"
})
public class ServerResponseEntityExtractorResultType {

    @XmlElements({
        @XmlElement(name = "nfFullTextSearch", type = ServerResponseEntityExtractorResultFullTextSearchResultType.class),
        @XmlElement(name = "nfExtract", type = ServerResponseEntityExtractorResultExtractResultType.class)
    })
    protected List<Object> nfExtractOrNfFullTextSearch;
    @XmlAttribute(name = "Name")
    protected String name;

    /**
     * Gets the value of the nfExtractOrNfFullTextSearch property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nfExtractOrNfFullTextSearch property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNfExtractOrNfFullTextSearch().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ServerResponseEntityExtractorResultFullTextSearchResultType }
     * {@link ServerResponseEntityExtractorResultExtractResultType }
     * 
     * 
     */
    public List<Object> getNfExtractOrNfFullTextSearch() {
        if (nfExtractOrNfFullTextSearch == null) {
            nfExtractOrNfFullTextSearch = new ArrayList<Object>();
        }
        return this.nfExtractOrNfFullTextSearch;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

}
