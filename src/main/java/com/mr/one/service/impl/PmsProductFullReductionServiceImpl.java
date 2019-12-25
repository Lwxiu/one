package com.mr.one.service.impl;

import com.mr.one.entity.PmsProductFullReduction;
import com.mr.one.mapper.PmsProductFullReductionMapper;
import com.mr.one.service.IPmsProductFullReductionService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 产品满减表(只针对同商品) 服务实现类
 * </p>
 *
 * @author yangxy
 * @since 2019-12-25
 */
@Service
public class PmsProductFullReductionServiceImpl extends ServiceImpl<PmsProductFullReductionMapper, PmsProductFullReduction> implements IPmsProductFullReductionService {

}
