package in.ayush.crudSpringBoot.controller;
import in.ayush.crudSpringBoot.entity.Student;
import in.ayush.crudSpringBoot.service.StudentService;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;





@RestController
@RequestMapping("/api/students")
public class StudentController{
   //1.Listen end-points(/api/students POST, GET, PUT, DELETE)(Student Controller)

   private StudentService studentService;

   public StudentController(StudentService studentService) {
       this.studentService = studentService;
   }

   //create Student (POST)
   @PostMapping
   public ResponseEntity<Student> createStudent(@RequestBody Student student) {
       Student createdStudent = studentService.createStudent(student);
       return ResponseEntity.ok(createdStudent);
   }

   //read Student (GET)

//    public List<Student> getAllStudents(){
       
//    }
   

   //update Student (PUT)

   //delete Student (DELETE)

 
}