package com.baobaotao.web;

import com.baobaoto.domain.AngularUser;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value="/AngularJS")
public class TestAngularJS {

    @RequestMapping("/test.do")
    public String test(){
        //ModelAndView mav = new ModelAndView();
        System.out.println("Test console output");
        //mav.setViewName("AngularJsTest");
        return "mav";
    }
    
    @RequestMapping("/intro.do")
    public ModelAndView intro(){
        ModelAndView mav = new ModelAndView();
        System.out.println("Test console output");
        mav.setViewName("AngularJsTest");
        return mav;
    }
    
    @RequestMapping(value="/getUser.do", method=RequestMethod.POST)
    public @ResponseBody String getUser(@RequestBody AngularUser angularUser){
        System.out.println("ID" + angularUser.getId());
        System.out.println("name" + angularUser.getName());
        System.out.println("age" + angularUser.getAge());
        return "{\"id\": 3, \"name\": \"Tom\", \"age\": \"28\"}";
    }
}