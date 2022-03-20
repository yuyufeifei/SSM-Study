package com.gzh.dao;

import com.gzh.entity.User;
import org.apache.ibatis.annotations.*;

import java.util.List;
import java.util.Map;

/**
 * @author GZH
 * @date 2021-10-23
 */
public interface UserMapper {

    List<User> getUserList();

    User getUserById(int id);

    int addUser(User user);

    int addUserMap(Map<String, Object> map);

    int updateUser(User user);

    int deleteUser(int id);

//    使用注解需要在mybatis-config.xml文件中配置mapper->class，不需要在xxxMapper.xml中配置sql语句
    @Select("select * from user")
    List<User> getUserList1();

    @Select("select * from user where id = #{id}")
    User getUserById1(@Param("id") int id2);

    @Insert("insert into user (id, name, password, email) values (#{id}, #{name}, #{password}, #{email})")
    int addUser1(User user);

    @Update("update user set name = #{name}, password = #{password}, email = #{email} where id = #{id}")
    int updateUser1(User user);

    @Delete("delete from user where id = #{id2}")
    int deleteUser1(@Param("id2") int id);

}
