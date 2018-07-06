package com.zst.chat.listen;

import com.zst.chat.service.*;
import org.apache.thrift.TException;
import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.transport.TSocket;
import org.apache.thrift.transport.TTransportException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.TimeUnit;

/**
 * 用户轮询服务端的线程
 * 实操中将任务机制与执行机制解耦，
 * Created by Ablert
 * on 2018/6/29.
 * @author Ablert
 */
public class ClientThread implements Runnable {

    private static String ip = "10.1.26.190";
    private static int port = 9091;
    private static int timeOut = 1000;

    private static TBinaryProtocol protocol;

    private static TSocket transport;

    private static ChatService.Client client;


    /** 控制死循环出口标识 */
    private static volatile boolean runningFlag = true;

    private static final Logger LOGGER = LoggerFactory.getLogger(ClientThread.class);

    /**
     * 线程执行任务
     */
    @Override
    public void run() {
        while (runningFlag) {
            try {
                transport = new TSocket(ip, port, timeOut);
                //创建TProtocol
                protocol = new TBinaryProtocol(transport);
                client = new ChatService.Client(protocol);
                transport.open();
//                SendMessageResponse messageResponse = client.recv_sendMessage();
//                if (messageResponse != null) {
//                    LOGGER.info("接收到的信息为: " + messageResponse.getSeqNo());
//                } else {
//                    LOGGER.info("轮询信息");
//                }
                LoginRequest request = new LoginRequest();
                request.setMachineCode("");
                request.setUserName("melo");
                request.setPassword("123456");
                request.setType(ClientType.PC);
                LoginResponse loginResponse = client.userLogin(request);
                transport.close();
            } catch (TTransportException e) {
                LOGGER.error("open transport error" ,e);
            } catch (InvalidSessionException e) {
                e.printStackTrace();
            } catch (OperationException e) {
                e.printStackTrace();
            } catch (TException e) {
                e.printStackTrace();
            }
            try {
                TimeUnit.SECONDS.sleep(3);
            } catch (InterruptedException e) {
                LOGGER.error("ClientThread run error", e);
            }
        }
    }
}
