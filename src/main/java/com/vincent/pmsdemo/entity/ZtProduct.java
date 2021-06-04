package com.vincent.pmsdemo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;

import java.time.LocalDateTime;

import com.baomidou.mybatisplus.annotation.TableField;

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
public class ZtProduct implements Serializable {

	private static final long serialVersionUID = 1L;

	@TableId(value = "id", type = IdType.AUTO)
	private Integer id;

	private String name;

	private String code;

	private Integer line;

	private String type;

	private String status;

	@TableField("subStatus")
	private String substatus;

	private String desc;

	@TableField("PO")
	private String po;

	@TableField("QD")
	private String qd;

	@TableField("RD")
	private String rd;

	private String feedback;

	private String acl;

	private String whitelist;

	@TableField("createdBy")
	private String createdby;

	@TableField("createdDate")
	private LocalDateTime createddate;

	@TableField("createdVersion")
	private String createdversion;

	private Integer order;

	private String deleted;

}
