package com.max;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PostIronyController {

    @RequestMapping("/postirony")
    public String showMyPage(){
        return "hello-page";
    }
}
