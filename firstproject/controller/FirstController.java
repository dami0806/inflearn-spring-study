package com.example.firstproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FirstController {

    @GetMapping("/hi")
    public String niceToMeetYou(Model model) {
        model.addAttribute("username","다미");
        return "greetings";
    }
    @GetMapping("/bye")
    public String seeYouNext(Model model) {
        model.addAttribute("nickname","밤다람");
        return "goodbye";
    }
        @GetMapping("/animal")
        public String Animal(Model model) {
            model.addAttribute("animal", "고양고양이");
            return "cat";
        }
    }

