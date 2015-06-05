/**
 * OaScheduleexception.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package openair.wsdl;

public class OaScheduleexception  extends openair.wsdl.OaBase  implements java.io.Serializable {
    private java.lang.String workhours;

    private java.lang.String schedule_request_itemid;

    private java.lang.String exception_type;

    private java.lang.String userid;

    private java.lang.String timetypeid;

    private java.lang.String name;

    private java.lang.String startdate;

    private java.lang.String created;

    private java.lang.String enddate;

    private java.lang.String workscheduleid;

    private java.lang.String id;

    private java.lang.String updated;

    private openair.wsdl.OaBase[] attributes;

    public OaScheduleexception() {
    }

    public OaScheduleexception(
           java.lang.String workhours,
           java.lang.String schedule_request_itemid,
           java.lang.String exception_type,
           java.lang.String userid,
           java.lang.String timetypeid,
           java.lang.String name,
           java.lang.String startdate,
           java.lang.String created,
           java.lang.String enddate,
           java.lang.String workscheduleid,
           java.lang.String id,
           java.lang.String updated,
           openair.wsdl.OaBase[] attributes) {
        this.workhours = workhours;
        this.schedule_request_itemid = schedule_request_itemid;
        this.exception_type = exception_type;
        this.userid = userid;
        this.timetypeid = timetypeid;
        this.name = name;
        this.startdate = startdate;
        this.created = created;
        this.enddate = enddate;
        this.workscheduleid = workscheduleid;
        this.id = id;
        this.updated = updated;
        this.attributes = attributes;
    }


    /**
     * Gets the workhours value for this OaScheduleexception.
     * 
     * @return workhours
     */
    public java.lang.String getWorkhours() {
        return workhours;
    }


    /**
     * Sets the workhours value for this OaScheduleexception.
     * 
     * @param workhours
     */
    public void setWorkhours(java.lang.String workhours) {
        this.workhours = workhours;
    }


    /**
     * Gets the schedule_request_itemid value for this OaScheduleexception.
     * 
     * @return schedule_request_itemid
     */
    public java.lang.String getSchedule_request_itemid() {
        return schedule_request_itemid;
    }


    /**
     * Sets the schedule_request_itemid value for this OaScheduleexception.
     * 
     * @param schedule_request_itemid
     */
    public void setSchedule_request_itemid(java.lang.String schedule_request_itemid) {
        this.schedule_request_itemid = schedule_request_itemid;
    }


    /**
     * Gets the exception_type value for this OaScheduleexception.
     * 
     * @return exception_type
     */
    public java.lang.String getException_type() {
        return exception_type;
    }


    /**
     * Sets the exception_type value for this OaScheduleexception.
     * 
     * @param exception_type
     */
    public void setException_type(java.lang.String exception_type) {
        this.exception_type = exception_type;
    }


    /**
     * Gets the userid value for this OaScheduleexception.
     * 
     * @return userid
     */
    public java.lang.String getUserid() {
        return userid;
    }


    /**
     * Sets the userid value for this OaScheduleexception.
     * 
     * @param userid
     */
    public void setUserid(java.lang.String userid) {
        this.userid = userid;
    }


    /**
     * Gets the timetypeid value for this OaScheduleexception.
     * 
     * @return timetypeid
     */
    public java.lang.String getTimetypeid() {
        return timetypeid;
    }


    /**
     * Sets the timetypeid value for this OaScheduleexception.
     * 
     * @param timetypeid
     */
    public void setTimetypeid(java.lang.String timetypeid) {
        this.timetypeid = timetypeid;
    }


    /**
     * Gets the name value for this OaScheduleexception.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this OaScheduleexception.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the startdate value for this OaScheduleexception.
     * 
     * @return startdate
     */
    public java.lang.String getStartdate() {
        return startdate;
    }


    /**
     * Sets the startdate value for this OaScheduleexception.
     * 
     * @param startdate
     */
    public void setStartdate(java.lang.String startdate) {
        this.startdate = startdate;
    }


    /**
     * Gets the created value for this OaScheduleexception.
     * 
     * @return created
     */
    public java.lang.String getCreated() {
        return created;
    }


    /**
     * Sets the created value for this OaScheduleexception.
     * 
     * @param created
     */
    public void setCreated(java.lang.String created) {
        this.created = created;
    }


    /**
     * Gets the enddate value for this OaScheduleexception.
     * 
     * @return enddate
     */
    public java.lang.String getEnddate() {
        return enddate;
    }


    /**
     * Sets the enddate value for this OaScheduleexception.
     * 
     * @param enddate
     */
    public void setEnddate(java.lang.String enddate) {
        this.enddate = enddate;
    }


    /**
     * Gets the workscheduleid value for this OaScheduleexception.
     * 
     * @return workscheduleid
     */
    public java.lang.String getWorkscheduleid() {
        return workscheduleid;
    }


    /**
     * Sets the workscheduleid value for this OaScheduleexception.
     * 
     * @param workscheduleid
     */
    public void setWorkscheduleid(java.lang.String workscheduleid) {
        this.workscheduleid = workscheduleid;
    }


    /**
     * Gets the id value for this OaScheduleexception.
     * 
     * @return id
     */
    public java.lang.String getId() {
        return id;
    }


    /**
     * Sets the id value for this OaScheduleexception.
     * 
     * @param id
     */
    public void setId(java.lang.String id) {
        this.id = id;
    }


    /**
     * Gets the updated value for this OaScheduleexception.
     * 
     * @return updated
     */
    public java.lang.String getUpdated() {
        return updated;
    }


    /**
     * Sets the updated value for this OaScheduleexception.
     * 
     * @param updated
     */
    public void setUpdated(java.lang.String updated) {
        this.updated = updated;
    }


    /**
     * Gets the attributes value for this OaScheduleexception.
     * 
     * @return attributes
     */
    public openair.wsdl.OaBase[] getAttributes() {
        return attributes;
    }


    /**
     * Sets the attributes value for this OaScheduleexception.
     * 
     * @param attributes
     */
    public void setAttributes(openair.wsdl.OaBase[] attributes) {
        this.attributes = attributes;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OaScheduleexception)) return false;
        OaScheduleexception other = (OaScheduleexception) obj;
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
            ((this.schedule_request_itemid==null && other.getSchedule_request_itemid()==null) || 
             (this.schedule_request_itemid!=null &&
              this.schedule_request_itemid.equals(other.getSchedule_request_itemid()))) &&
            ((this.exception_type==null && other.getException_type()==null) || 
             (this.exception_type!=null &&
              this.exception_type.equals(other.getException_type()))) &&
            ((this.userid==null && other.getUserid()==null) || 
             (this.userid!=null &&
              this.userid.equals(other.getUserid()))) &&
            ((this.timetypeid==null && other.getTimetypeid()==null) || 
             (this.timetypeid!=null &&
              this.timetypeid.equals(other.getTimetypeid()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.startdate==null && other.getStartdate()==null) || 
             (this.startdate!=null &&
              this.startdate.equals(other.getStartdate()))) &&
            ((this.created==null && other.getCreated()==null) || 
             (this.created!=null &&
              this.created.equals(other.getCreated()))) &&
            ((this.enddate==null && other.getEnddate()==null) || 
             (this.enddate!=null &&
              this.enddate.equals(other.getEnddate()))) &&
            ((this.workscheduleid==null && other.getWorkscheduleid()==null) || 
             (this.workscheduleid!=null &&
              this.workscheduleid.equals(other.getWorkscheduleid()))) &&
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.updated==null && other.getUpdated()==null) || 
             (this.updated!=null &&
              this.updated.equals(other.getUpdated()))) &&
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
        if (getSchedule_request_itemid() != null) {
            _hashCode += getSchedule_request_itemid().hashCode();
        }
        if (getException_type() != null) {
            _hashCode += getException_type().hashCode();
        }
        if (getUserid() != null) {
            _hashCode += getUserid().hashCode();
        }
        if (getTimetypeid() != null) {
            _hashCode += getTimetypeid().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getStartdate() != null) {
            _hashCode += getStartdate().hashCode();
        }
        if (getCreated() != null) {
            _hashCode += getCreated().hashCode();
        }
        if (getEnddate() != null) {
            _hashCode += getEnddate().hashCode();
        }
        if (getWorkscheduleid() != null) {
            _hashCode += getWorkscheduleid().hashCode();
        }
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getUpdated() != null) {
            _hashCode += getUpdated().hashCode();
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
        new org.apache.axis.description.TypeDesc(OaScheduleexception.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://namespaces.soaplite.com/perl", "oaScheduleexception"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("workhours");
        elemField.setXmlName(new javax.xml.namespace.QName("", "workhours"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("schedule_request_itemid");
        elemField.setXmlName(new javax.xml.namespace.QName("", "schedule_request_itemid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("exception_type");
        elemField.setXmlName(new javax.xml.namespace.QName("", "exception_type"));
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
        elemField.setFieldName("timetypeid");
        elemField.setXmlName(new javax.xml.namespace.QName("", "timetypeid"));
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
        elemField.setFieldName("startdate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "startdate"));
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
        elemField.setFieldName("enddate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "enddate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("workscheduleid");
        elemField.setXmlName(new javax.xml.namespace.QName("", "workscheduleid"));
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
