package com.gzh.dao;

import com.gzh.entity.Teacher;
import com.gzh.entity.Teacher2;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * @author GZH
 * @date 2021-10-28
 */
public interface TeacherMapper {

    @Select("select * from teacher where id = #{id}")
    Teacher getTeacherById(@Param("id") int id);


    Teacher2 getTeacherById2(@Param("id") int id);

    Teacher2 getTeacherById3(@Param("id") int id);
}
