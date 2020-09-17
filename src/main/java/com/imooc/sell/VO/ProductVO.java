package com.imooc.sell.VO;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

/**
 * 商品（包含类目）
 *
 * **/
@Data
public class ProductVO {

    @JsonProperty("name")
    /**@JsonProperty("name")
     * 前端返回为name，后台显示为categoryName
     * **/
    private String categoryName;
    @JsonProperty("type")
    private Integer categoryType;
    @JsonProperty("foods")
    private List<ProductInfoVO> productInfoVOList;
}
