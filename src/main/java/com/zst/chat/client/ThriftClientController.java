package com.zst.chat.client;

import com.zst.chat.util.FileUtil;
import com.zst.chat.service.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

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
     * 用户注册
     * @param username
     * @param password
     * @param displayName
     * @return
     */
    @RequestMapping(value = "/userSignUp", method = RequestMethod.GET)
    public String userSignUp(String username, String password, String displayName) {
        try {
            thriftClient.open();
            RegisterRequest registerRequest = new RegisterRequest();
            registerRequest.setUserName(username);
            registerRequest.setPassword(password);
            byte[] imageByte = FileUtil.image2byte("E:\\melo.jpg");
            registerRequest.setPicture(imageByte);
            registerRequest.setDisplayName(displayName);
            ChatService.Client chatService = thriftClient.getChatService();
            boolean register = chatService.userRegister(registerRequest);
            if (register) {
                LOGGER.info("registry success");
            }
            return "success";
        } catch (Exception e) {
            LOGGER.error("RPC调用失败", e);
            return null;
        } finally {
            thriftClient.close();
        }
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
            return String.valueOf(loginResponse.getUserId());
        } catch (Exception e) {
            LOGGER.error("RPC调用失败", e);
            return null;
        } finally {
            thriftClient.close();
        }
    }

    /**
     * 发送消息
     * @param username
     * @param password
     * @param destId
     * @return
     */
    @RequestMapping(value = "/sendMessage", method = RequestMethod.GET)
    public String sendMessage(String username, String password, Integer destId) {
        try {
            String groupFlag = "yes";
            thriftClient.open();
            LoginRequest request = new LoginRequest();
            request.setMachineCode("");
            request.setUserName(username);
            request.setPassword(password);
            request.setType(ClientType.PC);
            ChatService.Client chatService = thriftClient.getChatService();
            LoginResponse loginResponse = chatService.userLogin(request);
            //发送消息
            SessionInfo sessionInfo = new SessionInfo();
            sessionInfo.setSessionId(loginResponse.getSessionId());
            MessageInfo messageInfo = new MessageInfo();
            messageInfo.setType(MessageType.String);
            messageInfo.setMessage("hello");
            //是否是群发
            if (destId != null) {
                messageInfo.setDstUserId(destId);
            }
            //自己的序列号
            messageInfo.setSrcUserId(loginResponse.getUserId());
            SendMessageResponse sendMessageResponse = chatService.sendMessage(sessionInfo, messageInfo);
            LOGGER.info("get response message: " + sendMessageResponse.getSeqNo());
            return String.valueOf(sendMessageResponse.getSeqNo());
        } catch (Exception e) {
            LOGGER.error("RPC调用失败", e);
            return null;
        } finally {
            thriftClient.close();
        }
    }
}
