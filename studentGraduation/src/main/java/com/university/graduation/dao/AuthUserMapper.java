package com.university.graduation.dao;


import com.university.graduation.domain.bo.AuthUser;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.dao.DataAccessException;

import java.util.List;

@Mapper
public interface AuthUserMapper {

    int deleteByPrimaryKey(String uid) throws DataAccessException;

    int deleteByUsername(String username) throws DataAccessException;
    int insert(AuthUser record) throws DataAccessException;

    int insertSelective(AuthUser record) throws DataAccessException;

    AuthUser selectByPrimaryKey(String uid) throws DataAccessException;

    AuthUser selectByUsername(String username)throws DataAccessException;

    AuthUser selectByPhoneNumber(String phoneNumber)throws DataAccessException;

    AuthUser selectByEmail(String email)throws DataAccessException;

    int updateByPrimaryKeySelective(AuthUser record) throws DataAccessException;

    int updateByPrimaryKey(AuthUser record) throws DataAccessException;

    String selectUserRoles(String appId) throws DataAccessException;

    AuthUser selectByUniqueKey(String appId) throws DataAccessException;

    List<AuthUser> selectUserList() throws DataAccessException;

    List<AuthUser> selectUserListByRoleId(Integer roleId) throws DataAccessException;

    List<AuthUser> selectUserListExtendByRoleId(Integer roleId) throws DataAccessException;
}