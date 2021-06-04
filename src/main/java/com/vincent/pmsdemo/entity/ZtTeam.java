package com.vincent.pmsdemo.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
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
public class ZtTeam implements Serializable {

	private static final long serialVersionUID = 1L;

	@TableId(value = "id", type = IdType.AUTO)
	private Integer id;

	private Integer root;

	private String type;

	private String account;

	private String role;

	private String limited;

	private LocalDate join;

	private Integer days;

	private Float hours;

	private BigDecimal estimate;

	private BigDecimal consumed;

	private BigDecimal left;

	private Integer order;

}
