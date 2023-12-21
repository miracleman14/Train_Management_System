package co2103.hw1.validation;

import co2103.hw1.domain.Carriage;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

@Component
public class CarriageValidator implements Validator {
    @Override
    public boolean supports(Class<?> clazz) {
        return Carriage.class.isAssignableFrom(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        Carriage carriage = (Carriage) target;

        // Validate code (not empty)
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "code", "carriage.code.empty");

        // Validate driver (not empty)
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "driver", "carriage.driver.empty");

        // Validate type (must be one of the specified values)
        String type = carriage.getType();
        if (!type.equals("First Class") && !type.equals("Second Class") && !type.equals("Third Class")) {
            errors.rejectValue("type", "carriage.type.invalid");
        }

        // Validate seats (between 10 and 50)
        int seats = carriage.getSeats();
        if (seats < 10 || seats > 50) {
            errors.rejectValue("seats", "carriage.seats.invalid");
        }
    }
}
