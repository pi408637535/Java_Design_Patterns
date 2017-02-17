package pattern.mediator.country;

import pattern.mediator.mediator.UniteNation;

/**
 * Created by piguanghua on 2017/2/17.
 */
public abstract class Country {
    protected UniteNation mediator;

    public Country(UniteNation mediator) {
        this.mediator = mediator;
    }
}
