package com.vincent.pmsdemo.entity;

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
public class ZtProjectstory implements Serializable {

	private static final long serialVersionUID = 1L;

	private Integer project;

	private Integer product;

	private Integer story;

	private Integer version;

	private Integer order;

}
