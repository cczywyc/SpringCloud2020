package com.shterm.springcloud.entities;

import java.io.Serializable;

/**
 * 实体类
 * author: wangyc
 */
public class Payment implements Serializable {
    /** 订单id */
    private Long id;
    /** 订单流水号 */
    private String serial;

    public Payment() {
    }

    public Payment(Long id, String serial) {
        this.id = id;
        this.serial = serial;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }
}
