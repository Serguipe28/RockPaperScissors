package com.serguipe.rockPaperScissors.Controllers;


import com.serguipe.rockPaperScissors.Services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class GameController {

    @Autowired
    private GameService service;

    @GetMapping("/")
    public ModelAndView welcome(){
        ModelAndView modelAndView = new ModelAndView("index");

        return modelAndView;
    }
    @PostMapping("/oneTwoThree")
    public ModelAndView move(@RequestParam("trie") String intento){
        String result = service.play(intento);
        ModelAndView modelAndView = new ModelAndView("index");
        modelAndView.addObject("result",result);
        return modelAndView;
    }


}
