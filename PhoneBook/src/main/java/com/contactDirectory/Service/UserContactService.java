package com.contactDirectory.Service;

import java.util.List;

import com.contactDirectory.Model.UserContact;
import com.contactDirectory.Model.UserInfo;
import com.contactDirectory.Model.UserResponse;

public interface UserContactService {
	UserResponse saveUserContact(UserContact contact);

	List<UserContact> getAllUsersContacts();

	void delectUserContact(Integer id);

	UserContact updateContactById(UserContact id);
}
