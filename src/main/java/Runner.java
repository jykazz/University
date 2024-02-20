import models.Student;
import models.University;

import handlers.XlsReader;

import java.io.IOException;
import java.util.List;

public class Runner {
    public static void main(String[] args) throws IOException {

        System.out.println("Университеты");

        List<University> universities =
                XlsReader.readXlsUniversities("src/main/resources/universityInfo.xlsx");
        for (University university : universities) {
            System.out.println(university);
        }

        System.out.println("\nСтуденты");

        List<Student> students =
                XlsReader.readXlsStudents("src/main/resources/universityInfo.xlsx");
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
