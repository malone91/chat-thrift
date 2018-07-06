package com.zst.chat.client;

import com.zst.chat.listen.ClientThread;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.concurrent.Executors;
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
        //启动线程池
        ThreadPoolExecutor executor = new ThreadPoolExecutor(1, 1, 3, TimeUnit.SECONDS, new LinkedBlockingQueue<>());
        executor.execute(new ClientThread());
        executor.shutdown();
    }
}
