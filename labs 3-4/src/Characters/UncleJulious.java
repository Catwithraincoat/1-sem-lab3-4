package Characters;

import AbstractClasss.Humans;
import Exceptions.WrongAgeExcept;
import Interfaces.UncleJulious_interface;
import Things.BagOfCandies;

public class UncleJulious extends Humans implements UncleJulious_interface {
    public UncleJulious (String name, int age, String gender) throws WrongAgeExcept {
        super(name, age, gender);
        this.name = name;
        this.age = age;
        this.gender = gender;
        if (this.age>200){throw new WrongAgeExcept(this.age);}
    }
    public class Jaws{
        String name = "челюсти "  + UncleJulious.this.name + "а";
    }
    Jaws jaws = new Jaws();
    @Override
    public void Sleep(){
        System.out.println(this.name + " спал, как ребенок.");
    }
    public void TryToKnow(BagOfCandies bagOfCandies) {
        System.out.println(this.name + " начнет допытываться как " + bagOfCandies.name + " сюда попал");
    }
    public String Tell(){
        return " и только тогда сказал";
    }
    public void UseJaws(){
        System.out.println("Первым делом " +this.name + " схватился за " + jaws.name + " и надел их" + Tell());
    }
    public void WakeUped(){
        System.out.println(this.name + " проснулся");
    }



}
