package com.ssm.www.mapper;

import com.ssm.www.Entity.User;

public interface UserMapper {

    User GetUserByID(Integer id) throws Exception;

}
