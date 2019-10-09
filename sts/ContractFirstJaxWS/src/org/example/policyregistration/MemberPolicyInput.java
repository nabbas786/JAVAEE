
package org.example.policyregistration;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Member" type="{http://www.example.org/PolicyRegistration/}memberInfo"/>
 *         &lt;element name="Policy" type="{http://www.example.org/PolicyRegistration/}policyInfo"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "member",
    "policy"
})
@XmlRootElement(name = "MemberPolicyInput")
public class MemberPolicyInput {

    @XmlElement(name = "Member", required = true)
    protected MemberInfo member;
    @XmlElement(name = "Policy", required = true)
    protected PolicyInfo policy;

    /**
     * Gets the value of the member property.
     * 
     * @return
     *     possible object is
     *     {@link MemberInfo }
     *     
     */
    public MemberInfo getMember() {
        return member;
    }

    /**
     * Sets the value of the member property.
     * 
     * @param value
     *     allowed object is
     *     {@link MemberInfo }
     *     
     */
    public void setMember(MemberInfo value) {
        this.member = value;
    }

    /**
     * Gets the value of the policy property.
     * 
     * @return
     *     possible object is
     *     {@link PolicyInfo }
     *     
     */
    public PolicyInfo getPolicy() {
        return policy;
    }

    /**
     * Sets the value of the policy property.
     * 
     * @param value
     *     allowed object is
     *     {@link PolicyInfo }
     *     
     */
    public void setPolicy(PolicyInfo value) {
        this.policy = value;
    }

}
