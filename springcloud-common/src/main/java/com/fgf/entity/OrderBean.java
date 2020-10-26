package com.fgf.entity;

import lombok.Data;

import java.math.BigDecimal;
@Data
public class OrderBean {
    private Integer id;

    private String number;

    private String orderName;

    private BigDecimal price;

    private String orderdate;

    private Integer payId;
    private String payName;


}