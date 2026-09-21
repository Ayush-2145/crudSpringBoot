package in.ayush.crudSpringBoot.repository;
import org.springframework.stereotype.Component;
import in.ayush.crudSpringBoot.entity.Student;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;




@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
    //3.Interact with DB to store student data(Student Repository)



    
}