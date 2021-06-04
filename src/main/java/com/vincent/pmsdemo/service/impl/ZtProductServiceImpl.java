package com.vincent.pmsdemo.service.impl;

import com.vincent.pmsdemo.entity.ZtProduct;
import com.vincent.pmsdemo.mapper.ZtProductMapper;
import com.vincent.pmsdemo.service.IZtProductService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * @author vincent
 */
@Service
public class ZtProductServiceImpl extends ServiceImpl<ZtProductMapper, ZtProduct> implements IZtProductService {

}
