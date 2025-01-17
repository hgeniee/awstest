package com.example.awstest.test;

import org.springframework.stereotype.Service;

@Service
public class MemberService {

    private final MemberRepository memberRepository;

    public MemberService(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    public Member myIntro(Member member) {
        return memberRepository.save(member);
    }
}
