/**
 * Fdservice.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fdservice.service;

public interface Fdservice extends java.rmi.Remote {
    public double calculateFD(double amount, int noOfDays, int ageOfACHolder) throws java.rmi.RemoteException;
}
