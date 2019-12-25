package com.mr.one.entity;

import java.math.BigDecimal;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 产品满减表(只针对同商品)
 * </p>
 *
 * @author yangxy
 * @since 2019-12-25
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class PmsProductFullReduction implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long productId;

    private BigDecimal fullPrice;

    private BigDecimal reducePrice;


}
