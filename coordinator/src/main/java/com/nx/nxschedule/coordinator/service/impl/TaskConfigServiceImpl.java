package com.nx.nxschedule.coordinator.service.impl;

import com.nx.nxschedule.coordinator.mapper.TaskConfigMapper;
import com.nx.nxschedule.coordinator.model.entity.TaskConfig;
import com.nx.nxschedule.coordinator.service.TaskConfigService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

/**
 * task config service impl
 *
 * @author nx-xn2002
 */
@Service
public class TaskConfigServiceImpl implements TaskConfigService {
    @Resource
    private TaskConfigMapper taskConfigMapper;



    @Override
    public TaskConfig getTaskConfigByType(String taskType) {
        return taskConfigMapper.selectByTaskType(taskType);
    }
}




