import enums.StudentComparatorType;
import enums.StudyProfile;
import enums.UniversityComparatorType;
import models.Student;
import models.University;
import utils.ComparatorUtil;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Runner {
    public static void main(String[] args) {
        List<Student> students = generateRandomStudents(10);

        System.out.println("Cтуденты:");
        students.forEach(System.out::println);


        Comparator<Student> studentComparator = ComparatorUtil.getStudentComparator(StudentComparatorType.AVG_EXAM_SCORE);

        List<Student> sortedStudents = students.stream().sorted(studentComparator).collect(Collectors.toList());

        System.out.println("Отсортированные студенты по среднему баллу:");
        sortedStudents.forEach(System.out::println);
        System.out.println();

        List<University> universities = generateRandomUniversities(5);

        System.out.println("Университеты:");
        universities.forEach(System.out::println);


        Comparator<University> universityComparator = ComparatorUtil.getUniversityComparator(UniversityComparatorType.YEAR_OF_FOUNDATION);

        List<University> sortedUniversities = universities.stream().sorted(universityComparator).collect(Collectors.toList());

        System.out.println("Отсортированные университеты по году основания:");
        sortedUniversities.forEach(System.out::println);
    }

    private static List<Student> generateRandomStudents(int count) {
        List<Student> students = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < count; i++) {
            String fullName = "Student " + (i + 1);
            String universityId = "University " + (random.nextInt(5) + 1);
            int currentCourseNumber = random.nextInt(6) + 1;
            float avgExamScore = random.nextFloat() * 100;
            students.add(new Student(fullName, universityId, currentCourseNumber, avgExamScore));
        }
        return students;
    }

    private static List<University> generateRandomUniversities(int count) {
        List<University> universities = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < count; i++) {
            String id = "University " + (i + 1);
            String fullName = "University " + (i + 1);
            String shortName = "Uni " + (i + 1);
            int yearOfFoundation = random.nextInt(30) + 1990;
            universities.add(new University(id, fullName, shortName, yearOfFoundation, StudyProfile.MATHEMATICS));
        }
        return universities;
    }
}