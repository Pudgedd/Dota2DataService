package com.kendall.dota2dataservice.pojo.vo;

import com.kendall.dota2dataservice.utils.Responsable;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @description:
 * @author: kendall
 * @since: 2019/7/30
 */
@NoArgsConstructor
@Data
public class PlayerVo implements Responsable {
    /**
     * id : 88521435
     * real_name :
     * name : kabu
     * nation : CN
     * position : 1
     */
    private int id;
    private String real_name;
    private String name;
    private String nation;
    private int position;
}
