/**
 * OaUserWorkschedule.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package openair.wsdl;

public class OaUserWorkschedule  extends openair.wsdl.OaBase  implements java.io.Serializable {
    private java.lang.String workhours;

    private java.lang.String userid;

    private java.lang.String name;

    private java.lang.String created;

    private java.lang.String account_workscheduleid;

    private java.lang.String workdays;

    private java.lang.String updated;

    private java.lang.String id;

    private java.lang.String use_this_schedule;

    private openair.wsdl.OaBase[] attributes;

    public OaUserWorkschedule() {
    }

    public OaUserWorkschedule(
           java.lang.String workhours,
           java.lang.String userid,
           java.lang.String name,
           java.lang.String created,
           java.lang.String account_workscheduleid,
           java.lang.String workdays,
           java.lang.String updated,
           java.lang.String id,
           java.lang.String use_this_schedule,
           openair.wsdl.OaBase[] attributes) {
        this.workhours = workhours;
        this.userid = userid;
        this.name = name;
        this.created = created;
        this.account_workscheduleid = account_workscheduleid;
        this.workdays = workdays;
        this.updated = updated;
        this.id = id;
        this.use_this_schedule = use_this_schedule;
        this.attributes = attributes;
    }


    /**
     * Gets the workhours value for this OaUserWorkschedule.
     * 
     * @return workhours
     */
    public java.lang.String getWorkhours() {
        return workhours;
    }


    /**
     * Sets the workhours value for this OaUserWorkschedule.
     * 
     * @param workhours
     */
    public void setWorkhours(java.lang.String workhours) {
        this.workhours = workhours;
    }


    /**
     * Gets the userid value for this OaUserWorkschedule.
     * 
     * @return userid
     */
    public java.lang.String getUserid() {
        return userid;
    }


    /**
     * Sets the userid value for this OaUserWorkschedule.
     * 
     * @param userid
     */
    public void setUserid(java.lang.String userid) {
        this.userid = userid;
    }


    /**
     * Gets the name value for this OaUserWorkschedule.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this OaUserWorkschedule.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the created value for this OaUserWorkschedule.
     * 
     * @return created
     */
    public java.lang.String getCreated() {
        return created;
    }


    /**
     * Sets the created value for this OaUserWorkschedule.
     * 
     * @param created
     */
    public void setCreated(java.lang.String created) {
        this.created = created;
    }


    /**
     * Gets the account_workscheduleid value for this OaUserWorkschedule.
     * 
     * @return account_workscheduleid
     */
    public java.lang.String getAccount_workscheduleid() {
        return account_workscheduleid;
    }


    /**
     * Sets the account_workscheduleid value for this OaUserWorkschedule.
     * 
     * @param account_workscheduleid
     */
    public void setAccount_workscheduleid(java.lang.String account_workscheduleid) {
        this.account_workscheduleid = account_workscheduleid;
    }


    /**
     * Gets the workdays value for this OaUserWorkschedule.
     * 
     * @return workdays
     */
    public java.lang.String getWorkdays() {
        return workdays;
    }


    /**
     * Sets the workdays value for this OaUserWorkschedule.
     * 
     * @param workdays
     */
    public void setWorkdays(java.lang.String workdays) {
        this.workdays = workdays;
    }


    /**
     * Gets the updated value for this OaUserWorkschedule.
     * 
     * @return updated
     */
    public java.lang.String getUpdated() {
        return updated;
    }


    /**
     * Sets the updated value for this OaUserWorkschedule.
     * 
     * @param updated
     */
    public void setUpdated(java.lang.String updated) {
        this.updated = updated;
    }


    /**
     * Gets the id value for this OaUserWorkschedule.
     * 
     * @return id
     */
    public java.lang.String getId() {
        return id;
    }


    /**
     * Sets the id value for this OaUserWorkschedule.
     * 
     * @param id
     */
    public void setId(java.lang.String id) {
        this.id = id;
    }


    /**
     * Gets the use_this_schedule value for this OaUserWorkschedule.
     * 
     * @return use_this_schedule
     */
    public java.lang.String getUse_this_schedule() {
        return use_this_schedule;
    }


    /**
     * Sets the use_this_schedule value for this OaUserWorkschedule.
     * 
     * @param use_this_schedule
     */
    public void setUse_this_schedule(java.lang.String use_this_schedule) {
        this.use_this_schedule = use_this_schedule;
    }


    /**
     * Gets the attributes value for this OaUserWorkschedule.
     * 
     * @return attributes
     */
    public openair.wsdl.OaBase[] getAttributes() {
        return attributes;
    }


    /**
     * Sets the attributes value for this OaUserWorkschedule.
     * 
     * @param attributes
     */
    public void setAttributes(openair.wsdl.OaBase[] attributes) {
        this.attributes = attributes;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OaUserWorkschedule)) return false;
        OaUserWorkschedule other = (OaUserWorkschedule) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.workhours==null && other.getWorkhours()==null) || 
             (this.workhours!=null &&
              this.workhours.equals(other.getWorkhours()))) &&
            ((this.userid==null && other.getUserid()==null) || 
             (this.userid!=null &&
              this.userid.equals(other.getUserid()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.created==null && other.getCreated()==null) || 
             (this.created!=null &&
              this.created.equals(other.getCreated()))) &&
            ((this.account_workscheduleid==null && other.getAccount_workscheduleid()==null) || 
             (this.account_workscheduleid!=null &&
              this.account_workscheduleid.equals(other.getAccount_workscheduleid()))) &&
            ((this.workdays==null && other.getWorkdays()==null) || 
             (this.workdays!=null &&
              this.workdays.equals(other.getWorkdays()))) &&
            ((this.updated==null && other.getUpdated()==null) || 
             (this.updated!=null &&
              this.updated.equals(other.getUpdated()))) &&
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.use_this_schedule==null && other.getUse_this_schedule()==null) || 
             (this.use_this_schedule!=null &&
              this.use_this_schedule.equals(other.getUse_this_schedule()))) &&
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
        if (getWorkhours() != null) {
            _hashCode += getWorkhours().hashCode();
        }
        if (getUserid() != null) {
            _hashCode += getUserid().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getCreated() != null) {
            _hashCode += getCreated().hashCode();
        }
        if (getAccount_workscheduleid() != null) {
            _hashCode += getAccount_workscheduleid().hashCode();
        }
        if (getWorkdays() != null) {
            _hashCode += getWorkdays().hashCode();
        }
        if (getUpdated() != null) {
            _hashCode += getUpdated().hashCode();
        }
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getUse_this_schedule() != null) {
            _hashCode += getUse_this_schedule().hashCode();
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
        new org.apache.axis.description.TypeDesc(OaUserWorkschedule.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://namespaces.soaplite.com/perl", "oaUserWorkschedule"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("workhours");
        elemField.setXmlName(new javax.xml.namespace.QName("", "workhours"));
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
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "name"));
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
        elemField.setFieldName("account_workscheduleid");
        elemField.setXmlName(new javax.xml.namespace.QName("", "account_workscheduleid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("workdays");
        elemField.setXmlName(new javax.xml.namespace.QName("", "workdays"));
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
        elemField.setFieldName("use_this_schedule");
        elemField.setXmlName(new javax.xml.namespace.QName("", "use_this_schedule"));
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
