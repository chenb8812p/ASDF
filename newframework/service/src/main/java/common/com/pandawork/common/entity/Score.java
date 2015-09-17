package com.pandawork.common.entity;

import com.pandawork.core.common.entity.AbstractEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by chenyaosakai on 15/9/11.
 */
@Table(name = "t_score")
@Entity
public class Score extends AbstractEntity {
    @Id
    private Integer id;

    @Column(name = "student_id")
    private Integer  studentId;

    @Column(name = "leason_id")
    private Integer  leasonId;

    @Column(name = "score")
    private Integer score;

    private String studentName;

    private String leasonName;

    public String getLeasonName() {
        return leasonName;
    }

    public void setLeasonName(String leasonName) {
        this.leasonName = leasonName;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public Integer getId() {
        return id;
    }

    @Override
    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getLeasonId() {
        return leasonId;
    }

    public void setLeasonId(Integer leasonId) {
        this.leasonId = leasonId;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }
}
