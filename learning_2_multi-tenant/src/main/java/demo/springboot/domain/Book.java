package demo.springboot.domain;

import demo.springboot.bo.BaseForm;

import java.io.Serializable;

/**
 * 实体类
 *
 */
public class Book extends BaseForm implements Serializable {

    /**
     * 用户名
     */
    private String name;

    /**
     * 职位
     */
    private String position;
    /**
     * 简介
     */
    private String introduction;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

}
