package com.system.controller;

import com.system.po.PagingVO;
import com.system.po.StudentCustom;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @Description TODO
 * @Author ZHOUYAN
 * @Date 2021/5/12 2:53 下午
 */
public class UserController {
    @RequestMapping("/user")
    public String showStudent(Model model, Integer page) throws Exception {

        return "zhouyan";

    }

}
