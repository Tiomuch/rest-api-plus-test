package test.artemchupika.util.validation;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import test.artemchupika.model.dto.request.DateRangeDto;
import test.artemchupika.util.validation.annotation.ValidDateRange;

public class DateRangeValidator implements ConstraintValidator<ValidDateRange, DateRangeDto> {
    @Override
    public boolean isValid(DateRangeDto value, ConstraintValidatorContext context) {
        if (value.from() == null || value.to() == null) {
            return true;
        }
        return value.from().isBefore(value.to());
    }
}
