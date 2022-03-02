import Characters.FrekenBok;
import Characters.Malysh;
import Characters.UncleJulious;
import Exceptions.WrongAgeExcept;
import Interfaces.Malysh_interface;
import Things.*;

public class Main {

    public static void main(String[] args) throws WrongAgeExcept {
        Malysh malysh = new Malysh("Малыш", 7, "мужчина");
        GlassOfWater glassOfWater = new GlassOfWater("стакан воды");
        UncleJulious uncleJulious = new UncleJulious("Дядя Юлиус", 50, "мужчина");
        Watch watch = new Watch("часы");
        Glasses glass = new Glasses("очки");
        BagOfCandies bagOfCandies = new BagOfCandies("кулёк с конфетами");
        VagueFeeling vagueFeeling = new VagueFeeling("смтуное ощущение");
        Wallet wallet = new Wallet("бумажник");
        FrekenBok frekenBok = new FrekenBok("Фрэкен Бок", 45, "женщина");

        frekenBok.GoingCrazy();
        frekenBok.GoOut();
        malysh.WakeUp(uncleJulious);
        malysh.GrabFromMother();
        malysh.Understanding(uncleJulious);
        System.out.println("В спальне мерно звучало \"грр-пс-пс\"");
        uncleJulious.Sleep();
        System.out.println("Начинало светать. В еще совсем густых сумерках");
        malysh.Discerne(glassOfWater);
        malysh.PutInGlass(glassOfWater);
        glassOfWater.Splashing();
        glassOfWater.LayNear(glass, bagOfCandies);
        malysh.Grab(bagOfCandies);
        malysh.PutInPocket(bagOfCandies);
        bagOfCandies.NeedntSee(uncleJulious);
        uncleJulious.TryToKnow(bagOfCandies);
        vagueFeeling.appear();
        watch.layon();
        wallet.layon();
        System.out.println("Но");
        watch.notlayon();
        wallet.notlayon();
        malysh.NoAttention();

        Malysh_interface malysh1 = new Malysh("Малыш", 7, "мужчина"){
            public void WakeUp(UncleJulious uncleJulious){
                System.out.println(this.name + " было поручено разбудить " + uncleJulious.name);
            }
        };

        malysh1.WakeUp(uncleJulious);
        malysh.GoToAction();
        uncleJulious.WakeUped();
        uncleJulious.UseJaws();

    }

}
