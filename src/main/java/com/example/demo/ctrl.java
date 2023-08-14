package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@ResponseBody
//=RestController
//RequestMapping(method=get)=@GetMapping

public class ctrl {
    public String aaa(){
        System.out.println("book");
        return "book";
    }
    @RequestMapping(value = "list",method = RequestMethod.POST)
    public String bbb(){
        System.out.println("list");
        return "list";
    }
    @RequestMapping("user/{id}")
    public String ccc(@PathVariable Integer id){
        System.out.println("user="+id);
        return "user="+id;
    }
}
