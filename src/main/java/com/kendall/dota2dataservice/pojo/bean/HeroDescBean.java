package com.kendall.dota2dataservice.pojo.bean;

import com.google.gson.annotations.SerializedName;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @description:英雄描述
 * @author: kendall
 * @since: 2019/8/1
 */
@NoArgsConstructor
@Data
public class HeroDescBean extends BaseBean {

    /**
     * name : 敌法师
     * bio : 当山下的王国被潮水般的侵略者们横扫的时候，星隐寺的僧侣们只是在山上默默的注视着那崎岖的山谷。苦行且务实的他们在偏远高山的寺院里，独自沉浸在远离尘嚣的冥想中，不受任何魔法元素或者神灵的干扰。然而，死亡之神的军队来了，带着摧毁所有信仰，并让当地人转而信奉死亡之神的虚无主义。带着他们千年的战乱和血雨腥风，死亡军团将他们打败的敌人的灵魂和尸骨撕裂，用这种恐怖来摧毁星隐寺的信仰。面对此等攻击，寺院只坚持了不到两个星期，甚至还有一些刚从冥想中醒来的僧侣认为，这些入侵者不过是恶魔用来干扰他们冥想的幻象，于是他们死在了自己的冥想垫上。只有一个人幸免于难，他是来星隐寺寻求智慧，却尚未得到寺院认可的侍僧。他惊恐地看着自己曾经侍奉过的僧侣们被杀，然后又被复活成为死亡之神的祭司。带着星隐寺残存的珍贵教义卷轴，他艰难地到达了一个相对安全的地方，他发誓，不仅要消灭死亡之神的魔法师，更要将“魔法”这个词从世上抹去。
     * atk : melee
     * atk_l : 近战
     * roles : ["Carry","Escape","Nuker"]
     * roles_l : ["核心","逃生","爆发"]
     */

    @SerializedName(alternate = "bio", value = "desc")
    private String desc;
    private String atk;
    private String atk_l;
    private List<String> roles;
    private List<String> roles_l;
}
