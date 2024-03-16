package com.example.library.controller;
import com.example.library.entity.Member;
import com.example.library.service.MemberService ;
import com.example.library.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/api")
public class MemberController {
    @Autowired
    MemberService memberservice;//取得Service物件

    @GetMapping("/members")
    public Iterable<Member> getMemberList () {
        Iterable<Member> memberList = memberservice.getMembers();
        return memberList;
    }
}
