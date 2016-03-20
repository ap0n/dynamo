/**
 * DescribeSObjects.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.apatar.salesforcecom.ws;

public class DescribeSObjects  implements java.io.Serializable {
    private java.lang.String[] sObjectType;

    public DescribeSObjects() {
    }

    public DescribeSObjects(
           java.lang.String[] sObjectType) {
           this.sObjectType = sObjectType;
    }


    /**
     * Gets the sObjectType value for this DescribeSObjects.
     * 
     * @return sObjectType
     */
    public java.lang.String[] getSObjectType() {
        return sObjectType;
    }


    /**
     * Sets the sObjectType value for this DescribeSObjects.
     * 
     * @param sObjectType
     */
    public void setSObjectType(java.lang.String[] sObjectType) {
        this.sObjectType = sObjectType;
    }

    public java.lang.String getSObjectType(int i) {
        return this.sObjectType[i];
    }

    public void setSObjectType(int i, java.lang.String _value) {
        this.sObjectType[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DescribeSObjects)) return false;
        DescribeSObjects other = (DescribeSObjects) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.sObjectType==null && other.getSObjectType()==null) || 
             (this.sObjectType!=null &&
              java.util.Arrays.equals(this.sObjectType, other.getSObjectType())));
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
        if (getSObjectType() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSObjectType());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSObjectType(), i);
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
        new org.apache.axis.description.TypeDesc(DescribeSObjects.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", ">describeSObjects"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SObjectType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "sObjectType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
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