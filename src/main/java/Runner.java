import enums.StudentComparatorType;
import enums.UniversityComparatorType;
import handlers.XlsReader;
import models.Student;
import models.University;
import utils.ComparatorUtil;
import utils.comparator.StudentComparator;
import utils.comparator.UniversityComparator;

import java.io.IOException;
import java.util.List;

public class Runner {
    public static void main(String[] args) throws IOException {

        List<University> universities =
                XlsReader.readXlsUniversities("src/main/resources/universityInfo.xlsx");
        UniversityComparator universityComparator =
                ComparatorUtil.getUniversityComparator(UniversityComparatorType.YEAR_OF_FOUNDATION);
        universities.stream()
                .sorted(universityComparator)
                .forEach(System.out::println);

        List<Student> students =
                XlsReader.readXlsStudents("src/main/resources/universityInfo.xlsx");
        StudentComparator studentComparator =
                ComparatorUtil.getStudentComparator(StudentComparatorType.AVG_EXAM_SCORE);
        students.stream()
                .sorted(studentComparator)
                .forEach(System.out::println);
    }
}