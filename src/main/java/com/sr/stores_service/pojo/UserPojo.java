package com.sr.stores_service.pojo;

import com.sr.stores_service.entity.Store;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class UserPojo {
	
	private int userId;
	private String username;
	private String password;
	private int roleId;

}
