package com.vincent.pmsdemo.entity;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
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
public class ZtTask implements Serializable {

	private static final long serialVersionUID = 1L;

	@TableId(value = "id", type = IdType.AUTO)
	private Integer id;

	private Integer parent;

	private Integer project;

	private Integer module;

	private Integer story;

	@TableField("storyVersion")
	private Integer storyversion;

	@TableField("fromBug")
	private Integer frombug;

	private Integer feedback;

	private String name;

	private String type;

	private Integer pri;

	private Float estimate;

	private Float consumed;

	private Float left;

	private LocalDate deadline;

	private String status;

	@TableField("subStatus")
	private String substatus;

	private String color;

	private String mailto;

	private String desc;

	@TableField("openedBy")
	private String openedby;

	@TableField("openedDate")
	private LocalDateTime openeddate;

	@TableField("assignedTo")
	private String assignedto;

	@TableField("Team")
	private String team;

	@TableField("assignedDate")
	private LocalDateTime assigneddate;

	@TableField("estStarted")
	private LocalDate eststarted;

	@TableField("realStarted")
	private LocalDate realstarted;

	@TableField("finishedBy")
	private String finishedby;

	@TableField("finishedDate")
	private LocalDateTime finisheddate;

	@TableField("finishedList")
	private String finishedlist;

	@TableField("canceledBy")
	private String canceledby;

	@TableField("canceledDate")
	private LocalDateTime canceleddate;

	@TableField("closedBy")
	private String closedby;

	@TableField("closedDate")
	private LocalDateTime closeddate;

	@TableField("closedReason")
	private String closedreason;

	@TableField("lastEditedBy")
	private String lasteditedby;

	@TableField("lastEditedDate")
	private LocalDateTime lastediteddate;

	private String deleted;

	@TableField("workingtimeBy")
	private String workingtimeby;

	@TableField("workingtimeDate")
	private LocalDateTime workingtimedate;

}
