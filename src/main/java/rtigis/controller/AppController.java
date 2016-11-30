package rtigis.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import rtigis.model.By;
import rtigis.model.Hello;

@Controller
@ComponentScan("rtigis.model.By")
public class AppController {
    @Autowired
    Hello hello;
    @Autowired
    By by;

    @RequestMapping("/")
    public String hello(Model model){
        model.addAttribute("hello", hello.getHelloMessage());
        model.addAttribute("by", by.getByMessage());
        return "hello";
    }
}
