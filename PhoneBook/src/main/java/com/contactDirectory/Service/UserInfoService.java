package com.contactDirectory.Service;

import java.util.List;

import com.contactDirectory.Model.UserInfo;
import com.contactDirectory.Model.UserResponse;

public interface UserInfoService {
	UserResponse addNewUser(UserInfo user);

	List<UserInfo> getAllUsers();

	void delectUser(Integer id);

	UserInfo updateById(UserInfo id);

}
