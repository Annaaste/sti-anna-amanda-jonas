package sti.aaj.service;

import sti.aaj.domain.Student;

import java.util.List;

public interface StiService {
    public List<Student> getStudents(String name);
}
