package com.pandawork.service;

import com.pandawork.common.entity.Score;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by chenyaosakai on 15/9/11.
 */
public interface ScoreService {
    public int queryScore(@Param("score") Score score) throws Exception;
    public List<Score> listAll() throws Exception;
    public void insertScore(@Param("score")Score score) throws Exception;

}
