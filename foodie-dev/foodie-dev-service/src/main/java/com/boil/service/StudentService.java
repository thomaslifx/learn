package com.boil.service;

import com.boil.pojo.Student;

/**
 * @author lifuxiang
 * @Description
 * @date 2020/10/29 13:04
 */
public interface StudentService {

    public Student getStudentInfo(int id);

    public void saveStudent();

    public void updateStudent(int id);

    public void deleteStudent(int id);

    void saveParent();
    void saveChildren();
}
