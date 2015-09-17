package com.pandawork.service.impl;

import com.pandawork.common.entity.Score;
import com.pandawork.common.utils.NFException;
import com.pandawork.core.common.exception.SSException;
import com.pandawork.core.common.log.LogClerk;
import com.pandawork.core.common.util.Assert;
import com.pandawork.mapper.ScoreMapper;
import com.pandawork.service.LeasonService;
import com.pandawork.service.ScoreService;
import com.pandawork.service.StudentService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by chenyaosakai on 15/9/11.
 */
@Service("ScoreService")
public class ScoreServiceImpl implements ScoreService {

    @Autowired
    private ScoreMapper scoreMapper;
    @Autowired
    private StudentService studentService;
    @Autowired
    private LeasonService leasonService;

    /*
    传入带有 studentId 和 leasonId 字串的 Score 对象；
    通过其查找 score 属性；
     */
    @Override
    public int queryScore(@Param("score") Score score) throws Exception {
        if (Assert.isNull(score)) {
            return 0;
        }
        try {
          return scoreMapper.queryScore(score);
        } catch (Exception e) {
            LogClerk.errLog.error(e);
            throw SSException.get(NFException.SystemException, e);
        }
    }

    @Override
    public List<Score> listAll() throws Exception {
        try {
            return scoreMapper.listAll();
        } catch (Exception e) {
            LogClerk.errLog.error(e);
            throw SSException.get(NFException.SystemException, e);
        }    }

    @Override
    public void insertScore(@Param("score") Score score) throws Exception {
        if (Assert.isNull(score)) {
            return ;
        }

        // 判断用户名和密码是否为空
        Assert.isNotNull(score.getLeasonName(), NFException.UserNameNotNull);
        Assert.isNotNull(score.getStudentName(), NFException.PasswordNotNull);
        Assert.isNotNull(score.getScore(),NFException.PasswordNotNull);

        try {
            score.setStudentId(studentService.queryByName(score.getStudentName()).getId());
            score.setLeasonId(leasonService.queryByName(score.getLeasonName()).getId());
            scoreMapper.insertScore(score);
            return ;
        } catch (Exception e) {
            LogClerk.errLog.error(e);
            throw SSException.get(NFException.SystemException, e);
        }
    }
}
