package com.yuhuizhao.designPattern.j2ee.transferObject;

import java.util.ArrayList;
import java.util.List;

public class StudentBO {

    // 列表是当作一个数据库
    List<StudentVO> students;

    public StudentBO() {
        students = new ArrayList<>();

        StudentVO student1 = new StudentVO("Robert", 0);
        StudentVO student2 = new StudentVO("John", 1);

        students.add(student1);
        students.add(student2);
    }

    public void deleteStudent(StudentVO student) {
        students.remove(student.getRollNo());
        System.out.println("Student: Roll No " + student.getRollNo() + ", deleted from database");
    }

    // 从数据库中检索学生名单
    public List<StudentVO> getAllStudents() {
        return students;
    }

    public StudentVO getStudent(int rollNo) {
        return students.get(rollNo);
    }

    public void updateStudent(StudentVO studentVO) {
        students.get(studentVO.getRollNo()).setName(studentVO.getName());
        System.out.println("Student: Roll No" + studentVO.getRollNo() + ", updated in the database");
    }
}
