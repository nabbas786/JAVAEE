
package com.nad.sei.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.sun.xml.internal.ws.resources.WsservletMessages;

@XmlRootElement(name = "enroll", namespace = "http://www.nad.com/policy/wsdl")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "enroll", namespace = "http://www.nad.com/policy/wsdl", propOrder = {
    "memberInfo",
    "policyInfo"
})
public class Enroll {

    @XmlElement(name = "memberInfo", namespace = "http://www.nad.com/policy/types")
    private com.nad.bo.MemberInfo memberInfo;
    @XmlElement(name = "policyInfo", namespace = "http://www.nad.com/policy/types")
    private com.nad.bo.PoliyInfo policyInfo;

    /**
     * 
     * @return
     *     returns MemberInfo
     */
    public com.nad.bo.MemberInfo getMemberInfo() {
        return this.memberInfo;
    }

    /**
     * 
     * @param memberInfo
     *     the value for the memberInfo property
     */
    public void setMemberInfo(com.nad.bo.MemberInfo memberInfo) {
        this.memberInfo = memberInfo;
    }

    /**
     * 
     * @return
     *     returns PoliyInfo
     */
    public com.nad.bo.PoliyInfo getPolicyInfo() {
        return this.policyInfo;
    }

    /**
     * 
     * @param policyInfo
     *     the value for the policyInfo property
     */
    public void setPolicyInfo(com.nad.bo.PoliyInfo policyInfo) {
        this.policyInfo = policyInfo;
    }

}
