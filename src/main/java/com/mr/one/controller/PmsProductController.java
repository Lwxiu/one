package com.mr.one.controller;


import com.mr.one.common.CommonPage;
import com.mr.one.common.CommonResult;
import com.mr.one.dto.PmsProductParam;
import com.mr.one.dto.PmsProductQueryParam;
import com.mr.one.model.PmsProduct;
import com.mr.one.service.IPmsProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * <p>
 * 商品信息 前端控制器
 * </p>
 *
 * @author yangxy
 * @since 2019-12-25
 */
@RestController
@RequestMapping("product")
public class PmsProductController {

    @Autowired
    private IPmsProductService pmsProductService;
    @RequestMapping("list")
    @ResponseBody
    public CommonResult list(PmsProductQueryParam queryParam, @RequestParam(value = "pageSize",defaultValue = "5")Integer pageSize,@RequestParam(value = "pageNum",defaultValue = "1")Integer pageNum){


        List<PmsProduct> list =pmsProductService.list(queryParam,pageSize,pageNum);

        return CommonResult.success(CommonPage.restPage(list));
    }


    @ResponseBody
    @RequestMapping(value = "/update/{id}",method = RequestMethod.POST)
    public CommonResult  update(@PathVariable Long id, @RequestBody PmsProductParam pmsProductParam){

        int i = pmsProductService.update(id, pmsProductParam);
        if(i >0){
            return CommonResult.success(i);
        }else{
            return CommonResult.failed("系统错误");
        }

    }


    @ResponseBody
    @RequestMapping(value = "/update/publishStatus",method = RequestMethod.POST)
    public CommonResult  updatePublishStatus(@RequestParam(value = "ids")List<Long> ids,@RequestParam(value = "publishStatus")Integer publishStatus){

        int i = pmsProductService.updatePublishStatus(ids, publishStatus);
        if(i >0){
            return CommonResult.success(i);
        }else{
            return CommonResult.failed("系统错误");
        }

    }

}
