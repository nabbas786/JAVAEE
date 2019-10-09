package com.nad.bo;


public class PolicyRegistrationDetails  implements java.io.Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private java.lang.String registrationNumber;

    private java.lang.String policyDetails;

    public PolicyRegistrationDetails() {
    }

    public PolicyRegistrationDetails(
           java.lang.String registrationNumber,
           java.lang.String policyDetails) {
           this.registrationNumber = registrationNumber;
           this.policyDetails = policyDetails;
    }

	public java.lang.String getRegistrationNumber() {
		return registrationNumber;
	}

	public void setRegistrationNumber(java.lang.String registrationNumber) {
		this.registrationNumber = registrationNumber;
	}

	public java.lang.String getPolicyDetails() {
		return policyDetails;
	}

	public void setPolicyDetails(java.lang.String policyDetails) {
		this.policyDetails = policyDetails;
	}


   

}
