package com.nad.sei;

import javax.jws.WebParam;
import javax.jws.WebService;

import com.nad.bo.MemberInfo;
import com.nad.bo.PolicyRegistrationDetails;
import com.nad.bo.PoliyInfo;

@WebService(endpointInterface = "com.nad.sei.PolicyRegistration")
public class PolicyRegistrationImpl implements PolicyRegistration{
	@Override
	public PolicyRegistrationDetails enroll(MemberInfo memberInfo, PoliyInfo policyInfo) {
		return new PolicyRegistrationDetails(memberInfo.getSsn()+policyInfo.getId(), memberInfo.getUserName()+policyInfo.getPolicyName());
	}

	

}
