package com.vincent.pmsdemo.mapper;

import java.util.List;

import com.vincent.pmsdemo.entity.ZtStory;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * @author vincent
 */
public interface ZtStoryMapper extends BaseMapper<ZtStory> {

	List<ZtStory> getStoryByProductId(String productId);
}
