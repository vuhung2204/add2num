package com.example.web;

import com.example.core.MyBigNumber;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;



@Controller
public class Add2NumController {
    @GetMapping("/")
    public String showForm() {
        return "index";
    }

    @PostMapping("/sum")
    public String calculateSum(@RequestParam("num1") String num1,
                               @RequestParam("num2") String num2,
                               Model model) {
        String result = MyBigNumber.sum(num1, num2);
        String logs = MyBigNumber.getLogs();

        model.addAttribute("num1", num1);
        model.addAttribute("num2", num2);
        model.addAttribute("result", result);
        model.addAttribute("steps", logs);
        return "index";
    }
}
