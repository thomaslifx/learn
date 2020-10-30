package com.boil.my.mapper;


import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * @Description   继承自己的MyMapper
 * @author lifuxiang
 * @date 2020/10/29 9:47
 */
public interface MyMapper<T> extends Mapper<T>, MySqlMapper<T> {
}
