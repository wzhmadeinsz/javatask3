package com.jnshu.controllar;

import com.jnshu.model.Person;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import com.jnshu.service.Services;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
public class TheControl{

    @Resource(name = "services")
    Services services;

    org.apache.log4j.Logger log= Logger.getLogger(TheControl.class);
    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

    //开头欢迎页面
    @RequestMapping
    public ModelAndView helloWorld(){

         ModelAndView mv=new ModelAndView("hello");

         log.info(dateFormat.format(new Date().getTime())+"访问了页面");

         return mv;
     }

     //增加用户页面
    @RequestMapping(value = "user",method=RequestMethod.POST)
    public ModelAndView adduser(){
       return new ModelAndView("addperson");
    }

    //添加用户成功页面
    @RequestMapping(value = "user/success",method=RequestMethod.POST)
    public ModelAndView afteradduser(@ModelAttribute Person peradd,HttpServletRequest request){

        services.addPer(peradd);
        Person sqlper=services.takeByname(peradd.getName());

        ModelAndView mv=new ModelAndView("addsuccessful");
        mv.addObject("person",sqlper);

        log.info(dateFormat.format(new Date().getTime())+"增加了"+peradd);

        return mv;
    }

    //输入id后查看用户
    @RequestMapping(value = "user",method=RequestMethod.GET)
    public ModelAndView checkuser(HttpServletRequest request){

        int searchid=Integer.parseInt(request.getParameter("id"));
        Person perback=services.takePerById(searchid);

        ModelAndView mv=new ModelAndView("display");
        mv.addObject("perdis",perback);

        log.info(dateFormat.format(new Date().getTime())+"查看了"+perback);

        return mv;
    }

    //删除成功页面
    @RequestMapping(value = "user/{id}",method = RequestMethod.GET)
    public ModelAndView deleteuser(HttpServletRequest request){

        int searchid= Integer.parseInt(request.getParameter("id"));
        Person perdel=services.takePerById(searchid);
        services.deleByid(searchid);

        ModelAndView mv=new ModelAndView("end");
        mv.addObject("title","删除成功");
        mv.addObject("person",perdel);

        log.info(dateFormat.format(new Date().getTime())+"删除了"+perdel);

        return mv;
    }

    //更新成功页面
    @RequestMapping(value = "user/{id}",method = RequestMethod.POST)
    public ModelAndView updateuser(@ModelAttribute Person perup,HttpServletRequest request){

        services.upPer(perup);

        ModelAndView mv=new ModelAndView("end");
        mv.addObject("title","更新成功");
        mv.addObject("person",perup);

        log.info(dateFormat.format(new Date().getTime())+"更新了"+perup);

        return mv;
    }

}
