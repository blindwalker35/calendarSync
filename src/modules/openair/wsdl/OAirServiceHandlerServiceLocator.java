/**
 * OAirServiceHandlerServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package modules.openair.wsdl;

public class OAirServiceHandlerServiceLocator extends org.apache.axis.client.Service implements modules.openair.wsdl.OAirServiceHandlerService {

    public OAirServiceHandlerServiceLocator() {
    }


    public OAirServiceHandlerServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public OAirServiceHandlerServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for OAirService
    private java.lang.String OAirService_address = "https://www.openair.com/soap";

    public java.lang.String getOAirServiceAddress() {
        return OAirService_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String OAirServiceWSDDServiceName = "OAirService";

    public java.lang.String getOAirServiceWSDDServiceName() {
        return OAirServiceWSDDServiceName;
    }

    public void setOAirServiceWSDDServiceName(java.lang.String name) {
        OAirServiceWSDDServiceName = name;
    }

    public modules.openair.wsdl.OAirServiceHandler getOAirService() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(OAirService_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getOAirService(endpoint);
    }

    public modules.openair.wsdl.OAirServiceHandler getOAirService(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            modules.openair.wsdl.OAirServiceSoapBindingStub _stub = new modules.openair.wsdl.OAirServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getOAirServiceWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setOAirServiceEndpointAddress(java.lang.String address) {
        OAirService_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (modules.openair.wsdl.OAirServiceHandler.class.isAssignableFrom(serviceEndpointInterface)) {
                modules.openair.wsdl.OAirServiceSoapBindingStub _stub = new modules.openair.wsdl.OAirServiceSoapBindingStub(new java.net.URL(OAirService_address), this);
                _stub.setPortName(getOAirServiceWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("OAirService".equals(inputPortName)) {
            return getOAirService();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://namespaces.soaplite.com/perl", "OAirServiceHandlerService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://namespaces.soaplite.com/perl", "OAirService"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("OAirService".equals(portName)) {
            setOAirServiceEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
