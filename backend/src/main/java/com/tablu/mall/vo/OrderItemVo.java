package com.tablu.mall.vo;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
//用于展示订单内商品
public class OrderItemVo {

    private Long orderNo;

    private Integer productId;

    private String productName;

    private String productImage;

    private BigDecimal currentUnitPrice;

    private Integer quantity;

    private BigDecimal totalPrice;

    private Date createTime;
}
