package com.sr.stores_service.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.sr.stores_service.pojo.RegionPojo;

@FeignClient(name = "region-service", url = "http://localhost:9001/api")
public interface RegionClient {
	   @GetMapping("/regions/{regionId}")
	   RegionPojo getRegionById(@PathVariable int regionId);

}

