package com.boil.service.impl;

import com.boil.mapper.StudentMapper;
import com.boil.pojo.Student;
import com.boil.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Description    学生实现类
 * @author lifuxiang
 * @date 2020/10/29 14:17
 */
@Service
public class StuServiceIpl implements StudentService {

    @Autowired
    private StudentMapper studentMapper;

    @Transactional(propagation = Propagation.SUPPORTS)
    @Override
    public Student getStudentInfo(int id) {
        return studentMapper.selectByPrimaryKey(id);
    }

    @Transactional(propagation = Propagation.REQUIRED)
    @Override
    public void saveStudent() {
        Student student = new Student();
        student.setName("Jack");
        student.setAge(19);
        studentMapper.insert(student);
    }

    @Transactional(propagation = Propagation.REQUIRED)
    @Override
    public void updateStudent(int id) {
        Student student = new Student();
        student.setId(id);
        student.setName("lucy");
        student.setAge(20);
        studentMapper.updateByPrimaryKey(student);
    }

    @Transactional(propagation = Propagation.REQUIRED)
    @Override
    public void deleteStudent(int id) {
        studentMapper.deleteByPrimaryKey(id);
    }


    public void saveParent() {
        Student student = new Student();
        student.setName("parent");
        student.setAge(20);
        studentMapper.insert(student);
    }

    //@Transactional(propagation = Propagation.NEVER)
    public void saveChildren() {
        saveChild1();
        int a = 1/0;
        saveChild2();
    }


    private void saveChild1() {
        Student student = new Student();
        student.setName("child-1");
        student.setAge(11);
        studentMapper.insert(student);
    }


    private void saveChild2() {
        Student student = new Student();
        student.setName("child-2");
        student.setAge(16);
        studentMapper.insert(student);
    }
}
