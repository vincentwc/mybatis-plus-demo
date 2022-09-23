package com.vincent.pmsdemo.service.impl;

import com.vincent.pmsdemo.entity.SysUser;
import com.vincent.pmsdemo.mapper.SysUserMapper;
import com.vincent.pmsdemo.service.ISysUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * @author vincent
 */
@Service
public class SysUserServiceImpl extends ServiceImpl<SysUserMapper, SysUser> implements ISysUserService {

}
