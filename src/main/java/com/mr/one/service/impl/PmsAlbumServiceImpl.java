package com.mr.one.service.impl;

import com.mr.one.entity.PmsAlbum;
import com.mr.one.mapper.PmsAlbumMapper;
import com.mr.one.service.IPmsAlbumService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * <p>
 * 相册表 服务实现类
 * </p>
 *
 * @author yangxy
 * @since 2019-12-25
 */
@Service
public class PmsAlbumServiceImpl extends ServiceImpl<PmsAlbumMapper, PmsAlbum> implements IPmsAlbumService {

    @Resource
    private PmsAlbumMapper pmsMapper;
    @Override
    public Object demo() {
        Object aaa = pmsMapper.aaa();
        return aaa;
    }
}
