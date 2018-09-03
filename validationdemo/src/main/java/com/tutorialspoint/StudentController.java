package com.tutorialspoint;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class StudentController 
{
	
	

   @RequestMapping(value = "/student", method = RequestMethod.GET)
   public ModelAndView student() {
	   
	  //return new ModelAndView("student");
      return new ModelAndView("student", "student1", new Student());
      
   }
   
   @RequestMapping(value = "/addStudent", method = RequestMethod.POST)
   public String addStudent(@Valid @ModelAttribute("student1")Student student1,BindingResult result,ModelMap model) 
  
   	{  
	   
	   if(result.hasErrors())
	   {
		   return "student";
		  // System.out.println(result.getAllErrors().get(0).getDefaultMessage());
		 // return "redirect:student";
		   //return new ModelAndView("student","command",new Student());
	   }
	   else
	   {
		  
      model.addAttribute("name", student1.getName());
      model.addAttribute("age", student1.getAge());
      model.addAttribute("id", student1.getId());
      model.addAttribute("Email",student1.getEmail());
		   
      return "result";
      //return new ModelAndView("result");
   	}
	   
   	}   
}