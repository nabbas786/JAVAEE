/**
 * PolicyRegistrationSOAPImpl.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.example.www.PolicyRegistration;

import org.example.www.policy.registration.PolicyRegistration;

public class PolicyRegistrationSOAPImpl implements org.example.www.PolicyRegistration.PolicyRegistration_PortType {
	public org.example.www.policy.registration.PolicyRegistration enroll(org.example.www.policy.registration.MemberInfo memberInfo, org.example.www.policy.registration.PoliyInfo policyInfo) throws java.rmi.RemoteException {
        return new PolicyRegistration(memberInfo.getSsn()+policyInfo.getId(), memberInfo.getUserName()+policyInfo.getPolicyName());
    }

}
