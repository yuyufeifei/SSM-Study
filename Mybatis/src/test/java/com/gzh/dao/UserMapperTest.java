package com.gzh.dao;

import com.gzh.entity.User;
import com.gzh.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author GZH
 * @date 2021-10-23
 */
public class UserMapperTest {

    static Logger logger = Logger.getLogger(UserMapperTest.class);

    @Test
    public void getUserList(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> userList = mapper.getUserList();
        for (User user : userList) {
            logger.info(user);
        }

        sqlSession.close();
    }

    @Test
    public void getUserById() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = mapper.getUserById(1);
        System.out.println(user);

        sqlSession.close();
    }

    @Test
    public void addUser() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        int result = mapper.addUser(new User(7, "水电费", "4544", "999@163.com"));
        System.out.println(result);
        sqlSession.commit();

        sqlSession.close();
    }

    @Test
    public void addUserMap() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("userId", "6");
        map.put("userName", "双方的");
        map.put("userPwd", "666");
        map.put("userEmail", "453@qq.com");
        int result = mapper.addUserMap(map);
        System.out.println(result);
        sqlSession.commit();

        sqlSession.close();
    }

    @Test
    public void updateUser() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        int result = mapper.updateUser(new User(4, "哈哈1", "246", "246@163.com"));
        System.out.println(result);
        sqlSession.commit();

        sqlSession.close();
    }

    @Test
    public void deleteUser() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        int result = mapper.deleteUser(3);
        System.out.println(result);
        sqlSession.commit();

        sqlSession.close();
    }

    @Test
    public void TestLog4j() {
        logger.info("info");
        logger.debug("debug");
        logger.error("error");
    }
}
