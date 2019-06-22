package cn.itcast.controller;

import cn.itcast.domain.TbBrand;
import cn.itcast.domain.TbUser;
import cn.itcast.model.Result;
import cn.itcast.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@RequestMapping("/user")
@RestController
public class UserController {
    @Autowired
    private UserService userService;
    @RequestMapping("/login")
    public Result login(TbUser tbUser, HttpSession session){
        try {
            boolean login = userService.login(tbUser);
            if (login){
                session.setAttribute("user",tbUser);
            }
            return new Result(true,"登录成功");
        }catch (Exception e){
            e.printStackTrace();
            return new Result(false,e.getMessage());
        }
    }


}
