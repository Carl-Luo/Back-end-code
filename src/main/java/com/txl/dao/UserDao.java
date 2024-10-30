package com.txl.dao;


import com.txl.entity.Params;
import com.txl.entity.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

@Repository
public interface UserDao extends Mapper<User> {

    //1基于注解
   // @Select("select * from user")
    List<User> getUser();

    List<User> findBysearch(@Param("params") Params params);
}
