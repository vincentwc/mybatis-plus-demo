package com.vincent.pmsdemo.service;

import java.util.List;

import com.vincent.pmsdemo.entity.ZtStory;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * @author vincent
 */

public interface IZtStoryService extends IService<ZtStory> {

	List<ZtStory> getStoryByProductId(String productId);
}
