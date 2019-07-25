
package com.itau.core.service.client;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;

import com.itau.core.service.server.TransfersServer;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "TransfersImplService", targetNamespace = "http://server.service.core.itau.com/", wsdlLocation = "http://itau-core:9090/services/transfers?wsdl")
public class TransfersClientImpl
    extends Service
{

    private final static URL TRANSFERSIMPLSERVICE_WSDL_LOCATION;
    private final static WebServiceException TRANSFERSIMPLSERVICE_EXCEPTION;
    private final static QName TRANSFERSIMPLSERVICE_QNAME = new QName("http://server.service.core.itau.com/", "TransfersImplService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://itau-core:9090/services/transfers?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        TRANSFERSIMPLSERVICE_WSDL_LOCATION = url;
        TRANSFERSIMPLSERVICE_EXCEPTION = e;
    }

    public TransfersClientImpl() {
        super(__getWsdlLocation(), TRANSFERSIMPLSERVICE_QNAME);
    }

    public TransfersClientImpl(WebServiceFeature... features) {
        super(__getWsdlLocation(), TRANSFERSIMPLSERVICE_QNAME, features);
    }

    public TransfersClientImpl(URL wsdlLocation) {
        super(wsdlLocation, TRANSFERSIMPLSERVICE_QNAME);
    }

    public TransfersClientImpl(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, TRANSFERSIMPLSERVICE_QNAME, features);
    }

    public TransfersClientImpl(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public TransfersClientImpl(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns TransfersImpl
     */
    @WebEndpoint(name = "TransfersImplPort")
    public TransfersServer getTransfersImplPort() {
        return super.getPort(new QName("http://server.service.core.itau.com/", "TransfersImplPort"), TransfersServer.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns TransfersImpl
     */
    @WebEndpoint(name = "TransfersImplPort")
    public TransfersServer getTransfersImplPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://server.service.core.itau.com/", "TransfersImplPort"), TransfersServer.class, features);
    }

    private static URL __getWsdlLocation() {
        if (TRANSFERSIMPLSERVICE_EXCEPTION!= null) {
            throw TRANSFERSIMPLSERVICE_EXCEPTION;
        }
        return TRANSFERSIMPLSERVICE_WSDL_LOCATION;
    }

}
