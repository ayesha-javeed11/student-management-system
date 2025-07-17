package net.studentmanagementsystem.repository;

import net.studentmanagementsystem.entity.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeacherRepository extends JpaRepository<Teacher, Long> {
    // You can add custom queries here if needed
}
