package Characters;

import AbstractClasss.Humans;
import Exceptions.NothingInExeption;
import Exceptions.WrongAgeExcept;
import Interfaces.Malysh_interface;
import Things.BagOfCandies;
import Things.GlassOfWater;

import java.util.Objects;

public class Malysh extends Humans implements Malysh_interface {
    private static class Pocket{
        String name;
        Pocket(String name){
            this.name = name;
        }
    }
    Pocket pocket = new Pocket("карман пижамы");

    public Malysh(String name, int age, String gender) throws WrongAgeExcept {
        super(name, age, gender);
    }
    public void Discerne(GlassOfWater glassOfWater) throws NothingInExeption {
        if(glassOfWater== null) {
        throw new NothingInExeption("glassOfWater");
        }
        else {System.out.println(this.name + " с трудом разглядел на тумбочке " + glassOfWater.name);};

    }
    UncleJulious uncleJulious = new UncleJulious("Дядя Юлиус", 50, "мужчина");
    UncleJulious.Jaws jaws = uncleJulious. new Jaws();
    public void GrabFromMother(){
        System.out.println("Но прежде взял у Мамочки " + jaws.name);
    }
    @Override
    public String toString() {
        return this.name + ":";
    }
    public void Understanding(UncleJulious unclejulious){
        System.out.println(this.name + " понимал, что теперь "+ jaws.name + " нужнее самому "+ unclejulious.name);
    }
    public void PutInGlass( GlassOfWater glassOfWater){
        System.out.println(this.name + " опустил " + jaws.name + " в " + glassOfWater.name);
    }
    public void Grab(BagOfCandies bagOfCandies){
        System.out.println(this.name + " взял " + bagOfCandies.name);
    }
    public void PutInPocket(BagOfCandies bagOfCandies){
        System.out.println(bagOfCandies.name + " сунул в "+ pocket.name + ", чтобы отдать Карлсону");
    }
    public void NoAttention(){
        System.out.println(this.name + " не обратил на это особого внимания");
    }


    public void WakeUp(UncleJulious uncleJulious) {
        System.out.println(this.name + " побежал будить " + uncleJulious.name);
    }
    public void GoToAction() {
        System.out.println(this.name + " приступил к делу");
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj && age == 7 && gender == "мужчина") {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, gender);
    }
}
