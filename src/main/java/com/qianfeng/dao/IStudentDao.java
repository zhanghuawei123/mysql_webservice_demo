package com.qianfeng.dao;

import com.qianfeng.entity.Student;

import java.util.List;

public interface IStudentDao {
    List<Student> queryAll();
}
