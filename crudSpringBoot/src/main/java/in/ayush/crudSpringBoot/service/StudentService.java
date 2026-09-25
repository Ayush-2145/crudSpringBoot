package in.ayush.crudSpringBoot.service;

import in.ayush.crudSpringBoot.entity.Student;
import in.ayush.crudSpringBoot.repository.StudentRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;



@Service
public class StudentService {

    private StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    // Service methods for student operations can be added here

    //2.Business Logic(Student Service)

    public Student createStudent(Student student) {
        // Implement the logic to create a student
        Student studentResp = studentRepository.save(student); // Assuming you have a save method in StudentRepository
        return studentResp; 
    }

    public Student getStudent(Long id) {
        // Implement the logic to get a student by ID
        return studentRepository.findById(id).orElse(null); // Assuming you have a findById method in StudentRepository
    }

    public Student updateStudent(Long id, Student student) {
        // Implement the logic to update a student
        Student existingStudent = studentRepository.findById(id).orElse(null);
        if (existingStudent != null) {
            // Update the fields of existingStudent with values from student
            existingStudent.setName(student.getName());
            existingStudent.setEmail(student.getEmail());
            existingStudent.setSubject(student.getSubject());
            existingStudent.setAge(student.getAge());
            return studentRepository.save(existingStudent);
        }
        return null;
    }

    public void deleteStudent(Long id) {
        // Implement the logic to delete a student
        studentRepository.deleteById(id);
    }

    //3.Interact with DB to store student data(Student Repository)

    //4.Response back to client (Postman)
}