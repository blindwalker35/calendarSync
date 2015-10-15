/**
 * OaTaxLocation.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package modules.openair.wsdl;

public class OaTaxLocation  extends modules.openair.wsdl.OaBase  implements java.io.Serializable {
    private java.lang.String hst_rate;

    private java.lang.String federal_rate;

    private java.lang.String acct_code_federal;

    private java.lang.String tax_method;

    private java.lang.String state_rate;

    private java.lang.String updated;

    private java.lang.String id;

    private java.lang.String acct_code_pst;

    private java.lang.String acct_code_state;

    private java.lang.String name;

    private java.lang.String active;

    private java.lang.String acct_code_gst;

    private java.lang.String created;

    private java.lang.String pst_rate;

    private java.lang.String acct_code_hst;

    private java.lang.String notes;

    private java.lang.String gst_rate;

    private modules.openair.wsdl.OaBase[] attributes;

    public OaTaxLocation() {
    }

    public OaTaxLocation(
           java.lang.String hst_rate,
           java.lang.String federal_rate,
           java.lang.String acct_code_federal,
           java.lang.String tax_method,
           java.lang.String state_rate,
           java.lang.String updated,
           java.lang.String id,
           java.lang.String acct_code_pst,
           java.lang.String acct_code_state,
           java.lang.String name,
           java.lang.String active,
           java.lang.String acct_code_gst,
           java.lang.String created,
           java.lang.String pst_rate,
           java.lang.String acct_code_hst,
           java.lang.String notes,
           java.lang.String gst_rate,
           modules.openair.wsdl.OaBase[] attributes) {
        this.hst_rate = hst_rate;
        this.federal_rate = federal_rate;
        this.acct_code_federal = acct_code_federal;
        this.tax_method = tax_method;
        this.state_rate = state_rate;
        this.updated = updated;
        this.id = id;
        this.acct_code_pst = acct_code_pst;
        this.acct_code_state = acct_code_state;
        this.name = name;
        this.active = active;
        this.acct_code_gst = acct_code_gst;
        this.created = created;
        this.pst_rate = pst_rate;
        this.acct_code_hst = acct_code_hst;
        this.notes = notes;
        this.gst_rate = gst_rate;
        this.attributes = attributes;
    }


    /**
     * Gets the hst_rate value for this OaTaxLocation.
     * 
     * @return hst_rate
     */
    public java.lang.String getHst_rate() {
        return hst_rate;
    }


    /**
     * Sets the hst_rate value for this OaTaxLocation.
     * 
     * @param hst_rate
     */
    public void setHst_rate(java.lang.String hst_rate) {
        this.hst_rate = hst_rate;
    }


    /**
     * Gets the federal_rate value for this OaTaxLocation.
     * 
     * @return federal_rate
     */
    public java.lang.String getFederal_rate() {
        return federal_rate;
    }


    /**
     * Sets the federal_rate value for this OaTaxLocation.
     * 
     * @param federal_rate
     */
    public void setFederal_rate(java.lang.String federal_rate) {
        this.federal_rate = federal_rate;
    }


    /**
     * Gets the acct_code_federal value for this OaTaxLocation.
     * 
     * @return acct_code_federal
     */
    public java.lang.String getAcct_code_federal() {
        return acct_code_federal;
    }


    /**
     * Sets the acct_code_federal value for this OaTaxLocation.
     * 
     * @param acct_code_federal
     */
    public void setAcct_code_federal(java.lang.String acct_code_federal) {
        this.acct_code_federal = acct_code_federal;
    }


    /**
     * Gets the tax_method value for this OaTaxLocation.
     * 
     * @return tax_method
     */
    public java.lang.String getTax_method() {
        return tax_method;
    }


    /**
     * Sets the tax_method value for this OaTaxLocation.
     * 
     * @param tax_method
     */
    public void setTax_method(java.lang.String tax_method) {
        this.tax_method = tax_method;
    }


    /**
     * Gets the state_rate value for this OaTaxLocation.
     * 
     * @return state_rate
     */
    public java.lang.String getState_rate() {
        return state_rate;
    }


    /**
     * Sets the state_rate value for this OaTaxLocation.
     * 
     * @param state_rate
     */
    public void setState_rate(java.lang.String state_rate) {
        this.state_rate = state_rate;
    }


    /**
     * Gets the updated value for this OaTaxLocation.
     * 
     * @return updated
     */
    public java.lang.String getUpdated() {
        return updated;
    }


    /**
     * Sets the updated value for this OaTaxLocation.
     * 
     * @param updated
     */
    public void setUpdated(java.lang.String updated) {
        this.updated = updated;
    }


    /**
     * Gets the id value for this OaTaxLocation.
     * 
     * @return id
     */
    public java.lang.String getId() {
        return id;
    }


    /**
     * Sets the id value for this OaTaxLocation.
     * 
     * @param id
     */
    public void setId(java.lang.String id) {
        this.id = id;
    }


    /**
     * Gets the acct_code_pst value for this OaTaxLocation.
     * 
     * @return acct_code_pst
     */
    public java.lang.String getAcct_code_pst() {
        return acct_code_pst;
    }


    /**
     * Sets the acct_code_pst value for this OaTaxLocation.
     * 
     * @param acct_code_pst
     */
    public void setAcct_code_pst(java.lang.String acct_code_pst) {
        this.acct_code_pst = acct_code_pst;
    }


    /**
     * Gets the acct_code_state value for this OaTaxLocation.
     * 
     * @return acct_code_state
     */
    public java.lang.String getAcct_code_state() {
        return acct_code_state;
    }


    /**
     * Sets the acct_code_state value for this OaTaxLocation.
     * 
     * @param acct_code_state
     */
    public void setAcct_code_state(java.lang.String acct_code_state) {
        this.acct_code_state = acct_code_state;
    }


    /**
     * Gets the name value for this OaTaxLocation.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this OaTaxLocation.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the active value for this OaTaxLocation.
     * 
     * @return active
     */
    public java.lang.String getActive() {
        return active;
    }


    /**
     * Sets the active value for this OaTaxLocation.
     * 
     * @param active
     */
    public void setActive(java.lang.String active) {
        this.active = active;
    }


    /**
     * Gets the acct_code_gst value for this OaTaxLocation.
     * 
     * @return acct_code_gst
     */
    public java.lang.String getAcct_code_gst() {
        return acct_code_gst;
    }


    /**
     * Sets the acct_code_gst value for this OaTaxLocation.
     * 
     * @param acct_code_gst
     */
    public void setAcct_code_gst(java.lang.String acct_code_gst) {
        this.acct_code_gst = acct_code_gst;
    }


    /**
     * Gets the created value for this OaTaxLocation.
     * 
     * @return created
     */
    public java.lang.String getCreated() {
        return created;
    }


    /**
     * Sets the created value for this OaTaxLocation.
     * 
     * @param created
     */
    public void setCreated(java.lang.String created) {
        this.created = created;
    }


    /**
     * Gets the pst_rate value for this OaTaxLocation.
     * 
     * @return pst_rate
     */
    public java.lang.String getPst_rate() {
        return pst_rate;
    }


    /**
     * Sets the pst_rate value for this OaTaxLocation.
     * 
     * @param pst_rate
     */
    public void setPst_rate(java.lang.String pst_rate) {
        this.pst_rate = pst_rate;
    }


    /**
     * Gets the acct_code_hst value for this OaTaxLocation.
     * 
     * @return acct_code_hst
     */
    public java.lang.String getAcct_code_hst() {
        return acct_code_hst;
    }


    /**
     * Sets the acct_code_hst value for this OaTaxLocation.
     * 
     * @param acct_code_hst
     */
    public void setAcct_code_hst(java.lang.String acct_code_hst) {
        this.acct_code_hst = acct_code_hst;
    }


    /**
     * Gets the notes value for this OaTaxLocation.
     * 
     * @return notes
     */
    public java.lang.String getNotes() {
        return notes;
    }


    /**
     * Sets the notes value for this OaTaxLocation.
     * 
     * @param notes
     */
    public void setNotes(java.lang.String notes) {
        this.notes = notes;
    }


    /**
     * Gets the gst_rate value for this OaTaxLocation.
     * 
     * @return gst_rate
     */
    public java.lang.String getGst_rate() {
        return gst_rate;
    }


    /**
     * Sets the gst_rate value for this OaTaxLocation.
     * 
     * @param gst_rate
     */
    public void setGst_rate(java.lang.String gst_rate) {
        this.gst_rate = gst_rate;
    }


    /**
     * Gets the attributes value for this OaTaxLocation.
     * 
     * @return attributes
     */
    public modules.openair.wsdl.OaBase[] getAttributes() {
        return attributes;
    }


    /**
     * Sets the attributes value for this OaTaxLocation.
     * 
     * @param attributes
     */
    public void setAttributes(modules.openair.wsdl.OaBase[] attributes) {
        this.attributes = attributes;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OaTaxLocation)) return false;
        OaTaxLocation other = (OaTaxLocation) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.hst_rate==null && other.getHst_rate()==null) || 
             (this.hst_rate!=null &&
              this.hst_rate.equals(other.getHst_rate()))) &&
            ((this.federal_rate==null && other.getFederal_rate()==null) || 
             (this.federal_rate!=null &&
              this.federal_rate.equals(other.getFederal_rate()))) &&
            ((this.acct_code_federal==null && other.getAcct_code_federal()==null) || 
             (this.acct_code_federal!=null &&
              this.acct_code_federal.equals(other.getAcct_code_federal()))) &&
            ((this.tax_method==null && other.getTax_method()==null) || 
             (this.tax_method!=null &&
              this.tax_method.equals(other.getTax_method()))) &&
            ((this.state_rate==null && other.getState_rate()==null) || 
             (this.state_rate!=null &&
              this.state_rate.equals(other.getState_rate()))) &&
            ((this.updated==null && other.getUpdated()==null) || 
             (this.updated!=null &&
              this.updated.equals(other.getUpdated()))) &&
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.acct_code_pst==null && other.getAcct_code_pst()==null) || 
             (this.acct_code_pst!=null &&
              this.acct_code_pst.equals(other.getAcct_code_pst()))) &&
            ((this.acct_code_state==null && other.getAcct_code_state()==null) || 
             (this.acct_code_state!=null &&
              this.acct_code_state.equals(other.getAcct_code_state()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.active==null && other.getActive()==null) || 
             (this.active!=null &&
              this.active.equals(other.getActive()))) &&
            ((this.acct_code_gst==null && other.getAcct_code_gst()==null) || 
             (this.acct_code_gst!=null &&
              this.acct_code_gst.equals(other.getAcct_code_gst()))) &&
            ((this.created==null && other.getCreated()==null) || 
             (this.created!=null &&
              this.created.equals(other.getCreated()))) &&
            ((this.pst_rate==null && other.getPst_rate()==null) || 
             (this.pst_rate!=null &&
              this.pst_rate.equals(other.getPst_rate()))) &&
            ((this.acct_code_hst==null && other.getAcct_code_hst()==null) || 
             (this.acct_code_hst!=null &&
              this.acct_code_hst.equals(other.getAcct_code_hst()))) &&
            ((this.notes==null && other.getNotes()==null) || 
             (this.notes!=null &&
              this.notes.equals(other.getNotes()))) &&
            ((this.gst_rate==null && other.getGst_rate()==null) || 
             (this.gst_rate!=null &&
              this.gst_rate.equals(other.getGst_rate()))) &&
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
        if (getHst_rate() != null) {
            _hashCode += getHst_rate().hashCode();
        }
        if (getFederal_rate() != null) {
            _hashCode += getFederal_rate().hashCode();
        }
        if (getAcct_code_federal() != null) {
            _hashCode += getAcct_code_federal().hashCode();
        }
        if (getTax_method() != null) {
            _hashCode += getTax_method().hashCode();
        }
        if (getState_rate() != null) {
            _hashCode += getState_rate().hashCode();
        }
        if (getUpdated() != null) {
            _hashCode += getUpdated().hashCode();
        }
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getAcct_code_pst() != null) {
            _hashCode += getAcct_code_pst().hashCode();
        }
        if (getAcct_code_state() != null) {
            _hashCode += getAcct_code_state().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getActive() != null) {
            _hashCode += getActive().hashCode();
        }
        if (getAcct_code_gst() != null) {
            _hashCode += getAcct_code_gst().hashCode();
        }
        if (getCreated() != null) {
            _hashCode += getCreated().hashCode();
        }
        if (getPst_rate() != null) {
            _hashCode += getPst_rate().hashCode();
        }
        if (getAcct_code_hst() != null) {
            _hashCode += getAcct_code_hst().hashCode();
        }
        if (getNotes() != null) {
            _hashCode += getNotes().hashCode();
        }
        if (getGst_rate() != null) {
            _hashCode += getGst_rate().hashCode();
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
        new org.apache.axis.description.TypeDesc(OaTaxLocation.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://namespaces.soaplite.com/perl", "oaTaxLocation"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hst_rate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "hst_rate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("federal_rate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "federal_rate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("acct_code_federal");
        elemField.setXmlName(new javax.xml.namespace.QName("", "acct_code_federal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tax_method");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tax_method"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("state_rate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "state_rate"));
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
        elemField.setFieldName("acct_code_pst");
        elemField.setXmlName(new javax.xml.namespace.QName("", "acct_code_pst"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("acct_code_state");
        elemField.setXmlName(new javax.xml.namespace.QName("", "acct_code_state"));
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
        elemField.setFieldName("active");
        elemField.setXmlName(new javax.xml.namespace.QName("", "active"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("acct_code_gst");
        elemField.setXmlName(new javax.xml.namespace.QName("", "acct_code_gst"));
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
        elemField.setFieldName("pst_rate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pst_rate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("acct_code_hst");
        elemField.setXmlName(new javax.xml.namespace.QName("", "acct_code_hst"));
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
        elemField.setFieldName("gst_rate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "gst_rate"));
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
