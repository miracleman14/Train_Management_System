package co2103.hw1;

import co2103.hw1.domain.Train;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class Hw1Application {
    public static List<Train> trains = new ArrayList<>();

    public static Train getTrainById(int trainId) {
        for (Train train : trains) {
            if (train.getId() == trainId) {
                return train;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        // Initialize the list with some initial data (if needed).
        trains.add(new Train(1, "Route 1", "Manufacturer 1"));
        trains.add(new Train(2, "Route 2", "Manufacturer 2"));

        SpringApplication.run(Hw1Application.class, args);
    }
}

