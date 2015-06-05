/**
 * OaReport.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package openair.wsdl;

public class OaReport  extends openair.wsdl.OaBase  implements java.io.Serializable {
    private java.lang.String userid;

    private java.lang.String name;

    private java.lang.String date_created;

    private java.lang.String created;

    private java.lang.String email_report;

    private java.lang.String relatedid;

    private java.lang.String thin_client_context;

    private java.lang.String type;

    private java.lang.String updated;

    private java.lang.String id;

    private openair.wsdl.OaBase[] attributes;

    public OaReport() {
    }

    public OaReport(
           java.lang.String userid,
           java.lang.String name,
           java.lang.String date_created,
           java.lang.String created,
           java.lang.String email_report,
           java.lang.String relatedid,
           java.lang.String thin_client_context,
           java.lang.String type,
           java.lang.String updated,
           java.lang.String id,
           openair.wsdl.OaBase[] attributes) {
        this.userid = userid;
        this.name = name;
        this.date_created = date_created;
        this.created = created;
        this.email_report = email_report;
        this.relatedid = relatedid;
        this.thin_client_context = thin_client_context;
        this.type = type;
        this.updated = updated;
        this.id = id;
        this.attributes = attributes;
    }


    /**
     * Gets the userid value for this OaReport.
     * 
     * @return userid
     */
    public java.lang.String getUserid() {
        return userid;
    }


    /**
     * Sets the userid value for this OaReport.
     * 
     * @param userid
     */
    public void setUserid(java.lang.String userid) {
        this.userid = userid;
    }


    /**
     * Gets the name value for this OaReport.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this OaReport.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the date_created value for this OaReport.
     * 
     * @return date_created
     */
    public java.lang.String getDate_created() {
        return date_created;
    }


    /**
     * Sets the date_created value for this OaReport.
     * 
     * @param date_created
     */
    public void setDate_created(java.lang.String date_created) {
        this.date_created = date_created;
    }


    /**
     * Gets the created value for this OaReport.
     * 
     * @return created
     */
    public java.lang.String getCreated() {
        return created;
    }


    /**
     * Sets the created value for this OaReport.
     * 
     * @param created
     */
    public void setCreated(java.lang.String created) {
        this.created = created;
    }


    /**
     * Gets the email_report value for this OaReport.
     * 
     * @return email_report
     */
    public java.lang.String getEmail_report() {
        return email_report;
    }


    /**
     * Sets the email_report value for this OaReport.
     * 
     * @param email_report
     */
    public void setEmail_report(java.lang.String email_report) {
        this.email_report = email_report;
    }


    /**
     * Gets the relatedid value for this OaReport.
     * 
     * @return relatedid
     */
    public java.lang.String getRelatedid() {
        return relatedid;
    }


    /**
     * Sets the relatedid value for this OaReport.
     * 
     * @param relatedid
     */
    public void setRelatedid(java.lang.String relatedid) {
        this.relatedid = relatedid;
    }


    /**
     * Gets the thin_client_context value for this OaReport.
     * 
     * @return thin_client_context
     */
    public java.lang.String getThin_client_context() {
        return thin_client_context;
    }


    /**
     * Sets the thin_client_context value for this OaReport.
     * 
     * @param thin_client_context
     */
    public void setThin_client_context(java.lang.String thin_client_context) {
        this.thin_client_context = thin_client_context;
    }


    /**
     * Gets the type value for this OaReport.
     * 
     * @return type
     */
    public java.lang.String getType() {
        return type;
    }


    /**
     * Sets the type value for this OaReport.
     * 
     * @param type
     */
    public void setType(java.lang.String type) {
        this.type = type;
    }


    /**
     * Gets the updated value for this OaReport.
     * 
     * @return updated
     */
    public java.lang.String getUpdated() {
        return updated;
    }


    /**
     * Sets the updated value for this OaReport.
     * 
     * @param updated
     */
    public void setUpdated(java.lang.String updated) {
        this.updated = updated;
    }


    /**
     * Gets the id value for this OaReport.
     * 
     * @return id
     */
    public java.lang.String getId() {
        return id;
    }


    /**
     * Sets the id value for this OaReport.
     * 
     * @param id
     */
    public void setId(java.lang.String id) {
        this.id = id;
    }


    /**
     * Gets the attributes value for this OaReport.
     * 
     * @return attributes
     */
    public openair.wsdl.OaBase[] getAttributes() {
        return attributes;
    }


    /**
     * Sets the attributes value for this OaReport.
     * 
     * @param attributes
     */
    public void setAttributes(openair.wsdl.OaBase[] attributes) {
        this.attributes = attributes;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OaReport)) return false;
        OaReport other = (OaReport) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.userid==null && other.getUserid()==null) || 
             (this.userid!=null &&
              this.userid.equals(other.getUserid()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.date_created==null && other.getDate_created()==null) || 
             (this.date_created!=null &&
              this.date_created.equals(other.getDate_created()))) &&
            ((this.created==null && other.getCreated()==null) || 
             (this.created!=null &&
              this.created.equals(other.getCreated()))) &&
            ((this.email_report==null && other.getEmail_report()==null) || 
             (this.email_report!=null &&
              this.email_report.equals(other.getEmail_report()))) &&
            ((this.relatedid==null && other.getRelatedid()==null) || 
             (this.relatedid!=null &&
              this.relatedid.equals(other.getRelatedid()))) &&
            ((this.thin_client_context==null && other.getThin_client_context()==null) || 
             (this.thin_client_context!=null &&
              this.thin_client_context.equals(other.getThin_client_context()))) &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            ((this.updated==null && other.getUpdated()==null) || 
             (this.updated!=null &&
              this.updated.equals(other.getUpdated()))) &&
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
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
        if (getUserid() != null) {
            _hashCode += getUserid().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getDate_created() != null) {
            _hashCode += getDate_created().hashCode();
        }
        if (getCreated() != null) {
            _hashCode += getCreated().hashCode();
        }
        if (getEmail_report() != null) {
            _hashCode += getEmail_report().hashCode();
        }
        if (getRelatedid() != null) {
            _hashCode += getRelatedid().hashCode();
        }
        if (getThin_client_context() != null) {
            _hashCode += getThin_client_context().hashCode();
        }
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        if (getUpdated() != null) {
            _hashCode += getUpdated().hashCode();
        }
        if (getId() != null) {
            _hashCode += getId().hashCode();
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
        new org.apache.axis.description.TypeDesc(OaReport.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://namespaces.soaplite.com/perl", "oaReport"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userid");
        elemField.setXmlName(new javax.xml.namespace.QName("", "userid"));
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
        elemField.setFieldName("date_created");
        elemField.setXmlName(new javax.xml.namespace.QName("", "date_created"));
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
        elemField.setFieldName("email_report");
        elemField.setXmlName(new javax.xml.namespace.QName("", "email_report"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("relatedid");
        elemField.setXmlName(new javax.xml.namespace.QName("", "relatedid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("thin_client_context");
        elemField.setXmlName(new javax.xml.namespace.QName("", "thin_client_context"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("", "type"));
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
