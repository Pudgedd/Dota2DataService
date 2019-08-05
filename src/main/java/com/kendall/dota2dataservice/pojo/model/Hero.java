package com.kendall.dota2dataservice.pojo.model;

import java.io.Serializable;
import java.util.Date;

public class Hero implements Serializable {
    /**
     * This field corresponds to the database column hero.id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     * This field corresponds to the database column hero.img
     *
     * @mbg.generated
     */
    private String img;

    /**
     * This field corresponds to the database column hero.name
     *
     * @mbg.generated
     */
    private String name;

    /**
     * This field corresponds to the database column hero.local_name
     *
     * @mbg.generated
     */
    private String localName;

    /**
     * This field corresponds to the database column hero.primary_attr
     *
     * @mbg.generated
     */
    private String primaryAttr;

    /**
     * This field corresponds to the database column hero.attribs
     *
     * @mbg.generated
     */
    private String attribs;

    /**
     * This field corresponds to the database column hero.attack
     *
     * @mbg.generated
     */
    private String attack;

    /**
     * This field corresponds to the database column hero.roles
     *
     * @mbg.generated
     */
    private String roles;

    /**
     * This field corresponds to the database column hero.desc
     *
     * @mbg.generated
     */
    private String desc;

    /**
     * This field corresponds to the database column hero.create_time
     *
     * @mbg.generated
     */
    private Date createTime;

    /**
     * This field corresponds to the database column hero.update_time
     *
     * @mbg.generated
     */
    private Date updateTime;

    /**
     * This field corresponds to the database table hero
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method returns the value of the database column hero.id
     *
     * @return the value of hero.id
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method sets the value of the database column hero.id
     *
     * @param id the value for hero.id
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method returns the value of the database column hero.img
     *
     * @return the value of hero.img
     * @mbg.generated
     */
    public String getImg() {
        return img;
    }

    /**
     * This method sets the value of the database column hero.img
     *
     * @param img the value for hero.img
     * @mbg.generated
     */
    public void setImg(String img) {
        this.img = img == null ? null : img.trim();
    }

    /**
     * This method returns the value of the database column hero.name
     *
     * @return the value of hero.name
     * @mbg.generated
     */
    public String getName() {
        return name;
    }

    /**
     * This method sets the value of the database column hero.name
     *
     * @param name the value for hero.name
     * @mbg.generated
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method returns the value of the database column hero.local_name
     *
     * @return the value of hero.local_name
     * @mbg.generated
     */
    public String getLocalName() {
        return localName;
    }

    /**
     * This method sets the value of the database column hero.local_name
     *
     * @param localName the value for hero.local_name
     * @mbg.generated
     */
    public void setLocalName(String localName) {
        this.localName = localName == null ? null : localName.trim();
    }

    /**
     * This method returns the value of the database column hero.primary_attr
     *
     * @return the value of hero.primary_attr
     * @mbg.generated
     */
    public String getPrimaryAttr() {
        return primaryAttr;
    }

    /**
     * This method sets the value of the database column hero.primary_attr
     *
     * @param primaryAttr the value for hero.primary_attr
     * @mbg.generated
     */
    public void setPrimaryAttr(String primaryAttr) {
        this.primaryAttr = primaryAttr == null ? null : primaryAttr.trim();
    }

    /**
     * This method returns the value of the database column hero.attribs
     *
     * @return the value of hero.attribs
     * @mbg.generated
     */
    public String getAttribs() {
        return attribs;
    }

    /**
     * This method sets the value of the database column hero.attribs
     *
     * @param attribs the value for hero.attribs
     * @mbg.generated
     */
    public void setAttribs(String attribs) {
        this.attribs = attribs == null ? null : attribs.trim();
    }

    /**
     * This method returns the value of the database column hero.attack
     *
     * @return the value of hero.attack
     * @mbg.generated
     */
    public String getAttack() {
        return attack;
    }

    /**
     * This method sets the value of the database column hero.attack
     *
     * @param attack the value for hero.attack
     * @mbg.generated
     */
    public void setAttack(String attack) {
        this.attack = attack == null ? null : attack.trim();
    }

    /**
     * This method returns the value of the database column hero.roles
     *
     * @return the value of hero.roles
     * @mbg.generated
     */
    public String getRoles() {
        return roles;
    }

    /**
     * This method sets the value of the database column hero.roles
     *
     * @param roles the value for hero.roles
     * @mbg.generated
     */
    public void setRoles(String roles) {
        this.roles = roles == null ? null : roles.trim();
    }

    /**
     * This method returns the value of the database column hero.desc
     *
     * @return the value of hero.desc
     * @mbg.generated
     */
    public String getDesc() {
        return desc;
    }

    /**
     * This method sets the value of the database column hero.desc
     *
     * @param desc the value for hero.desc
     * @mbg.generated
     */
    public void setDesc(String desc) {
        this.desc = desc == null ? null : desc.trim();
    }

    /**
     * This method returns the value of the database column hero.create_time
     *
     * @return the value of hero.create_time
     * @mbg.generated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method sets the value of the database column hero.create_time
     *
     * @param createTime the value for hero.create_time
     * @mbg.generated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method returns the value of the database column hero.update_time
     *
     * @return the value of hero.update_time
     * @mbg.generated
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method sets the value of the database column hero.update_time
     *
     * @param updateTime the value for hero.update_time
     * @mbg.generated
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method corresponds to the database table hero
     *
     * @mbg.generated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", img=").append(img);
        sb.append(", name=").append(name);
        sb.append(", localName=").append(localName);
        sb.append(", primaryAttr=").append(primaryAttr);
        sb.append(", attribs=").append(attribs);
        sb.append(", attack=").append(attack);
        sb.append(", roles=").append(roles);
        sb.append(", desc=").append(desc);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}