package com.pandawork.test;

import com.pandawork.common.entity.Leason;
import com.pandawork.service.LeasonService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by chenyaosakai on 15/9/11.
 */
public class LeasonServiceTest extends AbstractTestCase {
    @Autowired
    private LeasonService leasonService;
    @Test
    public void update() throws Exception {
        Leason leason = new Leason();
        leason.setId(1);
        leason.setLeasonName("ssdsa");
        leason.setTeacher("aaaa");
        leasonService.update(leason);
        leasonService.queryById(1);
        leasonService.listAll();
        leasonService.queryByName("ssdsa");
    }
}
