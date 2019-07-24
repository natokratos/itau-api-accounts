
package com.itau.core.service.client.jaxws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.itau.core.service.server.AccountsImpl package. 
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

    private final static QName _GetRead_QNAME = new QName("http://server.service.core.itau.com/", "getRead");
    private final static QName _GetList_QNAME = new QName("http://server.service.core.itau.com/", "getList");
    private final static QName _GetListResponse_QNAME = new QName("http://server.service.core.itau.com/", "getListResponse");
    private final static QName _GetReadResponse_QNAME = new QName("http://server.service.core.itau.com/", "getReadResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.itau.core.service.server.AccountsImpl
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetReadResponse }
     * 
     */
    public GetReadResponse createGetReadResponse() {
        return new GetReadResponse();
    }

    /**
     * Create an instance of {@link GetList }
     * 
     */
    public GetList createGetList() {
        return new GetList();
    }

    /**
     * Create an instance of {@link GetListResponse }
     * 
     */
    public GetListResponse createGetListResponse() {
        return new GetListResponse();
    }

    /**
     * Create an instance of {@link GetRead }
     * 
     */
    public GetRead createGetRead() {
        return new GetRead();
    }

    /**
     * Create an instance of {@link Account }
     * 
     */
    public Account createAccount() {
        return new Account();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRead }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.service.core.itau.com/", name = "getRead")
    public JAXBElement<GetRead> createGetRead(GetRead value) {
        return new JAXBElement<GetRead>(_GetRead_QNAME, GetRead.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.service.core.itau.com/", name = "getList")
    public JAXBElement<GetList> createGetList(GetList value) {
        return new JAXBElement<GetList>(_GetList_QNAME, GetList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetListResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.service.core.itau.com/", name = "getListResponse")
    public JAXBElement<GetListResponse> createGetListResponse(GetListResponse value) {
        return new JAXBElement<GetListResponse>(_GetListResponse_QNAME, GetListResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetReadResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.service.core.itau.com/", name = "getReadResponse")
    public JAXBElement<GetReadResponse> createGetReadResponse(GetReadResponse value) {
        return new JAXBElement<GetReadResponse>(_GetReadResponse_QNAME, GetReadResponse.class, null, value);
    }

}
