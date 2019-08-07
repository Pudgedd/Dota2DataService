package com.kendall.dota2dataservice.pojo.bean;

import com.google.gson.annotations.SerializedName;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @description:
 * @author: kendall
 * @since: 2019/8/1
 */
@NoArgsConstructor
@Data
public class AbilityBean extends BaseBean{

    /**
     * name : antimage_mana_break
     * dname : 法力损毁
     * affects : 技能： <span class="attribVal">被动</span><br />伤害类型： <span class="attribVal"><font color="#71a9ea">物理</font></span><br />无视技能免疫： <span class="attribVal">否</span><br />
     * desc : 每次攻击损毁目标一定量的魔法值，并额外造成相当于损毁魔法值50%的伤害。
     * notes : 法力损毁对技能免疫单位无效。<br />受到吸血光环的效果就能根据该技能造成的伤害吸血。
     * dmg : 攻击力: <span class="attribVal">0 / 0 / 0 / 0</span><br />
     * attrib : 每次攻击损毁魔法： <span class="attribVal">28 / 40 / 52 / 64</span>
     * cmb : <div class="cooldownMana"><div class="mana"><img alt="魔法消耗" title="魔法消耗" class="manaImg" src="http://cdn.dota2.com/apps/dota2/images/tooltips/mana.png" width="16" height="16" border="0" /> 0/0/0/0</div><div class="cooldown"><img alt="冷却时间" title="冷却时间" class="cooldownImg" src="http://cdn.dota2.com/apps/dota2/images/tooltips/cooldown.png" width="16" height="16" border="0" /> 0</div><br clear="left" /></div>
     * lore : 一种格斗技巧，改良自星隐寺僧侣们的温和招式，可以让魔法能量反噬其拥有者。
     * hurl : antimage
     */
    @SerializedName(alternate = "dname", value = "localName")
    private String localName;

    private String affects;
    private String desc;
    private String notes;
    private String dmg;
    private String attrib;
    private String cmb;
    private String lore;
    private String hurl;
}
