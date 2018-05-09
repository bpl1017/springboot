package com.jk.dao;

import com.jk.model.Ren;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by new鹏 on 2018/5/4.
 */
@Mapper
public interface RenMapper {
    @Select("select * from t_ren")
    List<Ren> querylist();

}
