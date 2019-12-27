package com.mr.one.mapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.mr.one.entity.PmsBrand;

import java.util.List;

/**
 * <p>
 * 品牌表 Mapper 接口
 * </p>
 *
 * @author yangxy
 * @since 2019-12-25
 */
public interface PmsBrandMapper extends BaseMapper<PmsBrand> {
    List<PmsBrand> getBingList(Integer pageNum, Integer pageSize);
}
