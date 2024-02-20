package utils.student;

import models.Student;
import utils.UniversalComparator;

public class StudentAvgExamScoreComparator implements UniversalComparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        // Сравнение по убыванию
        return Float.compare(s2.getAvgExamScore(), s1.getAvgExamScore());
    }
}
