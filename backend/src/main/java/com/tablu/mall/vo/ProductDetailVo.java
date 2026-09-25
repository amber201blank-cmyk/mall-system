package com.tablu.mall.vo;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
//用于展示商品详细数据
public class ProductDetailVo {

    private Integer id;

    private Integer categoryId;

    private Byte markId;

    private String name;

    private String subtitle;

    private String mainImage;

    private String subImages;

    private String detail;

    private BigDecimal price;

    private Integer stock;

    private Integer status;

    private Date createTime;

    private Date updateTime;
}
