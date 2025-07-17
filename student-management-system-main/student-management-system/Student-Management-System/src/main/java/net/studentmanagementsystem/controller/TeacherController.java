package net.studentmanagementsystem.controller;

import net.studentmanagementsystem.entity.Teacher;
import net.studentmanagementsystem.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/teachers")
public class TeacherController {

    @Autowired
    private TeacherService teacherService;

    @GetMapping
    public String listTeachers(Model model) {
        model.addAttribute("teachers", teacherService.getAllTeachers());
        return "teachers";
    }

    @GetMapping("/new")
    public String createTeacherForm(Model model) {
        Teacher teacher = new Teacher();
        model.addAttribute("teacher", teacher);
        return "create_teacher";
    }

    @PostMapping
    public String saveTeacher(@ModelAttribute("teacher") Teacher teacher) {
        teacherService.saveTeacher(teacher);
        return "redirect:/teachers";
    }

    @GetMapping("/edit/{id}")
    public String editTeacherForm(@PathVariable Long id, Model model) {
        model.addAttribute("teacher", teacherService.getTeacherById(id));
        return "edit_teacher";
    }

    @PostMapping("/{id}")
    public String updateTeacher(@PathVariable Long id, @ModelAttribute("teacher") Teacher teacher) {
        Teacher existing = teacherService.getTeacherById(id);
        existing.setFirstName(teacher.getFirstName());
        existing.setLastName(teacher.getLastName());
        existing.setEmail(teacher.getEmail());
        teacherService.saveTeacher(existing);
        return "redirect:/teachers";
    }

    @GetMapping("/{id}")
    public String deleteTeacher(@PathVariable Long id) {
        teacherService.deleteTeacherById(id);
        return "redirect:/teachers";
    }
}