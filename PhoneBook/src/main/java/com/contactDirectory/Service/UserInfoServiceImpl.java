package com.contactDirectory.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.contactDirectory.CustomException.ContactDirectoryException;
import com.contactDirectory.DAO.UserInfoDao;
import com.contactDirectory.Model.ResponseMessage;
import com.contactDirectory.Model.UserInfo;
import com.contactDirectory.Model.UserResponse;
import com.contactDirectory.util.CommonUtil;

@Service
public class UserInfoServiceImpl implements UserInfoService {
	@Autowired
	UserInfoDao dao;

	@Override
	public UserResponse addNewUser(UserInfo user) {
		UserResponse response = new UserResponse();
		UserInfo userObject = new UserInfo();
		try {
			if ((user.getFirstName()).isEmpty() && (user.getFirstName() != null)) {
				throw new ContactDirectoryException("First Name shouldn't be empty");
			}
			if ((user.getLastName()).isEmpty() && (user.getLastName() != null)) {
				throw new ContactDirectoryException("Last Name shouldn't be empty");
			}
			if (!(CommonUtil.isValidEmailAddress(user.getEmailId())) && (user.getEmailId() != null)) {
				throw new ContactDirectoryException("Invalid Email...!!!");
			}
			userObject.setFirstName(user.getFirstName());
			userObject.setLastName(user.getLastName());
			userObject.setEmailId(user.getEmailId());
			userObject = dao.save(userObject);
			if (userObject != null) {
				response.setSuccessCode("200");
				response.setSusscessMessage("User Details Saved Sucessfully.....!!!!!");
			}
		} catch (ContactDirectoryException e) {
			response.setFailureCode("400");
			response.setFailureMessage("Error Saving User Details........!!!!!!!!!!!!!");
		}
		return response;

	}

	@Override
	public List<UserInfo> getAllUsers() {
		List<UserInfo> users = new ArrayList<UserInfo>();
		users = dao.findAll();
		return users;
	}

	@Override
	public void delectUser(Integer id) {
		dao.deleteById(id);

	}

	@Override
	public UserInfo updateById(UserInfo id) {
		Optional<UserInfo> info = dao.findById(id.getUserId());
		UserInfo user = info.get();
		user.setEmailId(id.getEmailId());
		user.setFirstName(id.getFirstName());
		user.setLastName(id.getLastName());
		user = dao.save(user);
		return user;
	}

}
