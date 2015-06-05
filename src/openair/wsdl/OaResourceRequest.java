/**
 * OaResourceRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package openair.wsdl;

public class OaResourceRequest  extends openair.wsdl.OaBase  implements java.io.Serializable {
    private java.lang.String number;

    private java.lang.String status;

    private java.lang.String percent_fulfilled;

    private java.lang.String date_finalized;

    private java.lang.String date_start;

    private java.lang.String updated;

    private java.lang.String id;

    private java.lang.String ownerid;

    private java.lang.String date_end;

    private java.lang.String booking_type_id;

    private java.lang.String name;

    private java.lang.String projectid;

    private java.lang.String date_start_expected;

    private java.lang.String created;

    private java.lang.String external_id;

    private java.lang.String notes;

    private java.lang.String customerid;

    private openair.wsdl.OaBase[] attributes;

    public OaResourceRequest() {
    }

    public OaResourceRequest(
           java.lang.String number,
           java.lang.String status,
           java.lang.String percent_fulfilled,
           java.lang.String date_finalized,
           java.lang.String date_start,
           java.lang.String updated,
           java.lang.String id,
           java.lang.String ownerid,
           java.lang.String date_end,
           java.lang.String booking_type_id,
           java.lang.String name,
           java.lang.String projectid,
           java.lang.String date_start_expected,
           java.lang.String created,
           java.lang.String external_id,
           java.lang.String notes,
           java.lang.String customerid,
           openair.wsdl.OaBase[] attributes) {
        this.number = number;
        this.status = status;
        this.percent_fulfilled = percent_fulfilled;
        this.date_finalized = date_finalized;
        this.date_start = date_start;
        this.updated = updated;
        this.id = id;
        this.ownerid = ownerid;
        this.date_end = date_end;
        this.booking_type_id = booking_type_id;
        this.name = name;
        this.projectid = projectid;
        this.date_start_expected = date_start_expected;
        this.created = created;
        this.external_id = external_id;
        this.notes = notes;
        this.customerid = customerid;
        this.attributes = attributes;
    }


    /**
     * Gets the number value for this OaResourceRequest.
     * 
     * @return number
     */
    public java.lang.String getNumber() {
        return number;
    }


    /**
     * Sets the number value for this OaResourceRequest.
     * 
     * @param number
     */
    public void setNumber(java.lang.String number) {
        this.number = number;
    }


    /**
     * Gets the status value for this OaResourceRequest.
     * 
     * @return status
     */
    public java.lang.String getStatus() {
        return status;
    }


    /**
     * Sets the status value for this OaResourceRequest.
     * 
     * @param status
     */
    public void setStatus(java.lang.String status) {
        this.status = status;
    }


    /**
     * Gets the percent_fulfilled value for this OaResourceRequest.
     * 
     * @return percent_fulfilled
     */
    public java.lang.String getPercent_fulfilled() {
        return percent_fulfilled;
    }


    /**
     * Sets the percent_fulfilled value for this OaResourceRequest.
     * 
     * @param percent_fulfilled
     */
    public void setPercent_fulfilled(java.lang.String percent_fulfilled) {
        this.percent_fulfilled = percent_fulfilled;
    }


    /**
     * Gets the date_finalized value for this OaResourceRequest.
     * 
     * @return date_finalized
     */
    public java.lang.String getDate_finalized() {
        return date_finalized;
    }


    /**
     * Sets the date_finalized value for this OaResourceRequest.
     * 
     * @param date_finalized
     */
    public void setDate_finalized(java.lang.String date_finalized) {
        this.date_finalized = date_finalized;
    }


    /**
     * Gets the date_start value for this OaResourceRequest.
     * 
     * @return date_start
     */
    public java.lang.String getDate_start() {
        return date_start;
    }


    /**
     * Sets the date_start value for this OaResourceRequest.
     * 
     * @param date_start
     */
    public void setDate_start(java.lang.String date_start) {
        this.date_start = date_start;
    }


    /**
     * Gets the updated value for this OaResourceRequest.
     * 
     * @return updated
     */
    public java.lang.String getUpdated() {
        return updated;
    }


    /**
     * Sets the updated value for this OaResourceRequest.
     * 
     * @param updated
     */
    public void setUpdated(java.lang.String updated) {
        this.updated = updated;
    }


    /**
     * Gets the id value for this OaResourceRequest.
     * 
     * @return id
     */
    public java.lang.String getId() {
        return id;
    }


    /**
     * Sets the id value for this OaResourceRequest.
     * 
     * @param id
     */
    public void setId(java.lang.String id) {
        this.id = id;
    }


    /**
     * Gets the ownerid value for this OaResourceRequest.
     * 
     * @return ownerid
     */
    public java.lang.String getOwnerid() {
        return ownerid;
    }


    /**
     * Sets the ownerid value for this OaResourceRequest.
     * 
     * @param ownerid
     */
    public void setOwnerid(java.lang.String ownerid) {
        this.ownerid = ownerid;
    }


    /**
     * Gets the date_end value for this OaResourceRequest.
     * 
     * @return date_end
     */
    public java.lang.String getDate_end() {
        return date_end;
    }


    /**
     * Sets the date_end value for this OaResourceRequest.
     * 
     * @param date_end
     */
    public void setDate_end(java.lang.String date_end) {
        this.date_end = date_end;
    }


    /**
     * Gets the booking_type_id value for this OaResourceRequest.
     * 
     * @return booking_type_id
     */
    public java.lang.String getBooking_type_id() {
        return booking_type_id;
    }


    /**
     * Sets the booking_type_id value for this OaResourceRequest.
     * 
     * @param booking_type_id
     */
    public void setBooking_type_id(java.lang.String booking_type_id) {
        this.booking_type_id = booking_type_id;
    }


    /**
     * Gets the name value for this OaResourceRequest.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this OaResourceRequest.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the projectid value for this OaResourceRequest.
     * 
     * @return projectid
     */
    public java.lang.String getProjectid() {
        return projectid;
    }


    /**
     * Sets the projectid value for this OaResourceRequest.
     * 
     * @param projectid
     */
    public void setProjectid(java.lang.String projectid) {
        this.projectid = projectid;
    }


    /**
     * Gets the date_start_expected value for this OaResourceRequest.
     * 
     * @return date_start_expected
     */
    public java.lang.String getDate_start_expected() {
        return date_start_expected;
    }


    /**
     * Sets the date_start_expected value for this OaResourceRequest.
     * 
     * @param date_start_expected
     */
    public void setDate_start_expected(java.lang.String date_start_expected) {
        this.date_start_expected = date_start_expected;
    }


    /**
     * Gets the created value for this OaResourceRequest.
     * 
     * @return created
     */
    public java.lang.String getCreated() {
        return created;
    }


    /**
     * Sets the created value for this OaResourceRequest.
     * 
     * @param created
     */
    public void setCreated(java.lang.String created) {
        this.created = created;
    }


    /**
     * Gets the external_id value for this OaResourceRequest.
     * 
     * @return external_id
     */
    public java.lang.String getExternal_id() {
        return external_id;
    }


    /**
     * Sets the external_id value for this OaResourceRequest.
     * 
     * @param external_id
     */
    public void setExternal_id(java.lang.String external_id) {
        this.external_id = external_id;
    }


    /**
     * Gets the notes value for this OaResourceRequest.
     * 
     * @return notes
     */
    public java.lang.String getNotes() {
        return notes;
    }


    /**
     * Sets the notes value for this OaResourceRequest.
     * 
     * @param notes
     */
    public void setNotes(java.lang.String notes) {
        this.notes = notes;
    }


    /**
     * Gets the customerid value for this OaResourceRequest.
     * 
     * @return customerid
     */
    public java.lang.String getCustomerid() {
        return customerid;
    }


    /**
     * Sets the customerid value for this OaResourceRequest.
     * 
     * @param customerid
     */
    public void setCustomerid(java.lang.String customerid) {
        this.customerid = customerid;
    }


    /**
     * Gets the attributes value for this OaResourceRequest.
     * 
     * @return attributes
     */
    public openair.wsdl.OaBase[] getAttributes() {
        return attributes;
    }


    /**
     * Sets the attributes value for this OaResourceRequest.
     * 
     * @param attributes
     */
    public void setAttributes(openair.wsdl.OaBase[] attributes) {
        this.attributes = attributes;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OaResourceRequest)) return false;
        OaResourceRequest other = (OaResourceRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.number==null && other.getNumber()==null) || 
             (this.number!=null &&
              this.number.equals(other.getNumber()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.percent_fulfilled==null && other.getPercent_fulfilled()==null) || 
             (this.percent_fulfilled!=null &&
              this.percent_fulfilled.equals(other.getPercent_fulfilled()))) &&
            ((this.date_finalized==null && other.getDate_finalized()==null) || 
             (this.date_finalized!=null &&
              this.date_finalized.equals(other.getDate_finalized()))) &&
            ((this.date_start==null && other.getDate_start()==null) || 
             (this.date_start!=null &&
              this.date_start.equals(other.getDate_start()))) &&
            ((this.updated==null && other.getUpdated()==null) || 
             (this.updated!=null &&
              this.updated.equals(other.getUpdated()))) &&
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.ownerid==null && other.getOwnerid()==null) || 
             (this.ownerid!=null &&
              this.ownerid.equals(other.getOwnerid()))) &&
            ((this.date_end==null && other.getDate_end()==null) || 
             (this.date_end!=null &&
              this.date_end.equals(other.getDate_end()))) &&
            ((this.booking_type_id==null && other.getBooking_type_id()==null) || 
             (this.booking_type_id!=null &&
              this.booking_type_id.equals(other.getBooking_type_id()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.projectid==null && other.getProjectid()==null) || 
             (this.projectid!=null &&
              this.projectid.equals(other.getProjectid()))) &&
            ((this.date_start_expected==null && other.getDate_start_expected()==null) || 
             (this.date_start_expected!=null &&
              this.date_start_expected.equals(other.getDate_start_expected()))) &&
            ((this.created==null && other.getCreated()==null) || 
             (this.created!=null &&
              this.created.equals(other.getCreated()))) &&
            ((this.external_id==null && other.getExternal_id()==null) || 
             (this.external_id!=null &&
              this.external_id.equals(other.getExternal_id()))) &&
            ((this.notes==null && other.getNotes()==null) || 
             (this.notes!=null &&
              this.notes.equals(other.getNotes()))) &&
            ((this.customerid==null && other.getCustomerid()==null) || 
             (this.customerid!=null &&
              this.customerid.equals(other.getCustomerid()))) &&
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
        if (getNumber() != null) {
            _hashCode += getNumber().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getPercent_fulfilled() != null) {
            _hashCode += getPercent_fulfilled().hashCode();
        }
        if (getDate_finalized() != null) {
            _hashCode += getDate_finalized().hashCode();
        }
        if (getDate_start() != null) {
            _hashCode += getDate_start().hashCode();
        }
        if (getUpdated() != null) {
            _hashCode += getUpdated().hashCode();
        }
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getOwnerid() != null) {
            _hashCode += getOwnerid().hashCode();
        }
        if (getDate_end() != null) {
            _hashCode += getDate_end().hashCode();
        }
        if (getBooking_type_id() != null) {
            _hashCode += getBooking_type_id().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getProjectid() != null) {
            _hashCode += getProjectid().hashCode();
        }
        if (getDate_start_expected() != null) {
            _hashCode += getDate_start_expected().hashCode();
        }
        if (getCreated() != null) {
            _hashCode += getCreated().hashCode();
        }
        if (getExternal_id() != null) {
            _hashCode += getExternal_id().hashCode();
        }
        if (getNotes() != null) {
            _hashCode += getNotes().hashCode();
        }
        if (getCustomerid() != null) {
            _hashCode += getCustomerid().hashCode();
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
        new org.apache.axis.description.TypeDesc(OaResourceRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://namespaces.soaplite.com/perl", "oaResourceRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("number");
        elemField.setXmlName(new javax.xml.namespace.QName("", "number"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("percent_fulfilled");
        elemField.setXmlName(new javax.xml.namespace.QName("", "percent_fulfilled"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("date_finalized");
        elemField.setXmlName(new javax.xml.namespace.QName("", "date_finalized"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("date_start");
        elemField.setXmlName(new javax.xml.namespace.QName("", "date_start"));
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
        elemField.setFieldName("ownerid");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ownerid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("date_end");
        elemField.setXmlName(new javax.xml.namespace.QName("", "date_end"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("booking_type_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "booking_type_id"));
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
        elemField.setFieldName("projectid");
        elemField.setXmlName(new javax.xml.namespace.QName("", "projectid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("date_start_expected");
        elemField.setXmlName(new javax.xml.namespace.QName("", "date_start_expected"));
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
        elemField.setFieldName("external_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "external_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("notes");
        elemField.setXmlName(new javax.xml.namespace.QName("", "notes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerid");
        elemField.setXmlName(new javax.xml.namespace.QName("", "customerid"));
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
