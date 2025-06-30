package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.ToString;

@Entity // DB가 해당 객체 인식
@AllArgsConstructor
@ToString
public class Article {
	
	@Id // 자동 생성 어노테이션 - 물리적 id
	@GeneratedValue
	private Long id;
	
	@Column
	private String title;
	
	@Column
	private String content;	

}
