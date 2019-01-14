package com.qianfeng.service.impl;

import com.qianfeng.dao.IStudentDao;
import com.qianfeng.entity.Student;
import com.qianfeng.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 业务层操作
 */
@Service
public class StudentServiceImpl implements IStudentService {
    @Autowired
    private IStudentDao studentDao;
    @Override
    public List<Student> queryAll() {
        return studentDao.queryAll();
    }
}
