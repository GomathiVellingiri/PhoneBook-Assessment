package com.contactDirectory.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.contactDirectory.Model.UserContact;

public interface UserContactDao extends JpaRepository<UserContact,Integer>{

}
