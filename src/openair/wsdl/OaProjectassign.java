/**
 * OaProjectassign.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package openair.wsdl;

public class OaProjectassign  extends openair.wsdl.OaBase  implements java.io.Serializable {
    private java.lang.String deleted;

    private java.lang.String project_groupid;

    private java.lang.String job_codeid;

    private java.lang.String created;

    private java.lang.String customer_id;

    private java.lang.String id;

    private java.lang.String user_id;

    private java.lang.String updated;

    private java.lang.String allocation;

    private java.lang.String project_id;

    private openair.wsdl.OaBase[] attributes;

    public OaProjectassign() {
    }

    public OaProjectassign(
           java.lang.String deleted,
           java.lang.String project_groupid,
           java.lang.String job_codeid,
           java.lang.String created,
           java.lang.String customer_id,
           java.lang.String id,
           java.lang.String user_id,
           java.lang.String updated,
           java.lang.String allocation,
           java.lang.String project_id,
           openair.wsdl.OaBase[] attributes) {
        this.deleted = deleted;
        this.project_groupid = project_groupid;
        this.job_codeid = job_codeid;
        this.created = created;
        this.customer_id = customer_id;
        this.id = id;
        this.user_id = user_id;
        this.updated = updated;
        this.allocation = allocation;
        this.project_id = project_id;
        this.attributes = attributes;
    }


    /**
     * Gets the deleted value for this OaProjectassign.
     * 
     * @return deleted
     */
    public java.lang.String getDeleted() {
        return deleted;
    }


    /**
     * Sets the deleted value for this OaProjectassign.
     * 
     * @param deleted
     */
    public void setDeleted(java.lang.String deleted) {
        this.deleted = deleted;
    }


    /**
     * Gets the project_groupid value for this OaProjectassign.
     * 
     * @return project_groupid
     */
    public java.lang.String getProject_groupid() {
        return project_groupid;
    }


    /**
     * Sets the project_groupid value for this OaProjectassign.
     * 
     * @param project_groupid
     */
    public void setProject_groupid(java.lang.String project_groupid) {
        this.project_groupid = project_groupid;
    }


    /**
     * Gets the job_codeid value for this OaProjectassign.
     * 
     * @return job_codeid
     */
    public java.lang.String getJob_codeid() {
        return job_codeid;
    }


    /**
     * Sets the job_codeid value for this OaProjectassign.
     * 
     * @param job_codeid
     */
    public void setJob_codeid(java.lang.String job_codeid) {
        this.job_codeid = job_codeid;
    }


    /**
     * Gets the created value for this OaProjectassign.
     * 
     * @return created
     */
    public java.lang.String getCreated() {
        return created;
    }


    /**
     * Sets the created value for this OaProjectassign.
     * 
     * @param created
     */
    public void setCreated(java.lang.String created) {
        this.created = created;
    }


    /**
     * Gets the customer_id value for this OaProjectassign.
     * 
     * @return customer_id
     */
    public java.lang.String getCustomer_id() {
        return customer_id;
    }


    /**
     * Sets the customer_id value for this OaProjectassign.
     * 
     * @param customer_id
     */
    public void setCustomer_id(java.lang.String customer_id) {
        this.customer_id = customer_id;
    }


    /**
     * Gets the id value for this OaProjectassign.
     * 
     * @return id
     */
    public java.lang.String getId() {
        return id;
    }


    /**
     * Sets the id value for this OaProjectassign.
     * 
     * @param id
     */
    public void setId(java.lang.String id) {
        this.id = id;
    }


    /**
     * Gets the user_id value for this OaProjectassign.
     * 
     * @return user_id
     */
    public java.lang.String getUser_id() {
        return user_id;
    }


    /**
     * Sets the user_id value for this OaProjectassign.
     * 
     * @param user_id
     */
    public void setUser_id(java.lang.String user_id) {
        this.user_id = user_id;
    }


    /**
     * Gets the updated value for this OaProjectassign.
     * 
     * @return updated
     */
    public java.lang.String getUpdated() {
        return updated;
    }


    /**
     * Sets the updated value for this OaProjectassign.
     * 
     * @param updated
     */
    public void setUpdated(java.lang.String updated) {
        this.updated = updated;
    }


    /**
     * Gets the allocation value for this OaProjectassign.
     * 
     * @return allocation
     */
    public java.lang.String getAllocation() {
        return allocation;
    }


    /**
     * Sets the allocation value for this OaProjectassign.
     * 
     * @param allocation
     */
    public void setAllocation(java.lang.String allocation) {
        this.allocation = allocation;
    }


    /**
     * Gets the project_id value for this OaProjectassign.
     * 
     * @return project_id
     */
    public java.lang.String getProject_id() {
        return project_id;
    }


    /**
     * Sets the project_id value for this OaProjectassign.
     * 
     * @param project_id
     */
    public void setProject_id(java.lang.String project_id) {
        this.project_id = project_id;
    }


    /**
     * Gets the attributes value for this OaProjectassign.
     * 
     * @return attributes
     */
    public openair.wsdl.OaBase[] getAttributes() {
        return attributes;
    }


    /**
     * Sets the attributes value for this OaProjectassign.
     * 
     * @param attributes
     */
    public void setAttributes(openair.wsdl.OaBase[] attributes) {
        this.attributes = attributes;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OaProjectassign)) return false;
        OaProjectassign other = (OaProjectassign) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.deleted==null && other.getDeleted()==null) || 
             (this.deleted!=null &&
              this.deleted.equals(other.getDeleted()))) &&
            ((this.project_groupid==null && other.getProject_groupid()==null) || 
             (this.project_groupid!=null &&
              this.project_groupid.equals(other.getProject_groupid()))) &&
            ((this.job_codeid==null && other.getJob_codeid()==null) || 
             (this.job_codeid!=null &&
              this.job_codeid.equals(other.getJob_codeid()))) &&
            ((this.created==null && other.getCreated()==null) || 
             (this.created!=null &&
              this.created.equals(other.getCreated()))) &&
            ((this.customer_id==null && other.getCustomer_id()==null) || 
             (this.customer_id!=null &&
              this.customer_id.equals(other.getCustomer_id()))) &&
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.user_id==null && other.getUser_id()==null) || 
             (this.user_id!=null &&
              this.user_id.equals(other.getUser_id()))) &&
            ((this.updated==null && other.getUpdated()==null) || 
             (this.updated!=null &&
              this.updated.equals(other.getUpdated()))) &&
            ((this.allocation==null && other.getAllocation()==null) || 
             (this.allocation!=null &&
              this.allocation.equals(other.getAllocation()))) &&
            ((this.project_id==null && other.getProject_id()==null) || 
             (this.project_id!=null &&
              this.project_id.equals(other.getProject_id()))) &&
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
        if (getDeleted() != null) {
            _hashCode += getDeleted().hashCode();
        }
        if (getProject_groupid() != null) {
            _hashCode += getProject_groupid().hashCode();
        }
        if (getJob_codeid() != null) {
            _hashCode += getJob_codeid().hashCode();
        }
        if (getCreated() != null) {
            _hashCode += getCreated().hashCode();
        }
        if (getCustomer_id() != null) {
            _hashCode += getCustomer_id().hashCode();
        }
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getUser_id() != null) {
            _hashCode += getUser_id().hashCode();
        }
        if (getUpdated() != null) {
            _hashCode += getUpdated().hashCode();
        }
        if (getAllocation() != null) {
            _hashCode += getAllocation().hashCode();
        }
        if (getProject_id() != null) {
            _hashCode += getProject_id().hashCode();
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
        new org.apache.axis.description.TypeDesc(OaProjectassign.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://namespaces.soaplite.com/perl", "oaProjectassign"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deleted");
        elemField.setXmlName(new javax.xml.namespace.QName("", "deleted"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("project_groupid");
        elemField.setXmlName(new javax.xml.namespace.QName("", "project_groupid"));
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
        elemField.setFieldName("created");
        elemField.setXmlName(new javax.xml.namespace.QName("", "created"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customer_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "customer_id"));
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
        elemField.setFieldName("user_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "user_id"));
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
        elemField.setFieldName("allocation");
        elemField.setXmlName(new javax.xml.namespace.QName("", "allocation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("project_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "project_id"));
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
