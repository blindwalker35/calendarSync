/**
 * OaFormPermissionField.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package modules.openair.wsdl;

public class OaFormPermissionField  extends modules.openair.wsdl.OaBase  implements java.io.Serializable {
    private java.lang.String readonly;

    private java.lang.String required;

    private java.lang.String default_value;

    private java.lang.String form_name;

    private java.lang.String field_name;

    private java.lang.String hidden;

    private java.lang.String save_and_create;

    private modules.openair.wsdl.OaBase[] attributes;

    public OaFormPermissionField() {
    }

    public OaFormPermissionField(
           java.lang.String readonly,
           java.lang.String required,
           java.lang.String default_value,
           java.lang.String form_name,
           java.lang.String field_name,
           java.lang.String hidden,
           java.lang.String save_and_create,
           modules.openair.wsdl.OaBase[] attributes) {
        this.readonly = readonly;
        this.required = required;
        this.default_value = default_value;
        this.form_name = form_name;
        this.field_name = field_name;
        this.hidden = hidden;
        this.save_and_create = save_and_create;
        this.attributes = attributes;
    }


    /**
     * Gets the readonly value for this OaFormPermissionField.
     * 
     * @return readonly
     */
    public java.lang.String getReadonly() {
        return readonly;
    }


    /**
     * Sets the readonly value for this OaFormPermissionField.
     * 
     * @param readonly
     */
    public void setReadonly(java.lang.String readonly) {
        this.readonly = readonly;
    }


    /**
     * Gets the required value for this OaFormPermissionField.
     * 
     * @return required
     */
    public java.lang.String getRequired() {
        return required;
    }


    /**
     * Sets the required value for this OaFormPermissionField.
     * 
     * @param required
     */
    public void setRequired(java.lang.String required) {
        this.required = required;
    }


    /**
     * Gets the default_value value for this OaFormPermissionField.
     * 
     * @return default_value
     */
    public java.lang.String getDefault_value() {
        return default_value;
    }


    /**
     * Sets the default_value value for this OaFormPermissionField.
     * 
     * @param default_value
     */
    public void setDefault_value(java.lang.String default_value) {
        this.default_value = default_value;
    }


    /**
     * Gets the form_name value for this OaFormPermissionField.
     * 
     * @return form_name
     */
    public java.lang.String getForm_name() {
        return form_name;
    }


    /**
     * Sets the form_name value for this OaFormPermissionField.
     * 
     * @param form_name
     */
    public void setForm_name(java.lang.String form_name) {
        this.form_name = form_name;
    }


    /**
     * Gets the field_name value for this OaFormPermissionField.
     * 
     * @return field_name
     */
    public java.lang.String getField_name() {
        return field_name;
    }


    /**
     * Sets the field_name value for this OaFormPermissionField.
     * 
     * @param field_name
     */
    public void setField_name(java.lang.String field_name) {
        this.field_name = field_name;
    }


    /**
     * Gets the hidden value for this OaFormPermissionField.
     * 
     * @return hidden
     */
    public java.lang.String getHidden() {
        return hidden;
    }


    /**
     * Sets the hidden value for this OaFormPermissionField.
     * 
     * @param hidden
     */
    public void setHidden(java.lang.String hidden) {
        this.hidden = hidden;
    }


    /**
     * Gets the save_and_create value for this OaFormPermissionField.
     * 
     * @return save_and_create
     */
    public java.lang.String getSave_and_create() {
        return save_and_create;
    }


    /**
     * Sets the save_and_create value for this OaFormPermissionField.
     * 
     * @param save_and_create
     */
    public void setSave_and_create(java.lang.String save_and_create) {
        this.save_and_create = save_and_create;
    }


    /**
     * Gets the attributes value for this OaFormPermissionField.
     * 
     * @return attributes
     */
    public modules.openair.wsdl.OaBase[] getAttributes() {
        return attributes;
    }


    /**
     * Sets the attributes value for this OaFormPermissionField.
     * 
     * @param attributes
     */
    public void setAttributes(modules.openair.wsdl.OaBase[] attributes) {
        this.attributes = attributes;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OaFormPermissionField)) return false;
        OaFormPermissionField other = (OaFormPermissionField) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.readonly==null && other.getReadonly()==null) || 
             (this.readonly!=null &&
              this.readonly.equals(other.getReadonly()))) &&
            ((this.required==null && other.getRequired()==null) || 
             (this.required!=null &&
              this.required.equals(other.getRequired()))) &&
            ((this.default_value==null && other.getDefault_value()==null) || 
             (this.default_value!=null &&
              this.default_value.equals(other.getDefault_value()))) &&
            ((this.form_name==null && other.getForm_name()==null) || 
             (this.form_name!=null &&
              this.form_name.equals(other.getForm_name()))) &&
            ((this.field_name==null && other.getField_name()==null) || 
             (this.field_name!=null &&
              this.field_name.equals(other.getField_name()))) &&
            ((this.hidden==null && other.getHidden()==null) || 
             (this.hidden!=null &&
              this.hidden.equals(other.getHidden()))) &&
            ((this.save_and_create==null && other.getSave_and_create()==null) || 
             (this.save_and_create!=null &&
              this.save_and_create.equals(other.getSave_and_create()))) &&
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
        if (getReadonly() != null) {
            _hashCode += getReadonly().hashCode();
        }
        if (getRequired() != null) {
            _hashCode += getRequired().hashCode();
        }
        if (getDefault_value() != null) {
            _hashCode += getDefault_value().hashCode();
        }
        if (getForm_name() != null) {
            _hashCode += getForm_name().hashCode();
        }
        if (getField_name() != null) {
            _hashCode += getField_name().hashCode();
        }
        if (getHidden() != null) {
            _hashCode += getHidden().hashCode();
        }
        if (getSave_and_create() != null) {
            _hashCode += getSave_and_create().hashCode();
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
        new org.apache.axis.description.TypeDesc(OaFormPermissionField.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://namespaces.soaplite.com/perl", "oaFormPermissionField"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("readonly");
        elemField.setXmlName(new javax.xml.namespace.QName("", "readonly"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("required");
        elemField.setXmlName(new javax.xml.namespace.QName("", "required"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("default_value");
        elemField.setXmlName(new javax.xml.namespace.QName("", "default_value"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("form_name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "form_name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("field_name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "field_name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hidden");
        elemField.setXmlName(new javax.xml.namespace.QName("", "hidden"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("save_and_create");
        elemField.setXmlName(new javax.xml.namespace.QName("", "save_and_create"));
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
