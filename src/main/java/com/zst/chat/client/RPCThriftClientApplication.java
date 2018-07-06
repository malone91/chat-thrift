package com.zst.chat.client;

import com.zst.chat.listen.ClientThread;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * Created by Ablert
 * on 2018/6/18.
 * @author Ablert
 */
@SpringBootApplication
public class RPCThriftClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(RPCThriftClientApplication.class, args);
        //使用线程池的方式启动线程，将任务机制与执行机解耦，此为执行机制
        ThreadPoolExecutor executor = new ThreadPoolExecutor(1, 1, 3, TimeUnit.SECONDS, new LinkedBlockingQueue<>());
        executor.execute(new ClientThread());
    }
}
