package com.example.eventscheduler;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

import androidx.core.app.NotificationCompat;


public class Alert_invoker extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Notification_pusher notificationHelper = new Notification_pusher(context);
        NotificationCompat.Builder nb = notificationHelper.getChannelNotification();
        notificationHelper.getManager().notify(1, nb.build());
    }
}