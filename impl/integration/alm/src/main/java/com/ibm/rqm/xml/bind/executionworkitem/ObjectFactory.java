//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.07.13 at 12:00:05 PM BRT 
//


package com.ibm.rqm.xml.bind.executionworkitem;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.ibm.rqm.xml.bind.executionworkitem package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Regression_QNAME = new QName("http://jazz.net/xmlns/alm/qm/v0.1/executionworkitem/v0.1", "regression");
    private final static QName _Weight_QNAME = new QName("http://jazz.net/xmlns/alm/qm/v0.1/executionworkitem/v0.1", "weight");
    private final static QName _Frequency_QNAME = new QName("http://jazz.net/xmlns/alm/qm/v0.1/executionworkitem/v0.1", "frequency");
    private final static QName _Tags_QNAME = new QName("http://jazz.net/xmlns/alm/qm/v0.1/executionworkitem/v0.1", "tags");
    private final static QName _Legacydata_QNAME = new QName("http://jazz.net/xmlns/alm/qm/v0.1/executionworkitem/v0.1", "legacydata");
    private final static QName _Notes_QNAME = new QName("http://jazz.net/xmlns/alm/qm/v0.1/executionworkitem/v0.1", "notes");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.ibm.rqm.xml.bind.executionworkitem
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Priority }
     * 
     */
    public Priority createPriority() {
        return new Priority();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jazz.net/xmlns/alm/qm/v0.1/executionworkitem/v0.1", name = "regression")
    public JAXBElement<Boolean> createRegression(Boolean value) {
        return new JAXBElement<Boolean>(_Regression_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jazz.net/xmlns/alm/qm/v0.1/executionworkitem/v0.1", name = "weight")
    public JAXBElement<Integer> createWeight(Integer value) {
        return new JAXBElement<Integer>(_Weight_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jazz.net/xmlns/alm/qm/v0.1/executionworkitem/v0.1", name = "frequency")
    public JAXBElement<String> createFrequency(String value) {
        return new JAXBElement<String>(_Frequency_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jazz.net/xmlns/alm/qm/v0.1/executionworkitem/v0.1", name = "tags")
    public JAXBElement<String> createTags(String value) {
        return new JAXBElement<String>(_Tags_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jazz.net/xmlns/alm/qm/v0.1/executionworkitem/v0.1", name = "legacydata")
    public JAXBElement<String> createLegacydata(String value) {
        return new JAXBElement<String>(_Legacydata_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jazz.net/xmlns/alm/qm/v0.1/executionworkitem/v0.1", name = "notes")
    public JAXBElement<String> createNotes(String value) {
        return new JAXBElement<String>(_Notes_QNAME, String.class, null, value);
    }

}