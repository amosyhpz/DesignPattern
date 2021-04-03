package com.yuhuizhao.designPattern.j2ee.businessDelegate;

public class BusinessLookUp {
    public BusinessService getBusinessService(String serviceType) {
        if ("EJB".equalsIgnoreCase(serviceType)) {
            return new EJBService();
        } else {
            return new JMSService();
        }
    }
}
