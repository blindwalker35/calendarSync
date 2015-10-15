/**
 * SubmitRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package modules.openair.wsdl;

public class SubmitRequest  implements java.io.Serializable {
    private modules.openair.wsdl.Attribute[] attributes;

    private modules.openair.wsdl.OaBase submit;

    private modules.openair.wsdl.OaBase approval;

    public SubmitRequest() {
    }

    public SubmitRequest(
           modules.openair.wsdl.Attribute[] attributes,
           modules.openair.wsdl.OaBase submit,
           modules.openair.wsdl.OaBase approval) {
           this.attributes = attributes;
           this.submit = submit;
           this.approval = approval;
    }


    /**
     * Gets the attributes value for this SubmitRequest.
     * 
     * @return attributes
     */
    public modules.openair.wsdl.Attribute[] getAttributes() {
        return attributes;
    }


    /**
     * Sets the attributes value for this SubmitRequest.
     * 
     * @param attributes
     */
    public void setAttributes(modules.openair.wsdl.Attribute[] attributes) {
        this.attributes = attributes;
    }


    /**
     * Gets the submit value for this SubmitRequest.
     * 
     * @return submit
     */
    public modules.openair.wsdl.OaBase getSubmit() {
        return submit;
    }


    /**
     * Sets the submit value for this SubmitRequest.
     * 
     * @param submit
     */
    public void setSubmit(modules.openair.wsdl.OaBase submit) {
        this.submit = submit;
    }


    /**
     * Gets the approval value for this SubmitRequest.
     * 
     * @return approval
     */
    public modules.openair.wsdl.OaBase getApproval() {
        return approval;
    }


    /**
     * Sets the approval value for this SubmitRequest.
     * 
     * @param approval
     */
    public void setApproval(modules.openair.wsdl.OaBase approval) {
        this.approval = approval;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SubmitRequest)) return false;
        SubmitRequest other = (SubmitRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.attributes==null && other.getAttributes()==null) || 
             (this.attributes!=null &&
              java.util.Arrays.equals(this.attributes, other.getAttributes()))) &&
            ((this.submit==null && other.getSubmit()==null) || 
             (this.submit!=null &&
              this.submit.equals(other.getSubmit()))) &&
            ((this.approval==null && other.getApproval()==null) || 
             (this.approval!=null &&
              this.approval.equals(other.getApproval())));
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
        if (getSubmit() != null) {
            _hashCode += getSubmit().hashCode();
        }
        if (getApproval() != null) {
            _hashCode += getApproval().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SubmitRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://namespaces.soaplite.com/perl", "SubmitRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attributes");
        elemField.setXmlName(new javax.xml.namespace.QName("", "attributes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://namespaces.soaplite.com/perl", "Attribute"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("submit");
        elemField.setXmlName(new javax.xml.namespace.QName("", "submit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://namespaces.soaplite.com/perl", "oaBase"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("approval");
        elemField.setXmlName(new javax.xml.namespace.QName("", "approval"));
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
