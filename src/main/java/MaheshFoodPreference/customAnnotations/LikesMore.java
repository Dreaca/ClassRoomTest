package MaheshFoodPreference.customAnnotations;

import org.aspectj.lang.annotation.DeclareAnnotation;
import org.springframework.beans.factory.annotation.Qualifier;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Qualifier
@Retention(RetentionPolicy.RUNTIME)
public @interface LikesMore {

}
