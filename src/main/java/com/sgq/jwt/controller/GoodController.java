package com.sgq.jwt.controller;

import com.sgq.jwt.pojo.Goods;
import com.sgq.jwt.service.IGoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author : SGQ
 * @date : 2022-04-02 19:34
 **/
@RestController
@RequestMapping("/goods")
public class GoodController {
    @Autowired
    private IGoodsService service;

    @GetMapping("/findAll")
    public List<Goods> findAll(){
       return service.findAll();
    }
}