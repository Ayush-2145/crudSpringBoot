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

    //3.Interact with DB to store student data(Student Repository)

    //4.Response back to client (Postman)
}