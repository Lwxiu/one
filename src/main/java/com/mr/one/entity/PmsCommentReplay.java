package com.mr.one.entity;

import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 产品评价回复表
 * </p>
 *
 * @author yangxy
 * @since 2019-12-25
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class PmsCommentReplay implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long commentId;

    private String memberNickName;

    private String memberIcon;

    private String content;

    private LocalDateTime createTime;

    /**
     * 评论人员类型；0->会员；1->管理员
     */
    private Integer type;


}
