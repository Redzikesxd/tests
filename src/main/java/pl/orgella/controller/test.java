package pl.orgella.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class test {


    @ResponseBody
    @GetMapping("/")
    public String response()
    {
        return "huj";
    }
}
