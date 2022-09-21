package com.vincent.pmsdemo.service.impl;

import com.vincent.pmsdemo.entity.User;
import com.vincent.pmsdemo.mapper.UserMapper;
import com.vincent.pmsdemo.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * @author vincent
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
