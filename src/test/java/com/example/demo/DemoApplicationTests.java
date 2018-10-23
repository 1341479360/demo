package com.example.demo;

import com.sun.org.apache.bcel.internal.generic.RETURN;
import com.sun.org.apache.regexp.internal.RE;
import org.apache.logging.log4j.message.ReusableMessage;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.validator.PublicClassValidator;
import org.omg.CORBA.PUBLIC_MEMBER;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.xml.ws.RequestWrapper;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {


    @Test
    public void contextLoads() {


    }

    @ResponseBody
    @RequestMapping("")
    public String select(Model model) {

        String i = "32342324234";

        model.addAttribute("name", "zhangsan");


        System.out.println("已经更改");
        User u = new User();
        model.addAttribute("user", u);
        return "index";




    }


}
