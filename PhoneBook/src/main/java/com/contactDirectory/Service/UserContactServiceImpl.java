package com.contactDirectory.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.contactDirectory.CustomException.ContactDirectoryException;
import com.contactDirectory.DAO.UserContactDao;
import com.contactDirectory.DAO.UserInfoDao;
import com.contactDirectory.Model.UserContact;
import com.contactDirectory.Model.UserInfo;
import com.contactDirectory.Model.UserResponse;
import com.contactDirectory.util.CommonUtil;

@Service
public class UserContactServiceImpl implements UserContactService {
	@Autowired
	UserContactDao dao;
	@Autowired
	UserInfoDao userInfodao;

	@Override
	public UserResponse saveUserContact(UserContact contact) {
		UserContact contactObject = new UserContact();
		UserResponse response = new UserResponse();
		try {
			Optional<UserInfo> info = userInfodao.findById(contact.getUser().getUserId());
			UserInfo user = info.get();
			if (!(CommonUtil.validateMobileNumber(contact.getPhoneNumber())) && (contact.getPhoneNumber() != null)) {
				throw new ContactDirectoryException("Invalid Mobile Number...!!!");
			}
			if (!(CommonUtil.validateMobileNumber(contact.getAlternateNumber())) && (contact.getAlternateNumber() != null)) {
				throw new ContactDirectoryException("Invalid Mobile Number...!!!");
			}
			contactObject.setPhoneNumber(contact.getPhoneNumber());
			contactObject.setAlternateNumber(contact.getAlternateNumber());
			Integer userId = user.getUserId();
			contactObject.setUser(user);
			dao.save(contactObject);
			if (contactObject != null) {
				response.setSuccessCode("200");
				response.setSusscessMessage("User contacts Saved Sucessfully.....!!!!!");
			}
		} catch (ContactDirectoryException e) {
			response.setFailureCode("400");
			response.setFailureMessage("Cannot insert User Contact details..!!!!");
		}
		return response;
	}

	@Override
	public List<UserContact> getAllUsersContacts() {
		List<UserContact> users = new ArrayList<UserContact>();
		users = dao.findAll();
		return users;
	}

	@Override
	public void delectUserContact(Integer id) {
		dao.deleteById(id);
		
	}

	@Override
	public UserContact updateContactById(UserContact id) {
		Optional<UserContact> info=dao.findById(id.getContactId());
		UserContact user=info.get();
		user.setPhoneNumber(id.getPhoneNumber());
		user.setAlternateNumber(id.getAlternateNumber());
		user=dao.save(user);
		return user;
	}
}
