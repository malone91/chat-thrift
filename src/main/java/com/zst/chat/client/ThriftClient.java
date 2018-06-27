package com.zst.chat.client;

import com.zst.chat.service.ChatService;
import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.transport.TSocket;
import org.apache.thrift.transport.TTransportException;

/**
 * Created by Ablert
 * on 2018/6/18.
 */
public class ThriftClient {

    private ChatService.Client client;

    private TBinaryProtocol protocol;

    private TSocket transport;

    private String host;

    private int port;

    /**
     * 初始化方法
     */
    public void init() {
        transport = new TSocket(host, port);
        protocol = new TBinaryProtocol(transport);
        client = new ChatService.Client(protocol);
    }

    public int getPort() {
        return port;
    }

    public ChatService.Client getChatService() {
        return client;
    }

    public void open() throws TTransportException {
        transport.open();
    }

    public void close() {
        transport.close();
    }

    public void setPort(int port) {
        this.port = port;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }
}
