/**
 * OaEstimateadjustment.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package openair.wsdl;

public class OaEstimateadjustment  extends openair.wsdl.OaBase  implements java.io.Serializable {
    private java.lang.String created;

    private java.lang.String amount;

    private java.lang.String estimateid;

    private java.lang.String name;

    private java.lang.String updated;

    private java.lang.String id;

    private java.lang.String adjustment_type;

    private java.lang.String amount_type;

    private openair.wsdl.OaBase[] attributes;

    public OaEstimateadjustment() {
    }

    public OaEstimateadjustment(
           java.lang.String created,
           java.lang.String amount,
           java.lang.String estimateid,
           java.lang.String name,
           java.lang.String updated,
           java.lang.String id,
           java.lang.String adjustment_type,
           java.lang.String amount_type,
           openair.wsdl.OaBase[] attributes) {
        this.created = created;
        this.amount = amount;
        this.estimateid = estimateid;
        this.name = name;
        this.updated = updated;
        this.id = id;
        this.adjustment_type = adjustment_type;
        this.amount_type = amount_type;
        this.attributes = attributes;
    }


    /**
     * Gets the created value for this OaEstimateadjustment.
     * 
     * @return created
     */
    public java.lang.String getCreated() {
        return created;
    }


    /**
     * Sets the created value for this OaEstimateadjustment.
     * 
     * @param created
     */
    public void setCreated(java.lang.String created) {
        this.created = created;
    }


    /**
     * Gets the amount value for this OaEstimateadjustment.
     * 
     * @return amount
     */
    public java.lang.String getAmount() {
        return amount;
    }


    /**
     * Sets the amount value for this OaEstimateadjustment.
     * 
     * @param amount
     */
    public void setAmount(java.lang.String amount) {
        this.amount = amount;
    }


    /**
     * Gets the estimateid value for this OaEstimateadjustment.
     * 
     * @return estimateid
     */
    public java.lang.String getEstimateid() {
        return estimateid;
    }


    /**
     * Sets the estimateid value for this OaEstimateadjustment.
     * 
     * @param estimateid
     */
    public void setEstimateid(java.lang.String estimateid) {
        this.estimateid = estimateid;
    }


    /**
     * Gets the name value for this OaEstimateadjustment.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this OaEstimateadjustment.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the updated value for this OaEstimateadjustment.
     * 
     * @return updated
     */
    public java.lang.String getUpdated() {
        return updated;
    }


    /**
     * Sets the updated value for this OaEstimateadjustment.
     * 
     * @param updated
     */
    public void setUpdated(java.lang.String updated) {
        this.updated = updated;
    }


    /**
     * Gets the id value for this OaEstimateadjustment.
     * 
     * @return id
     */
    public java.lang.String getId() {
        return id;
    }


    /**
     * Sets the id value for this OaEstimateadjustment.
     * 
     * @param id
     */
    public void setId(java.lang.String id) {
        this.id = id;
    }


    /**
     * Gets the adjustment_type value for this OaEstimateadjustment.
     * 
     * @return adjustment_type
     */
    public java.lang.String getAdjustment_type() {
        return adjustment_type;
    }


    /**
     * Sets the adjustment_type value for this OaEstimateadjustment.
     * 
     * @param adjustment_type
     */
    public void setAdjustment_type(java.lang.String adjustment_type) {
        this.adjustment_type = adjustment_type;
    }


    /**
     * Gets the amount_type value for this OaEstimateadjustment.
     * 
     * @return amount_type
     */
    public java.lang.String getAmount_type() {
        return amount_type;
    }


    /**
     * Sets the amount_type value for this OaEstimateadjustment.
     * 
     * @param amount_type
     */
    public void setAmount_type(java.lang.String amount_type) {
        this.amount_type = amount_type;
    }


    /**
     * Gets the attributes value for this OaEstimateadjustment.
     * 
     * @return attributes
     */
    public openair.wsdl.OaBase[] getAttributes() {
        return attributes;
    }


    /**
     * Sets the attributes value for this OaEstimateadjustment.
     * 
     * @param attributes
     */
    public void setAttributes(openair.wsdl.OaBase[] attributes) {
        this.attributes = attributes;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OaEstimateadjustment)) return false;
        OaEstimateadjustment other = (OaEstimateadjustment) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.created==null && other.getCreated()==null) || 
             (this.created!=null &&
              this.created.equals(other.getCreated()))) &&
            ((this.amount==null && other.getAmount()==null) || 
             (this.amount!=null &&
              this.amount.equals(other.getAmount()))) &&
            ((this.estimateid==null && other.getEstimateid()==null) || 
             (this.estimateid!=null &&
              this.estimateid.equals(other.getEstimateid()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.updated==null && other.getUpdated()==null) || 
             (this.updated!=null &&
              this.updated.equals(other.getUpdated()))) &&
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.adjustment_type==null && other.getAdjustment_type()==null) || 
             (this.adjustment_type!=null &&
              this.adjustment_type.equals(other.getAdjustment_type()))) &&
            ((this.amount_type==null && other.getAmount_type()==null) || 
             (this.amount_type!=null &&
              this.amount_type.equals(other.getAmount_type()))) &&
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
        if (getCreated() != null) {
            _hashCode += getCreated().hashCode();
        }
        if (getAmount() != null) {
            _hashCode += getAmount().hashCode();
        }
        if (getEstimateid() != null) {
            _hashCode += getEstimateid().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getUpdated() != null) {
            _hashCode += getUpdated().hashCode();
        }
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getAdjustment_type() != null) {
            _hashCode += getAdjustment_type().hashCode();
        }
        if (getAmount_type() != null) {
            _hashCode += getAmount_type().hashCode();
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
        new org.apache.axis.description.TypeDesc(OaEstimateadjustment.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://namespaces.soaplite.com/perl", "oaEstimateadjustment"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("created");
        elemField.setXmlName(new javax.xml.namespace.QName("", "created"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "amount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("estimateid");
        elemField.setXmlName(new javax.xml.namespace.QName("", "estimateid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("updated");
        elemField.setXmlName(new javax.xml.namespace.QName("", "updated"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adjustment_type");
        elemField.setXmlName(new javax.xml.namespace.QName("", "adjustment_type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amount_type");
        elemField.setXmlName(new javax.xml.namespace.QName("", "amount_type"));
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
