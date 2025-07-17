package net.studentmanagementsystem;

import net.studentmanagementsystem.entity.Student;
import net.studentmanagementsystem.entity.Teacher;
import net.studentmanagementsystem.repository.StudentRepository;
import net.studentmanagementsystem.repository.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentTeacherManagementSystemApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(StudentTeacherManagementSystemApplication.class, args);
	}

	@Autowired
	private StudentRepository studentRepository;

	@Autowired
	private TeacherRepository teacherRepository;

	@Override
	public void run(String... args) throws Exception {

		// --- Adding Students ---
		studentRepository.save(new Student("Ayesha", "Javeed", "ayeshajav12@gmail.com"));
		studentRepository.save(new Student("Saba", "Khan", "saba@gmail.com"));
		studentRepository.save(new Student("John", "Smith", "john@gmail.com"));
		studentRepository.save(new Student("Ishaan", "Kishan", "ishaan@gmail.com"));
		studentRepository.save(new Student("Dinesh", "Rawat", "dinesh@gmail.com"));

		// --- Adding Teachers ---
		teacherRepository.save(new Teacher("Prof. Arjun", "Maths", "arjun.maths@school.com"));
		teacherRepository.save(new Teacher("Dr. Sharma", "Physics", "sharma.physics@school.com"));
		teacherRepository.save(new Teacher("Ms. Meera", "Chemistry", "meera.chem@school.com"));
		teacherRepository.save(new Teacher("Mr. Rohan", "Biology", "rohan.bio@school.com"));
		teacherRepository.save(new Teacher("Mrs. Kapoor", "English", "kapoor.eng@school.com"));
	}
}
