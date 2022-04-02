package com.sgq.jwt.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.sgq.jwt.dao.GoodsMapper;
import com.sgq.jwt.pojo.Goods;
import com.sgq.jwt.service.IGoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author : SGQ
 * @date : 2022-04-02 19:27
 **/

@Service
public class GoodsServiceImpl implements IGoodsService {
    @Autowired
    private GoodsMapper mapper;

    @Override
    public List<Goods> findAll() {

        QueryWrapper<Goods> queryWrapper = new QueryWrapper();
        queryWrapper.eq("id", 1);
        System.out.println(mapper.selectList(queryWrapper));

        LambdaQueryWrapper<Goods> lambdaQueryWrapper = new LambdaQueryWrapper();
        lambdaQueryWrapper.lt(Goods::getId,10);
        List<Goods> goodsList = mapper.selectList(lambdaQueryWrapper);
        System.out.println(goodsList);
        return goodsList;
    }


}