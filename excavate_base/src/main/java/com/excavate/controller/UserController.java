package com.excavate.controller;

import org.apache.ibatis.annotations.Param;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
    @RequestMapping("/test")
    public String testRest(@RequestParam(value = "result",required = true) String result){
        Logger logger = LoggerFactory.getLogger(UserController.class);
        logger.debug(result);
        logger.info(result);
        int  i = 1/0;
        logger.error(result);
        return result;
    }
}
