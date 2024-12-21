package com.microservice.demoservice.service;

import com.microservice.demoservice.model.DemoServiceModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DemoSevice {

    @Autowired
    DemoServiceModel demoServiceModel;

    public DemoServiceModel getDemoService(){
        demoServiceModel.setResourceid(12345);
        demoServiceModel.setFirstname("-");
        demoServiceModel.setLastname("-");
        demoServiceModel.setPhone("123 675 3456");
        demoServiceModel.setAddress("#250 South Street");
        demoServiceModel.setCity("Boston");
        demoServiceModel.setCountry("USA");
        demoServiceModel.setZipcode("03110");

        return demoServiceModel;
    }
}
