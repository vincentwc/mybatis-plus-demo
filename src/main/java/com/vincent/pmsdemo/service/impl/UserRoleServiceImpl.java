package com.vincent.pmsdemo.service.impl;

import com.vincent.pmsdemo.entity.UserRole;
import com.vincent.pmsdemo.mapper.UserRoleMapper;
import com.vincent.pmsdemo.service.IUserRoleService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * @author vincent
 */
@Service
public class UserRoleServiceImpl extends ServiceImpl<UserRoleMapper, UserRole> implements IUserRoleService {

}
