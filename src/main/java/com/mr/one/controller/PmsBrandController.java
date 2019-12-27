package com.mr.one.controller;


import com.mr.one.entity.PmsBrand;
import com.mr.one.service.IPmsBrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 * 品牌表 前端控制器
 * </p>
 *
 * @author yangxy
 * @since 2019-12-25
 */
@RestController
@RequestMapping("/one/pms-brand")
public class PmsBrandController {
    @Autowired
    private IPmsBrandService pmsBrandService;

    @RequestMapping("list")
    public List<PmsBrand> getBingList(){
        List<PmsBrand> list = pmsBrandService.list();
        return list;
    }

}
