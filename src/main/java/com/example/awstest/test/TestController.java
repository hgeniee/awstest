package com.example.awstest.test;

// 컨트롤러

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    private MemberRepository memberRepository;
    @Autowired
    private MemberService memberService;

    @GetMapping("/myname")
    public String test() {
        return "제 이름은 이현진입니다.";
    }

    @PostMapping("/myintro")
    public Member myIntro(@RequestBody Member member) {
        return memberService.myIntro(member);
    }

}
