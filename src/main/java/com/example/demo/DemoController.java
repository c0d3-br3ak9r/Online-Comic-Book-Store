package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DemoController {
    
    @RequestMapping("/")
    public String index(Model model) {
        model.addAttribute("topRated", DemoDb.getModelList("rating"));
        model.addAttribute("topDownloaded", DemoDb.getModelList("downloads"));
        model.addAttribute("rec", DemoDb.getModelList("none"));
        return "index";
    }

    @RequestMapping("/book")
    public String book(@RequestParam int id, Model model) {
        model.addAttribute("book", DemoDb.getModel(id));
        return "book";
    }
}