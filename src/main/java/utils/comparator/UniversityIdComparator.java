package utils.comparator;

import models.University;

public class UniversityIdComparator implements UniversityComparator {
    @Override
    public int compare(University u1, University u2) {
        return u1.getId().compareTo(u2.getId());
    }

}
