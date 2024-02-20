package utils;
import enums.StudentComparatorType;
import enums.UniversityComparatorType;
import models.Student;
import models.University;

import java.util.Comparator;

public class ComparatorUtil {
    public static Comparator<Student> getStudentComparator(StudentComparatorType comparatorType) {
        switch (comparatorType) {
            case FULL_NAME:
                return Comparator.comparing(Student::getFullName);
            case UNIVERSITY_ID:
                return Comparator.comparing(Student::getUniversityId);
            case CURRENT_COURSE_NUMBER:
                return Comparator.comparingInt(Student::getCurrentCourseNumber);
            case AVG_EXAM_SCORE:
                return (s1, s2) -> Float.compare(s2.getAvgExamScore(), s1.getAvgExamScore());
            default:
                throw new IllegalArgumentException("Unknown comparator type for student: " + comparatorType);
        }
    }

    public static Comparator<University> getUniversityComparator(UniversityComparatorType comparatorType) {
        switch (comparatorType) {
            case FULL_NAME:
                return Comparator.comparing(University::getFullName);
            case SHORT_NAME:
                return Comparator.comparing(University::getShortName);
            case YEAR_OF_FOUNDATION:
                return Comparator.comparingInt(University::getYearOfFoundation);
            case MAIN_PROFILE:
                return Comparator.comparing(university -> university.getMainProfile().getProfileName());
            default:
                throw new IllegalArgumentException("Unknown comparator type for university: " + comparatorType);
        }
    }
}
