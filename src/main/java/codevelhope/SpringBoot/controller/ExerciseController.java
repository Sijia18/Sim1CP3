package codevelhope.SpringBoot.controller;

import codevelhope.SpringBoot.model.Exercise;
import codevelhope.SpringBoot.service.ExerciseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/exercises")
public class ExerciseController {
    @Autowired
    private ExerciseService exerciseService;

    @PostMapping
    public Exercise addExercise(@RequestBody Exercise exercise){
        return exerciseService.addExercise(exercise);
    }

    @PutMapping("/{submissionId}/marks")
    public Exercise updateExerciseMarks(@PathVariable Long submissionId, @RequestParam int marks) {
        return exerciseService.updateExerciseMarks(submissionId, marks);
    }

    @GetMapping("/students/{studentId}")
    public List<Exercise> showExercisesByStudent(@PathVariable Long studentId) {
        return exerciseService.getExercisesByStudentId(studentId);
    }

    @GetMapping("/students/{studentId}/count")
    public long countExercisesByStudent(@PathVariable Long studentId) {
        return exerciseService.countExercisesByStudentId(studentId);
    }
}
