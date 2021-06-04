package com.vincent.pmsdemo.controller;


import java.util.List;

import com.vincent.pmsdemo.common.util.HttpResult;
import com.vincent.pmsdemo.entity.ZtStory;
import com.vincent.pmsdemo.service.IZtStoryService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author vincent
 */
@RestController
@RequestMapping("/zt-story")
@Api(value = "故事相关接口")
@Slf4j
public class ZtStoryController {

	@Autowired
	private IZtStoryService storyService;

	@GetMapping("/list")
	@ApiOperation(value = "获取列表", notes = "获取列表信息")
	public HttpResult getZtStoryList() {
		List<ZtStory> list = storyService.list();
		return HttpResult.success(list);
	}

	@GetMapping("/getById")
	@ApiOperation(value = "获取故事信息", notes = "根据故事id获取故事信息")
	public HttpResult getZtStoryListById(@RequestParam("id") String id) {
		ZtStory ztStory = storyService.getById(id);
		return HttpResult.success(ztStory);
	}

	@GetMapping("/getByProductId")
	@ApiOperation(value = "获取故事信息", notes = "根据产品id获取故事信息")
	public HttpResult getZtStoryListByProductId(@RequestParam("productId") String productId) {
		List<ZtStory> list = storyService.getStoryByProductId(productId);
		return HttpResult.success(list);
	}
}
