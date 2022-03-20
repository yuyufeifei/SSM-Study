package com.gzh.dao;

import com.gzh.entity.Teacher;
import com.gzh.entity.Teacher2;
import com.gzh.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

/**
 * @author GZH
 * @date 2021-10-28
 */
public class TeacherMapperTest {

    @Test
    public void getTeacherById() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        TeacherMapper mapper = sqlSession.getMapper(TeacherMapper.class);
        Teacher teacher = mapper.getTeacherById(1);
        System.out.println(teacher);

        sqlSession.close();
    }

    @Test
    public void getTeacherById2() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        TeacherMapper mapper = sqlSession.getMapper(TeacherMapper.class);
        Teacher2 teacher = mapper.getTeacherById2(1);
        System.out.println(teacher);

        sqlSession.close();
    }

    @Test
    public void getTeacherById3() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        TeacherMapper mapper = sqlSession.getMapper(TeacherMapper.class);
        Teacher2 teacher = mapper.getTeacherById3(1);
        System.out.println(teacher);

        sqlSession.close();
    }

}