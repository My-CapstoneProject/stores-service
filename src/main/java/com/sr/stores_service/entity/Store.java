package com.sr.stores_service.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name="store_details")
public class Store {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="store_id")
	private int storeId;
	
	@Column(name="store_name")
	private String storeName;
	
	@Column(name="store_region_id")
	private int storeRegionId;
	
	@Column(name="store_user_id")
	private int storeUserId;
	
	@Column(name="region_name")
	private String regionName;
	

}
