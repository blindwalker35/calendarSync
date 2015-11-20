/**
 * LoginParams.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package modules.openair.wsdl;

public class LoginParams  implements java.io.Serializable {
    /* Namespace name. */
    private java.lang.String api_namespace;

    /* Specify and API key assigned to you. */
    private java.lang.String api_key;

    /* Specify companyID */
    private java.lang.String company;

    /* Specify User ID. */
    private java.lang.String user;

    /* Specify password. */
    private java.lang.String password;

    /* Specify the client name. */
    private java.lang.String client;

    /* Specify the version of the client. */
    private java.lang.String version;

    public LoginParams() {
    }

    public LoginParams(
           java.lang.String api_namespace,
           java.lang.String api_key,
           java.lang.String company,
           java.lang.String user,
           java.lang.String password,
           java.lang.String client,
           java.lang.String version) {
           this.api_namespace = api_namespace;
           this.api_key = api_key;
           this.company = company;
           this.user = user;
           this.password = password;
           this.client = client;
           this.version = version;
    }


    /**
     * Gets the api_namespace value for this LoginParams.
     * 
     * @return api_namespace   * Namespace name.
     */
    public java.lang.String getApi_namespace() {
        return api_namespace;
    }


    /**
     * Sets the api_namespace value for this LoginParams.
     * 
     * @param api_namespace   * Namespace name.
     */
    public void setApi_namespace(java.lang.String api_namespace) {
        this.api_namespace = api_namespace;
    }


    /**
     * Gets the api_key value for this LoginParams.
     * 
     * @return api_key   * Specify and API key assigned to you.
     */
    public java.lang.String getApi_key() {
        return api_key;
    }


    /**
     * Sets the api_key value for this LoginParams.
     * 
     * @param api_key   * Specify and API key assigned to you.
     */
    public void setApi_key(java.lang.String api_key) {
        this.api_key = api_key;
    }


    /**
     * Gets the company value for this LoginParams.
     * 
     * @return company   * Specify companyID
     */
    public java.lang.String getCompany() {
        return company;
    }


    /**
     * Sets the company value for this LoginParams.
     * 
     * @param company   * Specify companyID
     */
    public void setCompany(java.lang.String company) {
        this.company = company;
    }


    /**
     * Gets the user value for this LoginParams.
     * 
     * @return user   * Specify User ID.
     */
    public java.lang.String getUser() {
        return user;
    }


    /**
     * Sets the user value for this LoginParams.
     * 
     * @param user   * Specify User ID.
     */
    public void setUser(java.lang.String user) {
        this.user = user;
    }


    /**
     * Gets the password value for this LoginParams.
     * 
     * @return password   * Specify password.
     */
    public java.lang.String getPassword() {
        return password;
    }


    /**
     * Sets the password value for this LoginParams.
     * 
     * @param password   * Specify password.
     */
    public void setPassword(java.lang.String password) {
        this.password = password;
    }


    /**
     * Gets the client value for this LoginParams.
     * 
     * @return client   * Specify the client name.
     */
    public java.lang.String getClient() {
        return client;
    }


    /**
     * Sets the client value for this LoginParams.
     * 
     * @param client   * Specify the client name.
     */
    public void setClient(java.lang.String client) {
        this.client = client;
    }


    /**
     * Gets the version value for this LoginParams.
     * 
     * @return version   * Specify the version of the client.
     */
    public java.lang.String getVersion() {
        return version;
    }


    /**
     * Sets the version value for this LoginParams.
     * 
     * @param version   * Specify the version of the client.
     */
    public void setVersion(java.lang.String version) {
        this.version = version;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LoginParams)) return false;
        LoginParams other = (LoginParams) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.api_namespace==null && other.getApi_namespace()==null) || 
             (this.api_namespace!=null &&
              this.api_namespace.equals(other.getApi_namespace()))) &&
            ((this.api_key==null && other.getApi_key()==null) || 
             (this.api_key!=null &&
              this.api_key.equals(other.getApi_key()))) &&
            ((this.company==null && other.getCompany()==null) || 
             (this.company!=null &&
              this.company.equals(other.getCompany()))) &&
            ((this.user==null && other.getUser()==null) || 
             (this.user!=null &&
              this.user.equals(other.getUser()))) &&
            ((this.password==null && other.getPassword()==null) || 
             (this.password!=null &&
              this.password.equals(other.getPassword()))) &&
            ((this.client==null && other.getClient()==null) || 
             (this.client!=null &&
              this.client.equals(other.getClient()))) &&
            ((this.version==null && other.getVersion()==null) || 
             (this.version!=null &&
              this.version.equals(other.getVersion())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getApi_namespace() != null) {
            _hashCode += getApi_namespace().hashCode();
        }
        if (getApi_key() != null) {
            _hashCode += getApi_key().hashCode();
        }
        if (getCompany() != null) {
            _hashCode += getCompany().hashCode();
        }
        if (getUser() != null) {
            _hashCode += getUser().hashCode();
        }
        if (getPassword() != null) {
            _hashCode += getPassword().hashCode();
        }
        if (getClient() != null) {
            _hashCode += getClient().hashCode();
        }
        if (getVersion() != null) {
            _hashCode += getVersion().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(LoginParams.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://namespaces.soaplite.com/perl", "LoginParams"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("api_namespace");
        elemField.setXmlName(new javax.xml.namespace.QName("", "api_namespace"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("api_key");
        elemField.setXmlName(new javax.xml.namespace.QName("", "api_key"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("company");
        elemField.setXmlName(new javax.xml.namespace.QName("", "company"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("user");
        elemField.setXmlName(new javax.xml.namespace.QName("", "user"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("password");
        elemField.setXmlName(new javax.xml.namespace.QName("", "password"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("client");
        elemField.setXmlName(new javax.xml.namespace.QName("", "client"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("version");
        elemField.setXmlName(new javax.xml.namespace.QName("", "version"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
