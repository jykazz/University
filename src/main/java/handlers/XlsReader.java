package handlers;

import enums.StudyProfile;
import models.Student;
import models.University;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class XlsReader {
    private XlsReader() {
    }

    public static List<Student> readXlsStudents(String filePath) throws IOException {
        List<Student> students = new ArrayList<>();
        FileInputStream fileInputStream = new FileInputStream(filePath);
        XSSFWorkbook workbook = new XSSFWorkbook(fileInputStream);
        XSSFSheet sheet = workbook.getSheet("Студенты");

        Iterator<Row> rows = sheet.iterator();
        rows.next();

        while (rows.hasNext()) {
            Row currentRow = rows.next();
            String universityId = currentRow.getCell(0).getStringCellValue();
            String fullName = currentRow.getCell(1).getStringCellValue();
            int currentCourseNumber = (int) currentRow.getCell(2).getNumericCellValue();
            float avgExamScore = (float) currentRow.getCell(3).getNumericCellValue();

            students.add(new Student(universityId, fullName, currentCourseNumber, avgExamScore));
        }

        fileInputStream.close();
        workbook.close();

        return students;
    }

    public static List<University> readXlsUniversities(String filePath) throws IOException {
        List<University> universities = new ArrayList<>();
        FileInputStream fileInputStream = new FileInputStream(filePath);
        XSSFWorkbook workbook = new XSSFWorkbook(fileInputStream);
        XSSFSheet sheet = workbook.getSheet("Университеты");

        Iterator<Row> rows = sheet.iterator();
        rows.next();

        while (rows.hasNext()) {
            Row currentRow = rows.next();

            String id = currentRow.getCell(0).getStringCellValue();
            String fullName = currentRow.getCell(1).getStringCellValue();
            String shortName = currentRow.getCell(2).getStringCellValue();
            int yearOfFoundation = (int) currentRow.getCell(3).getNumericCellValue();
            StudyProfile mainProfile = StudyProfile.valueOf(
                    StudyProfile.class, currentRow.getCell(4).getStringCellValue());

            universities.add(new University(id, fullName, shortName, yearOfFoundation, mainProfile));
        }

        fileInputStream.close();
        workbook.close();

        return universities;
    }
}
