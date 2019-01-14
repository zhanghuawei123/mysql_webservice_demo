package com.qianfeng.controller;

import com.qianfeng.entity.Student;
import com.qianfeng.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/student")
public class StudentController {
    @Autowired
    private IStudentService studentService;

    /**
     * 查询学生信息
     * @return
     */
    @RequestMapping("/query")
    public String queryAll(Model model){
        List<Student> studentList=studentService.queryAll();
        model.addAttribute("studentList",studentList);
        return "studentShow";
    }

    @RequestMapping("/test")
    @ResponseBody
    public List<Student> test(){


        return studentService.queryAll();
    }

}
