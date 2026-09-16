package in.ayush.crudSpringBoot.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;



@Entity
public class Student {
    @Id
    private Long id;

    private int roll;
    private String name;
    private String email;
    private String subject;
    private int age;

    // Constructors, getters, and setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public String getName() {
        return name;
    }

    public String getSubject() {
        return subject;
    }

    public int getAge() {
        return age;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}