/**
 * OaPendingBooking.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package openair.wsdl;

public class OaPendingBooking  extends openair.wsdl.OaBase  implements java.io.Serializable {
    private java.lang.String userid;

    private java.lang.String dirty;

    private java.lang.String startdate;

    private java.lang.String repeatid;

    private java.lang.String booking_typeid;

    private java.lang.String notify_owner;

    private java.lang.String enddate;

    private java.lang.String date_approved;

    private java.lang.String starttime;

    private java.lang.String id;

    private java.lang.String endtime;

    private java.lang.String updated;

    private java.lang.String as_percentage;

    private java.lang.String project_taskid;

    private java.lang.String date_submitted;

    private java.lang.String ownerid;

    private java.lang.String hours;

    private java.lang.String approval_status;

    private java.lang.String percentage;

    private java.lang.String externalid;

    private java.lang.String job_codeid;

    private java.lang.String projectid;

    private java.lang.String resource_request_queue_id;

    private java.lang.String created;

    private java.lang.String locationid;

    private java.lang.String notes;

    private java.lang.String customerid;

    private java.lang.String project_assignment_profileid;

    private openair.wsdl.OaBase[] attributes;

    public OaPendingBooking() {
    }

    public OaPendingBooking(
           java.lang.String userid,
           java.lang.String dirty,
           java.lang.String startdate,
           java.lang.String repeatid,
           java.lang.String booking_typeid,
           java.lang.String notify_owner,
           java.lang.String enddate,
           java.lang.String date_approved,
           java.lang.String starttime,
           java.lang.String id,
           java.lang.String endtime,
           java.lang.String updated,
           java.lang.String as_percentage,
           java.lang.String project_taskid,
           java.lang.String date_submitted,
           java.lang.String ownerid,
           java.lang.String hours,
           java.lang.String approval_status,
           java.lang.String percentage,
           java.lang.String externalid,
           java.lang.String job_codeid,
           java.lang.String projectid,
           java.lang.String resource_request_queue_id,
           java.lang.String created,
           java.lang.String locationid,
           java.lang.String notes,
           java.lang.String customerid,
           java.lang.String project_assignment_profileid,
           openair.wsdl.OaBase[] attributes) {
        this.userid = userid;
        this.dirty = dirty;
        this.startdate = startdate;
        this.repeatid = repeatid;
        this.booking_typeid = booking_typeid;
        this.notify_owner = notify_owner;
        this.enddate = enddate;
        this.date_approved = date_approved;
        this.starttime = starttime;
        this.id = id;
        this.endtime = endtime;
        this.updated = updated;
        this.as_percentage = as_percentage;
        this.project_taskid = project_taskid;
        this.date_submitted = date_submitted;
        this.ownerid = ownerid;
        this.hours = hours;
        this.approval_status = approval_status;
        this.percentage = percentage;
        this.externalid = externalid;
        this.job_codeid = job_codeid;
        this.projectid = projectid;
        this.resource_request_queue_id = resource_request_queue_id;
        this.created = created;
        this.locationid = locationid;
        this.notes = notes;
        this.customerid = customerid;
        this.project_assignment_profileid = project_assignment_profileid;
        this.attributes = attributes;
    }


    /**
     * Gets the userid value for this OaPendingBooking.
     * 
     * @return userid
     */
    public java.lang.String getUserid() {
        return userid;
    }


    /**
     * Sets the userid value for this OaPendingBooking.
     * 
     * @param userid
     */
    public void setUserid(java.lang.String userid) {
        this.userid = userid;
    }


    /**
     * Gets the dirty value for this OaPendingBooking.
     * 
     * @return dirty
     */
    public java.lang.String getDirty() {
        return dirty;
    }


    /**
     * Sets the dirty value for this OaPendingBooking.
     * 
     * @param dirty
     */
    public void setDirty(java.lang.String dirty) {
        this.dirty = dirty;
    }


    /**
     * Gets the startdate value for this OaPendingBooking.
     * 
     * @return startdate
     */
    public java.lang.String getStartdate() {
        return startdate;
    }


    /**
     * Sets the startdate value for this OaPendingBooking.
     * 
     * @param startdate
     */
    public void setStartdate(java.lang.String startdate) {
        this.startdate = startdate;
    }


    /**
     * Gets the repeatid value for this OaPendingBooking.
     * 
     * @return repeatid
     */
    public java.lang.String getRepeatid() {
        return repeatid;
    }


    /**
     * Sets the repeatid value for this OaPendingBooking.
     * 
     * @param repeatid
     */
    public void setRepeatid(java.lang.String repeatid) {
        this.repeatid = repeatid;
    }


    /**
     * Gets the booking_typeid value for this OaPendingBooking.
     * 
     * @return booking_typeid
     */
    public java.lang.String getBooking_typeid() {
        return booking_typeid;
    }


    /**
     * Sets the booking_typeid value for this OaPendingBooking.
     * 
     * @param booking_typeid
     */
    public void setBooking_typeid(java.lang.String booking_typeid) {
        this.booking_typeid = booking_typeid;
    }


    /**
     * Gets the notify_owner value for this OaPendingBooking.
     * 
     * @return notify_owner
     */
    public java.lang.String getNotify_owner() {
        return notify_owner;
    }


    /**
     * Sets the notify_owner value for this OaPendingBooking.
     * 
     * @param notify_owner
     */
    public void setNotify_owner(java.lang.String notify_owner) {
        this.notify_owner = notify_owner;
    }


    /**
     * Gets the enddate value for this OaPendingBooking.
     * 
     * @return enddate
     */
    public java.lang.String getEnddate() {
        return enddate;
    }


    /**
     * Sets the enddate value for this OaPendingBooking.
     * 
     * @param enddate
     */
    public void setEnddate(java.lang.String enddate) {
        this.enddate = enddate;
    }


    /**
     * Gets the date_approved value for this OaPendingBooking.
     * 
     * @return date_approved
     */
    public java.lang.String getDate_approved() {
        return date_approved;
    }


    /**
     * Sets the date_approved value for this OaPendingBooking.
     * 
     * @param date_approved
     */
    public void setDate_approved(java.lang.String date_approved) {
        this.date_approved = date_approved;
    }


    /**
     * Gets the starttime value for this OaPendingBooking.
     * 
     * @return starttime
     */
    public java.lang.String getStarttime() {
        return starttime;
    }


    /**
     * Sets the starttime value for this OaPendingBooking.
     * 
     * @param starttime
     */
    public void setStarttime(java.lang.String starttime) {
        this.starttime = starttime;
    }


    /**
     * Gets the id value for this OaPendingBooking.
     * 
     * @return id
     */
    public java.lang.String getId() {
        return id;
    }


    /**
     * Sets the id value for this OaPendingBooking.
     * 
     * @param id
     */
    public void setId(java.lang.String id) {
        this.id = id;
    }


    /**
     * Gets the endtime value for this OaPendingBooking.
     * 
     * @return endtime
     */
    public java.lang.String getEndtime() {
        return endtime;
    }


    /**
     * Sets the endtime value for this OaPendingBooking.
     * 
     * @param endtime
     */
    public void setEndtime(java.lang.String endtime) {
        this.endtime = endtime;
    }


    /**
     * Gets the updated value for this OaPendingBooking.
     * 
     * @return updated
     */
    public java.lang.String getUpdated() {
        return updated;
    }


    /**
     * Sets the updated value for this OaPendingBooking.
     * 
     * @param updated
     */
    public void setUpdated(java.lang.String updated) {
        this.updated = updated;
    }


    /**
     * Gets the as_percentage value for this OaPendingBooking.
     * 
     * @return as_percentage
     */
    public java.lang.String getAs_percentage() {
        return as_percentage;
    }


    /**
     * Sets the as_percentage value for this OaPendingBooking.
     * 
     * @param as_percentage
     */
    public void setAs_percentage(java.lang.String as_percentage) {
        this.as_percentage = as_percentage;
    }


    /**
     * Gets the project_taskid value for this OaPendingBooking.
     * 
     * @return project_taskid
     */
    public java.lang.String getProject_taskid() {
        return project_taskid;
    }


    /**
     * Sets the project_taskid value for this OaPendingBooking.
     * 
     * @param project_taskid
     */
    public void setProject_taskid(java.lang.String project_taskid) {
        this.project_taskid = project_taskid;
    }


    /**
     * Gets the date_submitted value for this OaPendingBooking.
     * 
     * @return date_submitted
     */
    public java.lang.String getDate_submitted() {
        return date_submitted;
    }


    /**
     * Sets the date_submitted value for this OaPendingBooking.
     * 
     * @param date_submitted
     */
    public void setDate_submitted(java.lang.String date_submitted) {
        this.date_submitted = date_submitted;
    }


    /**
     * Gets the ownerid value for this OaPendingBooking.
     * 
     * @return ownerid
     */
    public java.lang.String getOwnerid() {
        return ownerid;
    }


    /**
     * Sets the ownerid value for this OaPendingBooking.
     * 
     * @param ownerid
     */
    public void setOwnerid(java.lang.String ownerid) {
        this.ownerid = ownerid;
    }


    /**
     * Gets the hours value for this OaPendingBooking.
     * 
     * @return hours
     */
    public java.lang.String getHours() {
        return hours;
    }


    /**
     * Sets the hours value for this OaPendingBooking.
     * 
     * @param hours
     */
    public void setHours(java.lang.String hours) {
        this.hours = hours;
    }


    /**
     * Gets the approval_status value for this OaPendingBooking.
     * 
     * @return approval_status
     */
    public java.lang.String getApproval_status() {
        return approval_status;
    }


    /**
     * Sets the approval_status value for this OaPendingBooking.
     * 
     * @param approval_status
     */
    public void setApproval_status(java.lang.String approval_status) {
        this.approval_status = approval_status;
    }


    /**
     * Gets the percentage value for this OaPendingBooking.
     * 
     * @return percentage
     */
    public java.lang.String getPercentage() {
        return percentage;
    }


    /**
     * Sets the percentage value for this OaPendingBooking.
     * 
     * @param percentage
     */
    public void setPercentage(java.lang.String percentage) {
        this.percentage = percentage;
    }


    /**
     * Gets the externalid value for this OaPendingBooking.
     * 
     * @return externalid
     */
    public java.lang.String getExternalid() {
        return externalid;
    }


    /**
     * Sets the externalid value for this OaPendingBooking.
     * 
     * @param externalid
     */
    public void setExternalid(java.lang.String externalid) {
        this.externalid = externalid;
    }


    /**
     * Gets the job_codeid value for this OaPendingBooking.
     * 
     * @return job_codeid
     */
    public java.lang.String getJob_codeid() {
        return job_codeid;
    }


    /**
     * Sets the job_codeid value for this OaPendingBooking.
     * 
     * @param job_codeid
     */
    public void setJob_codeid(java.lang.String job_codeid) {
        this.job_codeid = job_codeid;
    }


    /**
     * Gets the projectid value for this OaPendingBooking.
     * 
     * @return projectid
     */
    public java.lang.String getProjectid() {
        return projectid;
    }


    /**
     * Sets the projectid value for this OaPendingBooking.
     * 
     * @param projectid
     */
    public void setProjectid(java.lang.String projectid) {
        this.projectid = projectid;
    }


    /**
     * Gets the resource_request_queue_id value for this OaPendingBooking.
     * 
     * @return resource_request_queue_id
     */
    public java.lang.String getResource_request_queue_id() {
        return resource_request_queue_id;
    }


    /**
     * Sets the resource_request_queue_id value for this OaPendingBooking.
     * 
     * @param resource_request_queue_id
     */
    public void setResource_request_queue_id(java.lang.String resource_request_queue_id) {
        this.resource_request_queue_id = resource_request_queue_id;
    }


    /**
     * Gets the created value for this OaPendingBooking.
     * 
     * @return created
     */
    public java.lang.String getCreated() {
        return created;
    }


    /**
     * Sets the created value for this OaPendingBooking.
     * 
     * @param created
     */
    public void setCreated(java.lang.String created) {
        this.created = created;
    }


    /**
     * Gets the locationid value for this OaPendingBooking.
     * 
     * @return locationid
     */
    public java.lang.String getLocationid() {
        return locationid;
    }


    /**
     * Sets the locationid value for this OaPendingBooking.
     * 
     * @param locationid
     */
    public void setLocationid(java.lang.String locationid) {
        this.locationid = locationid;
    }


    /**
     * Gets the notes value for this OaPendingBooking.
     * 
     * @return notes
     */
    public java.lang.String getNotes() {
        return notes;
    }


    /**
     * Sets the notes value for this OaPendingBooking.
     * 
     * @param notes
     */
    public void setNotes(java.lang.String notes) {
        this.notes = notes;
    }


    /**
     * Gets the customerid value for this OaPendingBooking.
     * 
     * @return customerid
     */
    public java.lang.String getCustomerid() {
        return customerid;
    }


    /**
     * Sets the customerid value for this OaPendingBooking.
     * 
     * @param customerid
     */
    public void setCustomerid(java.lang.String customerid) {
        this.customerid = customerid;
    }


    /**
     * Gets the project_assignment_profileid value for this OaPendingBooking.
     * 
     * @return project_assignment_profileid
     */
    public java.lang.String getProject_assignment_profileid() {
        return project_assignment_profileid;
    }


    /**
     * Sets the project_assignment_profileid value for this OaPendingBooking.
     * 
     * @param project_assignment_profileid
     */
    public void setProject_assignment_profileid(java.lang.String project_assignment_profileid) {
        this.project_assignment_profileid = project_assignment_profileid;
    }


    /**
     * Gets the attributes value for this OaPendingBooking.
     * 
     * @return attributes
     */
    public openair.wsdl.OaBase[] getAttributes() {
        return attributes;
    }


    /**
     * Sets the attributes value for this OaPendingBooking.
     * 
     * @param attributes
     */
    public void setAttributes(openair.wsdl.OaBase[] attributes) {
        this.attributes = attributes;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OaPendingBooking)) return false;
        OaPendingBooking other = (OaPendingBooking) obj;
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
            ((this.dirty==null && other.getDirty()==null) || 
             (this.dirty!=null &&
              this.dirty.equals(other.getDirty()))) &&
            ((this.startdate==null && other.getStartdate()==null) || 
             (this.startdate!=null &&
              this.startdate.equals(other.getStartdate()))) &&
            ((this.repeatid==null && other.getRepeatid()==null) || 
             (this.repeatid!=null &&
              this.repeatid.equals(other.getRepeatid()))) &&
            ((this.booking_typeid==null && other.getBooking_typeid()==null) || 
             (this.booking_typeid!=null &&
              this.booking_typeid.equals(other.getBooking_typeid()))) &&
            ((this.notify_owner==null && other.getNotify_owner()==null) || 
             (this.notify_owner!=null &&
              this.notify_owner.equals(other.getNotify_owner()))) &&
            ((this.enddate==null && other.getEnddate()==null) || 
             (this.enddate!=null &&
              this.enddate.equals(other.getEnddate()))) &&
            ((this.date_approved==null && other.getDate_approved()==null) || 
             (this.date_approved!=null &&
              this.date_approved.equals(other.getDate_approved()))) &&
            ((this.starttime==null && other.getStarttime()==null) || 
             (this.starttime!=null &&
              this.starttime.equals(other.getStarttime()))) &&
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.endtime==null && other.getEndtime()==null) || 
             (this.endtime!=null &&
              this.endtime.equals(other.getEndtime()))) &&
            ((this.updated==null && other.getUpdated()==null) || 
             (this.updated!=null &&
              this.updated.equals(other.getUpdated()))) &&
            ((this.as_percentage==null && other.getAs_percentage()==null) || 
             (this.as_percentage!=null &&
              this.as_percentage.equals(other.getAs_percentage()))) &&
            ((this.project_taskid==null && other.getProject_taskid()==null) || 
             (this.project_taskid!=null &&
              this.project_taskid.equals(other.getProject_taskid()))) &&
            ((this.date_submitted==null && other.getDate_submitted()==null) || 
             (this.date_submitted!=null &&
              this.date_submitted.equals(other.getDate_submitted()))) &&
            ((this.ownerid==null && other.getOwnerid()==null) || 
             (this.ownerid!=null &&
              this.ownerid.equals(other.getOwnerid()))) &&
            ((this.hours==null && other.getHours()==null) || 
             (this.hours!=null &&
              this.hours.equals(other.getHours()))) &&
            ((this.approval_status==null && other.getApproval_status()==null) || 
             (this.approval_status!=null &&
              this.approval_status.equals(other.getApproval_status()))) &&
            ((this.percentage==null && other.getPercentage()==null) || 
             (this.percentage!=null &&
              this.percentage.equals(other.getPercentage()))) &&
            ((this.externalid==null && other.getExternalid()==null) || 
             (this.externalid!=null &&
              this.externalid.equals(other.getExternalid()))) &&
            ((this.job_codeid==null && other.getJob_codeid()==null) || 
             (this.job_codeid!=null &&
              this.job_codeid.equals(other.getJob_codeid()))) &&
            ((this.projectid==null && other.getProjectid()==null) || 
             (this.projectid!=null &&
              this.projectid.equals(other.getProjectid()))) &&
            ((this.resource_request_queue_id==null && other.getResource_request_queue_id()==null) || 
             (this.resource_request_queue_id!=null &&
              this.resource_request_queue_id.equals(other.getResource_request_queue_id()))) &&
            ((this.created==null && other.getCreated()==null) || 
             (this.created!=null &&
              this.created.equals(other.getCreated()))) &&
            ((this.locationid==null && other.getLocationid()==null) || 
             (this.locationid!=null &&
              this.locationid.equals(other.getLocationid()))) &&
            ((this.notes==null && other.getNotes()==null) || 
             (this.notes!=null &&
              this.notes.equals(other.getNotes()))) &&
            ((this.customerid==null && other.getCustomerid()==null) || 
             (this.customerid!=null &&
              this.customerid.equals(other.getCustomerid()))) &&
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
        if (getUserid() != null) {
            _hashCode += getUserid().hashCode();
        }
        if (getDirty() != null) {
            _hashCode += getDirty().hashCode();
        }
        if (getStartdate() != null) {
            _hashCode += getStartdate().hashCode();
        }
        if (getRepeatid() != null) {
            _hashCode += getRepeatid().hashCode();
        }
        if (getBooking_typeid() != null) {
            _hashCode += getBooking_typeid().hashCode();
        }
        if (getNotify_owner() != null) {
            _hashCode += getNotify_owner().hashCode();
        }
        if (getEnddate() != null) {
            _hashCode += getEnddate().hashCode();
        }
        if (getDate_approved() != null) {
            _hashCode += getDate_approved().hashCode();
        }
        if (getStarttime() != null) {
            _hashCode += getStarttime().hashCode();
        }
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getEndtime() != null) {
            _hashCode += getEndtime().hashCode();
        }
        if (getUpdated() != null) {
            _hashCode += getUpdated().hashCode();
        }
        if (getAs_percentage() != null) {
            _hashCode += getAs_percentage().hashCode();
        }
        if (getProject_taskid() != null) {
            _hashCode += getProject_taskid().hashCode();
        }
        if (getDate_submitted() != null) {
            _hashCode += getDate_submitted().hashCode();
        }
        if (getOwnerid() != null) {
            _hashCode += getOwnerid().hashCode();
        }
        if (getHours() != null) {
            _hashCode += getHours().hashCode();
        }
        if (getApproval_status() != null) {
            _hashCode += getApproval_status().hashCode();
        }
        if (getPercentage() != null) {
            _hashCode += getPercentage().hashCode();
        }
        if (getExternalid() != null) {
            _hashCode += getExternalid().hashCode();
        }
        if (getJob_codeid() != null) {
            _hashCode += getJob_codeid().hashCode();
        }
        if (getProjectid() != null) {
            _hashCode += getProjectid().hashCode();
        }
        if (getResource_request_queue_id() != null) {
            _hashCode += getResource_request_queue_id().hashCode();
        }
        if (getCreated() != null) {
            _hashCode += getCreated().hashCode();
        }
        if (getLocationid() != null) {
            _hashCode += getLocationid().hashCode();
        }
        if (getNotes() != null) {
            _hashCode += getNotes().hashCode();
        }
        if (getCustomerid() != null) {
            _hashCode += getCustomerid().hashCode();
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
        new org.apache.axis.description.TypeDesc(OaPendingBooking.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://namespaces.soaplite.com/perl", "oaPendingBooking"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userid");
        elemField.setXmlName(new javax.xml.namespace.QName("", "userid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dirty");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dirty"));
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
        elemField.setFieldName("repeatid");
        elemField.setXmlName(new javax.xml.namespace.QName("", "repeatid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("booking_typeid");
        elemField.setXmlName(new javax.xml.namespace.QName("", "booking_typeid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("notify_owner");
        elemField.setXmlName(new javax.xml.namespace.QName("", "notify_owner"));
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
        elemField.setFieldName("date_approved");
        elemField.setXmlName(new javax.xml.namespace.QName("", "date_approved"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("starttime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "starttime"));
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
        elemField.setFieldName("endtime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "endtime"));
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
        elemField.setFieldName("project_taskid");
        elemField.setXmlName(new javax.xml.namespace.QName("", "project_taskid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("date_submitted");
        elemField.setXmlName(new javax.xml.namespace.QName("", "date_submitted"));
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
        elemField.setFieldName("hours");
        elemField.setXmlName(new javax.xml.namespace.QName("", "hours"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("approval_status");
        elemField.setXmlName(new javax.xml.namespace.QName("", "approval_status"));
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
        elemField.setFieldName("externalid");
        elemField.setXmlName(new javax.xml.namespace.QName("", "externalid"));
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
        elemField.setFieldName("projectid");
        elemField.setXmlName(new javax.xml.namespace.QName("", "projectid"));
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
        elemField.setFieldName("created");
        elemField.setXmlName(new javax.xml.namespace.QName("", "created"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locationid");
        elemField.setXmlName(new javax.xml.namespace.QName("", "locationid"));
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
