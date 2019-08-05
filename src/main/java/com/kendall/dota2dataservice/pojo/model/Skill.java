package com.kendall.dota2dataservice.pojo.model;

import java.io.Serializable;
import java.util.Date;

public class Skill implements Serializable {
    /**
     * This field corresponds to the database column skill.id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     * This field corresponds to the database column skill.hero_id
     *
     * @mbg.generated
     */
    private Integer heroId;

    /**
     * This field corresponds to the database column skill.img
     *
     * @mbg.generated
     */
    private String img;

    /**
     * This field corresponds to the database column skill.name
     *
     * @mbg.generated
     */
    private String name;

    /**
     * This field corresponds to the database column skill.local_name
     *
     * @mbg.generated
     */
    private String localName;

    /**
     * This field corresponds to the database column skill.affects
     *
     * @mbg.generated
     */
    private String affects;

    /**
     * This field corresponds to the database column skill.desc
     *
     * @mbg.generated
     */
    private String desc;

    /**
     * This field corresponds to the database column skill.notes
     *
     * @mbg.generated
     */
    private String notes;

    /**
     * This field corresponds to the database column skill.dmg
     *
     * @mbg.generated
     */
    private String dmg;

    /**
     * This field corresponds to the database column skill.attrib
     *
     * @mbg.generated
     */
    private String attrib;

    /**
     * This field corresponds to the database column skill.cmb
     *
     * @mbg.generated
     */
    private String cmb;

    /**
     * This field corresponds to the database column skill.lore
     *
     * @mbg.generated
     */
    private String lore;

    /**
     * This field corresponds to the database column skill.hurl
     *
     * @mbg.generated
     */
    private String hurl;

    /**
     * This field corresponds to the database column skill.create_time
     *
     * @mbg.generated
     */
    private Date createTime;

    /**
     * This field corresponds to the database column skill.update_time
     *
     * @mbg.generated
     */
    private Date updateTime;

    /**
     * This field corresponds to the database table skill
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column skill.id
     *
     * @return the value of skill.id
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column skill.id
     *
     * @param id the value for skill.id
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column skill.hero_id
     *
     * @return the value of skill.hero_id
     * @mbg.generated
     */
    public Integer getHeroId() {
        return heroId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column skill.hero_id
     *
     * @param heroId the value for skill.hero_id
     * @mbg.generated
     */
    public void setHeroId(Integer heroId) {
        this.heroId = heroId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column skill.img
     *
     * @return the value of skill.img
     * @mbg.generated
     */
    public String getImg() {
        return img;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column skill.img
     *
     * @param img the value for skill.img
     * @mbg.generated
     */
    public void setImg(String img) {
        this.img = img == null ? null : img.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column skill.name
     *
     * @return the value of skill.name
     * @mbg.generated
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column skill.name
     *
     * @param name the value for skill.name
     * @mbg.generated
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column skill.local_name
     *
     * @return the value of skill.local_name
     * @mbg.generated
     */
    public String getLocalName() {
        return localName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column skill.local_name
     *
     * @param localName the value for skill.local_name
     * @mbg.generated
     */
    public void setLocalName(String localName) {
        this.localName = localName == null ? null : localName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column skill.affects
     *
     * @return the value of skill.affects
     * @mbg.generated
     */
    public String getAffects() {
        return affects;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column skill.affects
     *
     * @param affects the value for skill.affects
     * @mbg.generated
     */
    public void setAffects(String affects) {
        this.affects = affects == null ? null : affects.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column skill.desc
     *
     * @return the value of skill.desc
     * @mbg.generated
     */
    public String getDesc() {
        return desc;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column skill.desc
     *
     * @param desc the value for skill.desc
     * @mbg.generated
     */
    public void setDesc(String desc) {
        this.desc = desc == null ? null : desc.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column skill.notes
     *
     * @return the value of skill.notes
     * @mbg.generated
     */
    public String getNotes() {
        return notes;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column skill.notes
     *
     * @param notes the value for skill.notes
     * @mbg.generated
     */
    public void setNotes(String notes) {
        this.notes = notes == null ? null : notes.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column skill.dmg
     *
     * @return the value of skill.dmg
     * @mbg.generated
     */
    public String getDmg() {
        return dmg;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column skill.dmg
     *
     * @param dmg the value for skill.dmg
     * @mbg.generated
     */
    public void setDmg(String dmg) {
        this.dmg = dmg == null ? null : dmg.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column skill.attrib
     *
     * @return the value of skill.attrib
     * @mbg.generated
     */
    public String getAttrib() {
        return attrib;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column skill.attrib
     *
     * @param attrib the value for skill.attrib
     * @mbg.generated
     */
    public void setAttrib(String attrib) {
        this.attrib = attrib == null ? null : attrib.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column skill.cmb
     *
     * @return the value of skill.cmb
     * @mbg.generated
     */
    public String getCmb() {
        return cmb;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column skill.cmb
     *
     * @param cmb the value for skill.cmb
     * @mbg.generated
     */
    public void setCmb(String cmb) {
        this.cmb = cmb == null ? null : cmb.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column skill.lore
     *
     * @return the value of skill.lore
     * @mbg.generated
     */
    public String getLore() {
        return lore;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column skill.lore
     *
     * @param lore the value for skill.lore
     * @mbg.generated
     */
    public void setLore(String lore) {
        this.lore = lore == null ? null : lore.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column skill.hurl
     *
     * @return the value of skill.hurl
     * @mbg.generated
     */
    public String getHurl() {
        return hurl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column skill.hurl
     *
     * @param hurl the value for skill.hurl
     * @mbg.generated
     */
    public void setHurl(String hurl) {
        this.hurl = hurl == null ? null : hurl.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column skill.create_time
     *
     * @return the value of skill.create_time
     * @mbg.generated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column skill.create_time
     *
     * @param createTime the value for skill.create_time
     * @mbg.generated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column skill.update_time
     *
     * @return the value of skill.update_time
     * @mbg.generated
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column skill.update_time
     *
     * @param updateTime the value for skill.update_time
     * @mbg.generated
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table skill
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
        sb.append(", heroId=").append(heroId);
        sb.append(", img=").append(img);
        sb.append(", name=").append(name);
        sb.append(", localName=").append(localName);
        sb.append(", affects=").append(affects);
        sb.append(", desc=").append(desc);
        sb.append(", notes=").append(notes);
        sb.append(", dmg=").append(dmg);
        sb.append(", attrib=").append(attrib);
        sb.append(", cmb=").append(cmb);
        sb.append(", lore=").append(lore);
        sb.append(", hurl=").append(hurl);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}