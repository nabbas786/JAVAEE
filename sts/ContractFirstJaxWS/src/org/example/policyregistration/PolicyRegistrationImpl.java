package org.example.policyregistration;

import javax.jws.WebService;

@WebService(endpointInterface = "org.example.policyregistration.PolicyRegistration")
public class PolicyRegistrationImpl implements PolicyRegistration {

	@Override
	public PolicyDetails enroll(MemberPolicyInput memberInfo) {
		PolicyDetails policy= new PolicyDetails();
		policy.setId(memberInfo.getMember().getId()+memberInfo.getPolicy().getId());
		policy.setDetails(memberInfo.getMember().getName()+memberInfo.getPolicy().getPolicyName());
		return policy;
	}

}
