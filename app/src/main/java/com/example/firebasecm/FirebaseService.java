package com.example.firebasecm;

import android.util.Log;

import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;

public class FirebaseService extends FirebaseMessagingService {
    //接收 收到的訊息
    @Override
    public void onMessageReceived(RemoteMessage remoteMessage) {
        super.onMessageReceived(remoteMessage);

        if (remoteMessage.getNotification() != null) {
            Log.i("***","title "+remoteMessage.getNotification().getTitle());
            Log.i("***","body "+remoteMessage.getNotification().getBody());
        }

    }
    //會產一個手機裝置的 token 傳送訊息識別用
    @Override
    public void onNewToken(String token) {
        super.onNewToken(token);
        Log.i("***","token "+token);
    }

}

