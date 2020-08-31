package com.zmq.service.impl;

import com.zmq.entity.VHero;
import com.zmq.mapper.VHeroMapper;
import com.zmq.service.VHeroService;

import java.util.List;

/**
 * @author zmq
 * @date 2020/8/31
 * @since 1.8
 */
public class VHeroServiceImpl implements VHeroService {
    private VHeroMapper vHeroMapper;

    @Override
    public List<VHero> queryAllVHero() {
        return vHeroMapper.queryAllVHero();
    }

    @Override
    public int deleteInfoById(Integer id) {
        int i = vHeroMapper.deleteInfoById(id);
//        int a = 1/0;
        return i;
    }

    public void setvHeroMapper(VHeroMapper vHeroMapper) {
        this.vHeroMapper = vHeroMapper;
    }
}
