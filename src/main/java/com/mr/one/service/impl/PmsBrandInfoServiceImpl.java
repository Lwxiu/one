package com.mr.one.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.github.pagehelper.PageHelper;
import com.mr.one.entity.PmsBrand;
import com.mr.one.mapper.PmsBrandMapper;
import com.mr.one.service.PmsBrandInfoService;
import com.mr.one.util.RedisUtils;
import io.swagger.annotations.ApiImplicitParams;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class PmsBrandInfoServiceImpl extends ServiceImpl<PmsBrandMapper, PmsBrand> implements PmsBrandInfoService {

    @Resource
    private PmsBrandMapper pmsBrandMapper;
    @Autowired
    private RedisTemplate redisTemplate;
    @Autowired
    private RedisUtils redisUtils;
    @Override
    public List<PmsBrand> getBingList(Integer pageNum, Integer pageSize) {
      /*  List<PmsBrand> kv = (List<PmsBrand>) redisUtils.getKV("brand", "brandList");
        System.out.println(kv);
        if(kv == null && kv.isEmpty()){*/
        PageHelper.startPage(pageNum, pageSize);
        List<PmsBrand>  kv= pmsBrandMapper.getBingList(pageNum,pageSize);
           // redisUtils.setKV("brand","brandList",kv);

        //}
        return kv;
    }
    @Override
    public int delete(Integer id) {
        //Boolean hasKey = redisTemplate.hasKey(id);
        return pmsBrandMapper.deleteById(id);
    }

    @Override
    public void updateById(Long id) {
        pmsBrandMapper.selectById(id);
    }
}
