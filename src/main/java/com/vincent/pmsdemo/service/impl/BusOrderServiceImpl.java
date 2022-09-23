package com.vincent.pmsdemo.service.impl;

import com.vincent.pmsdemo.entity.BusOrder;
import com.vincent.pmsdemo.mapper.BusOrderMapper;
import com.vincent.pmsdemo.service.IBusOrderService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * @author vincent
 */
@Service
public class BusOrderServiceImpl extends ServiceImpl<BusOrderMapper, BusOrder> implements IBusOrderService {

}
