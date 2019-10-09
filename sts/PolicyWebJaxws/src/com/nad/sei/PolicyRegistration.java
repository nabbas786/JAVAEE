package com.nad.sei;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

import com.nad.bo.MemberInfo;
import com.nad.bo.PolicyRegistrationDetails;
import com.nad.bo.PoliyInfo;

@WebService(name = "PloicyRegistraion", targetNamespace = "http://www.nad.com/policy/wsdl")
public interface PolicyRegistration {
	@WebMethod(operationName = "enroll", action = "http://www.nad.com/policy/wsdl#enroll")
	@WebResult(name = "return", targetNamespace = "http://www.nad.com/policy/types")
	PolicyRegistrationDetails enroll(
			@WebParam(name = "memberInfo", targetNamespace = "http://www.nad.com/policy/types") MemberInfo memberInfo,
			@WebParam(name = "policyInfo", targetNamespace = "http://www.nad.com/policy/types") PoliyInfo policyInfo);
}
