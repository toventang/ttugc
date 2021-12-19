package com.fcm.service;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.p025c.C0484a;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.utils.ServiceLifecycle;
import com.bytedance.push.C21798f;
import com.fcm.FcmPushAdapter;
import com.google.firebase.messaging.C27859b;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;

public class SSGcmListenerService extends FirebaseMessagingService {
    static {
        Covode.recordClassIndex(30400);
    }

    @Override // com.google.firebase.messaging.AbstractServiceC27862d, com.google.firebase.messaging.FirebaseMessagingService
    public int onStartCommand(Intent intent, int i, int i2) {
        ServiceLifecycle.onStartCommand(this, intent, i, i2);
        return super.onStartCommand(intent, i, i2);
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public void onNewToken(String str) {
        super.onNewToken(str);
        sendToken(str);
    }

    private void sendToken(String str) {
        try {
            if (!TextUtils.isEmpty(str)) {
                Intent intent = new Intent(this, FcmRegistrationJobIntentService.class);
                intent.putExtra("key_token", str);
                FcmRegistrationJobIntentService.enqueueWork(this, intent);
            }
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public void onMessageReceived(RemoteMessage remoteMessage) {
        try {
            if (remoteMessage.f65434b == null) {
                Bundle bundle = remoteMessage.f65433a;
                C0484a aVar = new C0484a();
                for (String str : bundle.keySet()) {
                    Object a = C27859b.C27860a.m55774a(bundle, str);
                    if (a instanceof String) {
                        String str2 = (String) a;
                        if (!str.startsWith("google.") && !str.startsWith("gcm.") && !str.equals("from") && !str.equals("message_type") && !str.equals("collapse_key")) {
                            aVar.put(str, str2);
                        }
                    }
                }
                remoteMessage.f65434b = aVar;
            }
            C21798f.m40815c().mo35434a(remoteMessage.f65434b.get(C21798f.m40814b().mo35457a()), FcmPushAdapter.getFcmPush());
        } catch (Exception e) {
            e.getMessage();
        }
    }
}
