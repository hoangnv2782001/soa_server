
package client;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the client package. 
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

    private final static QName _CalculateFee_QNAME = new QName("http://bai1/", "calculateFee");
    private final static QName _CalculateFeeResponse_QNAME = new QName("http://bai1/", "calculateFeeResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: client
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CalculateFee }
     * 
     */
    public CalculateFee createCalculateFee() {
        return new CalculateFee();
    }

    /**
     * Create an instance of {@link CalculateFeeResponse }
     * 
     */
    public CalculateFeeResponse createCalculateFeeResponse() {
        return new CalculateFeeResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CalculateFee }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bai1/", name = "calculateFee")
    public JAXBElement<CalculateFee> createCalculateFee(CalculateFee value) {
        return new JAXBElement<CalculateFee>(_CalculateFee_QNAME, CalculateFee.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CalculateFeeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bai1/", name = "calculateFeeResponse")
    public JAXBElement<CalculateFeeResponse> createCalculateFeeResponse(CalculateFeeResponse value) {
        return new JAXBElement<CalculateFeeResponse>(_CalculateFeeResponse_QNAME, CalculateFeeResponse.class, null, value);
    }

}
