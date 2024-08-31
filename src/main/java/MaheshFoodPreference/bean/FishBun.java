package MaheshFoodPreference.bean;

import MaheshFoodPreference.contract.BakeryItem;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class FishBun implements BakeryItem {
    @Override
    public void eat() {
        System.out.println("Taste like Fish bun");
    }
}
