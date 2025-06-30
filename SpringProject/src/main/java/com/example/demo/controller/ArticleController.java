package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.dto.ArticleForm;
import com.example.demo.entity.Article;
import com.example.demo.repository.ArticleRepository;

import lombok.extern.slf4j.Slf4j;

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
@Slf4j
public class ArticleController {
	
	@Autowired // 스프링 부트가 미리 생성해놓은 객체를 자동 연결 
	private ArticleRepository articleRepository;
	
	@GetMapping("/articles/new")
	public String mewArticleForm() {
		return "articles/new";
	}
	
	@PostMapping("/articles/create")
	public String createArticle(ArticleForm form) {
		log.info(form.toString());
		//System.out.println(form.toString()); -> 로깅기능으로 대체 
		
		
		//JPA
		// 1. DTO -> Entity
		Article article = form.toEntity();
		log.info(article.toString());
		//System.out.println(article.toString());
		
		// 2. Repository에 Entity를 DB안에 저장
		Article saved = articleRepository.save(article);
		log.info(saved.toString());
		//System.out.println();
		
		return "";
	}

}
