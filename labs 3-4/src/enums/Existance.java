package enums;

public enum Existance {
    LAYON("Должно лежать на тумбочке"),
    NOTLAYON("Не было на месте");
    public String label;
    Existance(String label) {
        this.label = label;
    }
}
