package com.zst.chat.client;

import com.zst.chat.service.*;
import org.apache.thrift.TException;
import org.apache.thrift.transport.TTransportException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * Created by Ablert
 * on 2018/6/18.
 * @author Ablert
 */
@RestController
@RequestMapping("/chat")
public class ThriftClientController {

    private static final Logger LOGGER = LoggerFactory.getLogger(ThriftClientController.class);

    @Autowired
    private ThriftClient thriftClient;

    /**
     * 测试方法
     * @return
     */
    @RequestMapping(value = "/java", method = RequestMethod.GET)
    public String java() {
        return "hello world";
    }

    /**
     * 提供对外的用户登录访问API
     * @param username
     * @param password
     * @return
     */
    @RequestMapping(value = "/userLogin", method = RequestMethod.GET)
    public String userLogin(String username, String password) {
        try {
            thriftClient.open();
            LoginRequest request = new LoginRequest();
            request.setMachineCode("");
            request.setUserName(username);
            request.setPassword(password);
            request.setType(ClientType.PC);
            LoginResponse loginResponse = thriftClient.getChatService().userLogin(request);
            return loginResponse.getSessionId();
        } catch (Exception e) {
            LOGGER.error("RPC调用失败", e);
            return null;
        } finally {
            thriftClient.close();
        }
    }
}
