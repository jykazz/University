package utils.university;

import models.University;

import java.util.Comparator;

public class UniversityFullNameComparator implements Comparator<University> {
    @Override
    public int compare(University u1, University u2) {
        return u1.getFullName().compareTo(u2.getFullName());
    }
}
