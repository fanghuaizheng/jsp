package cn.com.fhz.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by hzfang on 2018/3/16.
 */
@Controller
public class page2Go {

    @RequestMapping("login")
    public String go2Login(){
        return "/login";
    }
    @RequestMapping("head")
    public String go2Head(){
        return "header";
    }

}
