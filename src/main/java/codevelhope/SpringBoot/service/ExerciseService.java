package codevelhope.SpringBoot.service;

import codevelhope.SpringBoot.model.Exercise;
import codevelhope.SpringBoot.repoditory.ExerciseRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExerciseService {
    @Autowired
    private ExerciseRepo exerciseRepo;

    public Exercise addExercise(Exercise exercise) {
        if (exerciseRepo.existsByExerciseIdAndStudentId(exercise.getExerciseId(), exercise.getStudentId())) {
            throw new IllegalArgumentException("Exercise already submitted by this student.");
        }
        return exerciseRepo.save(exercise);
    }

    public List<Exercise> getExercisesByStudentId(Long studentId) {
        return exerciseRepo.findByStudentId(studentId);
    }

    public Exercise updateExerciseMarks(Long submissionId, int marks) {
        Exercise exercise = exerciseRepo.findById(submissionId)
                .orElseThrow(() -> new IllegalArgumentException("Exercise not found"));
        exercise.setMarks(marks);
        return exerciseRepo.save(exercise);
    }

    public long countExercisesByStudentId(Long studentId) {
        return exerciseRepo.findByStudentId(studentId).size();
    }
}
