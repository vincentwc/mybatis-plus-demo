package com.vincent;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.vincent.pmsdemo.PmsDemoApplication;
import com.vincent.pmsdemo.common.bean.UserVo;
import com.vincent.pmsdemo.entity.User;
import com.vincent.pmsdemo.mapper.RoleMapper;
import com.vincent.pmsdemo.mapper.UserMapper;
import com.vincent.pmsdemo.service.IUserService;
import com.vincent.pmsdemo.service.impl.UserServiceImpl;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.HashMap;
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


    @Resource
    private IUserService userService;

    /**
     * 演示通过用户ID查询用户和角色信息[多对多的查询]
     */
    @Test
    public void getUserInfo() {

        QueryWrapper<User> wrapper = new QueryWrapper();
        wrapper.eq("id", 1);
        List<UserVo> list = userMapper.getList(wrapper);
        System.out.println(list);
    }

    /**
     * 根据字段名称查询
     */
    @Test
    public void find() {
        HashMap<String, Object> map = new HashMap<>();
        String nickname = "aa";
        if (nickname != null) {
            map.put("nickname", nickname);
        }
        List<User> users = userService.listByMap(map);
        users.forEach(System.out::println);
    }


    /**
     * 分页
     */
    @Test
    public void find2() {
        HashMap<String, Object> map = new HashMap<>();
        String password = "123456";
        map.put("password", password);

        QueryWrapper<User> wrapper = new QueryWrapper<>();
        wrapper.allEq(map);
        wrapper.orderByDesc("id");
        Page<User> page = new Page<>(3, 1);
        Page<User> userPage = userService.page(page, wrapper);
        List<User> records = userPage.getRecords();
        records.forEach(System.out::println);
    }



    /**
     * 分页
     */
    @Test
    public void find3() {
        HashMap<String, Object> map = new HashMap<>();
        String password = "123456";
        map.put("password", password);
        map.put("nickname", null);
        QueryWrapper<User> wrapper = new QueryWrapper<>();
        /**
         * 如果map中参数值为null的时候，则忽略该字段参数
         */
        wrapper.allEq(map,false);
        Page<User> page = new Page<>(1, 1);
        Page<User> userPage = userService.page(page, wrapper);
        List<User> records = userPage.getRecords();
        records.forEach(System.out::println);
    }

}

