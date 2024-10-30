package com.txl.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.txl.dao.UserDao;
import com.txl.entity.Params;
import com.txl.entity.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserService {
    //service---->dao
    @Resource
    private UserDao userDao;

    public List<User> findAll(){
       // return userDao.getUser();
        //3使用引入的包
        return userDao.selectAll();
    }

    public PageInfo<User> findBysearch(Params params) {
        //处理分页
        PageHelper.startPage(params.getPageNum(),params.getPageSize());
        //zidong fen ye cha xun
       List<User> list = userDao.findBysearch(params);
       return PageInfo.of(list);
    }

    public void add(User user) {
        if(user.getAge() == null){
            user.setAge(21);
        }
        userDao.insertSelective(user);
    }

    public void update(User user) {
        userDao.updateByPrimaryKeySelective(user);
    }

    public void delete(Integer id) {
        userDao.deleteByPrimaryKey(id);
    }
}
