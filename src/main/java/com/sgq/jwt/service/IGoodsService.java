package com.sgq.jwt.service;

import com.sgq.jwt.pojo.Goods;

import java.util.List;

public interface IGoodsService {

    List<Goods> findAll();
}
