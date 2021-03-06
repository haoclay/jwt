package com.sgq.jwt.pojo;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import javax.persistence.criteria.CriteriaBuilder;
import java.math.BigDecimal;

/**
 * @author : SGQ
 * @date : 2022-04-02 19:22
 **/
@Data
@TableName(value = "goods")
public class Goods {
    @TableField("id")
    private Integer id ;
    @TableField("name")
    private String name ;
    @TableField("price")
    private BigDecimal price;
}