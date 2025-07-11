package com.example.subin.spring;

import com.example.subin.spring.repository.JpaMemberRepository;
import com.example.subin.spring.repository.MemberRepository;
import com.example.subin.spring.repository.MemoryMemberRepository;
import com.example.subin.spring.service.MemberService;
import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {

    private final MemberRepository memberRepository;

    @Autowired
    public SpringConfig(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }


    //private EntityManager em;

//    @Autowired
//    public SpringConfig(EntityManager em) {
//        this.em = em;
//    }

    @Bean
    public MemberService memberService() {
        return new MemberService(memberRepository); // <-- 여기 고침
    }

//    @Bean
//    public MemberRepository memberRepository() {
//        //return new JpaMemberRepository(em);
//    }

}
