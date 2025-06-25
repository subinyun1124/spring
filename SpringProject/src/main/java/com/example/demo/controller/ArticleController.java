package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.dto.ArticleForm;

/* 
 * Form데이터 주고받기
 * 1. 뷰 페이지 생성
 * 2. 뷰 페이지에서 Form태그를 통해 데이터 주고받을 수 있도록 로직개발
 *    action: 어디로 보낼지, method: 어떻게 보낼지 
 * 3. @PostMapping의 URL주소 통해 데이터 받음  
 * 4. 폼데이터는 DTO객체(ArticleForm)에 담기게 된다 
 *
 */

@Controller
public class ArticleController {
	
	@GetMapping("/articles/new")
	public String mewArticleForm() {
		return "articles/new";
	}
	
	@PostMapping("/articles/create")
	public String createArticle(ArticleForm form) {
		System.out.println(form.toString());
		return "";
	}

}
