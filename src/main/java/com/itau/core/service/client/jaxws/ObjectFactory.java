
package com.itau.core.service.client.jaxws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.itau.core.service.server.TransfersImpl package. 
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

    private final static QName _PostCreate_QNAME = new QName("http://server.service.core.itau.com/", "postCreate");
    private final static QName _PostCreateResponse_QNAME = new QName("http://server.service.core.itau.com/", "postCreateResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.itau.core.service.server.TransfersImpl
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PostCreateResponse }
     * 
     */
    public PostCreateResponse createPostCreateResponse() {
        return new PostCreateResponse();
    }

    /**
     * Create an instance of {@link PostCreate }
     * 
     */
    public PostCreate createPostCreate() {
        return new PostCreate();
    }

    /**
     * Create an instance of {@link Transfer }
     * 
     */
    public Transfer createTransfer() {
        return new Transfer();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PostCreate }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.service.core.itau.com/", name = "postCreate")
    public JAXBElement<PostCreate> createPostCreate(PostCreate value) {
        return new JAXBElement<PostCreate>(_PostCreate_QNAME, PostCreate.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PostCreateResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.service.core.itau.com/", name = "postCreateResponse")
    public JAXBElement<PostCreateResponse> createPostCreateResponse(PostCreateResponse value) {
        return new JAXBElement<PostCreateResponse>(_PostCreateResponse_QNAME, PostCreateResponse.class, null, value);
    }

}
