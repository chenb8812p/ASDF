package com.pandawork.test;

import com.pandawork.common.entity.Score;
import com.pandawork.service.ScoreService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by chenyaosakai on 15/9/12.
 */
public class ScoreServiceTest extends AbstractTestCase {
    @Autowired
    private ScoreService scoreService;

    @Test
    public void queryScore() throws Exception {
        Score score = new Score();
        score.setStudentId(1);
        score.setLeasonId(1);
        score.setScore(scoreService.queryScore(score));
        System.out.println(  scoreService.queryScore(score) );
    }
}
