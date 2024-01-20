package com.main.Controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.main.Entiry.User;
import com.main.Service.SignUpService;

@Controller
public class SignUpController
{
    @Autowired
	private SignUpService signUpService;
    
    
    
    @RequestMapping(path = "/send",method = RequestMethod.POST)
    public ModelAndView display(HttpServletRequest req,HttpServletResponse res)
    {
    	String id = req.getParameter("id");
    	String name = req.getParameter("name");
    	String password = req.getParameter("password");
    	String email = req.getParameter("email");
    	
    	signUpService.serviceMethod(id,name,password,email);
    	
    	ModelAndView mav=new ModelAndView();
    	mav.setViewName("output.jsp");
    	mav.addObject("name", name);
    	
    	return mav;
    }
	
    
    
    //FOR UPDATING 

//    @RequestMapping(path = "/send",method = RequestMethod.PUT)
//  public ModelAndView display(HttpServletRequest req,HttpServletResponse res)
//  {
//  	String id = req.getParameter("id");
//  	String name = req.getParameter("name");
//  	signUpService.serviceUpdateMethod(id,name);
//  	
//  	ModelAndView mav=new ModelAndView();
//  	mav.setViewName("output.jsp");
//  	mav.addObject("name", name);
//  	
//  	return mav;
//  }
//    
	//FOR DELETING 
//    @RequestMapping("/send")
//    public ModelAndView display(HttpServletRequest req,HttpServletResponse res)
//    {
//    	String id = req.getParameter("id");
//    	signUpService.serviceDeleteMethod(id);
//    	
//    	ModelAndView mav=new ModelAndView();
//    	mav.setViewName("output.jsp");
//    	mav.addObject("id",id);
//    	
//    	return mav;
//    }

    //FOR GETTING ALL DATA
    
//    @RequestMapping("/send")
//    public ModelAndView display(HttpServletRequest req,HttpServletResponse res)
//    {
//    	
//    	List<User> serviceGetAllData = signUpService.serviceGetAllData();
//    	
//    	for(User s:serviceGetAllData)
//    	{
//    		System.out.println(s);
//    	}
//    	
//    	ModelAndView mav=new ModelAndView();
//    	mav.setViewName("output.jsp");
//        mav.addObject("output",serviceGetAllData);
//   	
//        
//    	return mav;
//    }
//    
}
