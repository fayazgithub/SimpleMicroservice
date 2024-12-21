package com.microservice.demoservice.controller;

import com.microservice.demoservice.model.DemoServiceModel;
import com.microservice.demoservice.service.DemoSevice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/")

public class DemoServiceController {

    @Autowired
    DemoServiceModel demoServiceModel;

    @Autowired
    DemoSevice demoSevice;


    @GetMapping(value = "/demoservice")
    public DemoServiceModel getDemoService() {
            demoServiceModel = demoSevice.getDemoService(123);
            return demoServiceModel;
    }

}
