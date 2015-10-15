/**
 * SubmitResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package modules.openair.wsdl;

public class SubmitResult  implements java.io.Serializable {
    private java.lang.String id;

    private java.lang.String approval_warnings;

    private java.lang.String approval_errors;

    private java.lang.String log;

    private modules.openair.wsdl.OaBase[] errors;

    private java.lang.String status;

    public SubmitResult() {
    }

    public SubmitResult(
           java.lang.String id,
           java.lang.String approval_warnings,
           java.lang.String approval_errors,
           java.lang.String log,
           modules.openair.wsdl.OaBase[] errors,
           java.lang.String status) {
           this.id = id;
           this.approval_warnings = approval_warnings;
           this.approval_errors = approval_errors;
           this.log = log;
           this.errors = errors;
           this.status = status;
    }


    /**
     * Gets the id value for this SubmitResult.
     * 
     * @return id
     */
    public java.lang.String getId() {
        return id;
    }


    /**
     * Sets the id value for this SubmitResult.
     * 
     * @param id
     */
    public void setId(java.lang.String id) {
        this.id = id;
    }


    /**
     * Gets the approval_warnings value for this SubmitResult.
     * 
     * @return approval_warnings
     */
    public java.lang.String getApproval_warnings() {
        return approval_warnings;
    }


    /**
     * Sets the approval_warnings value for this SubmitResult.
     * 
     * @param approval_warnings
     */
    public void setApproval_warnings(java.lang.String approval_warnings) {
        this.approval_warnings = approval_warnings;
    }


    /**
     * Gets the approval_errors value for this SubmitResult.
     * 
     * @return approval_errors
     */
    public java.lang.String getApproval_errors() {
        return approval_errors;
    }


    /**
     * Sets the approval_errors value for this SubmitResult.
     * 
     * @param approval_errors
     */
    public void setApproval_errors(java.lang.String approval_errors) {
        this.approval_errors = approval_errors;
    }


    /**
     * Gets the log value for this SubmitResult.
     * 
     * @return log
     */
    public java.lang.String getLog() {
        return log;
    }


    /**
     * Sets the log value for this SubmitResult.
     * 
     * @param log
     */
    public void setLog(java.lang.String log) {
        this.log = log;
    }


    /**
     * Gets the errors value for this SubmitResult.
     * 
     * @return errors
     */
    public modules.openair.wsdl.OaBase[] getErrors() {
        return errors;
    }


    /**
     * Sets the errors value for this SubmitResult.
     * 
     * @param errors
     */
    public void setErrors(modules.openair.wsdl.OaBase[] errors) {
        this.errors = errors;
    }


    /**
     * Gets the status value for this SubmitResult.
     * 
     * @return status
     */
    public java.lang.String getStatus() {
        return status;
    }


    /**
     * Sets the status value for this SubmitResult.
     * 
     * @param status
     */
    public void setStatus(java.lang.String status) {
        this.status = status;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SubmitResult)) return false;
        SubmitResult other = (SubmitResult) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.approval_warnings==null && other.getApproval_warnings()==null) || 
             (this.approval_warnings!=null &&
              this.approval_warnings.equals(other.getApproval_warnings()))) &&
            ((this.approval_errors==null && other.getApproval_errors()==null) || 
             (this.approval_errors!=null &&
              this.approval_errors.equals(other.getApproval_errors()))) &&
            ((this.log==null && other.getLog()==null) || 
             (this.log!=null &&
              this.log.equals(other.getLog()))) &&
            ((this.errors==null && other.getErrors()==null) || 
             (this.errors!=null &&
              java.util.Arrays.equals(this.errors, other.getErrors()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getApproval_warnings() != null) {
            _hashCode += getApproval_warnings().hashCode();
        }
        if (getApproval_errors() != null) {
            _hashCode += getApproval_errors().hashCode();
        }
        if (getLog() != null) {
            _hashCode += getLog().hashCode();
        }
        if (getErrors() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getErrors());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getErrors(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SubmitResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://namespaces.soaplite.com/perl", "SubmitResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("approval_warnings");
        elemField.setXmlName(new javax.xml.namespace.QName("", "approval_warnings"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("approval_errors");
        elemField.setXmlName(new javax.xml.namespace.QName("", "approval_errors"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("log");
        elemField.setXmlName(new javax.xml.namespace.QName("", "log"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("errors");
        elemField.setXmlName(new javax.xml.namespace.QName("", "errors"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://namespaces.soaplite.com/perl", "oaBase"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
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
