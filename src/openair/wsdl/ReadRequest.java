/**
 * ReadRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package openair.wsdl;

public class ReadRequest  implements java.io.Serializable {
    /* valid method object. */
    private java.lang.String method;

    private java.lang.String fields;

    private openair.wsdl.Attribute[] attributes;

    private java.lang.String type;

    private openair.wsdl.OaBase[] objects;

    public ReadRequest() {
    }

    public ReadRequest(
           java.lang.String method,
           java.lang.String fields,
           openair.wsdl.Attribute[] attributes,
           java.lang.String type,
           openair.wsdl.OaBase[] objects) {
           this.method = method;
           this.fields = fields;
           this.attributes = attributes;
           this.type = type;
           this.objects = objects;
    }


    /**
     * Gets the method value for this ReadRequest.
     * 
     * @return method   * valid method object.
     */
    public java.lang.String getMethod() {
        return method;
    }


    /**
     * Sets the method value for this ReadRequest.
     * 
     * @param method   * valid method object.
     */
    public void setMethod(java.lang.String method) {
        this.method = method;
    }


    /**
     * Gets the fields value for this ReadRequest.
     * 
     * @return fields
     */
    public java.lang.String getFields() {
        return fields;
    }


    /**
     * Sets the fields value for this ReadRequest.
     * 
     * @param fields
     */
    public void setFields(java.lang.String fields) {
        this.fields = fields;
    }


    /**
     * Gets the attributes value for this ReadRequest.
     * 
     * @return attributes
     */
    public openair.wsdl.Attribute[] getAttributes() {
        return attributes;
    }


    /**
     * Sets the attributes value for this ReadRequest.
     * 
     * @param attributes
     */
    public void setAttributes(openair.wsdl.Attribute[] attributes) {
        this.attributes = attributes;
    }


    /**
     * Gets the type value for this ReadRequest.
     * 
     * @return type
     */
    public java.lang.String getType() {
        return type;
    }


    /**
     * Sets the type value for this ReadRequest.
     * 
     * @param type
     */
    public void setType(java.lang.String type) {
        this.type = type;
    }


    /**
     * Gets the objects value for this ReadRequest.
     * 
     * @return objects
     */
    public openair.wsdl.OaBase[] getObjects() {
        return objects;
    }


    /**
     * Sets the objects value for this ReadRequest.
     * 
     * @param objects
     */
    public void setObjects(openair.wsdl.OaBase[] objects) {
        this.objects = objects;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ReadRequest)) return false;
        ReadRequest other = (ReadRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.method==null && other.getMethod()==null) || 
             (this.method!=null &&
              this.method.equals(other.getMethod()))) &&
            ((this.fields==null && other.getFields()==null) || 
             (this.fields!=null &&
              this.fields.equals(other.getFields()))) &&
            ((this.attributes==null && other.getAttributes()==null) || 
             (this.attributes!=null &&
              java.util.Arrays.equals(this.attributes, other.getAttributes()))) &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            ((this.objects==null && other.getObjects()==null) || 
             (this.objects!=null &&
              java.util.Arrays.equals(this.objects, other.getObjects())));
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
        if (getMethod() != null) {
            _hashCode += getMethod().hashCode();
        }
        if (getFields() != null) {
            _hashCode += getFields().hashCode();
        }
        if (getAttributes() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAttributes());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAttributes(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        if (getObjects() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getObjects());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getObjects(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ReadRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://namespaces.soaplite.com/perl", "ReadRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("method");
        elemField.setXmlName(new javax.xml.namespace.QName("", "method"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fields");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fields"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attributes");
        elemField.setXmlName(new javax.xml.namespace.QName("", "attributes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://namespaces.soaplite.com/perl", "Attribute"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("", "type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("objects");
        elemField.setXmlName(new javax.xml.namespace.QName("", "objects"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://namespaces.soaplite.com/perl", "oaBase"));
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
