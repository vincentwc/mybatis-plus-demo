package com.vincent.pmsdemo.service.impl;

import java.util.List;

import com.vincent.pmsdemo.entity.ZtStory;
import com.vincent.pmsdemo.mapper.ZtStoryMapper;
import com.vincent.pmsdemo.service.IZtStoryService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * @author vincent
 */
@Service
public class ZtStoryServiceImpl extends ServiceImpl<ZtStoryMapper, ZtStory> implements IZtStoryService {

	@Override
	public List<ZtStory> getStoryByProductId(String productId) {
		return this.baseMapper.getStoryByProductId(productId);
	}
}
