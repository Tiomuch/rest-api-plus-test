package test.artemchupika.model.dto.request;

import jakarta.validation.constraints.NotNull;
import java.time.LocalDate;
import test.artemchupika.util.validation.annotation.ValidDateRange;

@ValidDateRange
public record DateRangeDto(
        @NotNull LocalDate from,
        @NotNull LocalDate to
) {
}
