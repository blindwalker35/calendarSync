/**
 * OaResourceRequestQueue.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package modules.openair.wsdl;

public class OaResourceRequestQueue  extends modules.openair.wsdl.OaBase  implements java.io.Serializable {
    private java.lang.String number;

    private java.lang.String date_end;

    private java.lang.String status;

    private java.lang.String name;

    private java.lang.String projectid;

    private java.lang.String resource_request_id;

    private java.lang.String created;

    private java.lang.String resourcesearch_id;

    private java.lang.String external_id;

    private java.lang.String date_start;

    private java.lang.String percent_fulfilled;

    private java.lang.String notes;

    private java.lang.String customerid;

    private java.lang.String id;

    private java.lang.String updated;

    private java.lang.String slots;

    private modules.openair.wsdl.OaBase[] attributes;

    public OaResourceRequestQueue() {
    }

    public OaResourceRequestQueue(
           java.lang.String number,
           java.lang.String date_end,
           java.lang.String status,
           java.lang.String name,
           java.lang.String projectid,
           java.lang.String resource_request_id,
           java.lang.String created,
           java.lang.String resourcesearch_id,
           java.lang.String external_id,
           java.lang.String date_start,
           java.lang.String percent_fulfilled,
           java.lang.String notes,
           java.lang.String customerid,
           java.lang.String id,
           java.lang.String updated,
           java.lang.String slots,
           modules.openair.wsdl.OaBase[] attributes) {
        this.number = number;
        this.date_end = date_end;
        this.status = status;
        this.name = name;
        this.projectid = projectid;
        this.resource_request_id = resource_request_id;
        this.created = created;
        this.resourcesearch_id = resourcesearch_id;
        this.external_id = external_id;
        this.date_start = date_start;
        this.percent_fulfilled = percent_fulfilled;
        this.notes = notes;
        this.customerid = customerid;
        this.id = id;
        this.updated = updated;
        this.slots = slots;
        this.attributes = attributes;
    }


    /**
     * Gets the number value for this OaResourceRequestQueue.
     * 
     * @return number
     */
    public java.lang.String getNumber() {
        return number;
    }


    /**
     * Sets the number value for this OaResourceRequestQueue.
     * 
     * @param number
     */
    public void setNumber(java.lang.String number) {
        this.number = number;
    }


    /**
     * Gets the date_end value for this OaResourceRequestQueue.
     * 
     * @return date_end
     */
    public java.lang.String getDate_end() {
        return date_end;
    }


    /**
     * Sets the date_end value for this OaResourceRequestQueue.
     * 
     * @param date_end
     */
    public void setDate_end(java.lang.String date_end) {
        this.date_end = date_end;
    }


    /**
     * Gets the status value for this OaResourceRequestQueue.
     * 
     * @return status
     */
    public java.lang.String getStatus() {
        return status;
    }


    /**
     * Sets the status value for this OaResourceRequestQueue.
     * 
     * @param status
     */
    public void setStatus(java.lang.String status) {
        this.status = status;
    }


    /**
     * Gets the name value for this OaResourceRequestQueue.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this OaResourceRequestQueue.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the projectid value for this OaResourceRequestQueue.
     * 
     * @return projectid
     */
    public java.lang.String getProjectid() {
        return projectid;
    }


    /**
     * Sets the projectid value for this OaResourceRequestQueue.
     * 
     * @param projectid
     */
    public void setProjectid(java.lang.String projectid) {
        this.projectid = projectid;
    }


    /**
     * Gets the resource_request_id value for this OaResourceRequestQueue.
     * 
     * @return resource_request_id
     */
    public java.lang.String getResource_request_id() {
        return resource_request_id;
    }


    /**
     * Sets the resource_request_id value for this OaResourceRequestQueue.
     * 
     * @param resource_request_id
     */
    public void setResource_request_id(java.lang.String resource_request_id) {
        this.resource_request_id = resource_request_id;
    }


    /**
     * Gets the created value for this OaResourceRequestQueue.
     * 
     * @return created
     */
    public java.lang.String getCreated() {
        return created;
    }


    /**
     * Sets the created value for this OaResourceRequestQueue.
     * 
     * @param created
     */
    public void setCreated(java.lang.String created) {
        this.created = created;
    }


    /**
     * Gets the resourcesearch_id value for this OaResourceRequestQueue.
     * 
     * @return resourcesearch_id
     */
    public java.lang.String getResourcesearch_id() {
        return resourcesearch_id;
    }


    /**
     * Sets the resourcesearch_id value for this OaResourceRequestQueue.
     * 
     * @param resourcesearch_id
     */
    public void setResourcesearch_id(java.lang.String resourcesearch_id) {
        this.resourcesearch_id = resourcesearch_id;
    }


    /**
     * Gets the external_id value for this OaResourceRequestQueue.
     * 
     * @return external_id
     */
    public java.lang.String getExternal_id() {
        return external_id;
    }


    /**
     * Sets the external_id value for this OaResourceRequestQueue.
     * 
     * @param external_id
     */
    public void setExternal_id(java.lang.String external_id) {
        this.external_id = external_id;
    }


    /**
     * Gets the date_start value for this OaResourceRequestQueue.
     * 
     * @return date_start
     */
    public java.lang.String getDate_start() {
        return date_start;
    }


    /**
     * Sets the date_start value for this OaResourceRequestQueue.
     * 
     * @param date_start
     */
    public void setDate_start(java.lang.String date_start) {
        this.date_start = date_start;
    }


    /**
     * Gets the percent_fulfilled value for this OaResourceRequestQueue.
     * 
     * @return percent_fulfilled
     */
    public java.lang.String getPercent_fulfilled() {
        return percent_fulfilled;
    }


    /**
     * Sets the percent_fulfilled value for this OaResourceRequestQueue.
     * 
     * @param percent_fulfilled
     */
    public void setPercent_fulfilled(java.lang.String percent_fulfilled) {
        this.percent_fulfilled = percent_fulfilled;
    }


    /**
     * Gets the notes value for this OaResourceRequestQueue.
     * 
     * @return notes
     */
    public java.lang.String getNotes() {
        return notes;
    }


    /**
     * Sets the notes value for this OaResourceRequestQueue.
     * 
     * @param notes
     */
    public void setNotes(java.lang.String notes) {
        this.notes = notes;
    }


    /**
     * Gets the customerid value for this OaResourceRequestQueue.
     * 
     * @return customerid
     */
    public java.lang.String getCustomerid() {
        return customerid;
    }


    /**
     * Sets the customerid value for this OaResourceRequestQueue.
     * 
     * @param customerid
     */
    public void setCustomerid(java.lang.String customerid) {
        this.customerid = customerid;
    }


    /**
     * Gets the id value for this OaResourceRequestQueue.
     * 
     * @return id
     */
    public java.lang.String getId() {
        return id;
    }


    /**
     * Sets the id value for this OaResourceRequestQueue.
     * 
     * @param id
     */
    public void setId(java.lang.String id) {
        this.id = id;
    }


    /**
     * Gets the updated value for this OaResourceRequestQueue.
     * 
     * @return updated
     */
    public java.lang.String getUpdated() {
        return updated;
    }


    /**
     * Sets the updated value for this OaResourceRequestQueue.
     * 
     * @param updated
     */
    public void setUpdated(java.lang.String updated) {
        this.updated = updated;
    }


    /**
     * Gets the slots value for this OaResourceRequestQueue.
     * 
     * @return slots
     */
    public java.lang.String getSlots() {
        return slots;
    }


    /**
     * Sets the slots value for this OaResourceRequestQueue.
     * 
     * @param slots
     */
    public void setSlots(java.lang.String slots) {
        this.slots = slots;
    }


    /**
     * Gets the attributes value for this OaResourceRequestQueue.
     * 
     * @return attributes
     */
    public modules.openair.wsdl.OaBase[] getAttributes() {
        return attributes;
    }


    /**
     * Sets the attributes value for this OaResourceRequestQueue.
     * 
     * @param attributes
     */
    public void setAttributes(modules.openair.wsdl.OaBase[] attributes) {
        this.attributes = attributes;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OaResourceRequestQueue)) return false;
        OaResourceRequestQueue other = (OaResourceRequestQueue) obj;
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
            ((this.date_end==null && other.getDate_end()==null) || 
             (this.date_end!=null &&
              this.date_end.equals(other.getDate_end()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.projectid==null && other.getProjectid()==null) || 
             (this.projectid!=null &&
              this.projectid.equals(other.getProjectid()))) &&
            ((this.resource_request_id==null && other.getResource_request_id()==null) || 
             (this.resource_request_id!=null &&
              this.resource_request_id.equals(other.getResource_request_id()))) &&
            ((this.created==null && other.getCreated()==null) || 
             (this.created!=null &&
              this.created.equals(other.getCreated()))) &&
            ((this.resourcesearch_id==null && other.getResourcesearch_id()==null) || 
             (this.resourcesearch_id!=null &&
              this.resourcesearch_id.equals(other.getResourcesearch_id()))) &&
            ((this.external_id==null && other.getExternal_id()==null) || 
             (this.external_id!=null &&
              this.external_id.equals(other.getExternal_id()))) &&
            ((this.date_start==null && other.getDate_start()==null) || 
             (this.date_start!=null &&
              this.date_start.equals(other.getDate_start()))) &&
            ((this.percent_fulfilled==null && other.getPercent_fulfilled()==null) || 
             (this.percent_fulfilled!=null &&
              this.percent_fulfilled.equals(other.getPercent_fulfilled()))) &&
            ((this.notes==null && other.getNotes()==null) || 
             (this.notes!=null &&
              this.notes.equals(other.getNotes()))) &&
            ((this.customerid==null && other.getCustomerid()==null) || 
             (this.customerid!=null &&
              this.customerid.equals(other.getCustomerid()))) &&
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.updated==null && other.getUpdated()==null) || 
             (this.updated!=null &&
              this.updated.equals(other.getUpdated()))) &&
            ((this.slots==null && other.getSlots()==null) || 
             (this.slots!=null &&
              this.slots.equals(other.getSlots()))) &&
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
        if (getDate_end() != null) {
            _hashCode += getDate_end().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getProjectid() != null) {
            _hashCode += getProjectid().hashCode();
        }
        if (getResource_request_id() != null) {
            _hashCode += getResource_request_id().hashCode();
        }
        if (getCreated() != null) {
            _hashCode += getCreated().hashCode();
        }
        if (getResourcesearch_id() != null) {
            _hashCode += getResourcesearch_id().hashCode();
        }
        if (getExternal_id() != null) {
            _hashCode += getExternal_id().hashCode();
        }
        if (getDate_start() != null) {
            _hashCode += getDate_start().hashCode();
        }
        if (getPercent_fulfilled() != null) {
            _hashCode += getPercent_fulfilled().hashCode();
        }
        if (getNotes() != null) {
            _hashCode += getNotes().hashCode();
        }
        if (getCustomerid() != null) {
            _hashCode += getCustomerid().hashCode();
        }
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getUpdated() != null) {
            _hashCode += getUpdated().hashCode();
        }
        if (getSlots() != null) {
            _hashCode += getSlots().hashCode();
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
        new org.apache.axis.description.TypeDesc(OaResourceRequestQueue.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://namespaces.soaplite.com/perl", "oaResourceRequestQueue"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("number");
        elemField.setXmlName(new javax.xml.namespace.QName("", "number"));
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
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("", "status"));
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
        elemField.setFieldName("resource_request_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "resource_request_id"));
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
        elemField.setFieldName("resourcesearch_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "resourcesearch_id"));
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
        elemField.setFieldName("date_start");
        elemField.setXmlName(new javax.xml.namespace.QName("", "date_start"));
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
        elemField.setFieldName("slots");
        elemField.setXmlName(new javax.xml.namespace.QName("", "slots"));
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
