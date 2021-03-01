package com.contactDirectory.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.contactDirectory.Model.UserInfo;
import com.contactDirectory.Model.UserResponse;
import com.contactDirectory.Service.UserInfoService;

@RestController
public class UserInfoController {
	@Autowired
	UserInfoService service;

	@PostMapping("/saveUserInfo")
	public UserResponse addNewUser(@RequestBody UserInfo user) {
		UserResponse userObject = new UserResponse();
		userObject = service.addNewUser(user);
		return userObject;

	}

	@GetMapping("/getAllUsers")
	public List<UserInfo> getAllUsers() {
		List<UserInfo> users = new ArrayList<UserInfo>();
		return users = service.getAllUsers();
	}

	@PostMapping("deleteUser")
	public void deleteUser(@RequestBody UserInfo info) {
		Integer id = info.getUserId();
		service.delectUser(id);
	}

	@PostMapping("/updateUserInfo")
	public UserInfo updateUser(@RequestBody UserInfo user) {
		UserInfo userObject = new UserInfo();
		Integer id = user.getUserId();
		userObject = service.updateById(user);
		return userObject;

	}
}
