package cn.itheima.springbootshizhan.hello;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    @GetMapping("/")
    public String show(String name, Model model){

        return "index";
    }
}
