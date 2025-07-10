package com.example.subin.spring.repository;

import com.example.subin.spring.domain.Member;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class MemoryMemberRepositoryTest {

    MemoryMemberRepository repository = new MemoryMemberRepository();

    @AfterEach
    public void afterEach() {
        repository.clearStore();
    }

    @Test
    public void save() {
        Member member = new Member();
        member.setName("subin");

        repository.save(member);

        Member result = repository.findById(member.getId()).get();
        Assertions.assertEquals(member, result);
    }

    @Test
    public void findByName() {
        Member member1 = new Member();
        member1.setName("subin1");
        repository.save(member1);

        Member member2 = new Member();
        member2.setName("subin2");
        repository.save(member2);

        Member result = repository.findByName("subin1").get();
        Assertions.assertEquals(result, member1);
    }


    @Test
    public void findAll() {
        Member member1 = new Member();
        member1.setName("subin");
        repository.save(member1);

        Member member2 = new Member();
        member2.setName("subin2");
        repository.save(member2);

        List<Member> result = repository.findAll();
        Assertions.assertEquals(result.size(), 2);

    }

}
