package pattern.mediator;

import pattern.mediator.country.Iraq;
import pattern.mediator.country.USA;
import pattern.mediator.mediator.UniteNationSecurityCouncil;

/**
 * Created by piguanghua on 2017/2/17.
 */
public class Client {
    public static void main(String args[]) {
        UniteNationSecurityCouncil uniteNationSecurityCouncil = new UniteNationSecurityCouncil();
        USA usa = new USA(uniteNationSecurityCouncil);
        Iraq iraq = new Iraq(uniteNationSecurityCouncil);
        uniteNationSecurityCouncil.setIraq(iraq);
        uniteNationSecurityCouncil.setUsa(usa);
        uniteNationSecurityCouncil.Declare("attack", usa);
    }
}
