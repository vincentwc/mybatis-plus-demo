package com.vincent;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.vincent.pmsdemo.PmsDemoApplication;
import com.vincent.pmsdemo.common.bean.UserVo;
import com.vincent.pmsdemo.entity.User;
import com.vincent.pmsdemo.mapper.RoleMapper;
import com.vincent.pmsdemo.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author wang_cheng
 * @date 2022/09/21 15:29
 * @desc
 **/
@RunWith(SpringRunner.class)
@SpringBootTest(classes = PmsDemoApplication.class)
public class UserServiceImplTest {
    @Resource
    private UserMapper userMapper;

    @Resource
    private RoleMapper roleMapper;

    @Test
    public void getUserInfo() {

        QueryWrapper<User> wrapper = new QueryWrapper();
        wrapper.eq("id", 1);
        List<UserVo> list = userMapper.getList(wrapper);
        System.out.println(list);
    }
}

