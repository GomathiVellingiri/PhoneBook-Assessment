package com.contactDirectory.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.contactDirectory.Model.UserContact;
import com.contactDirectory.Model.UserInfo;
import com.contactDirectory.Model.UserResponse;
import com.contactDirectory.Service.UserContactService;

@RestController
public class UserContactController {
@Autowired UserContactService service;
@PostMapping("/SaveUserContact")
public UserResponse saveUserContact(@RequestBody UserContact contact)
{
	UserResponse response =new UserResponse();
	UserContact contactObject=new UserContact();
	response=service.saveUserContact(contact);
	return response;
	
}
@GetMapping("/getAllUsersContacts")
public List<UserContact> getAllUsers(){
List<UserContact> users=new ArrayList<UserContact>();
return users=service.getAllUsersContacts();
}
@PostMapping("deleteUserContact")
public void deleteUser(@RequestBody UserContact info)
{ 
Integer id=info.getContactId();
service.delectUserContact(id);
}
@PostMapping("/updateUserContact")
public UserContact updateUserContact(@RequestBody UserContact user)
{
	UserContact userObject=new UserContact();
	userObject=service.updateContactById(user);
	return userObject;
	
}
}
