package codevelhope.SpringBoot.model;

import jakarta.persistence.*;


@Entity
public class Exercise {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long submissionId;
    private long exerciseId;
    private long studentId;
    private int marks;

    public Exercise(long submissionId, int marks, long studentId, long exerciseId) {
        this.submissionId = submissionId;
        this.marks = marks;
        this.studentId = studentId;
        this.exerciseId = exerciseId;
    }

    public Exercise() {
    }

    public long getExerciseId() {
        return exerciseId;
    }

    public long getStudentId() {
        return studentId;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }
}
