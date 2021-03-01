package com.contactDirectory.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.contactDirectory.Model.UserInfo;

public interface UserInfoDao extends JpaRepository<UserInfo,Integer>{

}
