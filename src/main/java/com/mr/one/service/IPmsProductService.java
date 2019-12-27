package com.mr.one.service;

import com.mr.one.dto.PmsProductParam;
import com.mr.one.dto.PmsProductQueryParam;
import com.mr.one.entity.PmsProduct;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 * 商品信息 服务类
 * </p>
 *
 * @author yangxy
 * @since 2019-12-25
 */
public interface IPmsProductService extends IService<PmsProduct> {

    List<com.mr.one.model.PmsProduct> list(PmsProductQueryParam queryParam, Integer pageSize, Integer pageNum);


    int update(Long id, PmsProductParam pmsProductParam);

    int updatePublishStatus(List<Long> ids, Integer publishStatus);
}
