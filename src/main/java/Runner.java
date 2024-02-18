import enums.StudyProfile;
import models.Student;
import models.University;

public class Runner {
    public static void main(String[] args) {

        Student student = new Student();
        student.setAvgExamScore((float) 4.7);
        student.setCurrentCourseNumber(4);
        student.setFullName("Fedorov Petr Aleksandrovich");
        student.setUniversityId("758");
        System.out.println(student);

        University university = new University();
        university.setId("758");
        university.setFullName("Ryazan State Radio Engineering University");
        university.setShortName("RSREU");
        university.setYearOfFoundation(1951);
        university.setMainProfile(StudyProfile.PHYSICS);
        System.out.println(university);
    }
}
