package co2103.hw1.controller;

import co2103.hw1.Hw1Application;
import co2103.hw1.domain.Carriage;
import co2103.hw1.domain.Train;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class CarriageController {
    @GetMapping("/carriages")
    public String listCarriages(@RequestParam("train") int trainId, Model model) {
        Train train = Hw1Application.getTrainById(trainId);

        if (train != null) {
            List<Carriage> carriages = train.getCarriages();
            model.addAttribute("carriages", carriages);
            model.addAttribute("trainId", trainId);
            return "carriages/list";
        } else {
            return "redirect:/trains";
        }
    }

    @GetMapping("/newCarriage")
    public String showCarriageForm(@RequestParam("train") int trainId, Model model) {
        Train train = Hw1Application.getTrainById(trainId);

        if (train != null) {
            Carriage carriage = new Carriage();
            model.addAttribute("carriage", carriage);
            model.addAttribute("trainId", trainId);
            return "carriages/form";
        } else {
            return "redirect:/trains";
        }
    }

    @PostMapping("/addCarriage")
    public String addCarriage(
            @ModelAttribute("carriage") @Validated Carriage carriage,
            BindingResult result,
            @RequestParam("train") int trainId,
            Model model
    ) {
        if (result.hasErrors()) {
            model.addAttribute("trainId", trainId);
            return "carriages/form";
        }

        Train train = Hw1Application.getTrainById(trainId);

        if (train != null) {
            train.addCarriage(carriage);
        }

        return "redirect:/trains";
    }
}
