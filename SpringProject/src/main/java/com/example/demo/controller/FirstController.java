package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/*
 ** 작동 방식 
 사용자 요청을 하면
 요청은 컨트롤러가 받는다(@Controller) 
 어떻게? @getMapping("") 어노테이션을 통해서
 hi라는 요청을 받으면 niceToMeetYou메소드가 수행
 리턴값은 보여줄 페이지가 되는거고 보여줄 페이지에서 사용할 변수는 모델을 통해서 등록 */

@Controller
public class FirstController {
		
	@GetMapping("/hi")
	public String niceToMeetYou(Model model) {
		model.addAttribute("username", "수빈");
		return "greetings"; // templates/greetings.mustache
	}
	
	@GetMapping("/bye")
	public String seeYouNext(Model model) {
		model.addAttribute("nickname", "수빈");
		return "goodbye"; // templates/goodbye
	}
	
}
