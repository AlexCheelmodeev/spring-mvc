package ru.maxima.springmvc.config.controllers.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CalculatorController {
    @GetMapping("/calculator")
    public String numbers (@RequestParam(value = "a",required = false) double a,
                              @RequestParam(value = "b",required = false) double b,
                              @RequestParam(value = "operation",required = false) String  opertion,
                              Model model) {
        if (opertion.equals("division")){
            model.addAttribute("result", a/b);
        } else if (opertion.equals("multiplication")){
            model.addAttribute("result",a*b);
        } else if (opertion.equals("plus")){
            model.addAttribute("result",a+b);
        } else if (opertion.equals("minus")){
            model.addAttribute("result",a-b);
        }
        return "calculator";
    }

}
