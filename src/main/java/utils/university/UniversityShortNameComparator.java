package utils.university;

import models.University;

import java.util.Comparator;

public class UniversityShortNameComparator implements Comparator<University> {
    @Override
    public int compare(University u1, University u2) {
        return u1.getShortName().compareTo(u2.getShortName());
    }
}

