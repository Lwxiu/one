package com.mr.one.service.impl;

import com.mr.one.entity.PmsProduct;
import com.mr.one.mapper.PmsProductMapper;
import com.mr.one.service.IPmsProductService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 商品信息 服务实现类
 * </p>
 *
 * @author yangxy
 * @since 2019-12-25
 */
@Service
public class PmsProductServiceImpl extends ServiceImpl<PmsProductMapper, PmsProduct> implements IPmsProductService {

}
