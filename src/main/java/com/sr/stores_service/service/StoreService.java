package com.sr.stores_service.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sr.stores_service.dao.StoreRepository;
import com.sr.stores_service.entity.Store;

@Service
public class StoreService {
	
	@Autowired
	StoreRepository storeRepository;
	
	public List<Store> getAllStores(){
		
		return storeRepository.findAll();
		
	}
	
	public Optional<Store> getAStore(int storeId) {
		return storeRepository.findById(storeId);
	}
	
	public Store addStore(Store newStore) {
		return storeRepository.saveAndFlush(newStore);
	}
	
	public Store updateStore(Store editStore) {
		return storeRepository.save(editStore);
	}
	
	public void deleteStore(int storeId) {
		storeRepository.deleteById(storeId);
	}

}
