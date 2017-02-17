package pattern.mediator.mediator;

import pattern.mediator.country.Country;
import pattern.mediator.country.Iraq;
import pattern.mediator.country.USA;

/**
 * Created by piguanghua on 2017/2/17.
 */
public class UniteNationSecurityCouncil extends UniteNation {

    private USA usa;
    private Iraq iraq;

    public void setUsa(USA usa) {
        this.usa = usa;
    }

    public void setIraq(Iraq iraq) {
        this.iraq = iraq;
    }

    @Override
    public void Declare(String message, Country country) {
        if(usa == country){
            iraq.GetMessage(message);
        }else {
            usa.GetMessage(message);
        }
    }
}
