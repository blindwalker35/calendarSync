/**
 * OaProjecttaskassign.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package openair.wsdl;

public class OaProjecttaskassign  extends openair.wsdl.OaBase  implements java.io.Serializable {
    private java.lang.String closed_for_envelope;

    private java.lang.String userid;

    private java.lang.String closed_for_timesheet;

    private java.lang.String pending_bookingid;

    private java.lang.String bookingid;

    private java.lang.String id;

    private java.lang.String updated;

    private java.lang.String allocation;

    private java.lang.String planned_hours;

    private java.lang.String deleted;

    private java.lang.String projectid;

    private java.lang.String externalid;

    private java.lang.String project_groupid;

    private java.lang.String job_codeid;

    private java.lang.String created;

    private java.lang.String projecttaskid;

    private java.lang.String project_assignment_profileid;

    private openair.wsdl.OaBase[] attributes;

    public OaProjecttaskassign() {
    }

    public OaProjecttaskassign(
           java.lang.String closed_for_envelope,
           java.lang.String userid,
           java.lang.String closed_for_timesheet,
           java.lang.String pending_bookingid,
           java.lang.String bookingid,
           java.lang.String id,
           java.lang.String updated,
           java.lang.String allocation,
           java.lang.String planned_hours,
           java.lang.String deleted,
           java.lang.String projectid,
           java.lang.String externalid,
           java.lang.String project_groupid,
           java.lang.String job_codeid,
           java.lang.String created,
           java.lang.String projecttaskid,
           java.lang.String project_assignment_profileid,
           openair.wsdl.OaBase[] attributes) {
        this.closed_for_envelope = closed_for_envelope;
        this.userid = userid;
        this.closed_for_timesheet = closed_for_timesheet;
        this.pending_bookingid = pending_bookingid;
        this.bookingid = bookingid;
        this.id = id;
        this.updated = updated;
        this.allocation = allocation;
        this.planned_hours = planned_hours;
        this.deleted = deleted;
        this.projectid = projectid;
        this.externalid = externalid;
        this.project_groupid = project_groupid;
        this.job_codeid = job_codeid;
        this.created = created;
        this.projecttaskid = projecttaskid;
        this.project_assignment_profileid = project_assignment_profileid;
        this.attributes = attributes;
    }


    /**
     * Gets the closed_for_envelope value for this OaProjecttaskassign.
     * 
     * @return closed_for_envelope
     */
    public java.lang.String getClosed_for_envelope() {
        return closed_for_envelope;
    }


    /**
     * Sets the closed_for_envelope value for this OaProjecttaskassign.
     * 
     * @param closed_for_envelope
     */
    public void setClosed_for_envelope(java.lang.String closed_for_envelope) {
        this.closed_for_envelope = closed_for_envelope;
    }


    /**
     * Gets the userid value for this OaProjecttaskassign.
     * 
     * @return userid
     */
    public java.lang.String getUserid() {
        return userid;
    }


    /**
     * Sets the userid value for this OaProjecttaskassign.
     * 
     * @param userid
     */
    public void setUserid(java.lang.String userid) {
        this.userid = userid;
    }


    /**
     * Gets the closed_for_timesheet value for this OaProjecttaskassign.
     * 
     * @return closed_for_timesheet
     */
    public java.lang.String getClosed_for_timesheet() {
        return closed_for_timesheet;
    }


    /**
     * Sets the closed_for_timesheet value for this OaProjecttaskassign.
     * 
     * @param closed_for_timesheet
     */
    public void setClosed_for_timesheet(java.lang.String closed_for_timesheet) {
        this.closed_for_timesheet = closed_for_timesheet;
    }


    /**
     * Gets the pending_bookingid value for this OaProjecttaskassign.
     * 
     * @return pending_bookingid
     */
    public java.lang.String getPending_bookingid() {
        return pending_bookingid;
    }


    /**
     * Sets the pending_bookingid value for this OaProjecttaskassign.
     * 
     * @param pending_bookingid
     */
    public void setPending_bookingid(java.lang.String pending_bookingid) {
        this.pending_bookingid = pending_bookingid;
    }


    /**
     * Gets the bookingid value for this OaProjecttaskassign.
     * 
     * @return bookingid
     */
    public java.lang.String getBookingid() {
        return bookingid;
    }


    /**
     * Sets the bookingid value for this OaProjecttaskassign.
     * 
     * @param bookingid
     */
    public void setBookingid(java.lang.String bookingid) {
        this.bookingid = bookingid;
    }


    /**
     * Gets the id value for this OaProjecttaskassign.
     * 
     * @return id
     */
    public java.lang.String getId() {
        return id;
    }


    /**
     * Sets the id value for this OaProjecttaskassign.
     * 
     * @param id
     */
    public void setId(java.lang.String id) {
        this.id = id;
    }


    /**
     * Gets the updated value for this OaProjecttaskassign.
     * 
     * @return updated
     */
    public java.lang.String getUpdated() {
        return updated;
    }


    /**
     * Sets the updated value for this OaProjecttaskassign.
     * 
     * @param updated
     */
    public void setUpdated(java.lang.String updated) {
        this.updated = updated;
    }


    /**
     * Gets the allocation value for this OaProjecttaskassign.
     * 
     * @return allocation
     */
    public java.lang.String getAllocation() {
        return allocation;
    }


    /**
     * Sets the allocation value for this OaProjecttaskassign.
     * 
     * @param allocation
     */
    public void setAllocation(java.lang.String allocation) {
        this.allocation = allocation;
    }


    /**
     * Gets the planned_hours value for this OaProjecttaskassign.
     * 
     * @return planned_hours
     */
    public java.lang.String getPlanned_hours() {
        return planned_hours;
    }


    /**
     * Sets the planned_hours value for this OaProjecttaskassign.
     * 
     * @param planned_hours
     */
    public void setPlanned_hours(java.lang.String planned_hours) {
        this.planned_hours = planned_hours;
    }


    /**
     * Gets the deleted value for this OaProjecttaskassign.
     * 
     * @return deleted
     */
    public java.lang.String getDeleted() {
        return deleted;
    }


    /**
     * Sets the deleted value for this OaProjecttaskassign.
     * 
     * @param deleted
     */
    public void setDeleted(java.lang.String deleted) {
        this.deleted = deleted;
    }


    /**
     * Gets the projectid value for this OaProjecttaskassign.
     * 
     * @return projectid
     */
    public java.lang.String getProjectid() {
        return projectid;
    }


    /**
     * Sets the projectid value for this OaProjecttaskassign.
     * 
     * @param projectid
     */
    public void setProjectid(java.lang.String projectid) {
        this.projectid = projectid;
    }


    /**
     * Gets the externalid value for this OaProjecttaskassign.
     * 
     * @return externalid
     */
    public java.lang.String getExternalid() {
        return externalid;
    }


    /**
     * Sets the externalid value for this OaProjecttaskassign.
     * 
     * @param externalid
     */
    public void setExternalid(java.lang.String externalid) {
        this.externalid = externalid;
    }


    /**
     * Gets the project_groupid value for this OaProjecttaskassign.
     * 
     * @return project_groupid
     */
    public java.lang.String getProject_groupid() {
        return project_groupid;
    }


    /**
     * Sets the project_groupid value for this OaProjecttaskassign.
     * 
     * @param project_groupid
     */
    public void setProject_groupid(java.lang.String project_groupid) {
        this.project_groupid = project_groupid;
    }


    /**
     * Gets the job_codeid value for this OaProjecttaskassign.
     * 
     * @return job_codeid
     */
    public java.lang.String getJob_codeid() {
        return job_codeid;
    }


    /**
     * Sets the job_codeid value for this OaProjecttaskassign.
     * 
     * @param job_codeid
     */
    public void setJob_codeid(java.lang.String job_codeid) {
        this.job_codeid = job_codeid;
    }


    /**
     * Gets the created value for this OaProjecttaskassign.
     * 
     * @return created
     */
    public java.lang.String getCreated() {
        return created;
    }


    /**
     * Sets the created value for this OaProjecttaskassign.
     * 
     * @param created
     */
    public void setCreated(java.lang.String created) {
        this.created = created;
    }


    /**
     * Gets the projecttaskid value for this OaProjecttaskassign.
     * 
     * @return projecttaskid
     */
    public java.lang.String getProjecttaskid() {
        return projecttaskid;
    }


    /**
     * Sets the projecttaskid value for this OaProjecttaskassign.
     * 
     * @param projecttaskid
     */
    public void setProjecttaskid(java.lang.String projecttaskid) {
        this.projecttaskid = projecttaskid;
    }


    /**
     * Gets the project_assignment_profileid value for this OaProjecttaskassign.
     * 
     * @return project_assignment_profileid
     */
    public java.lang.String getProject_assignment_profileid() {
        return project_assignment_profileid;
    }


    /**
     * Sets the project_assignment_profileid value for this OaProjecttaskassign.
     * 
     * @param project_assignment_profileid
     */
    public void setProject_assignment_profileid(java.lang.String project_assignment_profileid) {
        this.project_assignment_profileid = project_assignment_profileid;
    }


    /**
     * Gets the attributes value for this OaProjecttaskassign.
     * 
     * @return attributes
     */
    public openair.wsdl.OaBase[] getAttributes() {
        return attributes;
    }


    /**
     * Sets the attributes value for this OaProjecttaskassign.
     * 
     * @param attributes
     */
    public void setAttributes(openair.wsdl.OaBase[] attributes) {
        this.attributes = attributes;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OaProjecttaskassign)) return false;
        OaProjecttaskassign other = (OaProjecttaskassign) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.closed_for_envelope==null && other.getClosed_for_envelope()==null) || 
             (this.closed_for_envelope!=null &&
              this.closed_for_envelope.equals(other.getClosed_for_envelope()))) &&
            ((this.userid==null && other.getUserid()==null) || 
             (this.userid!=null &&
              this.userid.equals(other.getUserid()))) &&
            ((this.closed_for_timesheet==null && other.getClosed_for_timesheet()==null) || 
             (this.closed_for_timesheet!=null &&
              this.closed_for_timesheet.equals(other.getClosed_for_timesheet()))) &&
            ((this.pending_bookingid==null && other.getPending_bookingid()==null) || 
             (this.pending_bookingid!=null &&
              this.pending_bookingid.equals(other.getPending_bookingid()))) &&
            ((this.bookingid==null && other.getBookingid()==null) || 
             (this.bookingid!=null &&
              this.bookingid.equals(other.getBookingid()))) &&
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.updated==null && other.getUpdated()==null) || 
             (this.updated!=null &&
              this.updated.equals(other.getUpdated()))) &&
            ((this.allocation==null && other.getAllocation()==null) || 
             (this.allocation!=null &&
              this.allocation.equals(other.getAllocation()))) &&
            ((this.planned_hours==null && other.getPlanned_hours()==null) || 
             (this.planned_hours!=null &&
              this.planned_hours.equals(other.getPlanned_hours()))) &&
            ((this.deleted==null && other.getDeleted()==null) || 
             (this.deleted!=null &&
              this.deleted.equals(other.getDeleted()))) &&
            ((this.projectid==null && other.getProjectid()==null) || 
             (this.projectid!=null &&
              this.projectid.equals(other.getProjectid()))) &&
            ((this.externalid==null && other.getExternalid()==null) || 
             (this.externalid!=null &&
              this.externalid.equals(other.getExternalid()))) &&
            ((this.project_groupid==null && other.getProject_groupid()==null) || 
             (this.project_groupid!=null &&
              this.project_groupid.equals(other.getProject_groupid()))) &&
            ((this.job_codeid==null && other.getJob_codeid()==null) || 
             (this.job_codeid!=null &&
              this.job_codeid.equals(other.getJob_codeid()))) &&
            ((this.created==null && other.getCreated()==null) || 
             (this.created!=null &&
              this.created.equals(other.getCreated()))) &&
            ((this.projecttaskid==null && other.getProjecttaskid()==null) || 
             (this.projecttaskid!=null &&
              this.projecttaskid.equals(other.getProjecttaskid()))) &&
            ((this.project_assignment_profileid==null && other.getProject_assignment_profileid()==null) || 
             (this.project_assignment_profileid!=null &&
              this.project_assignment_profileid.equals(other.getProject_assignment_profileid()))) &&
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
        if (getClosed_for_envelope() != null) {
            _hashCode += getClosed_for_envelope().hashCode();
        }
        if (getUserid() != null) {
            _hashCode += getUserid().hashCode();
        }
        if (getClosed_for_timesheet() != null) {
            _hashCode += getClosed_for_timesheet().hashCode();
        }
        if (getPending_bookingid() != null) {
            _hashCode += getPending_bookingid().hashCode();
        }
        if (getBookingid() != null) {
            _hashCode += getBookingid().hashCode();
        }
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getUpdated() != null) {
            _hashCode += getUpdated().hashCode();
        }
        if (getAllocation() != null) {
            _hashCode += getAllocation().hashCode();
        }
        if (getPlanned_hours() != null) {
            _hashCode += getPlanned_hours().hashCode();
        }
        if (getDeleted() != null) {
            _hashCode += getDeleted().hashCode();
        }
        if (getProjectid() != null) {
            _hashCode += getProjectid().hashCode();
        }
        if (getExternalid() != null) {
            _hashCode += getExternalid().hashCode();
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
        if (getProjecttaskid() != null) {
            _hashCode += getProjecttaskid().hashCode();
        }
        if (getProject_assignment_profileid() != null) {
            _hashCode += getProject_assignment_profileid().hashCode();
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
        new org.apache.axis.description.TypeDesc(OaProjecttaskassign.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://namespaces.soaplite.com/perl", "oaProjecttaskassign"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("closed_for_envelope");
        elemField.setXmlName(new javax.xml.namespace.QName("", "closed_for_envelope"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userid");
        elemField.setXmlName(new javax.xml.namespace.QName("", "userid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("closed_for_timesheet");
        elemField.setXmlName(new javax.xml.namespace.QName("", "closed_for_timesheet"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pending_bookingid");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pending_bookingid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bookingid");
        elemField.setXmlName(new javax.xml.namespace.QName("", "bookingid"));
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
        elemField.setFieldName("allocation");
        elemField.setXmlName(new javax.xml.namespace.QName("", "allocation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("planned_hours");
        elemField.setXmlName(new javax.xml.namespace.QName("", "planned_hours"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deleted");
        elemField.setXmlName(new javax.xml.namespace.QName("", "deleted"));
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
        elemField.setFieldName("externalid");
        elemField.setXmlName(new javax.xml.namespace.QName("", "externalid"));
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
        elemField.setFieldName("projecttaskid");
        elemField.setXmlName(new javax.xml.namespace.QName("", "projecttaskid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("project_assignment_profileid");
        elemField.setXmlName(new javax.xml.namespace.QName("", "project_assignment_profileid"));
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
