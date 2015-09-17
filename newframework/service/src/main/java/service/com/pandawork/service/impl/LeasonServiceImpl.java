package com.pandawork.service.impl;

import com.pandawork.common.entity.Leason;
import com.pandawork.common.utils.NFException;
import com.pandawork.core.common.exception.SSException;
import com.pandawork.core.common.log.LogClerk;
import com.pandawork.core.common.util.Assert;
import com.pandawork.mapper.LeasonMapper;
import com.pandawork.service.LeasonService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by chenyaosakai on 15/9/11.
 */
@Service("LeasonService")
public class LeasonServiceImpl implements LeasonService {

    @Autowired
    private LeasonMapper leasonMapper;
    @Override
    public void update(@Param("leason") Leason leason) throws Exception {
        try {
            leasonMapper.update(leason);
        } catch (Exception e) {
            LogClerk.errLog.error(e);
            throw SSException.get(NFException.SystemException, e);
        }
    }

    @Override
    public Leason queryById(@Param("id") Integer id) throws Exception {
        if (Assert.lessOrEqualZero(id)) {
            return null;
        }
        try {
            return leasonMapper.queryById(id);
        } catch (Exception e) {
            LogClerk.errLog.error(e);
            throw SSException.get(NFException.SystemException, e);
        }    }

    @Override
    public List<Leason> listAll() throws Exception {
        try {
            return leasonMapper.listAll();
        } catch (Exception e) {
            LogClerk.errLog.error(e);
            throw SSException.get(NFException.SystemException, e);
        }
    }

    @Override
    public Leason queryByName(@Param("name") String name) throws Exception {

        try {
            return leasonMapper.queryByName(name);
        } catch (Exception e) {
            LogClerk.errLog.error(e);
            throw SSException.get(NFException.SystemException, e);
        }       }
}
