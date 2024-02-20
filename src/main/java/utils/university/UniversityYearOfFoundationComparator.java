package utils.university;

import models.University;

import java.util.Comparator;

public class UniversityYearOfFoundationComparator implements Comparator<University> {
    @Override
    public int compare(University u1, University u2) {
        return Integer.compare(u1.getYearOfFoundation(), u2.getYearOfFoundation());
    }
}
