package com.sr.stores_service.pojo;

import com.sr.stores_service.entity.Store;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@AllArgsConstructor
@NoArgsConstructor
@Data
public class StorePojo {
	private int storeId;
	private String storeName;
	private int regionId;
	private int userId;
	
	private RegionPojo regionPojo;
	
	

}
