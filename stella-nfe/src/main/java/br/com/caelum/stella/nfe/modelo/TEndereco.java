//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.3 in JDK 1.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2008.10.22 at 06:02:18 PM BRST 
//

package br.com.caelum.stella.nfe.modelo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TEndereco", propOrder = { "xLgr", "nro", "xCpl", "xBairro", "cMun", "xMun", "uf", "cep", "cPais",
        "xPais", "fone" })
public class TEndereco {

    @XmlElement(required = true)
    protected String xLgr;

    @XmlElement(required = true)
    protected String nro;

    protected String xCpl;

    @XmlElement(required = true)
    protected String xBairro;

    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String cMun;

    @XmlElement(required = true)
    protected String xMun;

    @XmlElement(name = "UF", required = true)
    protected TUf uf;

    @XmlElement(name = "CEP")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String cep;

    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String cPais;

    protected String xPais;

    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String fone;

    public String getXLgr() {
        return xLgr;
    }

    public void setXLgr(String value) {
        this.xLgr = value;
    }

    public String getNro() {
        return nro;
    }

    public void setNro(String value) {
        this.nro = value;
    }

    public String getXCpl() {
        return xCpl;
    }

    public void setXCpl(String value) {
        this.xCpl = value;
    }

    public String getXBairro() {
        return xBairro;
    }

    public void setXBairro(String value) {
        this.xBairro = value;
    }

    public String getCMun() {
        return cMun;
    }

    public void setCMun(String value) {
        this.cMun = value;
    }

    public String getXMun() {
        return xMun;
    }

    public void setXMun(String value) {
        this.xMun = value;
    }

    public TUf getUF() {
        return uf;
    }

    public void setUF(TUf value) {
        this.uf = value;
    }

    public String getCEP() {
        return cep;
    }

    public void setCEP(String value) {
        this.cep = value;
    }

    public String getCPais() {
        return cPais;
    }

    public void setCPais(String value) {
        this.cPais = value;
    }

    public String getXPais() {
        return xPais;
    }

    public void setXPais(String value) {
        this.xPais = value;
    }

    public String getFone() {
        return fone;
    }

    public void setFone(String value) {
        this.fone = value;
    }

}
