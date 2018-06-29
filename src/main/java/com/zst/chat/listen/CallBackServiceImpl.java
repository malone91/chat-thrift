package com.zst.chat.listen;

import com.zst.chat.service.CallbackService;
import com.zst.chat.service.MessageInfo;
import org.apache.thrift.TException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by Ablert
 * on 2018/6/29.
 * @author Ablert
 */
public class CallBackServiceImpl implements CallbackService.Iface {

    private static final Logger LOGGER = LoggerFactory.getLogger(CallBackServiceImpl.class);

    @Override
    public void receiveMessage(MessageInfo message) throws TException {
        LOGGER.info("receive message: " + message.getMessage());
    }

    @Override
    public void subscribe(int userId) throws TException {

    }

    @Override
    public void unsubscribe(int userId) throws TException {

    }
}
