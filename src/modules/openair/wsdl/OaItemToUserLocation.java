/**
 * OaItemToUserLocation.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package modules.openair.wsdl;

public class OaItemToUserLocation  extends modules.openair.wsdl.OaBase  implements java.io.Serializable {
    private java.lang.String created;

    private java.lang.String itemid;

    private java.lang.String user_locationid;

    private java.lang.String id;

    private java.lang.String updated;

    private java.lang.String tax_locationid;

    private modules.openair.wsdl.OaBase[] attributes;

    public OaItemToUserLocation() {
    }

    public OaItemToUserLocation(
           java.lang.String created,
           java.lang.String itemid,
           java.lang.String user_locationid,
           java.lang.String id,
           java.lang.String updated,
           java.lang.String tax_locationid,
           modules.openair.wsdl.OaBase[] attributes) {
        this.created = created;
        this.itemid = itemid;
        this.user_locationid = user_locationid;
        this.id = id;
        this.updated = updated;
        this.tax_locationid = tax_locationid;
        this.attributes = attributes;
    }


    /**
     * Gets the created value for this OaItemToUserLocation.
     * 
     * @return created
     */
    public java.lang.String getCreated() {
        return created;
    }


    /**
     * Sets the created value for this OaItemToUserLocation.
     * 
     * @param created
     */
    public void setCreated(java.lang.String created) {
        this.created = created;
    }


    /**
     * Gets the itemid value for this OaItemToUserLocation.
     * 
     * @return itemid
     */
    public java.lang.String getItemid() {
        return itemid;
    }


    /**
     * Sets the itemid value for this OaItemToUserLocation.
     * 
     * @param itemid
     */
    public void setItemid(java.lang.String itemid) {
        this.itemid = itemid;
    }


    /**
     * Gets the user_locationid value for this OaItemToUserLocation.
     * 
     * @return user_locationid
     */
    public java.lang.String getUser_locationid() {
        return user_locationid;
    }


    /**
     * Sets the user_locationid value for this OaItemToUserLocation.
     * 
     * @param user_locationid
     */
    public void setUser_locationid(java.lang.String user_locationid) {
        this.user_locationid = user_locationid;
    }


    /**
     * Gets the id value for this OaItemToUserLocation.
     * 
     * @return id
     */
    public java.lang.String getId() {
        return id;
    }


    /**
     * Sets the id value for this OaItemToUserLocation.
     * 
     * @param id
     */
    public void setId(java.lang.String id) {
        this.id = id;
    }


    /**
     * Gets the updated value for this OaItemToUserLocation.
     * 
     * @return updated
     */
    public java.lang.String getUpdated() {
        return updated;
    }


    /**
     * Sets the updated value for this OaItemToUserLocation.
     * 
     * @param updated
     */
    public void setUpdated(java.lang.String updated) {
        this.updated = updated;
    }


    /**
     * Gets the tax_locationid value for this OaItemToUserLocation.
     * 
     * @return tax_locationid
     */
    public java.lang.String getTax_locationid() {
        return tax_locationid;
    }


    /**
     * Sets the tax_locationid value for this OaItemToUserLocation.
     * 
     * @param tax_locationid
     */
    public void setTax_locationid(java.lang.String tax_locationid) {
        this.tax_locationid = tax_locationid;
    }


    /**
     * Gets the attributes value for this OaItemToUserLocation.
     * 
     * @return attributes
     */
    public modules.openair.wsdl.OaBase[] getAttributes() {
        return attributes;
    }


    /**
     * Sets the attributes value for this OaItemToUserLocation.
     * 
     * @param attributes
     */
    public void setAttributes(modules.openair.wsdl.OaBase[] attributes) {
        this.attributes = attributes;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OaItemToUserLocation)) return false;
        OaItemToUserLocation other = (OaItemToUserLocation) obj;
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
            ((this.itemid==null && other.getItemid()==null) || 
             (this.itemid!=null &&
              this.itemid.equals(other.getItemid()))) &&
            ((this.user_locationid==null && other.getUser_locationid()==null) || 
             (this.user_locationid!=null &&
              this.user_locationid.equals(other.getUser_locationid()))) &&
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.updated==null && other.getUpdated()==null) || 
             (this.updated!=null &&
              this.updated.equals(other.getUpdated()))) &&
            ((this.tax_locationid==null && other.getTax_locationid()==null) || 
             (this.tax_locationid!=null &&
              this.tax_locationid.equals(other.getTax_locationid()))) &&
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
        if (getItemid() != null) {
            _hashCode += getItemid().hashCode();
        }
        if (getUser_locationid() != null) {
            _hashCode += getUser_locationid().hashCode();
        }
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getUpdated() != null) {
            _hashCode += getUpdated().hashCode();
        }
        if (getTax_locationid() != null) {
            _hashCode += getTax_locationid().hashCode();
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
        new org.apache.axis.description.TypeDesc(OaItemToUserLocation.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://namespaces.soaplite.com/perl", "oaItemToUserLocation"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("created");
        elemField.setXmlName(new javax.xml.namespace.QName("", "created"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemid");
        elemField.setXmlName(new javax.xml.namespace.QName("", "itemid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("user_locationid");
        elemField.setXmlName(new javax.xml.namespace.QName("", "user_locationid"));
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
        elemField.setFieldName("tax_locationid");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tax_locationid"));
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
