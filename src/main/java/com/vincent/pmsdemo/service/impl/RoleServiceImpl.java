package com.vincent.pmsdemo.service.impl;

import com.vincent.pmsdemo.entity.Role;
import com.vincent.pmsdemo.mapper.RoleMapper;
import com.vincent.pmsdemo.service.IRoleService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * @author vincent
 */
@Service
public class RoleServiceImpl extends ServiceImpl<RoleMapper, Role> implements IRoleService {

}
