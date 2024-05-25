package test.artemchupika.util.validation.annotation;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import test.artemchupika.util.validation.DateRangeValidator;

@Constraint(validatedBy = DateRangeValidator.class)
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface ValidDateRange {
    String message() default "The 'from' date must be before the 'to' date";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
