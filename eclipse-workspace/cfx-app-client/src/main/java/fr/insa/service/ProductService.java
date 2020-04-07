package fr.insa.service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.0.4
 * 2020-04-04T10:55:20.628-07:00
 * Generated source version: 3.0.4
 * 
 */
@WebService(targetNamespace = "http://service.insa.fr/", name = "ProductService")
@XmlSeeAlso({ObjectFactory.class})
public interface ProductService {

    @WebMethod
    @RequestWrapper(localName = "getProduct", targetNamespace = "http://service.insa.fr/", className = "fr.insa.service.GetProduct")
    @ResponseWrapper(localName = "getProductResponse", targetNamespace = "http://service.insa.fr/", className = "fr.insa.service.GetProductResponse")
    @WebResult(name = "return", targetNamespace = "")
    public fr.insa.service.Product getProduct(
        @WebParam(name = "productId", targetNamespace = "")
        java.lang.String productId
    );

    @WebMethod
    @RequestWrapper(localName = "getAllProducts", targetNamespace = "http://service.insa.fr/", className = "fr.insa.service.GetAllProducts")
    @ResponseWrapper(localName = "getAllProductsResponse", targetNamespace = "http://service.insa.fr/", className = "fr.insa.service.GetAllProductsResponse")
    @WebResult(name = "return", targetNamespace = "")
    public java.util.List<fr.insa.service.Product> getAllProducts();

    @WebMethod
    @RequestWrapper(localName = "searchProductsByCriteria", targetNamespace = "http://service.insa.fr/", className = "fr.insa.service.SearchProductsByCriteria")
    @ResponseWrapper(localName = "searchProductsByCriteriaResponse", targetNamespace = "http://service.insa.fr/", className = "fr.insa.service.SearchProductsByCriteriaResponse")
    @WebResult(name = "return", targetNamespace = "")
    public java.util.List<fr.insa.service.Product> searchProductsByCriteria(
        @WebParam(name = "productName", targetNamespace = "")
        java.lang.String productName,
        @WebParam(name = "category", targetNamespace = "")
        java.lang.String category
    );
}
