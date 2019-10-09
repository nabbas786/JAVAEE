/**
 * PolicyRegistration_Service.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.example.www.PolicyRegistration;

public interface PolicyRegistration_Service extends javax.xml.rpc.Service {
    public java.lang.String getPolicyRegistrationSOAPAddress();

    public org.example.www.PolicyRegistration.PolicyRegistration_PortType getPolicyRegistrationSOAP() throws javax.xml.rpc.ServiceException;

    public org.example.www.PolicyRegistration.PolicyRegistration_PortType getPolicyRegistrationSOAP(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
