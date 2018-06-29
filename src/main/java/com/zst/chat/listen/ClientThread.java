package com.zst.chat.listen;

import com.zst.chat.service.*;
import org.apache.thrift.TException;
import org.apache.thrift.TProcessor;
import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.protocol.TProtocol;
import org.apache.thrift.transport.TSocket;
import org.apache.thrift.transport.TTransport;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by Ablert
 * on 2018/6/29.
 * @author Ablert
 */
public class ClientThread implements Runnable {

    private static final Logger LOGGER = LoggerFactory.getLogger(ClientThread.class);

    @Override
    public void run() {
        String ip = "10.1.26.190";
        int port = 9091;
        int timeOut = 1000;
        //创建transport
        TTransport transport = new TSocket(ip, port, timeOut);
        //创建TProtocol
        TProtocol protocol = new TBinaryProtocol(transport);
        //基于transport 和 protocol创建client
        TProcessor processor = new CallbackService.Processor(new CallBackServiceImpl());
        try {
            while (true) {
                processor.process(protocol, protocol);
            }
        } catch (TException e) {
            e.printStackTrace();
        }
    }
}
