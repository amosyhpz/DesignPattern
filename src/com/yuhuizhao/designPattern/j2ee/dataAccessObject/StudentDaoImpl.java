package com.yuhuizhao.designPattern.j2ee.dataAccessObject;

import java.util.ArrayList;
import java.util.List;

public class StudentDaoImpl implements StudentDao {

    // 列表当作是一个数据库
    List<Student> students;

    public StudentDaoImpl() {
        students = new ArrayList<>();
        students.add(new Student("Robert", 0));
        students.add(new Student("John", 1));
    }

    @Override
    public List<Student> getAllStudents() {
        return students;
    }

    @Override
    public Student getStudent(int rollNo) {
        return students.get(rollNo);
    }

    @Override
    public void updateStudent(Student student) {
        students.get(student.getRollNo()).setName(student.getName());
        System.out.println("Student: Roll No " + student.getRollNo() + ", updated in the database");
    }

    @Override
    public void deleteStudent(Student student) {
        students.remove(student);
        System.out.println("Student: Roll No " + student.getRollNo() + ", deleted from database");
    }
}
