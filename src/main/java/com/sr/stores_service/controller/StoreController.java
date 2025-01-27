package com.sr.stores_service.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;
import com.sr.stores_service.entity.Store;
import com.sr.stores_service.pojo.StorePojo;
import com.sr.stores_service.service.StoreService;

@RestController
@RequestMapping("/api")
public class StoreController {
		
		@Autowired
		StoreService storeService;
		
		@GetMapping("/stores")
		public ResponseEntity<List<Store>> getAllStores(){
			return new ResponseEntity<List<Store>>(storeService.getAllStores(),HttpStatus.OK);
		}
		@GetMapping("/stores/b/{sid}")
		public ResponseEntity<Optional<Store>> getStoreById(@PathVariable int sid){
			return new ResponseEntity<Optional<Store>>(storeService.getStoreById(sid),HttpStatus.OK);
		}
		@PostMapping("/stores")
		public ResponseEntity<Store> addStore(@RequestBody Store newStore){
			return new ResponseEntity<Store>(storeService.addStore(newStore),HttpStatus.OK);
		}
		@PutMapping("/stores")
		public ResponseEntity<Store> updateStore(@RequestBody Store editStore){
			return new ResponseEntity<Store>(storeService.updateStore(editStore),HttpStatus.OK);
		}
		
		@DeleteMapping("stores/{sid}")
		public ResponseEntity<Void> deleteStore(@PathVariable int sid){
			storeService.deleteStore(sid);
			return new ResponseEntity(HttpStatus.OK);
		}
		@GetMapping("/stores/{sid}")
		public ResponseEntity<Optional<Store>> getAStore(@PathVariable int sid){
			return new ResponseEntity<Optional<Store>>(storeService.getAStore(sid),HttpStatus.OK);
		}
}
		




	




