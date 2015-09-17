package com.pandawork.mapper;

import com.pandawork.common.entity.Leason;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by chenyaosakai on 15/9/11.
 */
public interface LeasonMapper {
    public List<Leason> listAll()throws Exception;
    public Leason queryById(@Param("id") Integer id)throws Exception;
    public void update(@Param("leason") Leason leason)throws Exception;
    public Leason queryByName(@Param("name") String name)throws Exception;

}
