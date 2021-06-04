package com.vincent.pmsdemo.entity;

import com.baomidou.mybatisplus.annotation.IdType;

import java.time.LocalDate;

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
public class ZtProject implements Serializable {

	private static final long serialVersionUID = 1L;

	@TableId(value = "id", type = IdType.AUTO)
	private Integer id;

	@TableField("isCat")
	private String iscat;

	@TableField("catID")
	private Integer catid;

	private String type;

	private Integer parent;

	private String name;

	private String code;

	private LocalDate begin;

	private LocalDate end;

	private Integer days;

	private String status;

	@TableField("subStatus")
	private String substatus;

	private String statge;

	private String pri;

	private String desc;

	@TableField("openedBy")
	private String openedby;

	@TableField("openedDate")
	private LocalDateTime openeddate;

	@TableField("openedVersion")
	private String openedversion;

	@TableField("closedBy")
	private String closedby;

	@TableField("closedDate")
	private LocalDateTime closeddate;

	@TableField("canceledBy")
	private String canceledby;

	@TableField("canceledDate")
	private LocalDateTime canceleddate;

	@TableField("PO")
	private String po;

	@TableField("PM")
	private String pm;

	@TableField("QD")
	private String qd;

	@TableField("RD")
	private String rd;

	private String team;

	private String acl;

	private String whitelist;

	private Integer order;

	private String deleted;

}
