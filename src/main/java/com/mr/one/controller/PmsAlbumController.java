package com.mr.one.controller;


import com.mr.one.service.IPmsAlbumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 相册表 前端控制器
 * </p>
 *
 * @author yangxy
 * @since 2019-12-25
 */
@RestController
@RequestMapping("/one/pms-album")
public class PmsAlbumController {

    @Autowired
    private IPmsAlbumService service;
    @RequestMapping("demo")
    @ResponseBody
    public void demo(){
       Object a =  service.demo();
        System.out.println(a);
    }


}
