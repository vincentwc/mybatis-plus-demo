package com.vincent.pmsdemo.mapper;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.vincent.pmsdemo.common.bean.UserVo;
import com.vincent.pmsdemo.entity.Role;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author vincent
 */
public interface RoleMapper extends BaseMapper<Role> {

    /**
     * 根据指定的userId去user和user_role关联表查出该user所属role列表
     *
     * @param userId
     * @return
     */

    @Select("select * from role left join user_role on role.id=user_role.role_id  where user_role.user_id=#{userId}")
    List<Role> getListByUserId(Integer userId);


}
