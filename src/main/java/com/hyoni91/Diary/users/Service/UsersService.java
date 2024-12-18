package com.hyoni91.Diary.users.Service;

import com.hyoni91.Diary.users.VO.CateVO;
import com.hyoni91.Diary.users.VO.UsersVO;

import java.util.List;

public interface UsersService {
    //email check
    boolean mailChk(String mail);


    //join
    void join(UsersVO usersVO);

    //login
    UsersVO login(UsersVO usersVO);

    //cate list
    List<CateVO> cateList();
}
