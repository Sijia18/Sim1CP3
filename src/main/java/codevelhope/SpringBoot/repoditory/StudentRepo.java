package codevelhope.SpringBoot.repoditory;

import codevelhope.SpringBoot.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepo extends JpaRepository<Student, Long> {
}
