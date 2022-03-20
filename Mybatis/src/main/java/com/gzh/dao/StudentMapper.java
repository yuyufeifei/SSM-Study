package com.gzh.dao;

import com.gzh.entity.Student;

import java.util.List;

/**
 * @author GZH
 * @date 2021-10-28
 */
public interface StudentMapper {

    List<Student> getStudentList();

    List<Student> getStudentList2();
}
