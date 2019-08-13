CREATE TABLE `dota2_data`.`hero` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `img` varchar(256) DEFAULT NULL COMMENT '图片url',
  `name` varchar(64) DEFAULT NULL COMMENT '英文名称',
  `local_name` varchar(64) NOT NULL COMMENT '中文名称',
  `primary_attr` varchar(64) NOT NULL COMMENT '主属性',
  `attribs` varchar(1024) NOT NULL COMMENT '英雄属性',
  `attack` varchar(16) NOT NULL COMMENT '攻击方式',
  `roles` varchar(64) NOT NULL COMMENT '英雄定位',
  `desc` varchar(2048) DEFAULT NULL COMMENT '英雄背景',
  `create_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  PRIMARY KEY (`id`),
  UNIQUE KEY `uk_local_name` (`local_name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE `dota2_data`.`item` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `img` varchar(256) NOT NULL COMMENT '图片url',
  `name` varchar(64) DEFAULT NULL COMMENT '英文名称',
  `local_name` varchar(64) NOT NULL COMMENT '中文名称',
  `qual` varchar(64) NOT NULL COMMENT '物品类型：消耗品',
  `mc` varchar(32) DEFAULT NULL COMMENT '魔法消耗',
  `cd` int(8) DEFAULT NULL COMMENT 'cd',
  `attrib` varchar(1024) NOT NULL COMMENT '物品属性',
  `desc` varchar(2048) NOT NULL COMMENT '使用描述',
  `lore` varchar(2048) NOT NULL COMMENT '物品介绍',
  `components` varchar(2048) DEFAULT NULL COMMENT '配方',
  `created` tinyint(4) DEFAULT NULL COMMENT '是否由合成而来',
  `create_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  PRIMARY KEY (`id`),
  UNIQUE KEY `uk_local_name` (`local_name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE `dota2_data`.`skill` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `hero_id` int(11) DEFAULT NULL,
  `img` varchar(256) DEFAULT NULL COMMENT '图片url',
  `name` varchar(64) DEFAULT NULL COMMENT '英文名称',
  `local_name` varchar(64) NOT NULL COMMENT '中文名称',
  `affects` varchar(1024) DEFAULT NULL COMMENT '技能效果',
  `desc` varchar(2048) DEFAULT NULL COMMENT '技能描述',
  `notes` varchar(1024) DEFAULT NULL COMMENT '技能提示',
  `dmg` varchar(1024) DEFAULT NULL COMMENT '技能伤害',
  `attrib` varchar(1024) DEFAULT NULL COMMENT '技能升级属性1/2/3/4',
  `cmb` varchar(1024) DEFAULT NULL COMMENT '技能消耗',
  `lore` varchar(2048) DEFAULT NULL COMMENT '背景介绍',
  `hurl` varchar(256) DEFAULT NULL COMMENT '技能图片url',
  `create_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  PRIMARY KEY (`id`),
  UNIQUE KEY `name` (`name`),
  KEY `hero_id` (`hero_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;