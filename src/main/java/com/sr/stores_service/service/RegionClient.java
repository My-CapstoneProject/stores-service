package com.sr.stores_service.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.sr.stores_service.pojo.RegionPojo;

//@FeignClient(name = "region-service", url = "http://region-service:8081/api")  // URL of the Department Service
public interface RegionClient {

    // Endpoint to fetch department details by department ID
//    @GetMapping("/regions/{id}")
//    RegionPojo getDepartmentById(@PathVariable("id") int regionId);
}

