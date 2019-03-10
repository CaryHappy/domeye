package cn.edu.bupt.nic.domeyeui.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Author：Cary Chen
 * Date：2019-03-10 17:10
 * Description：<描述>
 */
@Controller
@RequestMapping("/bgp")
public class BGPController {

    @RequestMapping("/hello")
    public String hello(){
        return "bgpIndex";
    }

}
