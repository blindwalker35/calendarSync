/**
 * OaResourcesearch.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package modules.openair.wsdl;

public class OaResourcesearch  extends modules.openair.wsdl.OaBase  implements java.io.Serializable {
    private java.lang.String include_inactive_resources;

    private java.lang.String startdate;

    private java.lang.String include_regular_resources;

    private java.lang.String required;

    private java.lang.String enddate;

    private java.lang.String updated;

    private java.lang.String id;

    private java.lang.String as_percentage;

    private java.lang.String excluding;

    private java.lang.String hours;

    private java.lang.String consecutive_availability;

    private java.lang.String availability_search;

    private java.lang.String name;

    private java.lang.String preferred;

    private java.lang.String percentage;

    private java.lang.String resource_request_queue_id;

    private java.lang.String include_generic_resources;

    private java.lang.String created;

    private java.lang.String external_id;

    private modules.openair.wsdl.OaBase[] attributes;

    public OaResourcesearch() {
    }

    public OaResourcesearch(
           java.lang.String include_inactive_resources,
           java.lang.String startdate,
           java.lang.String include_regular_resources,
           java.lang.String required,
           java.lang.String enddate,
           java.lang.String updated,
           java.lang.String id,
           java.lang.String as_percentage,
           java.lang.String excluding,
           java.lang.String hours,
           java.lang.String consecutive_availability,
           java.lang.String availability_search,
           java.lang.String name,
           java.lang.String preferred,
           java.lang.String percentage,
           java.lang.String resource_request_queue_id,
           java.lang.String include_generic_resources,
           java.lang.String created,
           java.lang.String external_id,
           modules.openair.wsdl.OaBase[] attributes) {
        this.include_inactive_resources = include_inactive_resources;
        this.startdate = startdate;
        this.include_regular_resources = include_regular_resources;
        this.required = required;
        this.enddate = enddate;
        this.updated = updated;
        this.id = id;
        this.as_percentage = as_percentage;
        this.excluding = excluding;
        this.hours = hours;
        this.consecutive_availability = consecutive_availability;
        this.availability_search = availability_search;
        this.name = name;
        this.preferred = preferred;
        this.percentage = percentage;
        this.resource_request_queue_id = resource_request_queue_id;
        this.include_generic_resources = include_generic_resources;
        this.created = created;
        this.external_id = external_id;
        this.attributes = attributes;
    }


    /**
     * Gets the include_inactive_resources value for this OaResourcesearch.
     * 
     * @return include_inactive_resources
     */
    public java.lang.String getInclude_inactive_resources() {
        return include_inactive_resources;
    }


    /**
     * Sets the include_inactive_resources value for this OaResourcesearch.
     * 
     * @param include_inactive_resources
     */
    public void setInclude_inactive_resources(java.lang.String include_inactive_resources) {
        this.include_inactive_resources = include_inactive_resources;
    }


    /**
     * Gets the startdate value for this OaResourcesearch.
     * 
     * @return startdate
     */
    public java.lang.String getStartdate() {
        return startdate;
    }


    /**
     * Sets the startdate value for this OaResourcesearch.
     * 
     * @param startdate
     */
    public void setStartdate(java.lang.String startdate) {
        this.startdate = startdate;
    }


    /**
     * Gets the include_regular_resources value for this OaResourcesearch.
     * 
     * @return include_regular_resources
     */
    public java.lang.String getInclude_regular_resources() {
        return include_regular_resources;
    }


    /**
     * Sets the include_regular_resources value for this OaResourcesearch.
     * 
     * @param include_regular_resources
     */
    public void setInclude_regular_resources(java.lang.String include_regular_resources) {
        this.include_regular_resources = include_regular_resources;
    }


    /**
     * Gets the required value for this OaResourcesearch.
     * 
     * @return required
     */
    public java.lang.String getRequired() {
        return required;
    }


    /**
     * Sets the required value for this OaResourcesearch.
     * 
     * @param required
     */
    public void setRequired(java.lang.String required) {
        this.required = required;
    }


    /**
     * Gets the enddate value for this OaResourcesearch.
     * 
     * @return enddate
     */
    public java.lang.String getEnddate() {
        return enddate;
    }


    /**
     * Sets the enddate value for this OaResourcesearch.
     * 
     * @param enddate
     */
    public void setEnddate(java.lang.String enddate) {
        this.enddate = enddate;
    }


    /**
     * Gets the updated value for this OaResourcesearch.
     * 
     * @return updated
     */
    public java.lang.String getUpdated() {
        return updated;
    }


    /**
     * Sets the updated value for this OaResourcesearch.
     * 
     * @param updated
     */
    public void setUpdated(java.lang.String updated) {
        this.updated = updated;
    }


    /**
     * Gets the id value for this OaResourcesearch.
     * 
     * @return id
     */
    public java.lang.String getId() {
        return id;
    }


    /**
     * Sets the id value for this OaResourcesearch.
     * 
     * @param id
     */
    public void setId(java.lang.String id) {
        this.id = id;
    }


    /**
     * Gets the as_percentage value for this OaResourcesearch.
     * 
     * @return as_percentage
     */
    public java.lang.String getAs_percentage() {
        return as_percentage;
    }


    /**
     * Sets the as_percentage value for this OaResourcesearch.
     * 
     * @param as_percentage
     */
    public void setAs_percentage(java.lang.String as_percentage) {
        this.as_percentage = as_percentage;
    }


    /**
     * Gets the excluding value for this OaResourcesearch.
     * 
     * @return excluding
     */
    public java.lang.String getExcluding() {
        return excluding;
    }


    /**
     * Sets the excluding value for this OaResourcesearch.
     * 
     * @param excluding
     */
    public void setExcluding(java.lang.String excluding) {
        this.excluding = excluding;
    }


    /**
     * Gets the hours value for this OaResourcesearch.
     * 
     * @return hours
     */
    public java.lang.String getHours() {
        return hours;
    }


    /**
     * Sets the hours value for this OaResourcesearch.
     * 
     * @param hours
     */
    public void setHours(java.lang.String hours) {
        this.hours = hours;
    }


    /**
     * Gets the consecutive_availability value for this OaResourcesearch.
     * 
     * @return consecutive_availability
     */
    public java.lang.String getConsecutive_availability() {
        return consecutive_availability;
    }


    /**
     * Sets the consecutive_availability value for this OaResourcesearch.
     * 
     * @param consecutive_availability
     */
    public void setConsecutive_availability(java.lang.String consecutive_availability) {
        this.consecutive_availability = consecutive_availability;
    }


    /**
     * Gets the availability_search value for this OaResourcesearch.
     * 
     * @return availability_search
     */
    public java.lang.String getAvailability_search() {
        return availability_search;
    }


    /**
     * Sets the availability_search value for this OaResourcesearch.
     * 
     * @param availability_search
     */
    public void setAvailability_search(java.lang.String availability_search) {
        this.availability_search = availability_search;
    }


    /**
     * Gets the name value for this OaResourcesearch.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this OaResourcesearch.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the preferred value for this OaResourcesearch.
     * 
     * @return preferred
     */
    public java.lang.String getPreferred() {
        return preferred;
    }


    /**
     * Sets the preferred value for this OaResourcesearch.
     * 
     * @param preferred
     */
    public void setPreferred(java.lang.String preferred) {
        this.preferred = preferred;
    }


    /**
     * Gets the percentage value for this OaResourcesearch.
     * 
     * @return percentage
     */
    public java.lang.String getPercentage() {
        return percentage;
    }


    /**
     * Sets the percentage value for this OaResourcesearch.
     * 
     * @param percentage
     */
    public void setPercentage(java.lang.String percentage) {
        this.percentage = percentage;
    }


    /**
     * Gets the resource_request_queue_id value for this OaResourcesearch.
     * 
     * @return resource_request_queue_id
     */
    public java.lang.String getResource_request_queue_id() {
        return resource_request_queue_id;
    }


    /**
     * Sets the resource_request_queue_id value for this OaResourcesearch.
     * 
     * @param resource_request_queue_id
     */
    public void setResource_request_queue_id(java.lang.String resource_request_queue_id) {
        this.resource_request_queue_id = resource_request_queue_id;
    }


    /**
     * Gets the include_generic_resources value for this OaResourcesearch.
     * 
     * @return include_generic_resources
     */
    public java.lang.String getInclude_generic_resources() {
        return include_generic_resources;
    }


    /**
     * Sets the include_generic_resources value for this OaResourcesearch.
     * 
     * @param include_generic_resources
     */
    public void setInclude_generic_resources(java.lang.String include_generic_resources) {
        this.include_generic_resources = include_generic_resources;
    }


    /**
     * Gets the created value for this OaResourcesearch.
     * 
     * @return created
     */
    public java.lang.String getCreated() {
        return created;
    }


    /**
     * Sets the created value for this OaResourcesearch.
     * 
     * @param created
     */
    public void setCreated(java.lang.String created) {
        this.created = created;
    }


    /**
     * Gets the external_id value for this OaResourcesearch.
     * 
     * @return external_id
     */
    public java.lang.String getExternal_id() {
        return external_id;
    }


    /**
     * Sets the external_id value for this OaResourcesearch.
     * 
     * @param external_id
     */
    public void setExternal_id(java.lang.String external_id) {
        this.external_id = external_id;
    }


    /**
     * Gets the attributes value for this OaResourcesearch.
     * 
     * @return attributes
     */
    public modules.openair.wsdl.OaBase[] getAttributes() {
        return attributes;
    }


    /**
     * Sets the attributes value for this OaResourcesearch.
     * 
     * @param attributes
     */
    public void setAttributes(modules.openair.wsdl.OaBase[] attributes) {
        this.attributes = attributes;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OaResourcesearch)) return false;
        OaResourcesearch other = (OaResourcesearch) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.include_inactive_resources==null && other.getInclude_inactive_resources()==null) || 
             (this.include_inactive_resources!=null &&
              this.include_inactive_resources.equals(other.getInclude_inactive_resources()))) &&
            ((this.startdate==null && other.getStartdate()==null) || 
             (this.startdate!=null &&
              this.startdate.equals(other.getStartdate()))) &&
            ((this.include_regular_resources==null && other.getInclude_regular_resources()==null) || 
             (this.include_regular_resources!=null &&
              this.include_regular_resources.equals(other.getInclude_regular_resources()))) &&
            ((this.required==null && other.getRequired()==null) || 
             (this.required!=null &&
              this.required.equals(other.getRequired()))) &&
            ((this.enddate==null && other.getEnddate()==null) || 
             (this.enddate!=null &&
              this.enddate.equals(other.getEnddate()))) &&
            ((this.updated==null && other.getUpdated()==null) || 
             (this.updated!=null &&
              this.updated.equals(other.getUpdated()))) &&
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.as_percentage==null && other.getAs_percentage()==null) || 
             (this.as_percentage!=null &&
              this.as_percentage.equals(other.getAs_percentage()))) &&
            ((this.excluding==null && other.getExcluding()==null) || 
             (this.excluding!=null &&
              this.excluding.equals(other.getExcluding()))) &&
            ((this.hours==null && other.getHours()==null) || 
             (this.hours!=null &&
              this.hours.equals(other.getHours()))) &&
            ((this.consecutive_availability==null && other.getConsecutive_availability()==null) || 
             (this.consecutive_availability!=null &&
              this.consecutive_availability.equals(other.getConsecutive_availability()))) &&
            ((this.availability_search==null && other.getAvailability_search()==null) || 
             (this.availability_search!=null &&
              this.availability_search.equals(other.getAvailability_search()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.preferred==null && other.getPreferred()==null) || 
             (this.preferred!=null &&
              this.preferred.equals(other.getPreferred()))) &&
            ((this.percentage==null && other.getPercentage()==null) || 
             (this.percentage!=null &&
              this.percentage.equals(other.getPercentage()))) &&
            ((this.resource_request_queue_id==null && other.getResource_request_queue_id()==null) || 
             (this.resource_request_queue_id!=null &&
              this.resource_request_queue_id.equals(other.getResource_request_queue_id()))) &&
            ((this.include_generic_resources==null && other.getInclude_generic_resources()==null) || 
             (this.include_generic_resources!=null &&
              this.include_generic_resources.equals(other.getInclude_generic_resources()))) &&
            ((this.created==null && other.getCreated()==null) || 
             (this.created!=null &&
              this.created.equals(other.getCreated()))) &&
            ((this.external_id==null && other.getExternal_id()==null) || 
             (this.external_id!=null &&
              this.external_id.equals(other.getExternal_id()))) &&
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
        if (getInclude_inactive_resources() != null) {
            _hashCode += getInclude_inactive_resources().hashCode();
        }
        if (getStartdate() != null) {
            _hashCode += getStartdate().hashCode();
        }
        if (getInclude_regular_resources() != null) {
            _hashCode += getInclude_regular_resources().hashCode();
        }
        if (getRequired() != null) {
            _hashCode += getRequired().hashCode();
        }
        if (getEnddate() != null) {
            _hashCode += getEnddate().hashCode();
        }
        if (getUpdated() != null) {
            _hashCode += getUpdated().hashCode();
        }
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getAs_percentage() != null) {
            _hashCode += getAs_percentage().hashCode();
        }
        if (getExcluding() != null) {
            _hashCode += getExcluding().hashCode();
        }
        if (getHours() != null) {
            _hashCode += getHours().hashCode();
        }
        if (getConsecutive_availability() != null) {
            _hashCode += getConsecutive_availability().hashCode();
        }
        if (getAvailability_search() != null) {
            _hashCode += getAvailability_search().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getPreferred() != null) {
            _hashCode += getPreferred().hashCode();
        }
        if (getPercentage() != null) {
            _hashCode += getPercentage().hashCode();
        }
        if (getResource_request_queue_id() != null) {
            _hashCode += getResource_request_queue_id().hashCode();
        }
        if (getInclude_generic_resources() != null) {
            _hashCode += getInclude_generic_resources().hashCode();
        }
        if (getCreated() != null) {
            _hashCode += getCreated().hashCode();
        }
        if (getExternal_id() != null) {
            _hashCode += getExternal_id().hashCode();
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
        new org.apache.axis.description.TypeDesc(OaResourcesearch.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://namespaces.soaplite.com/perl", "oaResourcesearch"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("include_inactive_resources");
        elemField.setXmlName(new javax.xml.namespace.QName("", "include_inactive_resources"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startdate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "startdate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("include_regular_resources");
        elemField.setXmlName(new javax.xml.namespace.QName("", "include_regular_resources"));
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
        elemField.setFieldName("enddate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "enddate"));
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
        elemField.setFieldName("as_percentage");
        elemField.setXmlName(new javax.xml.namespace.QName("", "as_percentage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("excluding");
        elemField.setXmlName(new javax.xml.namespace.QName("", "excluding"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hours");
        elemField.setXmlName(new javax.xml.namespace.QName("", "hours"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("consecutive_availability");
        elemField.setXmlName(new javax.xml.namespace.QName("", "consecutive_availability"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("availability_search");
        elemField.setXmlName(new javax.xml.namespace.QName("", "availability_search"));
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
        elemField.setFieldName("preferred");
        elemField.setXmlName(new javax.xml.namespace.QName("", "preferred"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("percentage");
        elemField.setXmlName(new javax.xml.namespace.QName("", "percentage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resource_request_queue_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "resource_request_queue_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("include_generic_resources");
        elemField.setXmlName(new javax.xml.namespace.QName("", "include_generic_resources"));
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
