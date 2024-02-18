package enums;

public enum StudyProfile {
    PHYSICS("Физика"),
    COMPUTER_SCIENCE("Информатика"),
    MATHEMATICS("Математика"),
    JURISPRUDENCE("Юриспруденция"),
    MEDICINE("Медицина"),
    LINGUISTICS("Лингвистика"),
    BIOLOGY("Биология"),
    CHEMISTRY("Химия"),
    PSYCHOLOGY("Психология"),
    ECONOMICS("Экономика"),
    PHILOSOPHY("Философия"),
    HISTORY("История"),
    LITERATURE("Литература"),
    SOCIOLOGY("Социология"),
    POLITICAL_SCIENCE("Политология"),
    ANTHROPOLOGY("Антропология"),
    ARCHEOLOGY("Археология"),
    ART_HISTORY("История искусств"),
    ASTRONOMY("Астрономия"),
    GEOLOGY("Геология"),
    OCEANOGRAPHY("Океанография"),
    METEOROLOGY("Метеорология"),
    ENVIRONMENTAL_SCIENCE("Экология"),
    ENGINEERING("Инженерия"),
    ARCHITECTURE("Архитектура"),
    AGRICULTURE("Сельское хозяйство"),
    FORESTRY("Лесное хозяйство"),
    FASHION_DESIGN("Дизайн моды"),
    GRAPHIC_DESIGN("Графический дизайн"),
    INDUSTRIAL_DESIGN("Промышленный дизайн"),
    INTERIOR_DESIGN("Дизайн интерьера"),
    URBAN_PLANNING("Градостроительство"),
    LANDSCAPE_ARCHITECTURE("Ландшафтная архитектура"),
    MUSIC("Музыка"),
    THEATER("Театр"),
    DANCE("Танец"),
    FILM_STUDIES("Киноведение"),
    PHOTOGRAPHY("Фотография"),
    PAINTING("Живопись"),
    SCULPTURE("Скульптура"),
    CERAMICS("Керамика"),
    PRINTMAKING("Гравюра"),
    TEXTILE_ART("Текстильное искусство"),
    CALLIGRAPHY("Каллиграфия"),
    CARTOGRAPHY("Картография"),
    CRIMINOLOGY("Криминология"),
    MILITARY_SCIENCE("Военная наука"),
    SPORTS_SCIENCE("Спортивная наука"),
    NUTRITION("Питание");

    private final String profileName;

    private StudyProfile(String profileName) {
        this.profileName = profileName;
    }

    public String getProfileName() {
        return this.profileName;
    }
}
