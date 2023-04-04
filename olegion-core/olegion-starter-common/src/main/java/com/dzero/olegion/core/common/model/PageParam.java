package com.dzero.olegion.core.common.model;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.io.Serializable;

/**
 * 分页参数
 */
@Data
public class PageParam  implements Serializable {
    private static final Long PAGE_NO = 1L;
    private static final Long PAGE_SIZE = 10L;

    @NotNull(message = "页码不能为空")
    @Min(value = 1, message = "页码最小值为 1")
    private Long pageNo = PAGE_NO;

    @NotNull(message = "每页条数不能为空")
    @Min(value = 1, message = "每页条数最小值为 1")
    @Max(value = 100, message = "每页条数最大值为 100")
    private Long pageSize = PAGE_SIZE;
}
