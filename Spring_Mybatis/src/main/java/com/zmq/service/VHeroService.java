package com.zmq.service;

import com.zmq.entity.VHero;

import java.util.List;

/**
 * @author zmq
 * @date 2020/8/31
 * @since 1.8
 */
public interface VHeroService {
    List<VHero> queryAllVHero();

    int deleteInfoById(Integer id);
}
