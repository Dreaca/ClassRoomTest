package MaheshFoodPreference;

import MaheshFoodPreference.config.Config;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Appinit {
    public static void main(String[] args) {
        var ctx = new AnnotationConfigApplicationContext();

        ctx.register(Config.class);

        ctx.refresh();

        ctx.registerShutdownHook();
    }
}
