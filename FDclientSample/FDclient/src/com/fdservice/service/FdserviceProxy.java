package com.fdservice.service;

public class FdserviceProxy implements com.fdservice.service.Fdservice {
  private String _endpoint = null;
  private com.fdservice.service.Fdservice fdservice = null;
  
  public FdserviceProxy() {
    _initFdserviceProxy();
  }
  
  public FdserviceProxy(String endpoint) {
    _endpoint = endpoint;
    _initFdserviceProxy();
  }
  
  private void _initFdserviceProxy() {
    try {
      fdservice = (new com.fdservice.service.FdserviceServiceLocator()).getFdservice();
      if (fdservice != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)fdservice)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)fdservice)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (fdservice != null)
      ((javax.xml.rpc.Stub)fdservice)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.fdservice.service.Fdservice getFdservice() {
    if (fdservice == null)
      _initFdserviceProxy();
    return fdservice;
  }
  
  public double calculateFD(double amount, int noOfDays, int ageOfACHolder) throws java.rmi.RemoteException{
    if (fdservice == null)
      _initFdserviceProxy();
    return fdservice.calculateFD(amount, noOfDays, ageOfACHolder);
  }
  
  
}