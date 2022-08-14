package com.designpatterns.prototype;

import java.util.Date;

public class SearchWord {

    private String keywrod;
    private Integer count;
    private Long lastUpdateTime;

    public String getKeywrod() {
        return keywrod;
    }

    public void setKeywrod(String keywrod) {
        this.keywrod = keywrod;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Long getLastUpdateTime() {
        return lastUpdateTime;
    }

    public void setLastUpdateTime(Long lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }
}
