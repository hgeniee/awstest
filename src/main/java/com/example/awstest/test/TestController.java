package com.example.awstest.test;

// 컨트롤러

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    private MemberRepository memberRepository;

    @GetMapping("test/api")
    public String test() {
        return "바보😛";
    }

    @PostMapping("test/rds")
    public String testRds() {
        Member member = new Member(1L, "test", "1234");
        memberRepository.save(member);
        return "ok";
    }

}
