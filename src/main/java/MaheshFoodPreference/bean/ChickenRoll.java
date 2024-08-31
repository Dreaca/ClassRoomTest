package MaheshFoodPreference.bean;

import MaheshFoodPreference.contract.BakeryItem;
import MaheshFoodPreference.customAnnotations.LikesMore;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
@Qualifier("Preference")
@LikesMore

public class ChickenRoll implements BakeryItem {
    @Override
    public void eat() {
        System.out.println("Taste like a chicken roll");
    }
}