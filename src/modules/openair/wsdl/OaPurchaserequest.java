/**
 * OaPurchaserequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package modules.openair.wsdl;

public class OaPurchaserequest  extends modules.openair.wsdl.OaBase  implements java.io.Serializable {
    private java.lang.String number;

    private java.lang.String date;

    private java.lang.String userid;

    private java.lang.String request_items_fulfilled;

    private java.lang.String total_request_items;

    private java.lang.String ordered_request_items;

    private java.lang.String date_required;

    private java.lang.String attachmentid;

    private java.lang.String currency;

    private java.lang.String quantity_fulfilled;

    private java.lang.String date_approved;

    private java.lang.String id;

    private java.lang.String date_fulfilled;

    private java.lang.String updated;

    private java.lang.String total_quantity;

    private java.lang.String date_submitted;

    private java.lang.String approval_status;

    private java.lang.String name;

    private java.lang.String projectid;

    private java.lang.String description;

    private java.lang.String total;

    private java.lang.String created;

    private java.lang.String notes;

    private java.lang.String customerid;

    private java.lang.String exported;

    private java.lang.String prefix;

    private modules.openair.wsdl.OaBase[] attributes;

    public OaPurchaserequest() {
    }

    public OaPurchaserequest(
           java.lang.String number,
           java.lang.String date,
           java.lang.String userid,
           java.lang.String request_items_fulfilled,
           java.lang.String total_request_items,
           java.lang.String ordered_request_items,
           java.lang.String date_required,
           java.lang.String attachmentid,
           java.lang.String currency,
           java.lang.String quantity_fulfilled,
           java.lang.String date_approved,
           java.lang.String id,
           java.lang.String date_fulfilled,
           java.lang.String updated,
           java.lang.String total_quantity,
           java.lang.String date_submitted,
           java.lang.String approval_status,
           java.lang.String name,
           java.lang.String projectid,
           java.lang.String description,
           java.lang.String total,
           java.lang.String created,
           java.lang.String notes,
           java.lang.String customerid,
           java.lang.String exported,
           java.lang.String prefix,
           modules.openair.wsdl.OaBase[] attributes) {
        this.number = number;
        this.date = date;
        this.userid = userid;
        this.request_items_fulfilled = request_items_fulfilled;
        this.total_request_items = total_request_items;
        this.ordered_request_items = ordered_request_items;
        this.date_required = date_required;
        this.attachmentid = attachmentid;
        this.currency = currency;
        this.quantity_fulfilled = quantity_fulfilled;
        this.date_approved = date_approved;
        this.id = id;
        this.date_fulfilled = date_fulfilled;
        this.updated = updated;
        this.total_quantity = total_quantity;
        this.date_submitted = date_submitted;
        this.approval_status = approval_status;
        this.name = name;
        this.projectid = projectid;
        this.description = description;
        this.total = total;
        this.created = created;
        this.notes = notes;
        this.customerid = customerid;
        this.exported = exported;
        this.prefix = prefix;
        this.attributes = attributes;
    }


    /**
     * Gets the number value for this OaPurchaserequest.
     * 
     * @return number
     */
    public java.lang.String getNumber() {
        return number;
    }


    /**
     * Sets the number value for this OaPurchaserequest.
     * 
     * @param number
     */
    public void setNumber(java.lang.String number) {
        this.number = number;
    }


    /**
     * Gets the date value for this OaPurchaserequest.
     * 
     * @return date
     */
    public java.lang.String getDate() {
        return date;
    }


    /**
     * Sets the date value for this OaPurchaserequest.
     * 
     * @param date
     */
    public void setDate(java.lang.String date) {
        this.date = date;
    }


    /**
     * Gets the userid value for this OaPurchaserequest.
     * 
     * @return userid
     */
    public java.lang.String getUserid() {
        return userid;
    }


    /**
     * Sets the userid value for this OaPurchaserequest.
     * 
     * @param userid
     */
    public void setUserid(java.lang.String userid) {
        this.userid = userid;
    }


    /**
     * Gets the request_items_fulfilled value for this OaPurchaserequest.
     * 
     * @return request_items_fulfilled
     */
    public java.lang.String getRequest_items_fulfilled() {
        return request_items_fulfilled;
    }


    /**
     * Sets the request_items_fulfilled value for this OaPurchaserequest.
     * 
     * @param request_items_fulfilled
     */
    public void setRequest_items_fulfilled(java.lang.String request_items_fulfilled) {
        this.request_items_fulfilled = request_items_fulfilled;
    }


    /**
     * Gets the total_request_items value for this OaPurchaserequest.
     * 
     * @return total_request_items
     */
    public java.lang.String getTotal_request_items() {
        return total_request_items;
    }


    /**
     * Sets the total_request_items value for this OaPurchaserequest.
     * 
     * @param total_request_items
     */
    public void setTotal_request_items(java.lang.String total_request_items) {
        this.total_request_items = total_request_items;
    }


    /**
     * Gets the ordered_request_items value for this OaPurchaserequest.
     * 
     * @return ordered_request_items
     */
    public java.lang.String getOrdered_request_items() {
        return ordered_request_items;
    }


    /**
     * Sets the ordered_request_items value for this OaPurchaserequest.
     * 
     * @param ordered_request_items
     */
    public void setOrdered_request_items(java.lang.String ordered_request_items) {
        this.ordered_request_items = ordered_request_items;
    }


    /**
     * Gets the date_required value for this OaPurchaserequest.
     * 
     * @return date_required
     */
    public java.lang.String getDate_required() {
        return date_required;
    }


    /**
     * Sets the date_required value for this OaPurchaserequest.
     * 
     * @param date_required
     */
    public void setDate_required(java.lang.String date_required) {
        this.date_required = date_required;
    }


    /**
     * Gets the attachmentid value for this OaPurchaserequest.
     * 
     * @return attachmentid
     */
    public java.lang.String getAttachmentid() {
        return attachmentid;
    }


    /**
     * Sets the attachmentid value for this OaPurchaserequest.
     * 
     * @param attachmentid
     */
    public void setAttachmentid(java.lang.String attachmentid) {
        this.attachmentid = attachmentid;
    }


    /**
     * Gets the currency value for this OaPurchaserequest.
     * 
     * @return currency
     */
    public java.lang.String getCurrency() {
        return currency;
    }


    /**
     * Sets the currency value for this OaPurchaserequest.
     * 
     * @param currency
     */
    public void setCurrency(java.lang.String currency) {
        this.currency = currency;
    }


    /**
     * Gets the quantity_fulfilled value for this OaPurchaserequest.
     * 
     * @return quantity_fulfilled
     */
    public java.lang.String getQuantity_fulfilled() {
        return quantity_fulfilled;
    }


    /**
     * Sets the quantity_fulfilled value for this OaPurchaserequest.
     * 
     * @param quantity_fulfilled
     */
    public void setQuantity_fulfilled(java.lang.String quantity_fulfilled) {
        this.quantity_fulfilled = quantity_fulfilled;
    }


    /**
     * Gets the date_approved value for this OaPurchaserequest.
     * 
     * @return date_approved
     */
    public java.lang.String getDate_approved() {
        return date_approved;
    }


    /**
     * Sets the date_approved value for this OaPurchaserequest.
     * 
     * @param date_approved
     */
    public void setDate_approved(java.lang.String date_approved) {
        this.date_approved = date_approved;
    }


    /**
     * Gets the id value for this OaPurchaserequest.
     * 
     * @return id
     */
    public java.lang.String getId() {
        return id;
    }


    /**
     * Sets the id value for this OaPurchaserequest.
     * 
     * @param id
     */
    public void setId(java.lang.String id) {
        this.id = id;
    }


    /**
     * Gets the date_fulfilled value for this OaPurchaserequest.
     * 
     * @return date_fulfilled
     */
    public java.lang.String getDate_fulfilled() {
        return date_fulfilled;
    }


    /**
     * Sets the date_fulfilled value for this OaPurchaserequest.
     * 
     * @param date_fulfilled
     */
    public void setDate_fulfilled(java.lang.String date_fulfilled) {
        this.date_fulfilled = date_fulfilled;
    }


    /**
     * Gets the updated value for this OaPurchaserequest.
     * 
     * @return updated
     */
    public java.lang.String getUpdated() {
        return updated;
    }


    /**
     * Sets the updated value for this OaPurchaserequest.
     * 
     * @param updated
     */
    public void setUpdated(java.lang.String updated) {
        this.updated = updated;
    }


    /**
     * Gets the total_quantity value for this OaPurchaserequest.
     * 
     * @return total_quantity
     */
    public java.lang.String getTotal_quantity() {
        return total_quantity;
    }


    /**
     * Sets the total_quantity value for this OaPurchaserequest.
     * 
     * @param total_quantity
     */
    public void setTotal_quantity(java.lang.String total_quantity) {
        this.total_quantity = total_quantity;
    }


    /**
     * Gets the date_submitted value for this OaPurchaserequest.
     * 
     * @return date_submitted
     */
    public java.lang.String getDate_submitted() {
        return date_submitted;
    }


    /**
     * Sets the date_submitted value for this OaPurchaserequest.
     * 
     * @param date_submitted
     */
    public void setDate_submitted(java.lang.String date_submitted) {
        this.date_submitted = date_submitted;
    }


    /**
     * Gets the approval_status value for this OaPurchaserequest.
     * 
     * @return approval_status
     */
    public java.lang.String getApproval_status() {
        return approval_status;
    }


    /**
     * Sets the approval_status value for this OaPurchaserequest.
     * 
     * @param approval_status
     */
    public void setApproval_status(java.lang.String approval_status) {
        this.approval_status = approval_status;
    }


    /**
     * Gets the name value for this OaPurchaserequest.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this OaPurchaserequest.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the projectid value for this OaPurchaserequest.
     * 
     * @return projectid
     */
    public java.lang.String getProjectid() {
        return projectid;
    }


    /**
     * Sets the projectid value for this OaPurchaserequest.
     * 
     * @param projectid
     */
    public void setProjectid(java.lang.String projectid) {
        this.projectid = projectid;
    }


    /**
     * Gets the description value for this OaPurchaserequest.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this OaPurchaserequest.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the total value for this OaPurchaserequest.
     * 
     * @return total
     */
    public java.lang.String getTotal() {
        return total;
    }


    /**
     * Sets the total value for this OaPurchaserequest.
     * 
     * @param total
     */
    public void setTotal(java.lang.String total) {
        this.total = total;
    }


    /**
     * Gets the created value for this OaPurchaserequest.
     * 
     * @return created
     */
    public java.lang.String getCreated() {
        return created;
    }


    /**
     * Sets the created value for this OaPurchaserequest.
     * 
     * @param created
     */
    public void setCreated(java.lang.String created) {
        this.created = created;
    }


    /**
     * Gets the notes value for this OaPurchaserequest.
     * 
     * @return notes
     */
    public java.lang.String getNotes() {
        return notes;
    }


    /**
     * Sets the notes value for this OaPurchaserequest.
     * 
     * @param notes
     */
    public void setNotes(java.lang.String notes) {
        this.notes = notes;
    }


    /**
     * Gets the customerid value for this OaPurchaserequest.
     * 
     * @return customerid
     */
    public java.lang.String getCustomerid() {
        return customerid;
    }


    /**
     * Sets the customerid value for this OaPurchaserequest.
     * 
     * @param customerid
     */
    public void setCustomerid(java.lang.String customerid) {
        this.customerid = customerid;
    }


    /**
     * Gets the exported value for this OaPurchaserequest.
     * 
     * @return exported
     */
    public java.lang.String getExported() {
        return exported;
    }


    /**
     * Sets the exported value for this OaPurchaserequest.
     * 
     * @param exported
     */
    public void setExported(java.lang.String exported) {
        this.exported = exported;
    }


    /**
     * Gets the prefix value for this OaPurchaserequest.
     * 
     * @return prefix
     */
    public java.lang.String getPrefix() {
        return prefix;
    }


    /**
     * Sets the prefix value for this OaPurchaserequest.
     * 
     * @param prefix
     */
    public void setPrefix(java.lang.String prefix) {
        this.prefix = prefix;
    }


    /**
     * Gets the attributes value for this OaPurchaserequest.
     * 
     * @return attributes
     */
    public modules.openair.wsdl.OaBase[] getAttributes() {
        return attributes;
    }


    /**
     * Sets the attributes value for this OaPurchaserequest.
     * 
     * @param attributes
     */
    public void setAttributes(modules.openair.wsdl.OaBase[] attributes) {
        this.attributes = attributes;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OaPurchaserequest)) return false;
        OaPurchaserequest other = (OaPurchaserequest) obj;
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
            ((this.date==null && other.getDate()==null) || 
             (this.date!=null &&
              this.date.equals(other.getDate()))) &&
            ((this.userid==null && other.getUserid()==null) || 
             (this.userid!=null &&
              this.userid.equals(other.getUserid()))) &&
            ((this.request_items_fulfilled==null && other.getRequest_items_fulfilled()==null) || 
             (this.request_items_fulfilled!=null &&
              this.request_items_fulfilled.equals(other.getRequest_items_fulfilled()))) &&
            ((this.total_request_items==null && other.getTotal_request_items()==null) || 
             (this.total_request_items!=null &&
              this.total_request_items.equals(other.getTotal_request_items()))) &&
            ((this.ordered_request_items==null && other.getOrdered_request_items()==null) || 
             (this.ordered_request_items!=null &&
              this.ordered_request_items.equals(other.getOrdered_request_items()))) &&
            ((this.date_required==null && other.getDate_required()==null) || 
             (this.date_required!=null &&
              this.date_required.equals(other.getDate_required()))) &&
            ((this.attachmentid==null && other.getAttachmentid()==null) || 
             (this.attachmentid!=null &&
              this.attachmentid.equals(other.getAttachmentid()))) &&
            ((this.currency==null && other.getCurrency()==null) || 
             (this.currency!=null &&
              this.currency.equals(other.getCurrency()))) &&
            ((this.quantity_fulfilled==null && other.getQuantity_fulfilled()==null) || 
             (this.quantity_fulfilled!=null &&
              this.quantity_fulfilled.equals(other.getQuantity_fulfilled()))) &&
            ((this.date_approved==null && other.getDate_approved()==null) || 
             (this.date_approved!=null &&
              this.date_approved.equals(other.getDate_approved()))) &&
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.date_fulfilled==null && other.getDate_fulfilled()==null) || 
             (this.date_fulfilled!=null &&
              this.date_fulfilled.equals(other.getDate_fulfilled()))) &&
            ((this.updated==null && other.getUpdated()==null) || 
             (this.updated!=null &&
              this.updated.equals(other.getUpdated()))) &&
            ((this.total_quantity==null && other.getTotal_quantity()==null) || 
             (this.total_quantity!=null &&
              this.total_quantity.equals(other.getTotal_quantity()))) &&
            ((this.date_submitted==null && other.getDate_submitted()==null) || 
             (this.date_submitted!=null &&
              this.date_submitted.equals(other.getDate_submitted()))) &&
            ((this.approval_status==null && other.getApproval_status()==null) || 
             (this.approval_status!=null &&
              this.approval_status.equals(other.getApproval_status()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.projectid==null && other.getProjectid()==null) || 
             (this.projectid!=null &&
              this.projectid.equals(other.getProjectid()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.total==null && other.getTotal()==null) || 
             (this.total!=null &&
              this.total.equals(other.getTotal()))) &&
            ((this.created==null && other.getCreated()==null) || 
             (this.created!=null &&
              this.created.equals(other.getCreated()))) &&
            ((this.notes==null && other.getNotes()==null) || 
             (this.notes!=null &&
              this.notes.equals(other.getNotes()))) &&
            ((this.customerid==null && other.getCustomerid()==null) || 
             (this.customerid!=null &&
              this.customerid.equals(other.getCustomerid()))) &&
            ((this.exported==null && other.getExported()==null) || 
             (this.exported!=null &&
              this.exported.equals(other.getExported()))) &&
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
        if (getDate() != null) {
            _hashCode += getDate().hashCode();
        }
        if (getUserid() != null) {
            _hashCode += getUserid().hashCode();
        }
        if (getRequest_items_fulfilled() != null) {
            _hashCode += getRequest_items_fulfilled().hashCode();
        }
        if (getTotal_request_items() != null) {
            _hashCode += getTotal_request_items().hashCode();
        }
        if (getOrdered_request_items() != null) {
            _hashCode += getOrdered_request_items().hashCode();
        }
        if (getDate_required() != null) {
            _hashCode += getDate_required().hashCode();
        }
        if (getAttachmentid() != null) {
            _hashCode += getAttachmentid().hashCode();
        }
        if (getCurrency() != null) {
            _hashCode += getCurrency().hashCode();
        }
        if (getQuantity_fulfilled() != null) {
            _hashCode += getQuantity_fulfilled().hashCode();
        }
        if (getDate_approved() != null) {
            _hashCode += getDate_approved().hashCode();
        }
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getDate_fulfilled() != null) {
            _hashCode += getDate_fulfilled().hashCode();
        }
        if (getUpdated() != null) {
            _hashCode += getUpdated().hashCode();
        }
        if (getTotal_quantity() != null) {
            _hashCode += getTotal_quantity().hashCode();
        }
        if (getDate_submitted() != null) {
            _hashCode += getDate_submitted().hashCode();
        }
        if (getApproval_status() != null) {
            _hashCode += getApproval_status().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getProjectid() != null) {
            _hashCode += getProjectid().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getTotal() != null) {
            _hashCode += getTotal().hashCode();
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
        if (getExported() != null) {
            _hashCode += getExported().hashCode();
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
        new org.apache.axis.description.TypeDesc(OaPurchaserequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://namespaces.soaplite.com/perl", "oaPurchaserequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("number");
        elemField.setXmlName(new javax.xml.namespace.QName("", "number"));
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
        elemField.setFieldName("userid");
        elemField.setXmlName(new javax.xml.namespace.QName("", "userid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("request_items_fulfilled");
        elemField.setXmlName(new javax.xml.namespace.QName("", "request_items_fulfilled"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("total_request_items");
        elemField.setXmlName(new javax.xml.namespace.QName("", "total_request_items"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ordered_request_items");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ordered_request_items"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("date_required");
        elemField.setXmlName(new javax.xml.namespace.QName("", "date_required"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attachmentid");
        elemField.setXmlName(new javax.xml.namespace.QName("", "attachmentid"));
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
        elemField.setFieldName("quantity_fulfilled");
        elemField.setXmlName(new javax.xml.namespace.QName("", "quantity_fulfilled"));
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
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("date_fulfilled");
        elemField.setXmlName(new javax.xml.namespace.QName("", "date_fulfilled"));
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
        elemField.setFieldName("total_quantity");
        elemField.setXmlName(new javax.xml.namespace.QName("", "total_quantity"));
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
        elemField.setFieldName("projectid");
        elemField.setXmlName(new javax.xml.namespace.QName("", "projectid"));
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
        elemField.setFieldName("total");
        elemField.setXmlName(new javax.xml.namespace.QName("", "total"));
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
        elemField.setFieldName("exported");
        elemField.setXmlName(new javax.xml.namespace.QName("", "exported"));
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
