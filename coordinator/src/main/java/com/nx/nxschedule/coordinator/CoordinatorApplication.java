package com.nx.nxschedule.coordinator;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * coordinator application
 *
 * @author nx-xn2002
 */
@SpringBootApplication
@MapperScan("com.nx.nxschedule.coordinator.mapper")
public class CoordinatorApplication {
    public static void main(String[] args) {
        SpringApplication.run(CoordinatorApplication.class, args);
    }
}
