package com.kendall.dota2dataservice.pojo.vo;

import com.kendall.dota2dataservice.pojo.model.Skill;
import com.kendall.dota2dataservice.utils.Responsable;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

/**
 * @description:
 * @author: kendall
 * @since: 2019/8/25
 */
@NoArgsConstructor
@Data
public class HeroDetailVo implements Responsable {
    private Integer id;
    private String img;
    private String name;
    private String localName;
    private String primaryAttr;
    private AttributeVo attribute;
    private String attack;
    private String roles;
    private String desc;
    private List<Skill> skills;
    private Date createTime;
    private Date updateTime;
}
