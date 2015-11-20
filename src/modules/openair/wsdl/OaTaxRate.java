/**
 * OaTaxRate.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package modules.openair.wsdl;

public class OaTaxRate  extends modules.openair.wsdl.OaBase  implements java.io.Serializable {
    private java.lang.String pst;

    private java.lang.String date;

    private java.lang.String federal;

    private java.lang.String tax_locationid;

    private java.lang.String state;

    private java.lang.String created;

    private java.lang.String currency;

    private java.lang.String hst;

    private java.lang.String slipid;

    private java.lang.String notes;

    private java.lang.String ticketid;

    private java.lang.String id;

    private java.lang.String gst;

    private java.lang.String updated;

    private java.lang.String purchase_itemid;

    private modules.openair.wsdl.OaBase[] attributes;

    public OaTaxRate() {
    }

    public OaTaxRate(
           java.lang.String pst,
           java.lang.String date,
           java.lang.String federal,
           java.lang.String tax_locationid,
           java.lang.String state,
           java.lang.String created,
           java.lang.String currency,
           java.lang.String hst,
           java.lang.String slipid,
           java.lang.String notes,
           java.lang.String ticketid,
           java.lang.String id,
           java.lang.String gst,
           java.lang.String updated,
           java.lang.String purchase_itemid,
           modules.openair.wsdl.OaBase[] attributes) {
        this.pst = pst;
        this.date = date;
        this.federal = federal;
        this.tax_locationid = tax_locationid;
        this.state = state;
        this.created = created;
        this.currency = currency;
        this.hst = hst;
        this.slipid = slipid;
        this.notes = notes;
        this.ticketid = ticketid;
        this.id = id;
        this.gst = gst;
        this.updated = updated;
        this.purchase_itemid = purchase_itemid;
        this.attributes = attributes;
    }


    /**
     * Gets the pst value for this OaTaxRate.
     * 
     * @return pst
     */
    public java.lang.String getPst() {
        return pst;
    }


    /**
     * Sets the pst value for this OaTaxRate.
     * 
     * @param pst
     */
    public void setPst(java.lang.String pst) {
        this.pst = pst;
    }


    /**
     * Gets the date value for this OaTaxRate.
     * 
     * @return date
     */
    public java.lang.String getDate() {
        return date;
    }


    /**
     * Sets the date value for this OaTaxRate.
     * 
     * @param date
     */
    public void setDate(java.lang.String date) {
        this.date = date;
    }


    /**
     * Gets the federal value for this OaTaxRate.
     * 
     * @return federal
     */
    public java.lang.String getFederal() {
        return federal;
    }


    /**
     * Sets the federal value for this OaTaxRate.
     * 
     * @param federal
     */
    public void setFederal(java.lang.String federal) {
        this.federal = federal;
    }


    /**
     * Gets the tax_locationid value for this OaTaxRate.
     * 
     * @return tax_locationid
     */
    public java.lang.String getTax_locationid() {
        return tax_locationid;
    }


    /**
     * Sets the tax_locationid value for this OaTaxRate.
     * 
     * @param tax_locationid
     */
    public void setTax_locationid(java.lang.String tax_locationid) {
        this.tax_locationid = tax_locationid;
    }


    /**
     * Gets the state value for this OaTaxRate.
     * 
     * @return state
     */
    public java.lang.String getState() {
        return state;
    }


    /**
     * Sets the state value for this OaTaxRate.
     * 
     * @param state
     */
    public void setState(java.lang.String state) {
        this.state = state;
    }


    /**
     * Gets the created value for this OaTaxRate.
     * 
     * @return created
     */
    public java.lang.String getCreated() {
        return created;
    }


    /**
     * Sets the created value for this OaTaxRate.
     * 
     * @param created
     */
    public void setCreated(java.lang.String created) {
        this.created = created;
    }


    /**
     * Gets the currency value for this OaTaxRate.
     * 
     * @return currency
     */
    public java.lang.String getCurrency() {
        return currency;
    }


    /**
     * Sets the currency value for this OaTaxRate.
     * 
     * @param currency
     */
    public void setCurrency(java.lang.String currency) {
        this.currency = currency;
    }


    /**
     * Gets the hst value for this OaTaxRate.
     * 
     * @return hst
     */
    public java.lang.String getHst() {
        return hst;
    }


    /**
     * Sets the hst value for this OaTaxRate.
     * 
     * @param hst
     */
    public void setHst(java.lang.String hst) {
        this.hst = hst;
    }


    /**
     * Gets the slipid value for this OaTaxRate.
     * 
     * @return slipid
     */
    public java.lang.String getSlipid() {
        return slipid;
    }


    /**
     * Sets the slipid value for this OaTaxRate.
     * 
     * @param slipid
     */
    public void setSlipid(java.lang.String slipid) {
        this.slipid = slipid;
    }


    /**
     * Gets the notes value for this OaTaxRate.
     * 
     * @return notes
     */
    public java.lang.String getNotes() {
        return notes;
    }


    /**
     * Sets the notes value for this OaTaxRate.
     * 
     * @param notes
     */
    public void setNotes(java.lang.String notes) {
        this.notes = notes;
    }


    /**
     * Gets the ticketid value for this OaTaxRate.
     * 
     * @return ticketid
     */
    public java.lang.String getTicketid() {
        return ticketid;
    }


    /**
     * Sets the ticketid value for this OaTaxRate.
     * 
     * @param ticketid
     */
    public void setTicketid(java.lang.String ticketid) {
        this.ticketid = ticketid;
    }


    /**
     * Gets the id value for this OaTaxRate.
     * 
     * @return id
     */
    public java.lang.String getId() {
        return id;
    }


    /**
     * Sets the id value for this OaTaxRate.
     * 
     * @param id
     */
    public void setId(java.lang.String id) {
        this.id = id;
    }


    /**
     * Gets the gst value for this OaTaxRate.
     * 
     * @return gst
     */
    public java.lang.String getGst() {
        return gst;
    }


    /**
     * Sets the gst value for this OaTaxRate.
     * 
     * @param gst
     */
    public void setGst(java.lang.String gst) {
        this.gst = gst;
    }


    /**
     * Gets the updated value for this OaTaxRate.
     * 
     * @return updated
     */
    public java.lang.String getUpdated() {
        return updated;
    }


    /**
     * Sets the updated value for this OaTaxRate.
     * 
     * @param updated
     */
    public void setUpdated(java.lang.String updated) {
        this.updated = updated;
    }


    /**
     * Gets the purchase_itemid value for this OaTaxRate.
     * 
     * @return purchase_itemid
     */
    public java.lang.String getPurchase_itemid() {
        return purchase_itemid;
    }


    /**
     * Sets the purchase_itemid value for this OaTaxRate.
     * 
     * @param purchase_itemid
     */
    public void setPurchase_itemid(java.lang.String purchase_itemid) {
        this.purchase_itemid = purchase_itemid;
    }


    /**
     * Gets the attributes value for this OaTaxRate.
     * 
     * @return attributes
     */
    public modules.openair.wsdl.OaBase[] getAttributes() {
        return attributes;
    }


    /**
     * Sets the attributes value for this OaTaxRate.
     * 
     * @param attributes
     */
    public void setAttributes(modules.openair.wsdl.OaBase[] attributes) {
        this.attributes = attributes;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OaTaxRate)) return false;
        OaTaxRate other = (OaTaxRate) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.pst==null && other.getPst()==null) || 
             (this.pst!=null &&
              this.pst.equals(other.getPst()))) &&
            ((this.date==null && other.getDate()==null) || 
             (this.date!=null &&
              this.date.equals(other.getDate()))) &&
            ((this.federal==null && other.getFederal()==null) || 
             (this.federal!=null &&
              this.federal.equals(other.getFederal()))) &&
            ((this.tax_locationid==null && other.getTax_locationid()==null) || 
             (this.tax_locationid!=null &&
              this.tax_locationid.equals(other.getTax_locationid()))) &&
            ((this.state==null && other.getState()==null) || 
             (this.state!=null &&
              this.state.equals(other.getState()))) &&
            ((this.created==null && other.getCreated()==null) || 
             (this.created!=null &&
              this.created.equals(other.getCreated()))) &&
            ((this.currency==null && other.getCurrency()==null) || 
             (this.currency!=null &&
              this.currency.equals(other.getCurrency()))) &&
            ((this.hst==null && other.getHst()==null) || 
             (this.hst!=null &&
              this.hst.equals(other.getHst()))) &&
            ((this.slipid==null && other.getSlipid()==null) || 
             (this.slipid!=null &&
              this.slipid.equals(other.getSlipid()))) &&
            ((this.notes==null && other.getNotes()==null) || 
             (this.notes!=null &&
              this.notes.equals(other.getNotes()))) &&
            ((this.ticketid==null && other.getTicketid()==null) || 
             (this.ticketid!=null &&
              this.ticketid.equals(other.getTicketid()))) &&
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.gst==null && other.getGst()==null) || 
             (this.gst!=null &&
              this.gst.equals(other.getGst()))) &&
            ((this.updated==null && other.getUpdated()==null) || 
             (this.updated!=null &&
              this.updated.equals(other.getUpdated()))) &&
            ((this.purchase_itemid==null && other.getPurchase_itemid()==null) || 
             (this.purchase_itemid!=null &&
              this.purchase_itemid.equals(other.getPurchase_itemid()))) &&
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
        if (getPst() != null) {
            _hashCode += getPst().hashCode();
        }
        if (getDate() != null) {
            _hashCode += getDate().hashCode();
        }
        if (getFederal() != null) {
            _hashCode += getFederal().hashCode();
        }
        if (getTax_locationid() != null) {
            _hashCode += getTax_locationid().hashCode();
        }
        if (getState() != null) {
            _hashCode += getState().hashCode();
        }
        if (getCreated() != null) {
            _hashCode += getCreated().hashCode();
        }
        if (getCurrency() != null) {
            _hashCode += getCurrency().hashCode();
        }
        if (getHst() != null) {
            _hashCode += getHst().hashCode();
        }
        if (getSlipid() != null) {
            _hashCode += getSlipid().hashCode();
        }
        if (getNotes() != null) {
            _hashCode += getNotes().hashCode();
        }
        if (getTicketid() != null) {
            _hashCode += getTicketid().hashCode();
        }
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getGst() != null) {
            _hashCode += getGst().hashCode();
        }
        if (getUpdated() != null) {
            _hashCode += getUpdated().hashCode();
        }
        if (getPurchase_itemid() != null) {
            _hashCode += getPurchase_itemid().hashCode();
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
        new org.apache.axis.description.TypeDesc(OaTaxRate.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://namespaces.soaplite.com/perl", "oaTaxRate"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pst");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pst"));
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
        elemField.setFieldName("federal");
        elemField.setXmlName(new javax.xml.namespace.QName("", "federal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tax_locationid");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tax_locationid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("state");
        elemField.setXmlName(new javax.xml.namespace.QName("", "state"));
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
        elemField.setFieldName("currency");
        elemField.setXmlName(new javax.xml.namespace.QName("", "currency"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hst");
        elemField.setXmlName(new javax.xml.namespace.QName("", "hst"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("slipid");
        elemField.setXmlName(new javax.xml.namespace.QName("", "slipid"));
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
        elemField.setFieldName("ticketid");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ticketid"));
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
        elemField.setFieldName("gst");
        elemField.setXmlName(new javax.xml.namespace.QName("", "gst"));
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
        elemField.setFieldName("purchase_itemid");
        elemField.setXmlName(new javax.xml.namespace.QName("", "purchase_itemid"));
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
