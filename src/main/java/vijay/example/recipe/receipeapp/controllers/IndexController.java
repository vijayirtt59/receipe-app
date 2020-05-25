package vijay.example.recipe.receipeapp.controllers;

import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

@Controller
public class IndexController {

    @RequestMapping({"", "/", "/index"})
    public String getIndex(){
        System.out.println("Index Controller....123");
        return "index";
    }

}
