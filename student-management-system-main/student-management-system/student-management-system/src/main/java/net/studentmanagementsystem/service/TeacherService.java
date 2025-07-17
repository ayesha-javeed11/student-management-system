package net.studentmanagementsystem.service;

import net.studentmanagementsystem.entity.Teacher;
import java.util.List;

public interface TeacherService {
    List<Teacher> getAllTeachers();
    Teacher getTeacherById(Long id);
    void saveTeacher(Teacher teacher);
    void deleteTeacherById(Long id);
}
