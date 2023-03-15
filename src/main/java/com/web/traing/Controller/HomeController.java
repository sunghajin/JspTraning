package com.web.traing.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpServletRequest;
 
// 컨트럴러 어노테이션
@Controller
public class HomeController {
  // 매핑 주소
  @RequestMapping(value = {"/", "/index.html"})
  public String index(Model model) {
    // 템플릿에 전달할 데이터
	model.addAttribute("data", "hello world");
	// 템플릿 파일명
	return "home/index";
  }
  
	@RequestMapping(value = "/home", method=RequestMethod.GET)
	public ModelAndView goHome(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		List<String> resultList = new ArrayList<String>();
		
		resultList.add("AAA");
		resultList.add("BBB");
		resultList.add("CCC");
		resultList.add("DDD");
		resultList.add("EEE");
		resultList.add("FFF");
		
		mav.addObject("resultList",resultList);
		mav.setViewName("home/home");
		
		return mav;
	}  
}