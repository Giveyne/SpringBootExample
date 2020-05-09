package com.example.demo.controller;

import com.example.demo.model.Quot;
import com.example.demo.repository.QuotDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.template.TemplateLocation;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@org.springframework.stereotype.Controller

public class Controller {

    @Autowired
    private QuotDao quotDao;

    @GetMapping("/")
    public String page(){
        return "page";
    }


    @GetMapping("/elvls")
    public String getAllUsers(Model model){
        model.addAttribute("elvls", quotDao.getAllElvl());
        return "show_elvls";
    }
    @GetMapping("/elvl/{isin}")
    public String getElvlByIsin(@PathVariable("isin") String isin, Model model){
        model.addAttribute("elvl", quotDao.getElvlByIsin(isin));
        return "show_elvl";
    }

    @PostMapping("/quot/{isin,bid,ask,bidsize,asksize}")
    public String addQuote(@ModelAttribute("quot") Quot quot){
        quotDao.createQuot(quot);
        return "redirect:/elvls";
    }

}
