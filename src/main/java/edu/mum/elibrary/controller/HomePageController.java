package edu.mum.elibrary.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by 109376 on 11/6/2018.
 */
@Controller
public class HomePageController {
    @GetMapping(value = {"/","/elibrary","/elibrary/home"})
    public String displayHomePage()

    {
        return "home/index";
    }
    @RequestMapping(value = {"elibrary/book/list"})
    public String displayListBooks()

    {
        return "home/list";
    }
}
