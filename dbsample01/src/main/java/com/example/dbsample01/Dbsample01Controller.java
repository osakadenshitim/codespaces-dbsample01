package com.example.dbsample01;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Dbsample01Controller {
    @RequestMapping("/")
    String index(){
        return "index";
    }
}
