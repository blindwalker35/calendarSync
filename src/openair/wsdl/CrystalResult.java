/**
 * CrystalResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package openair.wsdl;

public class CrystalResult  implements java.io.Serializable {
    private java.lang.String db_id;

    private java.lang.String crystal_host;

    private java.lang.String crystal_port;

    public CrystalResult() {
    }

    public CrystalResult(
           java.lang.String db_id,
           java.lang.String crystal_host,
           java.lang.String crystal_port) {
           this.db_id = db_id;
           this.crystal_host = crystal_host;
           this.crystal_port = crystal_port;
    }


    /**
     * Gets the db_id value for this CrystalResult.
     * 
     * @return db_id
     */
    public java.lang.String getDb_id() {
        return db_id;
    }


    /**
     * Sets the db_id value for this CrystalResult.
     * 
     * @param db_id
     */
    public void setDb_id(java.lang.String db_id) {
        this.db_id = db_id;
    }


    /**
     * Gets the crystal_host value for this CrystalResult.
     * 
     * @return crystal_host
     */
    public java.lang.String getCrystal_host() {
        return crystal_host;
    }


    /**
     * Sets the crystal_host value for this CrystalResult.
     * 
     * @param crystal_host
     */
    public void setCrystal_host(java.lang.String crystal_host) {
        this.crystal_host = crystal_host;
    }


    /**
     * Gets the crystal_port value for this CrystalResult.
     * 
     * @return crystal_port
     */
    public java.lang.String getCrystal_port() {
        return crystal_port;
    }


    /**
     * Sets the crystal_port value for this CrystalResult.
     * 
     * @param crystal_port
     */
    public void setCrystal_port(java.lang.String crystal_port) {
        this.crystal_port = crystal_port;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CrystalResult)) return false;
        CrystalResult other = (CrystalResult) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.db_id==null && other.getDb_id()==null) || 
             (this.db_id!=null &&
              this.db_id.equals(other.getDb_id()))) &&
            ((this.crystal_host==null && other.getCrystal_host()==null) || 
             (this.crystal_host!=null &&
              this.crystal_host.equals(other.getCrystal_host()))) &&
            ((this.crystal_port==null && other.getCrystal_port()==null) || 
             (this.crystal_port!=null &&
              this.crystal_port.equals(other.getCrystal_port())));
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
        if (getDb_id() != null) {
            _hashCode += getDb_id().hashCode();
        }
        if (getCrystal_host() != null) {
            _hashCode += getCrystal_host().hashCode();
        }
        if (getCrystal_port() != null) {
            _hashCode += getCrystal_port().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CrystalResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://namespaces.soaplite.com/perl", "CrystalResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("db_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "db_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("crystal_host");
        elemField.setXmlName(new javax.xml.namespace.QName("", "crystal_host"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("crystal_port");
        elemField.setXmlName(new javax.xml.namespace.QName("", "crystal_port"));
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
