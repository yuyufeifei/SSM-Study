package com.gzh.entity;

import java.util.List;

/**
 * @author GZH
 * @date 2021-10-29
 */
public class Teacher2 {
    private int id;
    private String name;
    //一对多
    List<Student2> students;

    public Teacher2() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Student2> getStudents() {
        return students;
    }

    public void setStudents(List<Student2> students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "Teacher2{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", students=" + students +
                '}';
    }
}
