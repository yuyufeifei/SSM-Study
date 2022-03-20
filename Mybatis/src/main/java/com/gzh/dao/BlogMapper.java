package com.gzh.dao;

import com.gzh.entity.Blog;

import java.util.List;
import java.util.Map;

/**
 * @author GZH
 * @date 2021-10-29
 */
public interface BlogMapper {

    List<Blog> queryBlogIf(Map<String, Object> map);

    List<Blog> queryBlogChoose(Map<String, Object> map);

    int updateBlog(Map<String, Object> map);

    List<Blog> queryBlogForeach(Map<String, Object> map);
}
