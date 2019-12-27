package com.mr.one.mapper;

import com.mr.one.entity.PmsProduct;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.mr.one.model.PmsProductExample;

import java.util.List;

/**
 * <p>
 * 商品信息 Mapper 接口
 * </p>
 *
 * @author yangxy
 * @since 2019-12-25
 */
public interface PmsProductMapper extends BaseMapper<PmsProduct> {

    List<com.mr.one.model.PmsProduct> selectByExample(PmsProductExample productExample);

    int updateByExampleSelective(PmsProduct record, PmsProductExample example);
}
