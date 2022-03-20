package com.gzh.mapper;

import com.gzh.entity.User;
import org.mybatis.spring.SqlSessionTemplate;

import java.util.List;

/**
 * @author GZH
 * @date 2021-11-19
 */
public class UserMapperImpl implements UserMapper {

    private SqlSessionTemplate sqlSession;

    public void setSqlSession(SqlSessionTemplate sqlSession) {
        this.sqlSession = sqlSession;
    }

    @Override
    public List<User> getUserList() {
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        return mapper.getUserList();
    }
}
