package com.yuhuizhao.designPattern.j2ee.serviceLocator;

public class ServiceLocator {
    private static Cache cache;

    static {
        cache = new Cache();
    }

    public static Service getService(String jndiName) {

        Service cacheService = cache.getService(jndiName);

        if (cacheService != null) {
            return cacheService;
        }

        InitialContext context = new InitialContext();
        Service service = (Service) context.lookup(jndiName);
        cache.addService(service);
        return service;
    }
}
