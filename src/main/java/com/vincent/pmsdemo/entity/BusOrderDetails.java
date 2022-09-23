package com.vincent.pmsdemo.entity;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * 
 *
 * @author vincent
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class BusOrderDetails implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
            @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 商品名称
     */
    private String productName;

    /**
     * 商品规格
     */
    private String productSpec;

    /**
     * 商品价格
     */
    private BigDecimal productPrice;

    /**
     * 订单编号
     */
    private Integer orderId;


}
