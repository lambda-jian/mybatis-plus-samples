package com.baomidou.mybatisplus.samples.pagehelper;

import org.apache.ibatis.annotations.Mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author miemie
 * @since 2020-05-29
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {
    @Select("SELECT * FROM ${tableName}")
    List<People> getAllUsers(String tableName, Class resultType);
}
