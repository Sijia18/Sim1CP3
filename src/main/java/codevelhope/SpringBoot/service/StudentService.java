package codevelhope.SpringBoot.service;

import codevelhope.SpringBoot.model.Student;
import codevelhope.SpringBoot.model.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    private StudentRepo studentRepo;

    public Student addStudent (Student student){
       return studentRepo.save(student);
    }

    public List<Student> showStudents() {
        return studentRepo.findAll();
    }
}
