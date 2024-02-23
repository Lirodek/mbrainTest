package kr.co.mbrain.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import jakarta.annotation.Resource;
import kr.co.mbrain.service.TestService;
import kr.co.mbrain.vo.DataVo;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;



@Controller
@RestController
public class HelloController {

    @Resource(name="testService")
    private TestService testService;

    @GetMapping("/greeting")
	public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
		model.addAttribute("name", name);
		return "greeting";
	}
    

    @GetMapping("/from")
    public ModelAndView index(ModelAndView mav) {
        mav.addObject("msg", "please type your name");
        mav.setViewName("from");
        return mav;
    }
    

    @PostMapping("/from")
    public ModelAndView form(
            @RequestParam("text")String text
            ,ModelAndView mav) {
        mav.addObject("msg", String.format("welcome %s", text));
        mav.addObject("value", text);
        mav.setViewName("from");
        return mav;
    }
    
    @GetMapping("/")
	public ModelAndView index() {
		return new ModelAndView("base/layout");
	}

    @GetMapping("/hi")
	public ModelAndView index2(ModelAndView mav) {
        List list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        //mav.addObject("test", "33");
        mav.addObject("list", list);
        mav.setViewName("paramTest");

		return mav;
	}

    @GetMapping("/message")
    public ModelAndView getMethodName() {
        return new ModelAndView("messagetest");
    }

    @GetMapping("/htmlTest")
    public ModelAndView htmlTest(ModelAndView mav) {
        mav.addObject("message", "<h2>Hello</h2><p>World</p>");
        mav.setViewName("htmlTest");

        return mav;
    }
    
    @RequestMapping(value="/test", method = RequestMethod.POST, produces = "application/x-www-form-urlencoded;charset=euc-kr")
    public ModelAndView postMethodName(ModelAndView mav) {
        System.out.println("hello, World!");

        mav.addObject("message", "<h2>Hello</h2><p>World</p>");
        mav.setViewName("htmlTest");
        testService.findAll();
        return mav;
    }   
}
