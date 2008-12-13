//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.3 in JDK 1.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2008.10.22 at 06:02:18 PM BRST 
//

package br.com.caelum.stella.nfe.modelo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SignedInfoType", namespace = "http://www.w3.org/2000/09/xmldsig#", propOrder = {
        "canonicalizationMethod", "signatureMethod", "reference" })
public class SignedInfoType {

    @XmlElement(name = "CanonicalizationMethod", namespace = "http://www.w3.org/2000/09/xmldsig#", required = true)
    protected CanonicalizationMethod canonicalizationMethod;

    @XmlElement(name = "SignatureMethod", namespace = "http://www.w3.org/2000/09/xmldsig#", required = true)
    protected SignatureMethod signatureMethod;

    @XmlElement(name = "Reference", namespace = "http://www.w3.org/2000/09/xmldsig#", required = true)
    protected ReferenceType reference;

    @XmlAttribute(name = "Id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;

    public CanonicalizationMethod getCanonicalizationMethod() {
        return canonicalizationMethod;
    }

    public void setCanonicalizationMethod(CanonicalizationMethod value) {
        this.canonicalizationMethod = value;
    }

    public SignatureMethod getSignatureMethod() {
        return signatureMethod;
    }

    public void setSignatureMethod(SignatureMethod value) {
        this.signatureMethod = value;
    }

    public ReferenceType getReference() {
        return reference;
    }

    public void setReference(ReferenceType value) {
        this.reference = value;
    }

    public String getId() {
        return id;
    }

    public void setId(String value) {
        this.id = value;
    }

}
