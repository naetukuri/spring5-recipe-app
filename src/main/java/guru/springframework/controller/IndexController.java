package guru.springframework.controller;

import org.springframework.web.bind.annotation.RequestMapping;

public class IndexController {
    @RequestMapping({"","/","/index"})
    String getIndexPage(){
        return "index";
    }
}
