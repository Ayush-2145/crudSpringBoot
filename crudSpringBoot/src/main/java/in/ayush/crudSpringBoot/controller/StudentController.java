package in.ayush.crudSpringBoot.controller;

@RestController
@RequestMapping("/api/students")
public class StudentController{
   //1.Listen end-points(/api/students POST, GET, PUT, DELETE)(Student Controller)
   //create Student (POST)
   @PostMapping
   public void createStudent(@RequestBody Student student) {
       //2. Call Service Layer
   }

   //read Student (GET)

   public List<Student> getAllStudents(){

   }

   //update Student (PUT)

   //delete Student (DELETE)

 
}