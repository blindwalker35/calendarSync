/**
 * OaSummaryView.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package modules.openair.wsdl;

public class OaSummaryView  extends modules.openair.wsdl.OaBase  implements java.io.Serializable {
    private java.lang.String en_rejected;

    private java.lang.String tm_open;

    private java.lang.String tm_rejected;

    private java.lang.String tm_submitted;

    private java.lang.String tm_approved;

    private java.lang.String en_approved;

    private java.lang.String tm_waiting;

    private java.lang.String en_open;

    private java.lang.String en_submitted;

    private java.lang.String en_waiting;

    private modules.openair.wsdl.OaBase[] attributes;

    public OaSummaryView() {
    }

    public OaSummaryView(
           java.lang.String en_rejected,
           java.lang.String tm_open,
           java.lang.String tm_rejected,
           java.lang.String tm_submitted,
           java.lang.String tm_approved,
           java.lang.String en_approved,
           java.lang.String tm_waiting,
           java.lang.String en_open,
           java.lang.String en_submitted,
           java.lang.String en_waiting,
           modules.openair.wsdl.OaBase[] attributes) {
        this.en_rejected = en_rejected;
        this.tm_open = tm_open;
        this.tm_rejected = tm_rejected;
        this.tm_submitted = tm_submitted;
        this.tm_approved = tm_approved;
        this.en_approved = en_approved;
        this.tm_waiting = tm_waiting;
        this.en_open = en_open;
        this.en_submitted = en_submitted;
        this.en_waiting = en_waiting;
        this.attributes = attributes;
    }


    /**
     * Gets the en_rejected value for this OaSummaryView.
     * 
     * @return en_rejected
     */
    public java.lang.String getEn_rejected() {
        return en_rejected;
    }


    /**
     * Sets the en_rejected value for this OaSummaryView.
     * 
     * @param en_rejected
     */
    public void setEn_rejected(java.lang.String en_rejected) {
        this.en_rejected = en_rejected;
    }


    /**
     * Gets the tm_open value for this OaSummaryView.
     * 
     * @return tm_open
     */
    public java.lang.String getTm_open() {
        return tm_open;
    }


    /**
     * Sets the tm_open value for this OaSummaryView.
     * 
     * @param tm_open
     */
    public void setTm_open(java.lang.String tm_open) {
        this.tm_open = tm_open;
    }


    /**
     * Gets the tm_rejected value for this OaSummaryView.
     * 
     * @return tm_rejected
     */
    public java.lang.String getTm_rejected() {
        return tm_rejected;
    }


    /**
     * Sets the tm_rejected value for this OaSummaryView.
     * 
     * @param tm_rejected
     */
    public void setTm_rejected(java.lang.String tm_rejected) {
        this.tm_rejected = tm_rejected;
    }


    /**
     * Gets the tm_submitted value for this OaSummaryView.
     * 
     * @return tm_submitted
     */
    public java.lang.String getTm_submitted() {
        return tm_submitted;
    }


    /**
     * Sets the tm_submitted value for this OaSummaryView.
     * 
     * @param tm_submitted
     */
    public void setTm_submitted(java.lang.String tm_submitted) {
        this.tm_submitted = tm_submitted;
    }


    /**
     * Gets the tm_approved value for this OaSummaryView.
     * 
     * @return tm_approved
     */
    public java.lang.String getTm_approved() {
        return tm_approved;
    }


    /**
     * Sets the tm_approved value for this OaSummaryView.
     * 
     * @param tm_approved
     */
    public void setTm_approved(java.lang.String tm_approved) {
        this.tm_approved = tm_approved;
    }


    /**
     * Gets the en_approved value for this OaSummaryView.
     * 
     * @return en_approved
     */
    public java.lang.String getEn_approved() {
        return en_approved;
    }


    /**
     * Sets the en_approved value for this OaSummaryView.
     * 
     * @param en_approved
     */
    public void setEn_approved(java.lang.String en_approved) {
        this.en_approved = en_approved;
    }


    /**
     * Gets the tm_waiting value for this OaSummaryView.
     * 
     * @return tm_waiting
     */
    public java.lang.String getTm_waiting() {
        return tm_waiting;
    }


    /**
     * Sets the tm_waiting value for this OaSummaryView.
     * 
     * @param tm_waiting
     */
    public void setTm_waiting(java.lang.String tm_waiting) {
        this.tm_waiting = tm_waiting;
    }


    /**
     * Gets the en_open value for this OaSummaryView.
     * 
     * @return en_open
     */
    public java.lang.String getEn_open() {
        return en_open;
    }


    /**
     * Sets the en_open value for this OaSummaryView.
     * 
     * @param en_open
     */
    public void setEn_open(java.lang.String en_open) {
        this.en_open = en_open;
    }


    /**
     * Gets the en_submitted value for this OaSummaryView.
     * 
     * @return en_submitted
     */
    public java.lang.String getEn_submitted() {
        return en_submitted;
    }


    /**
     * Sets the en_submitted value for this OaSummaryView.
     * 
     * @param en_submitted
     */
    public void setEn_submitted(java.lang.String en_submitted) {
        this.en_submitted = en_submitted;
    }


    /**
     * Gets the en_waiting value for this OaSummaryView.
     * 
     * @return en_waiting
     */
    public java.lang.String getEn_waiting() {
        return en_waiting;
    }


    /**
     * Sets the en_waiting value for this OaSummaryView.
     * 
     * @param en_waiting
     */
    public void setEn_waiting(java.lang.String en_waiting) {
        this.en_waiting = en_waiting;
    }


    /**
     * Gets the attributes value for this OaSummaryView.
     * 
     * @return attributes
     */
    public modules.openair.wsdl.OaBase[] getAttributes() {
        return attributes;
    }


    /**
     * Sets the attributes value for this OaSummaryView.
     * 
     * @param attributes
     */
    public void setAttributes(modules.openair.wsdl.OaBase[] attributes) {
        this.attributes = attributes;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OaSummaryView)) return false;
        OaSummaryView other = (OaSummaryView) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.en_rejected==null && other.getEn_rejected()==null) || 
             (this.en_rejected!=null &&
              this.en_rejected.equals(other.getEn_rejected()))) &&
            ((this.tm_open==null && other.getTm_open()==null) || 
             (this.tm_open!=null &&
              this.tm_open.equals(other.getTm_open()))) &&
            ((this.tm_rejected==null && other.getTm_rejected()==null) || 
             (this.tm_rejected!=null &&
              this.tm_rejected.equals(other.getTm_rejected()))) &&
            ((this.tm_submitted==null && other.getTm_submitted()==null) || 
             (this.tm_submitted!=null &&
              this.tm_submitted.equals(other.getTm_submitted()))) &&
            ((this.tm_approved==null && other.getTm_approved()==null) || 
             (this.tm_approved!=null &&
              this.tm_approved.equals(other.getTm_approved()))) &&
            ((this.en_approved==null && other.getEn_approved()==null) || 
             (this.en_approved!=null &&
              this.en_approved.equals(other.getEn_approved()))) &&
            ((this.tm_waiting==null && other.getTm_waiting()==null) || 
             (this.tm_waiting!=null &&
              this.tm_waiting.equals(other.getTm_waiting()))) &&
            ((this.en_open==null && other.getEn_open()==null) || 
             (this.en_open!=null &&
              this.en_open.equals(other.getEn_open()))) &&
            ((this.en_submitted==null && other.getEn_submitted()==null) || 
             (this.en_submitted!=null &&
              this.en_submitted.equals(other.getEn_submitted()))) &&
            ((this.en_waiting==null && other.getEn_waiting()==null) || 
             (this.en_waiting!=null &&
              this.en_waiting.equals(other.getEn_waiting()))) &&
            ((this.attributes==null && other.getAttributes()==null) || 
             (this.attributes!=null &&
              java.util.Arrays.equals(this.attributes, other.getAttributes())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getEn_rejected() != null) {
            _hashCode += getEn_rejected().hashCode();
        }
        if (getTm_open() != null) {
            _hashCode += getTm_open().hashCode();
        }
        if (getTm_rejected() != null) {
            _hashCode += getTm_rejected().hashCode();
        }
        if (getTm_submitted() != null) {
            _hashCode += getTm_submitted().hashCode();
        }
        if (getTm_approved() != null) {
            _hashCode += getTm_approved().hashCode();
        }
        if (getEn_approved() != null) {
            _hashCode += getEn_approved().hashCode();
        }
        if (getTm_waiting() != null) {
            _hashCode += getTm_waiting().hashCode();
        }
        if (getEn_open() != null) {
            _hashCode += getEn_open().hashCode();
        }
        if (getEn_submitted() != null) {
            _hashCode += getEn_submitted().hashCode();
        }
        if (getEn_waiting() != null) {
            _hashCode += getEn_waiting().hashCode();
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
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(OaSummaryView.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://namespaces.soaplite.com/perl", "oaSummaryView"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("en_rejected");
        elemField.setXmlName(new javax.xml.namespace.QName("", "en_rejected"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tm_open");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tm_open"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tm_rejected");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tm_rejected"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tm_submitted");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tm_submitted"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tm_approved");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tm_approved"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("en_approved");
        elemField.setXmlName(new javax.xml.namespace.QName("", "en_approved"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tm_waiting");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tm_waiting"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("en_open");
        elemField.setXmlName(new javax.xml.namespace.QName("", "en_open"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("en_submitted");
        elemField.setXmlName(new javax.xml.namespace.QName("", "en_submitted"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("en_waiting");
        elemField.setXmlName(new javax.xml.namespace.QName("", "en_waiting"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attributes");
        elemField.setXmlName(new javax.xml.namespace.QName("", "attributes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://namespaces.soaplite.com/perl", "oaBase"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
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
