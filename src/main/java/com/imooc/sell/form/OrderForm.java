package com.imooc.sell.form;

import lombok.Data;
import org.hibernate.validator.constraints.NotEmpty;

@Data
public class OrderForm {
    /**
     * 买家姓名
     */
    @NotEmpty(message = "姓名必填")
    private String name;
    /**
     * 买家手机号
     */
    @NotEmpty(message = "")
    private String phone;
    /**
     * 买家地址
     * **/
    @NotEmpty(message = "")
    private String address;
    /**
     * 买家微信openid
     * **/
    @NotEmpty(message = "openid必填")
    private String openid;
    /***
     * 购物车
     ***/
    @NotEmpty(message = "购物车不能为空")
    private String items;
}
