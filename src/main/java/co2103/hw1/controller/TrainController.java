package co2103.hw1.controller;

import co2103.hw1.Hw1Application;
import co2103.hw1.domain.Train;
import co2103.hw1.validation.TrainValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class TrainController {
    @Autowired
    private TrainValidator trainValidator;

    @GetMapping("/trains")
    public String listTrains(Model model) {
        model.addAttribute("trains", Hw1Application.trains);
        return "trains/list";
    }

    @GetMapping("/newTrain")
    public String showTrainForm(Model model) {
        model.addAttribute("train", new Train());
        return "trains/form";
    }

    @PostMapping("/addTrain")
    public String addTrain(@ModelAttribute("train") @Validated Train train, BindingResult result) {
        if (result.hasErrors()) {
            return "trains/form";
        }

        // Add the new train to the list of all trains
        Hw1Application.trains.add(train);

        return "redirect:/trains";
    }


}
