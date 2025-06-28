package com.nx.nxschedule.coordinator.model.entity;

import java.util.Date;

import lombok.Data;

/**
 * 任务配置
 *
 * @author nx-xn2002
 */
@Data
public class TaskConfig {
    /**
     * 任务类型
     */
    private String taskType;

    /**
     * 单次拉取上限
     */
    private Integer scheduleLimit;

    /**
     * 超时时间
     */
    private Integer maxProcessingTime;

    /**
     * 最大重试次数
     */
    private Integer maxRetryNum;

    /**
     * 重试间隔
     */
    private Integer retryInterval;

    /**
     * 最大重试间隔
     */
    private Integer maxRetryInterval;

    /**
     *
     */
    private Date createTime;

    /**
     *
     */
    private Date updateTime;
}