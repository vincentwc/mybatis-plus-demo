package com.vincent.pmsdemo.mapper;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.vincent.pmsdemo.common.bean.UserVo;
import com.vincent.pmsdemo.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Many;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author vincent
 */
public interface UserMapper extends BaseMapper<User> {

//    @Select("select * from user where ${ew.SqlSegment}")
//    List<UserVo> getList(@Param("ew") QueryWrapper wrapper);


    @Select("select * from user where ${ew.SqlSegment}")
    @Results(
            {
                    @Result(column = "id", property = "id"),
                    @Result(column = "id", property = "roles",
                            many = @Many(select = "com.vincent.pmsdemo.mapper.RoleMapper.getListByUserId"))
            }
    )
    List<UserVo> getList(@Param("ew") QueryWrapper wrapper);


}
