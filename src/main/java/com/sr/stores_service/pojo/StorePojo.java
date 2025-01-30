package com.sr.stores_service.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class StorePojo {
    private int storeId;         
    private String storeName;    
    private int storeUserId;    
    private String regionName;  
}
