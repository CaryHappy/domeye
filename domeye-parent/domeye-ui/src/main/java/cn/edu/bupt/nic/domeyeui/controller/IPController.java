package cn.edu.bupt.nic.domeyeui.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Author：Cary Chen
 * Date：2019-03-10 17:15
 * Description：<描述>
 */
@Controller
@RequestMapping("/ip")
public class IPController {

    @RequestMapping("/hello")
    public String hello(){
        return "ipIndex";
    }
}
