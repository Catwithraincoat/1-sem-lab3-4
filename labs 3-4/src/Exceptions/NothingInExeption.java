package Exceptions;

public class NothingInExeption extends NullPointerException{
    public NothingInExeption(String errObj){
        super("проблемы с полученными данными");
    }
}
