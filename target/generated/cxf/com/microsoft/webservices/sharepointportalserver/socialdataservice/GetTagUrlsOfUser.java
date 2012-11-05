
package com.microsoft.webservices.sharepointportalserver.socialdataservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="termID" type="{http://microsoft.com/wsdl/types/}guid"/>
 *         &lt;element name="userAccountName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "termID",
    "userAccountName"
})
@XmlRootElement(name = "GetTagUrlsOfUser")
public class GetTagUrlsOfUser {

    @XmlElement(required = true)
    protected String termID;
    protected String userAccountName;

    /**
     * Gets the value of the termID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTermID() {
        return termID;
    }

    /**
     * Sets the value of the termID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTermID(String value) {
        this.termID = value;
    }

    /**
     * Gets the value of the userAccountName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserAccountName() {
        return userAccountName;
    }

    /**
     * Sets the value of the userAccountName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserAccountName(String value) {
        this.userAccountName = value;
    }

}
