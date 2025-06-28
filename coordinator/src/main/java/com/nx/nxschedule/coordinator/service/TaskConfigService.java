package com.nx.nxschedule.coordinator.service;

import com.nx.nxschedule.coordinator.model.entity.TaskConfig;

/**
 * task config service
 *
 * @author nx-xn2002
 */
public interface TaskConfigService {
    /**
     * add task config
     *
     * @param taskType task type
     * @return boolean
     */
    TaskConfig getTaskConfigByType(String taskType);
}
