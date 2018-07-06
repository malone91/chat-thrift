package com.zst.chat.listen;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.TimeUnit;

/**
 * Created by Ablert
 * on 2018/6/29.
 * @author Ablert
 */
public class ClientThread implements Runnable {

    private static volatile boolean runningFlag = true;

    private static final Logger LOGGER = LoggerFactory.getLogger(ClientThread.class);

    @Override
    public void run() {
        while (runningFlag) {
            System.out.println("正在读取数据");
            try {
                TimeUnit.SECONDS.sleep(3);
            } catch (InterruptedException e) {
                LOGGER.error("ClientThread run error", e);
            }
        }
    }
}
