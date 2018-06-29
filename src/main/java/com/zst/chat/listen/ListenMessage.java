package com.zst.chat.listen;

/**
 * Created by Ablert
 * on 2018/6/29.
 * @author Ablert
 */
public class ListenMessage {

    public static void main(String[] args) {
        Thread listenThread = new Thread(new ClientThread());
        listenThread.start();
    }
}
