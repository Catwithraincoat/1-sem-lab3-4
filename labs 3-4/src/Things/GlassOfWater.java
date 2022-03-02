package Things;
import AbstractClasss.ThingsOnTable;
import Interfaces.GlassOfWater_interface;
import enums.Existance;

import static enums.Existance.LAYON;
import static enums.Existance.NOTLAYON;

public class GlassOfWater extends ThingsOnTable implements GlassOfWater_interface {
    public Existance condition;

    public GlassOfWater(String name){
        super(name);
    }

    public void Splashing() {
        class Splash{
            String name;
            Splash(String name){
                this.name = name;
            }
        }
        Splash splash = new Splash("тихий всплеск");
        System.out.println(this.name + " послышался "+ splash.name);
    }
    public void LayNear(Glasses glass, BagOfCandies bagOfCandies){
        System.out.println("Рядом со " + this.name +" лежали "+ glass.name +  " и " + bagOfCandies.name);
    }



    public void layon(){
        Existance condition = LAYON;
        System.out.println(this.name + ' ' + this.condition.label);

    }
    public void notlayon(){
        Existance condition = NOTLAYON;
        System.out.println(this.name + ' ' + this.condition.label);
    }
}
