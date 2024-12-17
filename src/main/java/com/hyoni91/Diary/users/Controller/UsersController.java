package com.hyoni91.Diary.users.Controller;

import com.hyoni91.Diary.users.Service.UsersServiceImpl;
import com.hyoni91.Diary.users.VO.UsersVO;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.*;

@RestController
public class UsersController {
    @Resource(name = "usersService")
    private UsersServiceImpl usersService;

    @GetMapping("/mailChk/{mail}")
    public boolean mailChk(@PathVariable("mail") String mail){
        //mailChk는 null이 아니니? ture = null이 아니다 ---> 중복 / false = null이다 ---->  가입가능
        System.out.println("========================" + mail);

        return usersService.mailChk(mail);
    }

    @PostMapping("/join")
    public void join(@RequestBody UsersVO usersVO){
        usersService.join(usersVO);

    }

    @PostMapping("/login")
    public UsersVO login(@RequestBody UsersVO usersVO){
        //로그인 정보 없으면 빈값 (null뜸) --> 리액트는 빈 값
        System.out.println("======================="+usersVO);
        return usersService.login(usersVO);
    }

}
