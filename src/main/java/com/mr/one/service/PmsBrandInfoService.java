package com.mr.one.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.mr.one.entity.PmsBrand;

import java.util.List;

public interface PmsBrandInfoService extends IService<PmsBrand> {
    List<PmsBrand> getBingList(Integer pageNum, Integer pageSize);
    int delete(Integer id);

    void updateById(Long id);
}
