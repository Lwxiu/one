package com.mr.one.entity;

import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 产品的分类和属性的关系表，用于设置分类筛选条件（只支持一级分类）
 * </p>
 *
 * @author yangxy
 * @since 2019-12-25
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class PmsProductCategoryAttributeRelation implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long productCategoryId;

    private Long productAttributeId;


}
