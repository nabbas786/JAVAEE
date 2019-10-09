
package com.nad.sei.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "enrollResponse", namespace = "http://www.nad.com/policy/wsdl")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "enrollResponse", namespace = "http://www.nad.com/policy/wsdl")
public class EnrollResponse {

    @XmlElement(name = "return", namespace = "http://www.nad.com/policy/types")
    private com.nad.bo.PolicyRegistrationDetails _return;

    /**
     * 
     * @return
     *     returns PolicyRegistrationDetails
     */
    public com.nad.bo.PolicyRegistrationDetails getReturn() {
        return this._return;
    }

    /**
     * 
     * @param _return
     *     the value for the _return property
     */
    public void setReturn(com.nad.bo.PolicyRegistrationDetails _return) {
        this._return = _return;
    }

}
