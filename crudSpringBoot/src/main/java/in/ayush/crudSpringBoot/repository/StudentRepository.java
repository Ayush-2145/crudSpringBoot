package in.ayush.crudSpringBoot.repository;
import org.springframework.stereotype.Component;
import in.ayush.crudSpringBoot.entity.Student;
import org.springframework.stereotype.Repository;


@Repository
public class StudentRepository {
    //3.Interact with DB to store student data(Student Repository)

    public Student saveStudent(Student student) {
        // Implement the logic to save the student to the database
        Student s1 = new Student();
        s1.setName("Aditya");
        s1.setAge(28);
        s1.setEmail("aditya@gmail.com");
        s1.setRoll(101);
        s1.setSubject("Java");

        return s1;
    }

    
}