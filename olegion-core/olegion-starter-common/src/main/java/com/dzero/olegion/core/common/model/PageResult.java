package com.dzero.olegion.core.common.model;

import lombok.Data;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Data
public class PageResult<T> implements Serializable {
    private List<T> list;

    private long total;

    private long pageNo;

    private long pageSize;

    public PageResult(Long total) {
        this.list = new ArrayList<>();
        this.total = total;
    }

    public static <T> PageResult<T> empty() {
        return new PageResult<>(0L);
    }

    // TODO: of()方法
}
