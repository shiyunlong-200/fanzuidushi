package com.springboot.springboot2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.springboot.springboot2.entity.Person;
import com.springboot.springboot2.service.PersonService;


@Controller
public class StartController {
@Autowired
PersonService personService;
	 @RequestMapping("/hello1")
	 @ResponseBody
	    public String Hello(){
	         return "hi,springboot!";
     } 
	 @RequestMapping("/person") //与数据库连接成功，我马上去找文件模板
	 @ResponseBody
	    public  String index(){
	        List <Person> list = personService.getAll();
	        for(Person p:list){ 
	        	System.out.println(p.getName()+","+p.getMobile());
	        }
	        return "测试与数据库连接是否成功";
	    }	 
	 @RequestMapping("/person1") //与数据库连接成功，我马上去找文件模板
	 @ResponseBody
	    public  String index2(){
	       Person p1=new Person();
	       p1.setId(5);
	       p1.setMobile("18301194371");
	       p1.setName("ghuguu");
	       personService.delete(5);
	        return "测试与数据库连接添加是否成功";
	    }	
	 @RequestMapping("/person2") //与数据库连接成功，已经成功
	 @ResponseBody
	    public  String index3(){
		int i=2;
	    personService.delete(i);
	    return "测试与数据库连接添加是否成功";
	    }	
	 @RequestMapping("/person5") //与数据库连接成功，已经成功
	 @ResponseBody
	    public  String index6(){
		Person p1=new Person();
		p1.setName("萨带我去");
		p1.setMobile("3898999990");
		personService.newp(p1);
	    return "数据库添加成功";
	    }	 
}
