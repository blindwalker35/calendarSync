/**
 * OaHierarchyNode.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package openair.wsdl;

public class OaHierarchyNode  extends openair.wsdl.OaBase  implements java.io.Serializable {
    private java.lang.String levelid;

    private java.lang.String hierarchyid;

    private java.lang.String isalevel;

    private java.lang.String name;

    private java.lang.String externalid;

    private java.lang.String created;

    private java.lang.String recordid;

    private java.lang.String notes;

    private java.lang.String isanode;

    private java.lang.String id;

    private java.lang.String updated;

    private java.lang.String parentid;

    private openair.wsdl.OaBase[] attributes;

    public OaHierarchyNode() {
    }

    public OaHierarchyNode(
           java.lang.String levelid,
           java.lang.String hierarchyid,
           java.lang.String isalevel,
           java.lang.String name,
           java.lang.String externalid,
           java.lang.String created,
           java.lang.String recordid,
           java.lang.String notes,
           java.lang.String isanode,
           java.lang.String id,
           java.lang.String updated,
           java.lang.String parentid,
           openair.wsdl.OaBase[] attributes) {
        this.levelid = levelid;
        this.hierarchyid = hierarchyid;
        this.isalevel = isalevel;
        this.name = name;
        this.externalid = externalid;
        this.created = created;
        this.recordid = recordid;
        this.notes = notes;
        this.isanode = isanode;
        this.id = id;
        this.updated = updated;
        this.parentid = parentid;
        this.attributes = attributes;
    }


    /**
     * Gets the levelid value for this OaHierarchyNode.
     * 
     * @return levelid
     */
    public java.lang.String getLevelid() {
        return levelid;
    }


    /**
     * Sets the levelid value for this OaHierarchyNode.
     * 
     * @param levelid
     */
    public void setLevelid(java.lang.String levelid) {
        this.levelid = levelid;
    }


    /**
     * Gets the hierarchyid value for this OaHierarchyNode.
     * 
     * @return hierarchyid
     */
    public java.lang.String getHierarchyid() {
        return hierarchyid;
    }


    /**
     * Sets the hierarchyid value for this OaHierarchyNode.
     * 
     * @param hierarchyid
     */
    public void setHierarchyid(java.lang.String hierarchyid) {
        this.hierarchyid = hierarchyid;
    }


    /**
     * Gets the isalevel value for this OaHierarchyNode.
     * 
     * @return isalevel
     */
    public java.lang.String getIsalevel() {
        return isalevel;
    }


    /**
     * Sets the isalevel value for this OaHierarchyNode.
     * 
     * @param isalevel
     */
    public void setIsalevel(java.lang.String isalevel) {
        this.isalevel = isalevel;
    }


    /**
     * Gets the name value for this OaHierarchyNode.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this OaHierarchyNode.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the externalid value for this OaHierarchyNode.
     * 
     * @return externalid
     */
    public java.lang.String getExternalid() {
        return externalid;
    }


    /**
     * Sets the externalid value for this OaHierarchyNode.
     * 
     * @param externalid
     */
    public void setExternalid(java.lang.String externalid) {
        this.externalid = externalid;
    }


    /**
     * Gets the created value for this OaHierarchyNode.
     * 
     * @return created
     */
    public java.lang.String getCreated() {
        return created;
    }


    /**
     * Sets the created value for this OaHierarchyNode.
     * 
     * @param created
     */
    public void setCreated(java.lang.String created) {
        this.created = created;
    }


    /**
     * Gets the recordid value for this OaHierarchyNode.
     * 
     * @return recordid
     */
    public java.lang.String getRecordid() {
        return recordid;
    }


    /**
     * Sets the recordid value for this OaHierarchyNode.
     * 
     * @param recordid
     */
    public void setRecordid(java.lang.String recordid) {
        this.recordid = recordid;
    }


    /**
     * Gets the notes value for this OaHierarchyNode.
     * 
     * @return notes
     */
    public java.lang.String getNotes() {
        return notes;
    }


    /**
     * Sets the notes value for this OaHierarchyNode.
     * 
     * @param notes
     */
    public void setNotes(java.lang.String notes) {
        this.notes = notes;
    }


    /**
     * Gets the isanode value for this OaHierarchyNode.
     * 
     * @return isanode
     */
    public java.lang.String getIsanode() {
        return isanode;
    }


    /**
     * Sets the isanode value for this OaHierarchyNode.
     * 
     * @param isanode
     */
    public void setIsanode(java.lang.String isanode) {
        this.isanode = isanode;
    }


    /**
     * Gets the id value for this OaHierarchyNode.
     * 
     * @return id
     */
    public java.lang.String getId() {
        return id;
    }


    /**
     * Sets the id value for this OaHierarchyNode.
     * 
     * @param id
     */
    public void setId(java.lang.String id) {
        this.id = id;
    }


    /**
     * Gets the updated value for this OaHierarchyNode.
     * 
     * @return updated
     */
    public java.lang.String getUpdated() {
        return updated;
    }


    /**
     * Sets the updated value for this OaHierarchyNode.
     * 
     * @param updated
     */
    public void setUpdated(java.lang.String updated) {
        this.updated = updated;
    }


    /**
     * Gets the parentid value for this OaHierarchyNode.
     * 
     * @return parentid
     */
    public java.lang.String getParentid() {
        return parentid;
    }


    /**
     * Sets the parentid value for this OaHierarchyNode.
     * 
     * @param parentid
     */
    public void setParentid(java.lang.String parentid) {
        this.parentid = parentid;
    }


    /**
     * Gets the attributes value for this OaHierarchyNode.
     * 
     * @return attributes
     */
    public openair.wsdl.OaBase[] getAttributes() {
        return attributes;
    }


    /**
     * Sets the attributes value for this OaHierarchyNode.
     * 
     * @param attributes
     */
    public void setAttributes(openair.wsdl.OaBase[] attributes) {
        this.attributes = attributes;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OaHierarchyNode)) return false;
        OaHierarchyNode other = (OaHierarchyNode) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.levelid==null && other.getLevelid()==null) || 
             (this.levelid!=null &&
              this.levelid.equals(other.getLevelid()))) &&
            ((this.hierarchyid==null && other.getHierarchyid()==null) || 
             (this.hierarchyid!=null &&
              this.hierarchyid.equals(other.getHierarchyid()))) &&
            ((this.isalevel==null && other.getIsalevel()==null) || 
             (this.isalevel!=null &&
              this.isalevel.equals(other.getIsalevel()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.externalid==null && other.getExternalid()==null) || 
             (this.externalid!=null &&
              this.externalid.equals(other.getExternalid()))) &&
            ((this.created==null && other.getCreated()==null) || 
             (this.created!=null &&
              this.created.equals(other.getCreated()))) &&
            ((this.recordid==null && other.getRecordid()==null) || 
             (this.recordid!=null &&
              this.recordid.equals(other.getRecordid()))) &&
            ((this.notes==null && other.getNotes()==null) || 
             (this.notes!=null &&
              this.notes.equals(other.getNotes()))) &&
            ((this.isanode==null && other.getIsanode()==null) || 
             (this.isanode!=null &&
              this.isanode.equals(other.getIsanode()))) &&
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.updated==null && other.getUpdated()==null) || 
             (this.updated!=null &&
              this.updated.equals(other.getUpdated()))) &&
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
        if (getLevelid() != null) {
            _hashCode += getLevelid().hashCode();
        }
        if (getHierarchyid() != null) {
            _hashCode += getHierarchyid().hashCode();
        }
        if (getIsalevel() != null) {
            _hashCode += getIsalevel().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getExternalid() != null) {
            _hashCode += getExternalid().hashCode();
        }
        if (getCreated() != null) {
            _hashCode += getCreated().hashCode();
        }
        if (getRecordid() != null) {
            _hashCode += getRecordid().hashCode();
        }
        if (getNotes() != null) {
            _hashCode += getNotes().hashCode();
        }
        if (getIsanode() != null) {
            _hashCode += getIsanode().hashCode();
        }
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getUpdated() != null) {
            _hashCode += getUpdated().hashCode();
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
        new org.apache.axis.description.TypeDesc(OaHierarchyNode.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://namespaces.soaplite.com/perl", "oaHierarchyNode"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("levelid");
        elemField.setXmlName(new javax.xml.namespace.QName("", "levelid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hierarchyid");
        elemField.setXmlName(new javax.xml.namespace.QName("", "hierarchyid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isalevel");
        elemField.setXmlName(new javax.xml.namespace.QName("", "isalevel"));
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
        elemField.setFieldName("externalid");
        elemField.setXmlName(new javax.xml.namespace.QName("", "externalid"));
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
        elemField.setFieldName("recordid");
        elemField.setXmlName(new javax.xml.namespace.QName("", "recordid"));
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
        elemField.setFieldName("isanode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "isanode"));
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
