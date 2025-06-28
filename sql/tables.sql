create database if not exists nx_schedule;

use nx_schedule;

create table if not exists `task_config`
(
    taskType          varchar(256) not null comment '任务类型',
    scheduleLimit     int(11)  default 0 comment '单次拉取上限',
    maxProcessingTime int(11)  default 10 comment '超时时间',
    maxRetryNum       int(11)  default 0 comment '最大重试次数',
    retryInterval     int(11)  default null comment '重试间隔',
    maxRetryInterval  int(11)  default null comment '最大重试间隔',
    createTime        datetime default current_timestamp,
    updateTime        datetime default current_timestamp on update current_timestamp,
    primary key (taskType)
) comment '任务配置表'

