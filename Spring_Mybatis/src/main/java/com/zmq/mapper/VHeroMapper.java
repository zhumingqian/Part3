package com.zmq.mapper;

import com.zmq.entity.VHero;

import java.util.List;

/**
 * @author zmq
 * @date 2020/8/31
 * @since 1.8
 */
public interface VHeroMapper {
    /**
     * 查询所有数据
     * @return
     */
    List<VHero> queryAllVHero();

    int deleteInfoById(Integer id);
}
