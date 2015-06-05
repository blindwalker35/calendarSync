/**
 * OaUprate.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package openair.wsdl;

public class OaUprate  extends openair.wsdl.OaBase  implements java.io.Serializable {
    private java.lang.String userid;

    private java.lang.String duration;

    private java.lang.String projectid;

    private java.lang.String job_codeid;

    private java.lang.String categoryid;

    private java.lang.String currency;

    private java.lang.String rate;

    private java.lang.String created;

    private java.lang.String notes;

    private java.lang.String customerid;

    private java.lang.String updated;

    private java.lang.String id;

    private java.lang.String project_billing_ruleid;

    private openair.wsdl.OaBase[] attributes;

    public OaUprate() {
    }

    public OaUprate(
           java.lang.String userid,
           java.lang.String duration,
           java.lang.String projectid,
           java.lang.String job_codeid,
           java.lang.String categoryid,
           java.lang.String currency,
           java.lang.String rate,
           java.lang.String created,
           java.lang.String notes,
           java.lang.String customerid,
           java.lang.String updated,
           java.lang.String id,
           java.lang.String project_billing_ruleid,
           openair.wsdl.OaBase[] attributes) {
        this.userid = userid;
        this.duration = duration;
        this.projectid = projectid;
        this.job_codeid = job_codeid;
        this.categoryid = categoryid;
        this.currency = currency;
        this.rate = rate;
        this.created = created;
        this.notes = notes;
        this.customerid = customerid;
        this.updated = updated;
        this.id = id;
        this.project_billing_ruleid = project_billing_ruleid;
        this.attributes = attributes;
    }


    /**
     * Gets the userid value for this OaUprate.
     * 
     * @return userid
     */
    public java.lang.String getUserid() {
        return userid;
    }


    /**
     * Sets the userid value for this OaUprate.
     * 
     * @param userid
     */
    public void setUserid(java.lang.String userid) {
        this.userid = userid;
    }


    /**
     * Gets the duration value for this OaUprate.
     * 
     * @return duration
     */
    public java.lang.String getDuration() {
        return duration;
    }


    /**
     * Sets the duration value for this OaUprate.
     * 
     * @param duration
     */
    public void setDuration(java.lang.String duration) {
        this.duration = duration;
    }


    /**
     * Gets the projectid value for this OaUprate.
     * 
     * @return projectid
     */
    public java.lang.String getProjectid() {
        return projectid;
    }


    /**
     * Sets the projectid value for this OaUprate.
     * 
     * @param projectid
     */
    public void setProjectid(java.lang.String projectid) {
        this.projectid = projectid;
    }


    /**
     * Gets the job_codeid value for this OaUprate.
     * 
     * @return job_codeid
     */
    public java.lang.String getJob_codeid() {
        return job_codeid;
    }


    /**
     * Sets the job_codeid value for this OaUprate.
     * 
     * @param job_codeid
     */
    public void setJob_codeid(java.lang.String job_codeid) {
        this.job_codeid = job_codeid;
    }


    /**
     * Gets the categoryid value for this OaUprate.
     * 
     * @return categoryid
     */
    public java.lang.String getCategoryid() {
        return categoryid;
    }


    /**
     * Sets the categoryid value for this OaUprate.
     * 
     * @param categoryid
     */
    public void setCategoryid(java.lang.String categoryid) {
        this.categoryid = categoryid;
    }


    /**
     * Gets the currency value for this OaUprate.
     * 
     * @return currency
     */
    public java.lang.String getCurrency() {
        return currency;
    }


    /**
     * Sets the currency value for this OaUprate.
     * 
     * @param currency
     */
    public void setCurrency(java.lang.String currency) {
        this.currency = currency;
    }


    /**
     * Gets the rate value for this OaUprate.
     * 
     * @return rate
     */
    public java.lang.String getRate() {
        return rate;
    }


    /**
     * Sets the rate value for this OaUprate.
     * 
     * @param rate
     */
    public void setRate(java.lang.String rate) {
        this.rate = rate;
    }


    /**
     * Gets the created value for this OaUprate.
     * 
     * @return created
     */
    public java.lang.String getCreated() {
        return created;
    }


    /**
     * Sets the created value for this OaUprate.
     * 
     * @param created
     */
    public void setCreated(java.lang.String created) {
        this.created = created;
    }


    /**
     * Gets the notes value for this OaUprate.
     * 
     * @return notes
     */
    public java.lang.String getNotes() {
        return notes;
    }


    /**
     * Sets the notes value for this OaUprate.
     * 
     * @param notes
     */
    public void setNotes(java.lang.String notes) {
        this.notes = notes;
    }


    /**
     * Gets the customerid value for this OaUprate.
     * 
     * @return customerid
     */
    public java.lang.String getCustomerid() {
        return customerid;
    }


    /**
     * Sets the customerid value for this OaUprate.
     * 
     * @param customerid
     */
    public void setCustomerid(java.lang.String customerid) {
        this.customerid = customerid;
    }


    /**
     * Gets the updated value for this OaUprate.
     * 
     * @return updated
     */
    public java.lang.String getUpdated() {
        return updated;
    }


    /**
     * Sets the updated value for this OaUprate.
     * 
     * @param updated
     */
    public void setUpdated(java.lang.String updated) {
        this.updated = updated;
    }


    /**
     * Gets the id value for this OaUprate.
     * 
     * @return id
     */
    public java.lang.String getId() {
        return id;
    }


    /**
     * Sets the id value for this OaUprate.
     * 
     * @param id
     */
    public void setId(java.lang.String id) {
        this.id = id;
    }


    /**
     * Gets the project_billing_ruleid value for this OaUprate.
     * 
     * @return project_billing_ruleid
     */
    public java.lang.String getProject_billing_ruleid() {
        return project_billing_ruleid;
    }


    /**
     * Sets the project_billing_ruleid value for this OaUprate.
     * 
     * @param project_billing_ruleid
     */
    public void setProject_billing_ruleid(java.lang.String project_billing_ruleid) {
        this.project_billing_ruleid = project_billing_ruleid;
    }


    /**
     * Gets the attributes value for this OaUprate.
     * 
     * @return attributes
     */
    public openair.wsdl.OaBase[] getAttributes() {
        return attributes;
    }


    /**
     * Sets the attributes value for this OaUprate.
     * 
     * @param attributes
     */
    public void setAttributes(openair.wsdl.OaBase[] attributes) {
        this.attributes = attributes;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OaUprate)) return false;
        OaUprate other = (OaUprate) obj;
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
            ((this.duration==null && other.getDuration()==null) || 
             (this.duration!=null &&
              this.duration.equals(other.getDuration()))) &&
            ((this.projectid==null && other.getProjectid()==null) || 
             (this.projectid!=null &&
              this.projectid.equals(other.getProjectid()))) &&
            ((this.job_codeid==null && other.getJob_codeid()==null) || 
             (this.job_codeid!=null &&
              this.job_codeid.equals(other.getJob_codeid()))) &&
            ((this.categoryid==null && other.getCategoryid()==null) || 
             (this.categoryid!=null &&
              this.categoryid.equals(other.getCategoryid()))) &&
            ((this.currency==null && other.getCurrency()==null) || 
             (this.currency!=null &&
              this.currency.equals(other.getCurrency()))) &&
            ((this.rate==null && other.getRate()==null) || 
             (this.rate!=null &&
              this.rate.equals(other.getRate()))) &&
            ((this.created==null && other.getCreated()==null) || 
             (this.created!=null &&
              this.created.equals(other.getCreated()))) &&
            ((this.notes==null && other.getNotes()==null) || 
             (this.notes!=null &&
              this.notes.equals(other.getNotes()))) &&
            ((this.customerid==null && other.getCustomerid()==null) || 
             (this.customerid!=null &&
              this.customerid.equals(other.getCustomerid()))) &&
            ((this.updated==null && other.getUpdated()==null) || 
             (this.updated!=null &&
              this.updated.equals(other.getUpdated()))) &&
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.project_billing_ruleid==null && other.getProject_billing_ruleid()==null) || 
             (this.project_billing_ruleid!=null &&
              this.project_billing_ruleid.equals(other.getProject_billing_ruleid()))) &&
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
        if (getDuration() != null) {
            _hashCode += getDuration().hashCode();
        }
        if (getProjectid() != null) {
            _hashCode += getProjectid().hashCode();
        }
        if (getJob_codeid() != null) {
            _hashCode += getJob_codeid().hashCode();
        }
        if (getCategoryid() != null) {
            _hashCode += getCategoryid().hashCode();
        }
        if (getCurrency() != null) {
            _hashCode += getCurrency().hashCode();
        }
        if (getRate() != null) {
            _hashCode += getRate().hashCode();
        }
        if (getCreated() != null) {
            _hashCode += getCreated().hashCode();
        }
        if (getNotes() != null) {
            _hashCode += getNotes().hashCode();
        }
        if (getCustomerid() != null) {
            _hashCode += getCustomerid().hashCode();
        }
        if (getUpdated() != null) {
            _hashCode += getUpdated().hashCode();
        }
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getProject_billing_ruleid() != null) {
            _hashCode += getProject_billing_ruleid().hashCode();
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
        new org.apache.axis.description.TypeDesc(OaUprate.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://namespaces.soaplite.com/perl", "oaUprate"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userid");
        elemField.setXmlName(new javax.xml.namespace.QName("", "userid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("duration");
        elemField.setXmlName(new javax.xml.namespace.QName("", "duration"));
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
        elemField.setFieldName("job_codeid");
        elemField.setXmlName(new javax.xml.namespace.QName("", "job_codeid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("categoryid");
        elemField.setXmlName(new javax.xml.namespace.QName("", "categoryid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currency");
        elemField.setXmlName(new javax.xml.namespace.QName("", "currency"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rate"));
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
        elemField.setFieldName("project_billing_ruleid");
        elemField.setXmlName(new javax.xml.namespace.QName("", "project_billing_ruleid"));
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
