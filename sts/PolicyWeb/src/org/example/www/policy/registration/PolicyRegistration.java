/**
 * PolicyRegistration.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.example.www.policy.registration;

public class PolicyRegistration  implements java.io.Serializable {
    private java.lang.String registrationNumber;

    private java.lang.String policyDetails;

    public PolicyRegistration() {
    }

    public PolicyRegistration(
           java.lang.String registrationNumber,
           java.lang.String policyDetails) {
           this.registrationNumber = registrationNumber;
           this.policyDetails = policyDetails;
    }


    /**
     * Gets the registrationNumber value for this PolicyRegistration.
     * 
     * @return registrationNumber
     */
    public java.lang.String getRegistrationNumber() {
        return registrationNumber;
    }


    /**
     * Sets the registrationNumber value for this PolicyRegistration.
     * 
     * @param registrationNumber
     */
    public void setRegistrationNumber(java.lang.String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }


    /**
     * Gets the policyDetails value for this PolicyRegistration.
     * 
     * @return policyDetails
     */
    public java.lang.String getPolicyDetails() {
        return policyDetails;
    }


    /**
     * Sets the policyDetails value for this PolicyRegistration.
     * 
     * @param policyDetails
     */
    public void setPolicyDetails(java.lang.String policyDetails) {
        this.policyDetails = policyDetails;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PolicyRegistration)) return false;
        PolicyRegistration other = (PolicyRegistration) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.registrationNumber==null && other.getRegistrationNumber()==null) || 
             (this.registrationNumber!=null &&
              this.registrationNumber.equals(other.getRegistrationNumber()))) &&
            ((this.policyDetails==null && other.getPolicyDetails()==null) || 
             (this.policyDetails!=null &&
              this.policyDetails.equals(other.getPolicyDetails())));
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
        if (getRegistrationNumber() != null) {
            _hashCode += getRegistrationNumber().hashCode();
        }
        if (getPolicyDetails() != null) {
            _hashCode += getPolicyDetails().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PolicyRegistration.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.example.org/policy/registration", "PolicyRegistration"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("registrationNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "registrationNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("policyDetails");
        elemField.setXmlName(new javax.xml.namespace.QName("", "policyDetails"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
