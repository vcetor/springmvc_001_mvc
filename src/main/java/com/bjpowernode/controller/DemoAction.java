package com.bjpowernode.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller  //交给Spring去创建对象
@RequestMapping("/zar")
public class DemoAction {
    /**
     * action中所有的功能实现都是由方法来完成的
     * action方法的规范
     * public
     * 返回值任意
     * 名字任意
     * 参数任意
     * 需要@RequestMapping()
     */
    @RequestMapping("/demo")
    public String demo(){
        System.out.println("服务器被访问到了.....");
        return "main"; //可以直接跳转到/admin/main.jsp页面上
    }
    //测试GIT
}
