package codevelhope.SpringBoot.model;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ExerciseRepo extends JpaRepository<Exercise, Long> {
    List<Exercise> findByStudentId(Long studentId);
    boolean existsByExerciseIdAndStudentId(Long exerciseId, Long studentId);
}
