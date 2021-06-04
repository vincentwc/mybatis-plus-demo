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
public class ZtStory implements Serializable {

	private static final long serialVersionUID = 1L;

	@TableId(value = "id", type = IdType.AUTO)
	private Integer id;

	private Integer product;

	private Integer branch;

	private Integer module;

	private String plan;

	private String source;

	@TableField("sourceNote")
	private String sourcenote;

	@TableField("fromBug")
	private Integer frombug;

	private Integer feedback;

	private String title;

	private String keywords;

	private String type;

	private Integer pri;

	private String apri;

	private Float estimate;

	private String status;

	@TableField("subStatus")
	private String substatus;

	private String color;

	private String stage;

	@TableField("stagedBy")
	private String stagedby;

	private String mailto;

	@TableField("openedBy")
	private String openedby;

	@TableField("openedDate")
	private LocalDateTime openeddate;

	@TableField("assignedTo")
	private String assignedto;

	@TableField("assignedDate")
	private LocalDateTime assigneddate;

	@TableField("lastEditedBy")
	private String lasteditedby;

	@TableField("lastEditedDate")
	private LocalDateTime lastediteddate;

	@TableField("reviewedBy")
	private String reviewedby;

	@TableField("reviewedDate")
	private LocalDate revieweddate;

	@TableField("closedBy")
	private String closedby;

	@TableField("closedDate")
	private LocalDateTime closeddate;

	@TableField("closedReason")
	private String closedreason;

	@TableField("toBug")
	private Integer tobug;

	@TableField("childStories")
	private String childstories;

	@TableField("linkStories")
	private String linkstories;

	@TableField("duplicateStory")
	private Integer duplicatestory;

	private Integer version;

	private String deleted;

}
