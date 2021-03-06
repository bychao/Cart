package com.shike.vo;

import java.sql.Timestamp;

/**
 * Created by shike on 16/4/29.
 */
public class CartQuery {
    //自增主键
    private Long id;
    //购物车Id
    private String cartId;
    //用户Id
    private String userId;
    //状态
    private Integer status;

    //sku
    private String skuId;
    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setCartId(String cartId) {
        this.cartId = cartId;
    }

    public String getCartId() {
        return cartId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getSkuId() {
        return skuId;
    }

    public void setSkuId(String skuId) {
        this.skuId = skuId;
    }
}
