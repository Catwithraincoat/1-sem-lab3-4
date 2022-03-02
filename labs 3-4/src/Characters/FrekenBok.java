package Characters;

import AbstractClasss.Humans;
import Interfaces.FrekenBok_interface;

public class FrekenBok extends Humans implements FrekenBok_interface {
    public FrekenBok(String name, int age, String gender)
    {
        super(name, age, gender);
    }

    @Override
    public void GoingCrazy() {
        System.out.println(this.name + " чуть с ума не сошла, когда увидела Карлсона");
    }

    @Override
    public void GoOut() {
        System.out.println("И " + this.name + " торопливо вышла");
    }
}
