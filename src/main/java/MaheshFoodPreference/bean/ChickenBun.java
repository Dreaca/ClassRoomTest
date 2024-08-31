package MaheshFoodPreference.bean;

import MaheshFoodPreference.contract.BakeryItem;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Qualifier("Preference")
@Primary
public class ChickenBun implements BakeryItem {
    @Override
    public void eat() {
        System.out.println("taste like chicken");
    }
}
