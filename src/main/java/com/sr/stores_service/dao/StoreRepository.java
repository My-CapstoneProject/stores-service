package com.sr.stores_service.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sr.stores_service.entity.Store;

@Repository
public interface StoreRepository extends JpaRepository<Store, Integer>{

}
