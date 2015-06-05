/**
 * OAirServiceHandlerService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package openair.wsdl;

public interface OAirServiceHandlerService extends javax.xml.rpc.Service {
    public java.lang.String getOAirServiceAddress();

    public openair.wsdl.OAirServiceHandler getOAirService() throws javax.xml.rpc.ServiceException;

    public openair.wsdl.OAirServiceHandler getOAirService(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
