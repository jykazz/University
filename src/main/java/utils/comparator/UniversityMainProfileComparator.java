package utils.comparator;

import models.University;

public class UniversityMainProfileComparator implements UniversityComparator {
    @Override
    public int compare(University u1, University u2) {
        return u1.getMainProfile().compareTo(u2.getMainProfile());
    }
}
