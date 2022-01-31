package sti.aaj.service.impl;

import sti.aaj.domain.Student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AajServiceImpl implements AajServiceImpl2 {
    private static ArrayList<Student> students;

    public AajServiceImpl() {
        fillStudentList();
    }

    private static List<Student> fillStudentList() {
        students.add(new Student("Jonas", "Wadin"));
        students.add(new Student("Jon", "Karlsson"));
        students.add(new Student("Anna", "Fle"));

        return students;
    }

    @Override
    public List<String> getStudents(String name) {
        return Arrays.asList(
                students.get(0).toString(),
                students.get(1).toString(),
                students.get(2).toString());
    }
}
