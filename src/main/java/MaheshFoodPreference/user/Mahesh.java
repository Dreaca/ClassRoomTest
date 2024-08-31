package MaheshFoodPreference.user;

import MaheshFoodPreference.contract.BakeryItem;
import MaheshFoodPreference.customAnnotations.LikesMore;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("mahesh")
public class Mahesh {

    private BakeryItem bakeryItem;

    @Autowired
    @Primary
    @Qualifier("Preference")
    @LikesMore
    public void setBakeryItem(BakeryItem bakeryItem) {
        this.bakeryItem = bakeryItem;
    }

    public Mahesh() {

        System.out.println("Mahesh eats");
    }

    @PostConstruct
    public void init() {
        bakeryItem.eat();
    }
}
