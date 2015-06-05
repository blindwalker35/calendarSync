/**
 * OaBooking_request.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package openair.wsdl;

public class OaBooking_request  extends openair.wsdl.OaBase  implements java.io.Serializable {
    private java.lang.String number;

    private java.lang.String project_task_id;

    private java.lang.String startdate;

    private java.lang.String job_code_id;

    private java.lang.String notify_owner;

    private java.lang.String customer_id;

    private java.lang.String date_approved;

    private java.lang.String enddate;

    private java.lang.String id;

    private java.lang.String updated;

    private java.lang.String as_percentage;

    private java.lang.String project_id;

    private java.lang.String date_submitted;

    private java.lang.String hours;

    private java.lang.String booking_type_id;

    private java.lang.String attachment_id;

    private java.lang.String approval_status;

    private java.lang.String name;

    private java.lang.String percentage;

    private java.lang.String description;

    private java.lang.String repeat_id;

    private java.lang.String created;

    private java.lang.String external_id;

    private java.lang.String notes;

    private java.lang.String owner_id;

    private java.lang.String user_id;

    private java.lang.String prefix;

    private openair.wsdl.OaBase[] attributes;

    public OaBooking_request() {
    }

    public OaBooking_request(
           java.lang.String number,
           java.lang.String project_task_id,
           java.lang.String startdate,
           java.lang.String job_code_id,
           java.lang.String notify_owner,
           java.lang.String customer_id,
           java.lang.String date_approved,
           java.lang.String enddate,
           java.lang.String id,
           java.lang.String updated,
           java.lang.String as_percentage,
           java.lang.String project_id,
           java.lang.String date_submitted,
           java.lang.String hours,
           java.lang.String booking_type_id,
           java.lang.String attachment_id,
           java.lang.String approval_status,
           java.lang.String name,
           java.lang.String percentage,
           java.lang.String description,
           java.lang.String repeat_id,
           java.lang.String created,
           java.lang.String external_id,
           java.lang.String notes,
           java.lang.String owner_id,
           java.lang.String user_id,
           java.lang.String prefix,
           openair.wsdl.OaBase[] attributes) {
        this.number = number;
        this.project_task_id = project_task_id;
        this.startdate = startdate;
        this.job_code_id = job_code_id;
        this.notify_owner = notify_owner;
        this.customer_id = customer_id;
        this.date_approved = date_approved;
        this.enddate = enddate;
        this.id = id;
        this.updated = updated;
        this.as_percentage = as_percentage;
        this.project_id = project_id;
        this.date_submitted = date_submitted;
        this.hours = hours;
        this.booking_type_id = booking_type_id;
        this.attachment_id = attachment_id;
        this.approval_status = approval_status;
        this.name = name;
        this.percentage = percentage;
        this.description = description;
        this.repeat_id = repeat_id;
        this.created = created;
        this.external_id = external_id;
        this.notes = notes;
        this.owner_id = owner_id;
        this.user_id = user_id;
        this.prefix = prefix;
        this.attributes = attributes;
    }


    /**
     * Gets the number value for this OaBooking_request.
     * 
     * @return number
     */
    public java.lang.String getNumber() {
        return number;
    }


    /**
     * Sets the number value for this OaBooking_request.
     * 
     * @param number
     */
    public void setNumber(java.lang.String number) {
        this.number = number;
    }


    /**
     * Gets the project_task_id value for this OaBooking_request.
     * 
     * @return project_task_id
     */
    public java.lang.String getProject_task_id() {
        return project_task_id;
    }


    /**
     * Sets the project_task_id value for this OaBooking_request.
     * 
     * @param project_task_id
     */
    public void setProject_task_id(java.lang.String project_task_id) {
        this.project_task_id = project_task_id;
    }


    /**
     * Gets the startdate value for this OaBooking_request.
     * 
     * @return startdate
     */
    public java.lang.String getStartdate() {
        return startdate;
    }


    /**
     * Sets the startdate value for this OaBooking_request.
     * 
     * @param startdate
     */
    public void setStartdate(java.lang.String startdate) {
        this.startdate = startdate;
    }


    /**
     * Gets the job_code_id value for this OaBooking_request.
     * 
     * @return job_code_id
     */
    public java.lang.String getJob_code_id() {
        return job_code_id;
    }


    /**
     * Sets the job_code_id value for this OaBooking_request.
     * 
     * @param job_code_id
     */
    public void setJob_code_id(java.lang.String job_code_id) {
        this.job_code_id = job_code_id;
    }


    /**
     * Gets the notify_owner value for this OaBooking_request.
     * 
     * @return notify_owner
     */
    public java.lang.String getNotify_owner() {
        return notify_owner;
    }


    /**
     * Sets the notify_owner value for this OaBooking_request.
     * 
     * @param notify_owner
     */
    public void setNotify_owner(java.lang.String notify_owner) {
        this.notify_owner = notify_owner;
    }


    /**
     * Gets the customer_id value for this OaBooking_request.
     * 
     * @return customer_id
     */
    public java.lang.String getCustomer_id() {
        return customer_id;
    }


    /**
     * Sets the customer_id value for this OaBooking_request.
     * 
     * @param customer_id
     */
    public void setCustomer_id(java.lang.String customer_id) {
        this.customer_id = customer_id;
    }


    /**
     * Gets the date_approved value for this OaBooking_request.
     * 
     * @return date_approved
     */
    public java.lang.String getDate_approved() {
        return date_approved;
    }


    /**
     * Sets the date_approved value for this OaBooking_request.
     * 
     * @param date_approved
     */
    public void setDate_approved(java.lang.String date_approved) {
        this.date_approved = date_approved;
    }


    /**
     * Gets the enddate value for this OaBooking_request.
     * 
     * @return enddate
     */
    public java.lang.String getEnddate() {
        return enddate;
    }


    /**
     * Sets the enddate value for this OaBooking_request.
     * 
     * @param enddate
     */
    public void setEnddate(java.lang.String enddate) {
        this.enddate = enddate;
    }


    /**
     * Gets the id value for this OaBooking_request.
     * 
     * @return id
     */
    public java.lang.String getId() {
        return id;
    }


    /**
     * Sets the id value for this OaBooking_request.
     * 
     * @param id
     */
    public void setId(java.lang.String id) {
        this.id = id;
    }


    /**
     * Gets the updated value for this OaBooking_request.
     * 
     * @return updated
     */
    public java.lang.String getUpdated() {
        return updated;
    }


    /**
     * Sets the updated value for this OaBooking_request.
     * 
     * @param updated
     */
    public void setUpdated(java.lang.String updated) {
        this.updated = updated;
    }


    /**
     * Gets the as_percentage value for this OaBooking_request.
     * 
     * @return as_percentage
     */
    public java.lang.String getAs_percentage() {
        return as_percentage;
    }


    /**
     * Sets the as_percentage value for this OaBooking_request.
     * 
     * @param as_percentage
     */
    public void setAs_percentage(java.lang.String as_percentage) {
        this.as_percentage = as_percentage;
    }


    /**
     * Gets the project_id value for this OaBooking_request.
     * 
     * @return project_id
     */
    public java.lang.String getProject_id() {
        return project_id;
    }


    /**
     * Sets the project_id value for this OaBooking_request.
     * 
     * @param project_id
     */
    public void setProject_id(java.lang.String project_id) {
        this.project_id = project_id;
    }


    /**
     * Gets the date_submitted value for this OaBooking_request.
     * 
     * @return date_submitted
     */
    public java.lang.String getDate_submitted() {
        return date_submitted;
    }


    /**
     * Sets the date_submitted value for this OaBooking_request.
     * 
     * @param date_submitted
     */
    public void setDate_submitted(java.lang.String date_submitted) {
        this.date_submitted = date_submitted;
    }


    /**
     * Gets the hours value for this OaBooking_request.
     * 
     * @return hours
     */
    public java.lang.String getHours() {
        return hours;
    }


    /**
     * Sets the hours value for this OaBooking_request.
     * 
     * @param hours
     */
    public void setHours(java.lang.String hours) {
        this.hours = hours;
    }


    /**
     * Gets the booking_type_id value for this OaBooking_request.
     * 
     * @return booking_type_id
     */
    public java.lang.String getBooking_type_id() {
        return booking_type_id;
    }


    /**
     * Sets the booking_type_id value for this OaBooking_request.
     * 
     * @param booking_type_id
     */
    public void setBooking_type_id(java.lang.String booking_type_id) {
        this.booking_type_id = booking_type_id;
    }


    /**
     * Gets the attachment_id value for this OaBooking_request.
     * 
     * @return attachment_id
     */
    public java.lang.String getAttachment_id() {
        return attachment_id;
    }


    /**
     * Sets the attachment_id value for this OaBooking_request.
     * 
     * @param attachment_id
     */
    public void setAttachment_id(java.lang.String attachment_id) {
        this.attachment_id = attachment_id;
    }


    /**
     * Gets the approval_status value for this OaBooking_request.
     * 
     * @return approval_status
     */
    public java.lang.String getApproval_status() {
        return approval_status;
    }


    /**
     * Sets the approval_status value for this OaBooking_request.
     * 
     * @param approval_status
     */
    public void setApproval_status(java.lang.String approval_status) {
        this.approval_status = approval_status;
    }


    /**
     * Gets the name value for this OaBooking_request.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this OaBooking_request.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the percentage value for this OaBooking_request.
     * 
     * @return percentage
     */
    public java.lang.String getPercentage() {
        return percentage;
    }


    /**
     * Sets the percentage value for this OaBooking_request.
     * 
     * @param percentage
     */
    public void setPercentage(java.lang.String percentage) {
        this.percentage = percentage;
    }


    /**
     * Gets the description value for this OaBooking_request.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this OaBooking_request.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the repeat_id value for this OaBooking_request.
     * 
     * @return repeat_id
     */
    public java.lang.String getRepeat_id() {
        return repeat_id;
    }


    /**
     * Sets the repeat_id value for this OaBooking_request.
     * 
     * @param repeat_id
     */
    public void setRepeat_id(java.lang.String repeat_id) {
        this.repeat_id = repeat_id;
    }


    /**
     * Gets the created value for this OaBooking_request.
     * 
     * @return created
     */
    public java.lang.String getCreated() {
        return created;
    }


    /**
     * Sets the created value for this OaBooking_request.
     * 
     * @param created
     */
    public void setCreated(java.lang.String created) {
        this.created = created;
    }


    /**
     * Gets the external_id value for this OaBooking_request.
     * 
     * @return external_id
     */
    public java.lang.String getExternal_id() {
        return external_id;
    }


    /**
     * Sets the external_id value for this OaBooking_request.
     * 
     * @param external_id
     */
    public void setExternal_id(java.lang.String external_id) {
        this.external_id = external_id;
    }


    /**
     * Gets the notes value for this OaBooking_request.
     * 
     * @return notes
     */
    public java.lang.String getNotes() {
        return notes;
    }


    /**
     * Sets the notes value for this OaBooking_request.
     * 
     * @param notes
     */
    public void setNotes(java.lang.String notes) {
        this.notes = notes;
    }


    /**
     * Gets the owner_id value for this OaBooking_request.
     * 
     * @return owner_id
     */
    public java.lang.String getOwner_id() {
        return owner_id;
    }


    /**
     * Sets the owner_id value for this OaBooking_request.
     * 
     * @param owner_id
     */
    public void setOwner_id(java.lang.String owner_id) {
        this.owner_id = owner_id;
    }


    /**
     * Gets the user_id value for this OaBooking_request.
     * 
     * @return user_id
     */
    public java.lang.String getUser_id() {
        return user_id;
    }


    /**
     * Sets the user_id value for this OaBooking_request.
     * 
     * @param user_id
     */
    public void setUser_id(java.lang.String user_id) {
        this.user_id = user_id;
    }


    /**
     * Gets the prefix value for this OaBooking_request.
     * 
     * @return prefix
     */
    public java.lang.String getPrefix() {
        return prefix;
    }


    /**
     * Sets the prefix value for this OaBooking_request.
     * 
     * @param prefix
     */
    public void setPrefix(java.lang.String prefix) {
        this.prefix = prefix;
    }


    /**
     * Gets the attributes value for this OaBooking_request.
     * 
     * @return attributes
     */
    public openair.wsdl.OaBase[] getAttributes() {
        return attributes;
    }


    /**
     * Sets the attributes value for this OaBooking_request.
     * 
     * @param attributes
     */
    public void setAttributes(openair.wsdl.OaBase[] attributes) {
        this.attributes = attributes;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OaBooking_request)) return false;
        OaBooking_request other = (OaBooking_request) obj;
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
            ((this.project_task_id==null && other.getProject_task_id()==null) || 
             (this.project_task_id!=null &&
              this.project_task_id.equals(other.getProject_task_id()))) &&
            ((this.startdate==null && other.getStartdate()==null) || 
             (this.startdate!=null &&
              this.startdate.equals(other.getStartdate()))) &&
            ((this.job_code_id==null && other.getJob_code_id()==null) || 
             (this.job_code_id!=null &&
              this.job_code_id.equals(other.getJob_code_id()))) &&
            ((this.notify_owner==null && other.getNotify_owner()==null) || 
             (this.notify_owner!=null &&
              this.notify_owner.equals(other.getNotify_owner()))) &&
            ((this.customer_id==null && other.getCustomer_id()==null) || 
             (this.customer_id!=null &&
              this.customer_id.equals(other.getCustomer_id()))) &&
            ((this.date_approved==null && other.getDate_approved()==null) || 
             (this.date_approved!=null &&
              this.date_approved.equals(other.getDate_approved()))) &&
            ((this.enddate==null && other.getEnddate()==null) || 
             (this.enddate!=null &&
              this.enddate.equals(other.getEnddate()))) &&
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.updated==null && other.getUpdated()==null) || 
             (this.updated!=null &&
              this.updated.equals(other.getUpdated()))) &&
            ((this.as_percentage==null && other.getAs_percentage()==null) || 
             (this.as_percentage!=null &&
              this.as_percentage.equals(other.getAs_percentage()))) &&
            ((this.project_id==null && other.getProject_id()==null) || 
             (this.project_id!=null &&
              this.project_id.equals(other.getProject_id()))) &&
            ((this.date_submitted==null && other.getDate_submitted()==null) || 
             (this.date_submitted!=null &&
              this.date_submitted.equals(other.getDate_submitted()))) &&
            ((this.hours==null && other.getHours()==null) || 
             (this.hours!=null &&
              this.hours.equals(other.getHours()))) &&
            ((this.booking_type_id==null && other.getBooking_type_id()==null) || 
             (this.booking_type_id!=null &&
              this.booking_type_id.equals(other.getBooking_type_id()))) &&
            ((this.attachment_id==null && other.getAttachment_id()==null) || 
             (this.attachment_id!=null &&
              this.attachment_id.equals(other.getAttachment_id()))) &&
            ((this.approval_status==null && other.getApproval_status()==null) || 
             (this.approval_status!=null &&
              this.approval_status.equals(other.getApproval_status()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.percentage==null && other.getPercentage()==null) || 
             (this.percentage!=null &&
              this.percentage.equals(other.getPercentage()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.repeat_id==null && other.getRepeat_id()==null) || 
             (this.repeat_id!=null &&
              this.repeat_id.equals(other.getRepeat_id()))) &&
            ((this.created==null && other.getCreated()==null) || 
             (this.created!=null &&
              this.created.equals(other.getCreated()))) &&
            ((this.external_id==null && other.getExternal_id()==null) || 
             (this.external_id!=null &&
              this.external_id.equals(other.getExternal_id()))) &&
            ((this.notes==null && other.getNotes()==null) || 
             (this.notes!=null &&
              this.notes.equals(other.getNotes()))) &&
            ((this.owner_id==null && other.getOwner_id()==null) || 
             (this.owner_id!=null &&
              this.owner_id.equals(other.getOwner_id()))) &&
            ((this.user_id==null && other.getUser_id()==null) || 
             (this.user_id!=null &&
              this.user_id.equals(other.getUser_id()))) &&
            ((this.prefix==null && other.getPrefix()==null) || 
             (this.prefix!=null &&
              this.prefix.equals(other.getPrefix()))) &&
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
        if (getProject_task_id() != null) {
            _hashCode += getProject_task_id().hashCode();
        }
        if (getStartdate() != null) {
            _hashCode += getStartdate().hashCode();
        }
        if (getJob_code_id() != null) {
            _hashCode += getJob_code_id().hashCode();
        }
        if (getNotify_owner() != null) {
            _hashCode += getNotify_owner().hashCode();
        }
        if (getCustomer_id() != null) {
            _hashCode += getCustomer_id().hashCode();
        }
        if (getDate_approved() != null) {
            _hashCode += getDate_approved().hashCode();
        }
        if (getEnddate() != null) {
            _hashCode += getEnddate().hashCode();
        }
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getUpdated() != null) {
            _hashCode += getUpdated().hashCode();
        }
        if (getAs_percentage() != null) {
            _hashCode += getAs_percentage().hashCode();
        }
        if (getProject_id() != null) {
            _hashCode += getProject_id().hashCode();
        }
        if (getDate_submitted() != null) {
            _hashCode += getDate_submitted().hashCode();
        }
        if (getHours() != null) {
            _hashCode += getHours().hashCode();
        }
        if (getBooking_type_id() != null) {
            _hashCode += getBooking_type_id().hashCode();
        }
        if (getAttachment_id() != null) {
            _hashCode += getAttachment_id().hashCode();
        }
        if (getApproval_status() != null) {
            _hashCode += getApproval_status().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getPercentage() != null) {
            _hashCode += getPercentage().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getRepeat_id() != null) {
            _hashCode += getRepeat_id().hashCode();
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
        if (getOwner_id() != null) {
            _hashCode += getOwner_id().hashCode();
        }
        if (getUser_id() != null) {
            _hashCode += getUser_id().hashCode();
        }
        if (getPrefix() != null) {
            _hashCode += getPrefix().hashCode();
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
        new org.apache.axis.description.TypeDesc(OaBooking_request.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://namespaces.soaplite.com/perl", "oaBooking_request"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("number");
        elemField.setXmlName(new javax.xml.namespace.QName("", "number"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("project_task_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "project_task_id"));
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
        elemField.setFieldName("job_code_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "job_code_id"));
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
        elemField.setFieldName("customer_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "customer_id"));
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
        elemField.setFieldName("enddate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "enddate"));
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
        elemField.setFieldName("as_percentage");
        elemField.setXmlName(new javax.xml.namespace.QName("", "as_percentage"));
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
        elemField.setFieldName("date_submitted");
        elemField.setXmlName(new javax.xml.namespace.QName("", "date_submitted"));
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
        elemField.setFieldName("booking_type_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "booking_type_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attachment_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "attachment_id"));
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
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "name"));
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
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("repeat_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "repeat_id"));
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
        elemField.setFieldName("owner_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "owner_id"));
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
        elemField.setFieldName("prefix");
        elemField.setXmlName(new javax.xml.namespace.QName("", "prefix"));
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
