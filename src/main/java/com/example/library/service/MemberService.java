package com.example.library.service;
import com.example.library.dao.MemberDao;
import com.example.library.entity.Member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class MemberService {
    @Autowired
    MemberDao memberDao; // 取得Dao物件

    public Iterable<Member> getMembers () {
        return memberDao.findAll();
    }
}
