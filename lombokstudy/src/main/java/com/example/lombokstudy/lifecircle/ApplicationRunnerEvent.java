package com.example.lombokstudy.lifecircle;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

/**
 * @Author: ww
 * @Date: 2021/5/18 16:08
 * @Description: 生命周期函数
 */
@Component
@Slf4j
public class ApplicationRunnerEvent implements ApplicationRunner {
    @Override
    public void run(ApplicationArguments args) throws Exception {
        log.debug("--------debug-----------application started!");
        log.info("--------info-----------application started!");
        try {
            int a = 1/0;
        } catch (Exception e) {
            log.error("--------error-----------application started!", e);
        }
        log.info("{} is a brilliant man", "ww");
    }
}
