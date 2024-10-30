package com.txl.controller;

import com.github.pagehelper.PageInfo;
import com.txl.common.Result;
import com.txl.entity.Params;
import com.txl.entity.User;
import com.txl.service.UserService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping ("/user")
public class UserController {

    //control ----> service
    @Resource
    private UserService userService;

    @PostMapping
    public Result save(@RequestBody User user){
        if(user.getId() == null){
            userService.add(user);
        }
        else{
            userService.update(user);
        }
        return Result.sucess();
    }
    @GetMapping()
    public Result findAll(){
        List<User> list = userService.findAll();
        return Result.sucess(list);
    }

    @GetMapping("/search")
    public Result findBysearch(Params params){
        PageInfo<User> info = userService.findBysearch(params);
        return Result.sucess(info);
    }

    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id){
        userService.delete(id);
        return Result.sucess();
    }
}
