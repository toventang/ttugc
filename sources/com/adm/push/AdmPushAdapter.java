package com.adm.push;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.push.C21798f;
import com.bytedance.push.p1600k.C21853a;
import com.bytedance.push.p1600k.C21857c;
import com.bytedance.push.third.AbstractC21918b;
import com.bytedance.push.third.C21922f;
import com.p2082ss.android.message.C30061a;
import java.util.Arrays;
import java.util.Collections;

public class AdmPushAdapter implements AbstractC21918b {
    private static int ADM_PUSH = -1;
    private static boolean sSupport = true;

    public boolean requestNotificationPermission(int i) {
        return false;
    }

    static {
        Covode.recordClassIndex(2054);
        try {
            Class.forName("com.amazon.device.messaging.ADM");
        } catch (Throwable unused) {
        }
    }

    public static int getAdmPush() {
        if (ADM_PUSH == -1) {
            ADM_PUSH = C21922f.m41214a(C30061a.f71748a).mo35671a(AdmPushAdapter.class.getName());
        }
        return ADM_PUSH;
    }

    private boolean isSupport(Context context) {
        try {
            if (!sSupport || !C1881a.m6061a(context).f5703a.isSupported()) {
                return false;
            }
            return true;
        } catch (Exception unused) {
        }
    }

    @Override // com.bytedance.push.third.AbstractC21918b
    public boolean isPushAvailable(Context context, int i) {
        if (C21798f.m40813a().mo35477a()) {
            isSupport(context);
        }
        return isSupport(context);
    }

    @Override // com.bytedance.push.third.AbstractC21918b
    public void unregisterPush(Context context, int i) {
        if (context != null && i == getAdmPush() && isSupport(context)) {
            C1881a.m6061a(context).f5703a.startUnregister();
        }
    }

    @Override // com.bytedance.push.third.AbstractC21918b
    public void registerPush(Context context, int i) {
        String str;
        if (context != null) {
            if (i != getAdmPush() || !isSupport(context)) {
                str = null;
                if (context != null) {
                    if (i != getAdmPush()) {
                        str = "register sender error";
                    } else if (!isSupport(context)) {
                        str = "this device does not support adm sender";
                    }
                    C21798f.m40816d().mo35422a(i, 101, "0", str);
                }
            } else {
                C1881a.m6061a(context).f5703a.startRegister();
                return;
            }
        }
        str = "context is empty";
        C21798f.m40816d().mo35422a(i, 101, "0", str);
    }

    @Override // com.bytedance.push.third.AbstractC21918b
    public boolean checkThirdPushConfig(String str, Context context) {
        boolean z = false;
        boolean a = C1882b.m6062a(context) & C21857c.m40941a(context, "AdmPush error", Arrays.asList(context.getPackageName() + ".permission.RECEIVE_ADM_MESSAGE", "com.amazon.device.messaging.permission.RECEIVE", "android.permission.WAKE_LOCK"));
        boolean b = C21857c.m40944b(context, "Adm push AndroidManifest.xml configure error", Arrays.asList(C21853a.C21854a.m40935c("com.adm.push.ADMMessageHandler").mo35531a(context.getPackageName()).f51771a, C21853a.C21854a.m40935c("com.adm.push.ADMMessageHandlerJob").mo35531a(context.getPackageName()).mo35532b("android.permission.BIND_JOB_SERVICE").f51771a));
        if (C21857c.m40946c(context, "Adm push AndroidManifest.xml configure error", Collections.singletonList(C21853a.C21854a.m40935c("com.adm.push.ADMMessageHandler$Receiver").mo35531a(context.getPackageName()).mo35532b("com.amazon.device.messaging.permission.SEND").mo35530a(new C21853a.C21855b(Arrays.asList("com.amazon.device.messaging.intent.REGISTRATION", "com.amazon.device.messaging.intent.RECEIVE"), Collections.singletonList(context.getPackageName()))).f51771a)) && b) {
            z = true;
        }
        return a & z;
    }

    @Override // com.bytedance.push.third.AbstractC21918b
    public void setAlias(Context context, String str, int i) {
        if (context != null && i == getAdmPush()) {
            isSupport(context);
        }
    }

    @Override // com.bytedance.push.third.AbstractC21918b
    public void trackPush(Context context, int i, Object obj) {
        if (context != null && i == getAdmPush()) {
            isSupport(context);
        }
    }
}
