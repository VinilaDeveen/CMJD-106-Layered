/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.service;

import com.mysql.cj.result.DefaultValueFactory;
import edu.ijse.service.impl.ItemServiceImpl;

/**
 *
 * @author HP
 */
public class ServiceFactory {
    private static ServiceFactory serviceFactory;

    private ServiceFactory() {
    }
    
    public static ServiceFactory getInstance(){
        if (serviceFactory == null) {
            serviceFactory = new ServiceFactory();
        }
        return serviceFactory;
    }
    
    public SuperService getService(ServiceType serviceType){
        switch(serviceType){
                case ITEM:
                    return new ItemServiceImpl();
                default:
                    return null;
        }
    }
    
    public enum ServiceType{
        ITEM
    }
    
}
