/**
 * OaIssue.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package modules.openair.wsdl;

public class OaIssue  extends modules.openair.wsdl.OaBase  implements java.io.Serializable {
    private java.lang.String date_resolution_expected;

    private java.lang.String priority;

    private java.lang.String issue_severity_id;

    private java.lang.String number;

    private java.lang.String project_task_id;

    private java.lang.String date;

    private java.lang.String date_resolution_required;

    private java.lang.String customer_id;

    private java.lang.String issue_stage_id;

    private java.lang.String issue_status_id;

    private java.lang.String id;

    private java.lang.String issue_source_id;

    private java.lang.String updated;

    private java.lang.String issue_notes;

    private java.lang.String project_id;

    private java.lang.String attachment_id;

    private java.lang.String name;

    private java.lang.String description;

    private java.lang.String resolution_notes;

    private java.lang.String created;

    private java.lang.String issue_category_id;

    private java.lang.String owner_id;

    private java.lang.String date_resolved;

    private java.lang.String user_id;

    private java.lang.String prefix;

    private modules.openair.wsdl.OaBase[] attributes;

    public OaIssue() {
    }

    public OaIssue(
           java.lang.String date_resolution_expected,
           java.lang.String priority,
           java.lang.String issue_severity_id,
           java.lang.String number,
           java.lang.String project_task_id,
           java.lang.String date,
           java.lang.String date_resolution_required,
           java.lang.String customer_id,
           java.lang.String issue_stage_id,
           java.lang.String issue_status_id,
           java.lang.String id,
           java.lang.String issue_source_id,
           java.lang.String updated,
           java.lang.String issue_notes,
           java.lang.String project_id,
           java.lang.String attachment_id,
           java.lang.String name,
           java.lang.String description,
           java.lang.String resolution_notes,
           java.lang.String created,
           java.lang.String issue_category_id,
           java.lang.String owner_id,
           java.lang.String date_resolved,
           java.lang.String user_id,
           java.lang.String prefix,
           modules.openair.wsdl.OaBase[] attributes) {
        this.date_resolution_expected = date_resolution_expected;
        this.priority = priority;
        this.issue_severity_id = issue_severity_id;
        this.number = number;
        this.project_task_id = project_task_id;
        this.date = date;
        this.date_resolution_required = date_resolution_required;
        this.customer_id = customer_id;
        this.issue_stage_id = issue_stage_id;
        this.issue_status_id = issue_status_id;
        this.id = id;
        this.issue_source_id = issue_source_id;
        this.updated = updated;
        this.issue_notes = issue_notes;
        this.project_id = project_id;
        this.attachment_id = attachment_id;
        this.name = name;
        this.description = description;
        this.resolution_notes = resolution_notes;
        this.created = created;
        this.issue_category_id = issue_category_id;
        this.owner_id = owner_id;
        this.date_resolved = date_resolved;
        this.user_id = user_id;
        this.prefix = prefix;
        this.attributes = attributes;
    }


    /**
     * Gets the date_resolution_expected value for this OaIssue.
     * 
     * @return date_resolution_expected
     */
    public java.lang.String getDate_resolution_expected() {
        return date_resolution_expected;
    }


    /**
     * Sets the date_resolution_expected value for this OaIssue.
     * 
     * @param date_resolution_expected
     */
    public void setDate_resolution_expected(java.lang.String date_resolution_expected) {
        this.date_resolution_expected = date_resolution_expected;
    }


    /**
     * Gets the priority value for this OaIssue.
     * 
     * @return priority
     */
    public java.lang.String getPriority() {
        return priority;
    }


    /**
     * Sets the priority value for this OaIssue.
     * 
     * @param priority
     */
    public void setPriority(java.lang.String priority) {
        this.priority = priority;
    }


    /**
     * Gets the issue_severity_id value for this OaIssue.
     * 
     * @return issue_severity_id
     */
    public java.lang.String getIssue_severity_id() {
        return issue_severity_id;
    }


    /**
     * Sets the issue_severity_id value for this OaIssue.
     * 
     * @param issue_severity_id
     */
    public void setIssue_severity_id(java.lang.String issue_severity_id) {
        this.issue_severity_id = issue_severity_id;
    }


    /**
     * Gets the number value for this OaIssue.
     * 
     * @return number
     */
    public java.lang.String getNumber() {
        return number;
    }


    /**
     * Sets the number value for this OaIssue.
     * 
     * @param number
     */
    public void setNumber(java.lang.String number) {
        this.number = number;
    }


    /**
     * Gets the project_task_id value for this OaIssue.
     * 
     * @return project_task_id
     */
    public java.lang.String getProject_task_id() {
        return project_task_id;
    }


    /**
     * Sets the project_task_id value for this OaIssue.
     * 
     * @param project_task_id
     */
    public void setProject_task_id(java.lang.String project_task_id) {
        this.project_task_id = project_task_id;
    }


    /**
     * Gets the date value for this OaIssue.
     * 
     * @return date
     */
    public java.lang.String getDate() {
        return date;
    }


    /**
     * Sets the date value for this OaIssue.
     * 
     * @param date
     */
    public void setDate(java.lang.String date) {
        this.date = date;
    }


    /**
     * Gets the date_resolution_required value for this OaIssue.
     * 
     * @return date_resolution_required
     */
    public java.lang.String getDate_resolution_required() {
        return date_resolution_required;
    }


    /**
     * Sets the date_resolution_required value for this OaIssue.
     * 
     * @param date_resolution_required
     */
    public void setDate_resolution_required(java.lang.String date_resolution_required) {
        this.date_resolution_required = date_resolution_required;
    }


    /**
     * Gets the customer_id value for this OaIssue.
     * 
     * @return customer_id
     */
    public java.lang.String getCustomer_id() {
        return customer_id;
    }


    /**
     * Sets the customer_id value for this OaIssue.
     * 
     * @param customer_id
     */
    public void setCustomer_id(java.lang.String customer_id) {
        this.customer_id = customer_id;
    }


    /**
     * Gets the issue_stage_id value for this OaIssue.
     * 
     * @return issue_stage_id
     */
    public java.lang.String getIssue_stage_id() {
        return issue_stage_id;
    }


    /**
     * Sets the issue_stage_id value for this OaIssue.
     * 
     * @param issue_stage_id
     */
    public void setIssue_stage_id(java.lang.String issue_stage_id) {
        this.issue_stage_id = issue_stage_id;
    }


    /**
     * Gets the issue_status_id value for this OaIssue.
     * 
     * @return issue_status_id
     */
    public java.lang.String getIssue_status_id() {
        return issue_status_id;
    }


    /**
     * Sets the issue_status_id value for this OaIssue.
     * 
     * @param issue_status_id
     */
    public void setIssue_status_id(java.lang.String issue_status_id) {
        this.issue_status_id = issue_status_id;
    }


    /**
     * Gets the id value for this OaIssue.
     * 
     * @return id
     */
    public java.lang.String getId() {
        return id;
    }


    /**
     * Sets the id value for this OaIssue.
     * 
     * @param id
     */
    public void setId(java.lang.String id) {
        this.id = id;
    }


    /**
     * Gets the issue_source_id value for this OaIssue.
     * 
     * @return issue_source_id
     */
    public java.lang.String getIssue_source_id() {
        return issue_source_id;
    }


    /**
     * Sets the issue_source_id value for this OaIssue.
     * 
     * @param issue_source_id
     */
    public void setIssue_source_id(java.lang.String issue_source_id) {
        this.issue_source_id = issue_source_id;
    }


    /**
     * Gets the updated value for this OaIssue.
     * 
     * @return updated
     */
    public java.lang.String getUpdated() {
        return updated;
    }


    /**
     * Sets the updated value for this OaIssue.
     * 
     * @param updated
     */
    public void setUpdated(java.lang.String updated) {
        this.updated = updated;
    }


    /**
     * Gets the issue_notes value for this OaIssue.
     * 
     * @return issue_notes
     */
    public java.lang.String getIssue_notes() {
        return issue_notes;
    }


    /**
     * Sets the issue_notes value for this OaIssue.
     * 
     * @param issue_notes
     */
    public void setIssue_notes(java.lang.String issue_notes) {
        this.issue_notes = issue_notes;
    }


    /**
     * Gets the project_id value for this OaIssue.
     * 
     * @return project_id
     */
    public java.lang.String getProject_id() {
        return project_id;
    }


    /**
     * Sets the project_id value for this OaIssue.
     * 
     * @param project_id
     */
    public void setProject_id(java.lang.String project_id) {
        this.project_id = project_id;
    }


    /**
     * Gets the attachment_id value for this OaIssue.
     * 
     * @return attachment_id
     */
    public java.lang.String getAttachment_id() {
        return attachment_id;
    }


    /**
     * Sets the attachment_id value for this OaIssue.
     * 
     * @param attachment_id
     */
    public void setAttachment_id(java.lang.String attachment_id) {
        this.attachment_id = attachment_id;
    }


    /**
     * Gets the name value for this OaIssue.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this OaIssue.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the description value for this OaIssue.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this OaIssue.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the resolution_notes value for this OaIssue.
     * 
     * @return resolution_notes
     */
    public java.lang.String getResolution_notes() {
        return resolution_notes;
    }


    /**
     * Sets the resolution_notes value for this OaIssue.
     * 
     * @param resolution_notes
     */
    public void setResolution_notes(java.lang.String resolution_notes) {
        this.resolution_notes = resolution_notes;
    }


    /**
     * Gets the created value for this OaIssue.
     * 
     * @return created
     */
    public java.lang.String getCreated() {
        return created;
    }


    /**
     * Sets the created value for this OaIssue.
     * 
     * @param created
     */
    public void setCreated(java.lang.String created) {
        this.created = created;
    }


    /**
     * Gets the issue_category_id value for this OaIssue.
     * 
     * @return issue_category_id
     */
    public java.lang.String getIssue_category_id() {
        return issue_category_id;
    }


    /**
     * Sets the issue_category_id value for this OaIssue.
     * 
     * @param issue_category_id
     */
    public void setIssue_category_id(java.lang.String issue_category_id) {
        this.issue_category_id = issue_category_id;
    }


    /**
     * Gets the owner_id value for this OaIssue.
     * 
     * @return owner_id
     */
    public java.lang.String getOwner_id() {
        return owner_id;
    }


    /**
     * Sets the owner_id value for this OaIssue.
     * 
     * @param owner_id
     */
    public void setOwner_id(java.lang.String owner_id) {
        this.owner_id = owner_id;
    }


    /**
     * Gets the date_resolved value for this OaIssue.
     * 
     * @return date_resolved
     */
    public java.lang.String getDate_resolved() {
        return date_resolved;
    }


    /**
     * Sets the date_resolved value for this OaIssue.
     * 
     * @param date_resolved
     */
    public void setDate_resolved(java.lang.String date_resolved) {
        this.date_resolved = date_resolved;
    }


    /**
     * Gets the user_id value for this OaIssue.
     * 
     * @return user_id
     */
    public java.lang.String getUser_id() {
        return user_id;
    }


    /**
     * Sets the user_id value for this OaIssue.
     * 
     * @param user_id
     */
    public void setUser_id(java.lang.String user_id) {
        this.user_id = user_id;
    }


    /**
     * Gets the prefix value for this OaIssue.
     * 
     * @return prefix
     */
    public java.lang.String getPrefix() {
        return prefix;
    }


    /**
     * Sets the prefix value for this OaIssue.
     * 
     * @param prefix
     */
    public void setPrefix(java.lang.String prefix) {
        this.prefix = prefix;
    }


    /**
     * Gets the attributes value for this OaIssue.
     * 
     * @return attributes
     */
    public modules.openair.wsdl.OaBase[] getAttributes() {
        return attributes;
    }


    /**
     * Sets the attributes value for this OaIssue.
     * 
     * @param attributes
     */
    public void setAttributes(modules.openair.wsdl.OaBase[] attributes) {
        this.attributes = attributes;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OaIssue)) return false;
        OaIssue other = (OaIssue) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.date_resolution_expected==null && other.getDate_resolution_expected()==null) || 
             (this.date_resolution_expected!=null &&
              this.date_resolution_expected.equals(other.getDate_resolution_expected()))) &&
            ((this.priority==null && other.getPriority()==null) || 
             (this.priority!=null &&
              this.priority.equals(other.getPriority()))) &&
            ((this.issue_severity_id==null && other.getIssue_severity_id()==null) || 
             (this.issue_severity_id!=null &&
              this.issue_severity_id.equals(other.getIssue_severity_id()))) &&
            ((this.number==null && other.getNumber()==null) || 
             (this.number!=null &&
              this.number.equals(other.getNumber()))) &&
            ((this.project_task_id==null && other.getProject_task_id()==null) || 
             (this.project_task_id!=null &&
              this.project_task_id.equals(other.getProject_task_id()))) &&
            ((this.date==null && other.getDate()==null) || 
             (this.date!=null &&
              this.date.equals(other.getDate()))) &&
            ((this.date_resolution_required==null && other.getDate_resolution_required()==null) || 
             (this.date_resolution_required!=null &&
              this.date_resolution_required.equals(other.getDate_resolution_required()))) &&
            ((this.customer_id==null && other.getCustomer_id()==null) || 
             (this.customer_id!=null &&
              this.customer_id.equals(other.getCustomer_id()))) &&
            ((this.issue_stage_id==null && other.getIssue_stage_id()==null) || 
             (this.issue_stage_id!=null &&
              this.issue_stage_id.equals(other.getIssue_stage_id()))) &&
            ((this.issue_status_id==null && other.getIssue_status_id()==null) || 
             (this.issue_status_id!=null &&
              this.issue_status_id.equals(other.getIssue_status_id()))) &&
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.issue_source_id==null && other.getIssue_source_id()==null) || 
             (this.issue_source_id!=null &&
              this.issue_source_id.equals(other.getIssue_source_id()))) &&
            ((this.updated==null && other.getUpdated()==null) || 
             (this.updated!=null &&
              this.updated.equals(other.getUpdated()))) &&
            ((this.issue_notes==null && other.getIssue_notes()==null) || 
             (this.issue_notes!=null &&
              this.issue_notes.equals(other.getIssue_notes()))) &&
            ((this.project_id==null && other.getProject_id()==null) || 
             (this.project_id!=null &&
              this.project_id.equals(other.getProject_id()))) &&
            ((this.attachment_id==null && other.getAttachment_id()==null) || 
             (this.attachment_id!=null &&
              this.attachment_id.equals(other.getAttachment_id()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.resolution_notes==null && other.getResolution_notes()==null) || 
             (this.resolution_notes!=null &&
              this.resolution_notes.equals(other.getResolution_notes()))) &&
            ((this.created==null && other.getCreated()==null) || 
             (this.created!=null &&
              this.created.equals(other.getCreated()))) &&
            ((this.issue_category_id==null && other.getIssue_category_id()==null) || 
             (this.issue_category_id!=null &&
              this.issue_category_id.equals(other.getIssue_category_id()))) &&
            ((this.owner_id==null && other.getOwner_id()==null) || 
             (this.owner_id!=null &&
              this.owner_id.equals(other.getOwner_id()))) &&
            ((this.date_resolved==null && other.getDate_resolved()==null) || 
             (this.date_resolved!=null &&
              this.date_resolved.equals(other.getDate_resolved()))) &&
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
        if (getDate_resolution_expected() != null) {
            _hashCode += getDate_resolution_expected().hashCode();
        }
        if (getPriority() != null) {
            _hashCode += getPriority().hashCode();
        }
        if (getIssue_severity_id() != null) {
            _hashCode += getIssue_severity_id().hashCode();
        }
        if (getNumber() != null) {
            _hashCode += getNumber().hashCode();
        }
        if (getProject_task_id() != null) {
            _hashCode += getProject_task_id().hashCode();
        }
        if (getDate() != null) {
            _hashCode += getDate().hashCode();
        }
        if (getDate_resolution_required() != null) {
            _hashCode += getDate_resolution_required().hashCode();
        }
        if (getCustomer_id() != null) {
            _hashCode += getCustomer_id().hashCode();
        }
        if (getIssue_stage_id() != null) {
            _hashCode += getIssue_stage_id().hashCode();
        }
        if (getIssue_status_id() != null) {
            _hashCode += getIssue_status_id().hashCode();
        }
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getIssue_source_id() != null) {
            _hashCode += getIssue_source_id().hashCode();
        }
        if (getUpdated() != null) {
            _hashCode += getUpdated().hashCode();
        }
        if (getIssue_notes() != null) {
            _hashCode += getIssue_notes().hashCode();
        }
        if (getProject_id() != null) {
            _hashCode += getProject_id().hashCode();
        }
        if (getAttachment_id() != null) {
            _hashCode += getAttachment_id().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getResolution_notes() != null) {
            _hashCode += getResolution_notes().hashCode();
        }
        if (getCreated() != null) {
            _hashCode += getCreated().hashCode();
        }
        if (getIssue_category_id() != null) {
            _hashCode += getIssue_category_id().hashCode();
        }
        if (getOwner_id() != null) {
            _hashCode += getOwner_id().hashCode();
        }
        if (getDate_resolved() != null) {
            _hashCode += getDate_resolved().hashCode();
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
        new org.apache.axis.description.TypeDesc(OaIssue.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://namespaces.soaplite.com/perl", "oaIssue"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("date_resolution_expected");
        elemField.setXmlName(new javax.xml.namespace.QName("", "date_resolution_expected"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("priority");
        elemField.setXmlName(new javax.xml.namespace.QName("", "priority"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("issue_severity_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "issue_severity_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
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
        elemField.setFieldName("date");
        elemField.setXmlName(new javax.xml.namespace.QName("", "date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("date_resolution_required");
        elemField.setXmlName(new javax.xml.namespace.QName("", "date_resolution_required"));
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
        elemField.setFieldName("issue_stage_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "issue_stage_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("issue_status_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "issue_status_id"));
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
        elemField.setFieldName("issue_source_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "issue_source_id"));
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
        elemField.setFieldName("issue_notes");
        elemField.setXmlName(new javax.xml.namespace.QName("", "issue_notes"));
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
        elemField.setFieldName("attachment_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "attachment_id"));
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
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resolution_notes");
        elemField.setXmlName(new javax.xml.namespace.QName("", "resolution_notes"));
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
        elemField.setFieldName("issue_category_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "issue_category_id"));
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
        elemField.setFieldName("date_resolved");
        elemField.setXmlName(new javax.xml.namespace.QName("", "date_resolved"));
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
