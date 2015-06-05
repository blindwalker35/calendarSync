/**
 * OaEstimatemarkup.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package openair.wsdl;

public class OaEstimatemarkup  extends openair.wsdl.OaBase  implements java.io.Serializable {
    private java.lang.String estimateid;

    private java.lang.String percent;

    private java.lang.String total;

    private java.lang.String created;

    private java.lang.String phaseid;

    private java.lang.String id;

    private java.lang.String updated;

    private java.lang.String as_percentage;

    private openair.wsdl.OaBase[] attributes;

    public OaEstimatemarkup() {
    }

    public OaEstimatemarkup(
           java.lang.String estimateid,
           java.lang.String percent,
           java.lang.String total,
           java.lang.String created,
           java.lang.String phaseid,
           java.lang.String id,
           java.lang.String updated,
           java.lang.String as_percentage,
           openair.wsdl.OaBase[] attributes) {
        this.estimateid = estimateid;
        this.percent = percent;
        this.total = total;
        this.created = created;
        this.phaseid = phaseid;
        this.id = id;
        this.updated = updated;
        this.as_percentage = as_percentage;
        this.attributes = attributes;
    }


    /**
     * Gets the estimateid value for this OaEstimatemarkup.
     * 
     * @return estimateid
     */
    public java.lang.String getEstimateid() {
        return estimateid;
    }


    /**
     * Sets the estimateid value for this OaEstimatemarkup.
     * 
     * @param estimateid
     */
    public void setEstimateid(java.lang.String estimateid) {
        this.estimateid = estimateid;
    }


    /**
     * Gets the percent value for this OaEstimatemarkup.
     * 
     * @return percent
     */
    public java.lang.String getPercent() {
        return percent;
    }


    /**
     * Sets the percent value for this OaEstimatemarkup.
     * 
     * @param percent
     */
    public void setPercent(java.lang.String percent) {
        this.percent = percent;
    }


    /**
     * Gets the total value for this OaEstimatemarkup.
     * 
     * @return total
     */
    public java.lang.String getTotal() {
        return total;
    }


    /**
     * Sets the total value for this OaEstimatemarkup.
     * 
     * @param total
     */
    public void setTotal(java.lang.String total) {
        this.total = total;
    }


    /**
     * Gets the created value for this OaEstimatemarkup.
     * 
     * @return created
     */
    public java.lang.String getCreated() {
        return created;
    }


    /**
     * Sets the created value for this OaEstimatemarkup.
     * 
     * @param created
     */
    public void setCreated(java.lang.String created) {
        this.created = created;
    }


    /**
     * Gets the phaseid value for this OaEstimatemarkup.
     * 
     * @return phaseid
     */
    public java.lang.String getPhaseid() {
        return phaseid;
    }


    /**
     * Sets the phaseid value for this OaEstimatemarkup.
     * 
     * @param phaseid
     */
    public void setPhaseid(java.lang.String phaseid) {
        this.phaseid = phaseid;
    }


    /**
     * Gets the id value for this OaEstimatemarkup.
     * 
     * @return id
     */
    public java.lang.String getId() {
        return id;
    }


    /**
     * Sets the id value for this OaEstimatemarkup.
     * 
     * @param id
     */
    public void setId(java.lang.String id) {
        this.id = id;
    }


    /**
     * Gets the updated value for this OaEstimatemarkup.
     * 
     * @return updated
     */
    public java.lang.String getUpdated() {
        return updated;
    }


    /**
     * Sets the updated value for this OaEstimatemarkup.
     * 
     * @param updated
     */
    public void setUpdated(java.lang.String updated) {
        this.updated = updated;
    }


    /**
     * Gets the as_percentage value for this OaEstimatemarkup.
     * 
     * @return as_percentage
     */
    public java.lang.String getAs_percentage() {
        return as_percentage;
    }


    /**
     * Sets the as_percentage value for this OaEstimatemarkup.
     * 
     * @param as_percentage
     */
    public void setAs_percentage(java.lang.String as_percentage) {
        this.as_percentage = as_percentage;
    }


    /**
     * Gets the attributes value for this OaEstimatemarkup.
     * 
     * @return attributes
     */
    public openair.wsdl.OaBase[] getAttributes() {
        return attributes;
    }


    /**
     * Sets the attributes value for this OaEstimatemarkup.
     * 
     * @param attributes
     */
    public void setAttributes(openair.wsdl.OaBase[] attributes) {
        this.attributes = attributes;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OaEstimatemarkup)) return false;
        OaEstimatemarkup other = (OaEstimatemarkup) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.estimateid==null && other.getEstimateid()==null) || 
             (this.estimateid!=null &&
              this.estimateid.equals(other.getEstimateid()))) &&
            ((this.percent==null && other.getPercent()==null) || 
             (this.percent!=null &&
              this.percent.equals(other.getPercent()))) &&
            ((this.total==null && other.getTotal()==null) || 
             (this.total!=null &&
              this.total.equals(other.getTotal()))) &&
            ((this.created==null && other.getCreated()==null) || 
             (this.created!=null &&
              this.created.equals(other.getCreated()))) &&
            ((this.phaseid==null && other.getPhaseid()==null) || 
             (this.phaseid!=null &&
              this.phaseid.equals(other.getPhaseid()))) &&
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.updated==null && other.getUpdated()==null) || 
             (this.updated!=null &&
              this.updated.equals(other.getUpdated()))) &&
            ((this.as_percentage==null && other.getAs_percentage()==null) || 
             (this.as_percentage!=null &&
              this.as_percentage.equals(other.getAs_percentage()))) &&
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
        if (getEstimateid() != null) {
            _hashCode += getEstimateid().hashCode();
        }
        if (getPercent() != null) {
            _hashCode += getPercent().hashCode();
        }
        if (getTotal() != null) {
            _hashCode += getTotal().hashCode();
        }
        if (getCreated() != null) {
            _hashCode += getCreated().hashCode();
        }
        if (getPhaseid() != null) {
            _hashCode += getPhaseid().hashCode();
        }
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getUpdated() != null) {
            _hashCode += getUpdated().hashCode();
        }
        if (getAs_percentage() != null) {
            _hashCode += getAs_percentage().hashCode();
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
        new org.apache.axis.description.TypeDesc(OaEstimatemarkup.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://namespaces.soaplite.com/perl", "oaEstimatemarkup"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("estimateid");
        elemField.setXmlName(new javax.xml.namespace.QName("", "estimateid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("percent");
        elemField.setXmlName(new javax.xml.namespace.QName("", "percent"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("total");
        elemField.setXmlName(new javax.xml.namespace.QName("", "total"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("created");
        elemField.setXmlName(new javax.xml.namespace.QName("", "created"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("phaseid");
        elemField.setXmlName(new javax.xml.namespace.QName("", "phaseid"));
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
        elemField.setFieldName("updated");
        elemField.setXmlName(new javax.xml.namespace.QName("", "updated"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("as_percentage");
        elemField.setXmlName(new javax.xml.namespace.QName("", "as_percentage"));
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
