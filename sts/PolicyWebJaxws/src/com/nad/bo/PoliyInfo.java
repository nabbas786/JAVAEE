package com.nad.bo;


public class PoliyInfo  implements java.io.Serializable {
    private java.lang.String id;

    private java.lang.String policyName;

    public PoliyInfo() {
    }

    public PoliyInfo(
           java.lang.String id,
           java.lang.String policyName) {
           this.id = id;
           this.policyName = policyName;
    }


    /**
     * Gets the id value for this PoliyInfo.
     * 
     * @return id
     */
    public java.lang.String getId() {
        return id;
    }


    /**
     * Sets the id value for this PoliyInfo.
     * 
     * @param id
     */
    public void setId(java.lang.String id) {
        this.id = id;
    }


    /**
     * Gets the policyName value for this PoliyInfo.
     * 
     * @return policyName
     */
    public java.lang.String getPolicyName() {
        return policyName;
    }


    /**
     * Sets the policyName value for this PoliyInfo.
     * 
     * @param policyName
     */
    public void setPolicyName(java.lang.String policyName) {
        this.policyName = policyName;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PoliyInfo)) return false;
        PoliyInfo other = (PoliyInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.policyName==null && other.getPolicyName()==null) || 
             (this.policyName!=null &&
              this.policyName.equals(other.getPolicyName())));
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
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getPolicyName() != null) {
            _hashCode += getPolicyName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
   

}
