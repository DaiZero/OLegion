package com.dzero.olegion.core.common.model;

import lombok.Data;

import java.io.Serial;
import java.io.Serializable;

@Data
public class RspResult<T> implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    private boolean success;

    private String code;

    private String message;

    private long timestamp = System.currentTimeMillis();

    private T data;
}
