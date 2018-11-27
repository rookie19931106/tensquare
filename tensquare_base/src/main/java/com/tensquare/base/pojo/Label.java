package com.tensquare.base.pojo;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * @author jay
 * @date 2018/11/27 23:52
 * 分布式实体必须实现序列化
 */

@Data
@Entity
@Table(name = "tb_label")
public class Label implements Serializable {

    /**
     * 主键
     */
    @Id
    private String id;
    //标签名称
    private String labelName;
    //状态
    private String state;
    //使用数量
    private Long count;
    //关注数
    private String recommend;
    //是否推荐
    private Long fans;


}
