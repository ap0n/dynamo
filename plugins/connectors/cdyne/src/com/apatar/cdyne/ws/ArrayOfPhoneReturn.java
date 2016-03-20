/**
 * ArrayOfPhoneReturn.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package com.apatar.cdyne.ws;

public class ArrayOfPhoneReturn  implements java.io.Serializable {
    private com.apatar.cdyne.ws.PhoneReturn[] phoneReturn;

    public ArrayOfPhoneReturn() {
    }

    public ArrayOfPhoneReturn(
           com.apatar.cdyne.ws.PhoneReturn[] phoneReturn) {
           this.phoneReturn = phoneReturn;
    }


    /**
     * Gets the phoneReturn value for this ArrayOfPhoneReturn.
     * 
     * @return phoneReturn
     */
    public com.apatar.cdyne.ws.PhoneReturn[] getPhoneReturn() {
        return phoneReturn;
    }


    /**
     * Sets the phoneReturn value for this ArrayOfPhoneReturn.
     * 
     * @param phoneReturn
     */
    public void setPhoneReturn(com.apatar.cdyne.ws.PhoneReturn[] phoneReturn) {
        this.phoneReturn = phoneReturn;
    }

    public com.apatar.cdyne.ws.PhoneReturn getPhoneReturn(int i) {
        return this.phoneReturn[i];
    }

    public void setPhoneReturn(int i, com.apatar.cdyne.ws.PhoneReturn _value) {
        this.phoneReturn[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfPhoneReturn)) return false;
        ArrayOfPhoneReturn other = (ArrayOfPhoneReturn) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.phoneReturn==null && other.getPhoneReturn()==null) || 
             (this.phoneReturn!=null &&
              java.util.Arrays.equals(this.phoneReturn, other.getPhoneReturn())));
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
        if (getPhoneReturn() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPhoneReturn());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPhoneReturn(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ArrayOfPhoneReturn.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.cdyne.com/PhoneVerify/query", "ArrayOfPhoneReturn"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("phoneReturn");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.cdyne.com/PhoneVerify/query", "PhoneReturn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.cdyne.com/PhoneVerify/query", "PhoneReturn"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
