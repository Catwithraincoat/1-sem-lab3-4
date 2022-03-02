package Exceptions;

import java.io.IOException;
// checked
public class WrongAgeExcept  extends IOException {
    public WrongAgeExcept(int Age){
        super(" Неправильно задан возраст персонажа " + Age);
    }
}
