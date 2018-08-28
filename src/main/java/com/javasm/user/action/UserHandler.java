package com.javasm.user.action;

import com.javasm.user.model.UserModel;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("user")
public class UserHandler {

    @RequestMapping("/demo")
    @ResponseBody
    public String demo(){

      return "  This is a spring boot demo";
    }

    @RequestMapping("/model")
    @ResponseBody
    public UserModel model(Model model){

        UserModel user=new UserModel("Alex",1,"admin");
        model.addAttribute("adminUser",user);
        return user;
    }
    @RequestMapping("/listPage")
    public String jumpListPage(Model model){
        //测试th表达式接受数据
        UserModel user=new UserModel("Alex",1,"admin");
        model.addAttribute("adminUser",user);
        model.addAttribute("message","Hello,thank u!");

        //测试接受一个list 循环到表格
        List<UserModel> userList=new ArrayList<UserModel>(){
            {
            add(user);
                    add(new UserModel("Daniel", 2, "123"));
                    add(new UserModel("J", 3, "123"));
                    add(new UserModel("K", 2, "123"));
        }
        };
        model.addAttribute("userList",userList);
        return "user/list";
    }

    @RequestMapping("/login")
    public String jumpLoginPage(){

        return "login/login_page";
    }
}
