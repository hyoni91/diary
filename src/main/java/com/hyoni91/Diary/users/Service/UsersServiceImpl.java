package com.hyoni91.Diary.users.Service;


import com.hyoni91.Diary.users.VO.CateVO;
import com.hyoni91.Diary.users.VO.UsersVO;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("usersService")
public class UsersServiceImpl implements UsersService{

    @Autowired
    private SqlSessionTemplate sqlSession;

    @Override
    public boolean mailChk(String mail) {
        String mailChk = sqlSession.selectOne("usersMapper.mailChk", mail);
        return mailChk != null;
    }

    @Override
    public void join(UsersVO usersVO) {
        sqlSession.insert("usersMapper.join", usersVO);
    }

    @Override
    public UsersVO login(UsersVO usersVO) {
        return sqlSession.selectOne("usersMapper.login", usersVO);
    }

    @Override
    public List<CateVO> cateList() {
        return sqlSession.selectList("cateMapper.cateList");
    }


}
