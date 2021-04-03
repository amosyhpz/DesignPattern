package com.yuhuizhao.designPattern.j2ee.dataAccessObject;

import java.util.List;

public interface StudentDao {

    List<Student> getAllStudents();

    Student getStudent(int rollNo);

    void updateStudent(Student student);

    void deleteStudent(Student student);

}
