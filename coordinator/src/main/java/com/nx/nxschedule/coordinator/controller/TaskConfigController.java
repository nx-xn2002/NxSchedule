package com.nx.nxschedule.coordinator.controller;

import com.nx.nxschedule.coordinator.model.entity.TaskConfig;
import com.nx.nxschedule.coordinator.service.TaskConfigService;
import jakarta.annotation.Resource;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * task config controller
 *
 * @author nx-xn2002
 */
@RestController
@RequestMapping("/taskConfig")
public class TaskConfigController {
    @Resource
    private TaskConfigService taskConfigService;

    @GetMapping("/get")
    public TaskConfig getTaskConfig(String taskType) {
        return taskConfigService.getTaskConfigByType(taskType);
    }
}
