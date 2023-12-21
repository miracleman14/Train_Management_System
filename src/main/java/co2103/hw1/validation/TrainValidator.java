package co2103.hw1.validation;

import co2103.hw1.domain.Train;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

@Component
public class TrainValidator implements Validator {
    @Override
    public boolean supports(Class<?> clazz) {
        return Train.class.isAssignableFrom(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        Train train = (Train) target;

        // Validate ID uniqueness
        // Implement your uniqueness validation logic here, e.g., checking if the ID already exists in the list of trains.

        // Validate route (not empty)
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "route", "train.route.empty");

        // Validate manufacturer (not empty)
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "manufacturer", "train.manufacturer.empty");
    }
}
