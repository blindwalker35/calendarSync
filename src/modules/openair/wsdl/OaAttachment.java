/**
 * OaAttachment.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package modules.openair.wsdl;

public class OaAttachment  extends modules.openair.wsdl.OaBase  implements java.io.Serializable {
    private java.lang.String ownerid;

    private java.lang.String is_a_folder;

    private java.lang.String owner_type;

    private java.lang.String name;

    private java.lang.String attachmentid;

    private java.lang.String created;

    private java.lang.String file_name;

    private java.lang.String notes;

    private java.lang.String locked_by;

    private java.lang.String id;

    private java.lang.String updated;

    private java.lang.String workspaceid;

    private java.lang.String base64_data;

    private java.lang.String hash_name;

    private java.lang.String parentid;

    private modules.openair.wsdl.OaBase[] attributes;

    public OaAttachment() {
    }

    public OaAttachment(
           java.lang.String ownerid,
           java.lang.String is_a_folder,
           java.lang.String owner_type,
           java.lang.String name,
           java.lang.String attachmentid,
           java.lang.String created,
           java.lang.String file_name,
           java.lang.String notes,
           java.lang.String locked_by,
           java.lang.String id,
           java.lang.String updated,
           java.lang.String workspaceid,
           java.lang.String base64_data,
           java.lang.String hash_name,
           java.lang.String parentid,
           modules.openair.wsdl.OaBase[] attributes) {
        this.ownerid = ownerid;
        this.is_a_folder = is_a_folder;
        this.owner_type = owner_type;
        this.name = name;
        this.attachmentid = attachmentid;
        this.created = created;
        this.file_name = file_name;
        this.notes = notes;
        this.locked_by = locked_by;
        this.id = id;
        this.updated = updated;
        this.workspaceid = workspaceid;
        this.base64_data = base64_data;
        this.hash_name = hash_name;
        this.parentid = parentid;
        this.attributes = attributes;
    }


    /**
     * Gets the ownerid value for this OaAttachment.
     * 
     * @return ownerid
     */
    public java.lang.String getOwnerid() {
        return ownerid;
    }


    /**
     * Sets the ownerid value for this OaAttachment.
     * 
     * @param ownerid
     */
    public void setOwnerid(java.lang.String ownerid) {
        this.ownerid = ownerid;
    }


    /**
     * Gets the is_a_folder value for this OaAttachment.
     * 
     * @return is_a_folder
     */
    public java.lang.String getIs_a_folder() {
        return is_a_folder;
    }


    /**
     * Sets the is_a_folder value for this OaAttachment.
     * 
     * @param is_a_folder
     */
    public void setIs_a_folder(java.lang.String is_a_folder) {
        this.is_a_folder = is_a_folder;
    }


    /**
     * Gets the owner_type value for this OaAttachment.
     * 
     * @return owner_type
     */
    public java.lang.String getOwner_type() {
        return owner_type;
    }


    /**
     * Sets the owner_type value for this OaAttachment.
     * 
     * @param owner_type
     */
    public void setOwner_type(java.lang.String owner_type) {
        this.owner_type = owner_type;
    }


    /**
     * Gets the name value for this OaAttachment.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this OaAttachment.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the attachmentid value for this OaAttachment.
     * 
     * @return attachmentid
     */
    public java.lang.String getAttachmentid() {
        return attachmentid;
    }


    /**
     * Sets the attachmentid value for this OaAttachment.
     * 
     * @param attachmentid
     */
    public void setAttachmentid(java.lang.String attachmentid) {
        this.attachmentid = attachmentid;
    }


    /**
     * Gets the created value for this OaAttachment.
     * 
     * @return created
     */
    public java.lang.String getCreated() {
        return created;
    }


    /**
     * Sets the created value for this OaAttachment.
     * 
     * @param created
     */
    public void setCreated(java.lang.String created) {
        this.created = created;
    }


    /**
     * Gets the file_name value for this OaAttachment.
     * 
     * @return file_name
     */
    public java.lang.String getFile_name() {
        return file_name;
    }


    /**
     * Sets the file_name value for this OaAttachment.
     * 
     * @param file_name
     */
    public void setFile_name(java.lang.String file_name) {
        this.file_name = file_name;
    }


    /**
     * Gets the notes value for this OaAttachment.
     * 
     * @return notes
     */
    public java.lang.String getNotes() {
        return notes;
    }


    /**
     * Sets the notes value for this OaAttachment.
     * 
     * @param notes
     */
    public void setNotes(java.lang.String notes) {
        this.notes = notes;
    }


    /**
     * Gets the locked_by value for this OaAttachment.
     * 
     * @return locked_by
     */
    public java.lang.String getLocked_by() {
        return locked_by;
    }


    /**
     * Sets the locked_by value for this OaAttachment.
     * 
     * @param locked_by
     */
    public void setLocked_by(java.lang.String locked_by) {
        this.locked_by = locked_by;
    }


    /**
     * Gets the id value for this OaAttachment.
     * 
     * @return id
     */
    public java.lang.String getId() {
        return id;
    }


    /**
     * Sets the id value for this OaAttachment.
     * 
     * @param id
     */
    public void setId(java.lang.String id) {
        this.id = id;
    }


    /**
     * Gets the updated value for this OaAttachment.
     * 
     * @return updated
     */
    public java.lang.String getUpdated() {
        return updated;
    }


    /**
     * Sets the updated value for this OaAttachment.
     * 
     * @param updated
     */
    public void setUpdated(java.lang.String updated) {
        this.updated = updated;
    }


    /**
     * Gets the workspaceid value for this OaAttachment.
     * 
     * @return workspaceid
     */
    public java.lang.String getWorkspaceid() {
        return workspaceid;
    }


    /**
     * Sets the workspaceid value for this OaAttachment.
     * 
     * @param workspaceid
     */
    public void setWorkspaceid(java.lang.String workspaceid) {
        this.workspaceid = workspaceid;
    }


    /**
     * Gets the base64_data value for this OaAttachment.
     * 
     * @return base64_data
     */
    public java.lang.String getBase64_data() {
        return base64_data;
    }


    /**
     * Sets the base64_data value for this OaAttachment.
     * 
     * @param base64_data
     */
    public void setBase64_data(java.lang.String base64_data) {
        this.base64_data = base64_data;
    }


    /**
     * Gets the hash_name value for this OaAttachment.
     * 
     * @return hash_name
     */
    public java.lang.String getHash_name() {
        return hash_name;
    }


    /**
     * Sets the hash_name value for this OaAttachment.
     * 
     * @param hash_name
     */
    public void setHash_name(java.lang.String hash_name) {
        this.hash_name = hash_name;
    }


    /**
     * Gets the parentid value for this OaAttachment.
     * 
     * @return parentid
     */
    public java.lang.String getParentid() {
        return parentid;
    }


    /**
     * Sets the parentid value for this OaAttachment.
     * 
     * @param parentid
     */
    public void setParentid(java.lang.String parentid) {
        this.parentid = parentid;
    }


    /**
     * Gets the attributes value for this OaAttachment.
     * 
     * @return attributes
     */
    public modules.openair.wsdl.OaBase[] getAttributes() {
        return attributes;
    }


    /**
     * Sets the attributes value for this OaAttachment.
     * 
     * @param attributes
     */
    public void setAttributes(modules.openair.wsdl.OaBase[] attributes) {
        this.attributes = attributes;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OaAttachment)) return false;
        OaAttachment other = (OaAttachment) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.ownerid==null && other.getOwnerid()==null) || 
             (this.ownerid!=null &&
              this.ownerid.equals(other.getOwnerid()))) &&
            ((this.is_a_folder==null && other.getIs_a_folder()==null) || 
             (this.is_a_folder!=null &&
              this.is_a_folder.equals(other.getIs_a_folder()))) &&
            ((this.owner_type==null && other.getOwner_type()==null) || 
             (this.owner_type!=null &&
              this.owner_type.equals(other.getOwner_type()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.attachmentid==null && other.getAttachmentid()==null) || 
             (this.attachmentid!=null &&
              this.attachmentid.equals(other.getAttachmentid()))) &&
            ((this.created==null && other.getCreated()==null) || 
             (this.created!=null &&
              this.created.equals(other.getCreated()))) &&
            ((this.file_name==null && other.getFile_name()==null) || 
             (this.file_name!=null &&
              this.file_name.equals(other.getFile_name()))) &&
            ((this.notes==null && other.getNotes()==null) || 
             (this.notes!=null &&
              this.notes.equals(other.getNotes()))) &&
            ((this.locked_by==null && other.getLocked_by()==null) || 
             (this.locked_by!=null &&
              this.locked_by.equals(other.getLocked_by()))) &&
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.updated==null && other.getUpdated()==null) || 
             (this.updated!=null &&
              this.updated.equals(other.getUpdated()))) &&
            ((this.workspaceid==null && other.getWorkspaceid()==null) || 
             (this.workspaceid!=null &&
              this.workspaceid.equals(other.getWorkspaceid()))) &&
            ((this.base64_data==null && other.getBase64_data()==null) || 
             (this.base64_data!=null &&
              this.base64_data.equals(other.getBase64_data()))) &&
            ((this.hash_name==null && other.getHash_name()==null) || 
             (this.hash_name!=null &&
              this.hash_name.equals(other.getHash_name()))) &&
            ((this.parentid==null && other.getParentid()==null) || 
             (this.parentid!=null &&
              this.parentid.equals(other.getParentid()))) &&
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
        if (getOwnerid() != null) {
            _hashCode += getOwnerid().hashCode();
        }
        if (getIs_a_folder() != null) {
            _hashCode += getIs_a_folder().hashCode();
        }
        if (getOwner_type() != null) {
            _hashCode += getOwner_type().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getAttachmentid() != null) {
            _hashCode += getAttachmentid().hashCode();
        }
        if (getCreated() != null) {
            _hashCode += getCreated().hashCode();
        }
        if (getFile_name() != null) {
            _hashCode += getFile_name().hashCode();
        }
        if (getNotes() != null) {
            _hashCode += getNotes().hashCode();
        }
        if (getLocked_by() != null) {
            _hashCode += getLocked_by().hashCode();
        }
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getUpdated() != null) {
            _hashCode += getUpdated().hashCode();
        }
        if (getWorkspaceid() != null) {
            _hashCode += getWorkspaceid().hashCode();
        }
        if (getBase64_data() != null) {
            _hashCode += getBase64_data().hashCode();
        }
        if (getHash_name() != null) {
            _hashCode += getHash_name().hashCode();
        }
        if (getParentid() != null) {
            _hashCode += getParentid().hashCode();
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
        new org.apache.axis.description.TypeDesc(OaAttachment.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://namespaces.soaplite.com/perl", "oaAttachment"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ownerid");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ownerid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("is_a_folder");
        elemField.setXmlName(new javax.xml.namespace.QName("", "is_a_folder"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("owner_type");
        elemField.setXmlName(new javax.xml.namespace.QName("", "owner_type"));
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
        elemField.setFieldName("attachmentid");
        elemField.setXmlName(new javax.xml.namespace.QName("", "attachmentid"));
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
        elemField.setFieldName("file_name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "file_name"));
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
        elemField.setFieldName("locked_by");
        elemField.setXmlName(new javax.xml.namespace.QName("", "locked_by"));
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
        elemField.setFieldName("workspaceid");
        elemField.setXmlName(new javax.xml.namespace.QName("", "workspaceid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("base64_data");
        elemField.setXmlName(new javax.xml.namespace.QName("", "base64_data"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hash_name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "hash_name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parentid");
        elemField.setXmlName(new javax.xml.namespace.QName("", "parentid"));
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
