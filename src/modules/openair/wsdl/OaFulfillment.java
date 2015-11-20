/**
 * OaFulfillment.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package modules.openair.wsdl;

public class OaFulfillment  extends modules.openair.wsdl.OaBase  implements java.io.Serializable {
    private java.lang.String date;

    private java.lang.String waybill_number;

    private java.lang.String quantity;

    private java.lang.String purchase_item_id;

    private java.lang.String acct_date;

    private java.lang.String carrier_id;

    private java.lang.String slip_id;

    private java.lang.String created;

    private java.lang.String purchaserequest_id;

    private java.lang.String notes;

    private java.lang.String purchaseorder_id;

    private java.lang.String id;

    private java.lang.String updated;

    private java.lang.String request_item_id;

    private modules.openair.wsdl.OaBase[] attributes;

    public OaFulfillment() {
    }

    public OaFulfillment(
           java.lang.String date,
           java.lang.String waybill_number,
           java.lang.String quantity,
           java.lang.String purchase_item_id,
           java.lang.String acct_date,
           java.lang.String carrier_id,
           java.lang.String slip_id,
           java.lang.String created,
           java.lang.String purchaserequest_id,
           java.lang.String notes,
           java.lang.String purchaseorder_id,
           java.lang.String id,
           java.lang.String updated,
           java.lang.String request_item_id,
           modules.openair.wsdl.OaBase[] attributes) {
        this.date = date;
        this.waybill_number = waybill_number;
        this.quantity = quantity;
        this.purchase_item_id = purchase_item_id;
        this.acct_date = acct_date;
        this.carrier_id = carrier_id;
        this.slip_id = slip_id;
        this.created = created;
        this.purchaserequest_id = purchaserequest_id;
        this.notes = notes;
        this.purchaseorder_id = purchaseorder_id;
        this.id = id;
        this.updated = updated;
        this.request_item_id = request_item_id;
        this.attributes = attributes;
    }


    /**
     * Gets the date value for this OaFulfillment.
     * 
     * @return date
     */
    public java.lang.String getDate() {
        return date;
    }


    /**
     * Sets the date value for this OaFulfillment.
     * 
     * @param date
     */
    public void setDate(java.lang.String date) {
        this.date = date;
    }


    /**
     * Gets the waybill_number value for this OaFulfillment.
     * 
     * @return waybill_number
     */
    public java.lang.String getWaybill_number() {
        return waybill_number;
    }


    /**
     * Sets the waybill_number value for this OaFulfillment.
     * 
     * @param waybill_number
     */
    public void setWaybill_number(java.lang.String waybill_number) {
        this.waybill_number = waybill_number;
    }


    /**
     * Gets the quantity value for this OaFulfillment.
     * 
     * @return quantity
     */
    public java.lang.String getQuantity() {
        return quantity;
    }


    /**
     * Sets the quantity value for this OaFulfillment.
     * 
     * @param quantity
     */
    public void setQuantity(java.lang.String quantity) {
        this.quantity = quantity;
    }


    /**
     * Gets the purchase_item_id value for this OaFulfillment.
     * 
     * @return purchase_item_id
     */
    public java.lang.String getPurchase_item_id() {
        return purchase_item_id;
    }


    /**
     * Sets the purchase_item_id value for this OaFulfillment.
     * 
     * @param purchase_item_id
     */
    public void setPurchase_item_id(java.lang.String purchase_item_id) {
        this.purchase_item_id = purchase_item_id;
    }


    /**
     * Gets the acct_date value for this OaFulfillment.
     * 
     * @return acct_date
     */
    public java.lang.String getAcct_date() {
        return acct_date;
    }


    /**
     * Sets the acct_date value for this OaFulfillment.
     * 
     * @param acct_date
     */
    public void setAcct_date(java.lang.String acct_date) {
        this.acct_date = acct_date;
    }


    /**
     * Gets the carrier_id value for this OaFulfillment.
     * 
     * @return carrier_id
     */
    public java.lang.String getCarrier_id() {
        return carrier_id;
    }


    /**
     * Sets the carrier_id value for this OaFulfillment.
     * 
     * @param carrier_id
     */
    public void setCarrier_id(java.lang.String carrier_id) {
        this.carrier_id = carrier_id;
    }


    /**
     * Gets the slip_id value for this OaFulfillment.
     * 
     * @return slip_id
     */
    public java.lang.String getSlip_id() {
        return slip_id;
    }


    /**
     * Sets the slip_id value for this OaFulfillment.
     * 
     * @param slip_id
     */
    public void setSlip_id(java.lang.String slip_id) {
        this.slip_id = slip_id;
    }


    /**
     * Gets the created value for this OaFulfillment.
     * 
     * @return created
     */
    public java.lang.String getCreated() {
        return created;
    }


    /**
     * Sets the created value for this OaFulfillment.
     * 
     * @param created
     */
    public void setCreated(java.lang.String created) {
        this.created = created;
    }


    /**
     * Gets the purchaserequest_id value for this OaFulfillment.
     * 
     * @return purchaserequest_id
     */
    public java.lang.String getPurchaserequest_id() {
        return purchaserequest_id;
    }


    /**
     * Sets the purchaserequest_id value for this OaFulfillment.
     * 
     * @param purchaserequest_id
     */
    public void setPurchaserequest_id(java.lang.String purchaserequest_id) {
        this.purchaserequest_id = purchaserequest_id;
    }


    /**
     * Gets the notes value for this OaFulfillment.
     * 
     * @return notes
     */
    public java.lang.String getNotes() {
        return notes;
    }


    /**
     * Sets the notes value for this OaFulfillment.
     * 
     * @param notes
     */
    public void setNotes(java.lang.String notes) {
        this.notes = notes;
    }


    /**
     * Gets the purchaseorder_id value for this OaFulfillment.
     * 
     * @return purchaseorder_id
     */
    public java.lang.String getPurchaseorder_id() {
        return purchaseorder_id;
    }


    /**
     * Sets the purchaseorder_id value for this OaFulfillment.
     * 
     * @param purchaseorder_id
     */
    public void setPurchaseorder_id(java.lang.String purchaseorder_id) {
        this.purchaseorder_id = purchaseorder_id;
    }


    /**
     * Gets the id value for this OaFulfillment.
     * 
     * @return id
     */
    public java.lang.String getId() {
        return id;
    }


    /**
     * Sets the id value for this OaFulfillment.
     * 
     * @param id
     */
    public void setId(java.lang.String id) {
        this.id = id;
    }


    /**
     * Gets the updated value for this OaFulfillment.
     * 
     * @return updated
     */
    public java.lang.String getUpdated() {
        return updated;
    }


    /**
     * Sets the updated value for this OaFulfillment.
     * 
     * @param updated
     */
    public void setUpdated(java.lang.String updated) {
        this.updated = updated;
    }


    /**
     * Gets the request_item_id value for this OaFulfillment.
     * 
     * @return request_item_id
     */
    public java.lang.String getRequest_item_id() {
        return request_item_id;
    }


    /**
     * Sets the request_item_id value for this OaFulfillment.
     * 
     * @param request_item_id
     */
    public void setRequest_item_id(java.lang.String request_item_id) {
        this.request_item_id = request_item_id;
    }


    /**
     * Gets the attributes value for this OaFulfillment.
     * 
     * @return attributes
     */
    public modules.openair.wsdl.OaBase[] getAttributes() {
        return attributes;
    }


    /**
     * Sets the attributes value for this OaFulfillment.
     * 
     * @param attributes
     */
    public void setAttributes(modules.openair.wsdl.OaBase[] attributes) {
        this.attributes = attributes;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OaFulfillment)) return false;
        OaFulfillment other = (OaFulfillment) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.date==null && other.getDate()==null) || 
             (this.date!=null &&
              this.date.equals(other.getDate()))) &&
            ((this.waybill_number==null && other.getWaybill_number()==null) || 
             (this.waybill_number!=null &&
              this.waybill_number.equals(other.getWaybill_number()))) &&
            ((this.quantity==null && other.getQuantity()==null) || 
             (this.quantity!=null &&
              this.quantity.equals(other.getQuantity()))) &&
            ((this.purchase_item_id==null && other.getPurchase_item_id()==null) || 
             (this.purchase_item_id!=null &&
              this.purchase_item_id.equals(other.getPurchase_item_id()))) &&
            ((this.acct_date==null && other.getAcct_date()==null) || 
             (this.acct_date!=null &&
              this.acct_date.equals(other.getAcct_date()))) &&
            ((this.carrier_id==null && other.getCarrier_id()==null) || 
             (this.carrier_id!=null &&
              this.carrier_id.equals(other.getCarrier_id()))) &&
            ((this.slip_id==null && other.getSlip_id()==null) || 
             (this.slip_id!=null &&
              this.slip_id.equals(other.getSlip_id()))) &&
            ((this.created==null && other.getCreated()==null) || 
             (this.created!=null &&
              this.created.equals(other.getCreated()))) &&
            ((this.purchaserequest_id==null && other.getPurchaserequest_id()==null) || 
             (this.purchaserequest_id!=null &&
              this.purchaserequest_id.equals(other.getPurchaserequest_id()))) &&
            ((this.notes==null && other.getNotes()==null) || 
             (this.notes!=null &&
              this.notes.equals(other.getNotes()))) &&
            ((this.purchaseorder_id==null && other.getPurchaseorder_id()==null) || 
             (this.purchaseorder_id!=null &&
              this.purchaseorder_id.equals(other.getPurchaseorder_id()))) &&
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.updated==null && other.getUpdated()==null) || 
             (this.updated!=null &&
              this.updated.equals(other.getUpdated()))) &&
            ((this.request_item_id==null && other.getRequest_item_id()==null) || 
             (this.request_item_id!=null &&
              this.request_item_id.equals(other.getRequest_item_id()))) &&
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
        if (getDate() != null) {
            _hashCode += getDate().hashCode();
        }
        if (getWaybill_number() != null) {
            _hashCode += getWaybill_number().hashCode();
        }
        if (getQuantity() != null) {
            _hashCode += getQuantity().hashCode();
        }
        if (getPurchase_item_id() != null) {
            _hashCode += getPurchase_item_id().hashCode();
        }
        if (getAcct_date() != null) {
            _hashCode += getAcct_date().hashCode();
        }
        if (getCarrier_id() != null) {
            _hashCode += getCarrier_id().hashCode();
        }
        if (getSlip_id() != null) {
            _hashCode += getSlip_id().hashCode();
        }
        if (getCreated() != null) {
            _hashCode += getCreated().hashCode();
        }
        if (getPurchaserequest_id() != null) {
            _hashCode += getPurchaserequest_id().hashCode();
        }
        if (getNotes() != null) {
            _hashCode += getNotes().hashCode();
        }
        if (getPurchaseorder_id() != null) {
            _hashCode += getPurchaseorder_id().hashCode();
        }
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getUpdated() != null) {
            _hashCode += getUpdated().hashCode();
        }
        if (getRequest_item_id() != null) {
            _hashCode += getRequest_item_id().hashCode();
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
        new org.apache.axis.description.TypeDesc(OaFulfillment.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://namespaces.soaplite.com/perl", "oaFulfillment"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("date");
        elemField.setXmlName(new javax.xml.namespace.QName("", "date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("waybill_number");
        elemField.setXmlName(new javax.xml.namespace.QName("", "waybill_number"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quantity");
        elemField.setXmlName(new javax.xml.namespace.QName("", "quantity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("purchase_item_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "purchase_item_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("acct_date");
        elemField.setXmlName(new javax.xml.namespace.QName("", "acct_date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("carrier_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "carrier_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("slip_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "slip_id"));
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
        elemField.setFieldName("purchaserequest_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "purchaserequest_id"));
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
        elemField.setFieldName("purchaseorder_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "purchaseorder_id"));
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
        elemField.setFieldName("request_item_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "request_item_id"));
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
