package com.nx.nxschedule.coordinator.mapper;

import com.nx.nxschedule.coordinator.model.entity.TaskConfig;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * task config mapper
 *
 * @author nx-xn2002
 */
@Mapper
public interface TaskConfigMapper {

    /**
     * select by task type
     *
     * @param taskType task type
     * @return {@link TaskConfig }
     */
    TaskConfig selectByTaskType(String taskType);

    ///**
    // * insert
    // *
    // * @param config config
    // * @return boolean
    // */
    //boolean insert(TaskConfig config);
    //
    ///**
    // * update by task type
    // *
    // * @param config config
    // */
    //void updateByTaskType(TaskConfig config);
    //
    ///**
    // * delete by task type
    // *
    // * @param taskType task type
    // */
    //void deleteByTaskType(String taskType);
}





