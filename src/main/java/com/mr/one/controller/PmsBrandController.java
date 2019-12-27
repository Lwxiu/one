package com.mr.one.controller;


import com.mr.one.common.CommonPage;
import com.mr.one.common.CommonResult;
import com.mr.one.entity.PmsBrand;
import com.mr.one.service.PmsBrandInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
public class PmsBrandController{

    @Autowired
    private PmsBrandInfoService brandService;

   @GetMapping("list")
   @ResponseBody
    public CommonResult<CommonPage<PmsBrand>> getBingList(Integer pageNum,Integer pageSize){
       List<PmsBrand> list = brandService.getBingList(pageNum,pageSize);
       return  CommonResult.success(CommonPage.restPage(list));
    }

    @RequestMapping(value="delete/{id}")
    @ResponseBody
    public CommonResult<CommonPage<PmsBrand>> delete(@PathVariable("id") Integer id){
        int count = brandService.delete(id);
            if(count ==1){
                return CommonResult.success(null);
            }else{
                return  CommonResult.failed();
            }
    }


    @RequestMapping(value="updateById/{id}")
    @ResponseBody
    public CommonResult<CommonPage<PmsBrand>> updateById(@PathVariable("id") Long id){
        brandService.updateById(id);
        return CommonResult.failed();
    }


}
