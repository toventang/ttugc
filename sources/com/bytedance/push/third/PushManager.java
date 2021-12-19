package com.bytedance.push.third;

import android.content.Context;
import android.content.pm.PackageManager;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.push.C21798f;
import com.bytedance.push.p1588a.AbstractC21760b;
import com.bytedance.push.p1588a.C21758a;
import com.bytedance.push.p1600k.C21853a;
import com.bytedance.push.p1600k.C21857c;
import com.p2082ss.android.message.NotifyService;
import com.p2082ss.android.message.log.LogService;
import com.p2082ss.android.push.DefaultReceiver;
import com.p2082ss.android.pushmanager.setting.PushMultiProcessSharedProvider;
import java.util.Arrays;

public class PushManager implements AbstractC21918b {
    private static volatile PushManager sPushManager;

    static {
        Covode.recordClassIndex(25578);
    }

    public boolean requestNotificationPermission(int i) {
        return false;
    }

    private PushManager() {
    }

    public static PushManager inst() {
        MethodCollector.m26663i(5165);
        if (sPushManager == null) {
            synchronized (PushManager.class) {
                try {
                    if (sPushManager == null) {
                        sPushManager = new PushManager();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(5165);
                    throw th;
                }
            }
        }
        PushManager pushManager = sPushManager;
        MethodCollector.m26664o(5165);
        return pushManager;
    }

    @Override // com.bytedance.push.third.AbstractC21918b
    public void unregisterPush(Context context, int i) {
        AbstractC21918b a = C21922f.m41214a(context).mo35672a(i);
        if (a != null) {
            try {
                a.unregisterPush(context, i);
            } catch (Throwable unused) {
            }
        }
    }

    @Override // com.bytedance.push.third.AbstractC21918b
    public boolean isPushAvailable(Context context, int i) {
        AbstractC21918b a = C21922f.m41214a(context).mo35672a(i);
        if (a == null) {
            return false;
        }
        try {
            return a.isPushAvailable(context, i);
        } catch (Throwable unused) {
            return false;
        }
    }

    @Override // com.bytedance.push.third.AbstractC21918b
    public void registerPush(Context context, int i) {
        AbstractC21918b a = C21922f.m41214a(context).mo35672a(i);
        if (a != null) {
            try {
                C21798f.m40816d().mo35421a(i);
                a.registerPush(context, i);
            } catch (Throwable unused) {
            }
        }
    }

    @Override // com.bytedance.push.third.AbstractC21918b
    public boolean checkThirdPushConfig(String str, Context context) {
        boolean z = true;
        boolean z2 = true;
        for (Integer num : C21922f.m41214a(context).mo35674b()) {
            AbstractC21918b a = C21922f.m41214a(context).mo35672a(num.intValue());
            if (a != null) {
                try {
                    z2 &= a.checkThirdPushConfig(str, context);
                } catch (Throwable unused) {
                    z2 = false;
                }
            }
        }
        try {
            boolean b = C21857c.m40944b(context, "Push", Arrays.asList(C21853a.C21854a.m40935c(NotifyService.class.getName()).mo35531a(context.getPackageName() + ":push").mo35530a(new C21853a.C21855b(Arrays.asList("com.ss.android.message.action.PUSH_SERVICE"))).f51771a, C21853a.C21854a.m40935c(LogService.class.getName()).mo35531a(context.getPackageName() + ":push").f51771a)) & C21857c.m40946c(context, "Push", Arrays.asList(C21853a.C21854a.m40935c(DefaultReceiver.class.getName()).mo35531a(context.getPackageName()).f51771a));
            C21853a.C21854a a2 = C21853a.C21854a.m40935c(PushMultiProcessSharedProvider.class.getName()).mo35531a(context.getPackageName());
            a2.f51771a.f51770e = context.getPackageName() + ".push.SHARE_PROVIDER_AUTHORITY";
            boolean d = b & C21857c.m40948d(context, "Push", Arrays.asList(a2.f51771a)) & z2;
            AbstractC21760b b2 = C21758a.m40727a(context).mo35395b();
            if (b2 != null) {
                z = b2.mo35398b();
            }
            return d & z;
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override // com.bytedance.push.third.AbstractC21918b
    public void setAlias(Context context, String str, int i) {
        AbstractC21918b a = C21922f.m41214a(context).mo35672a(i);
        if (a != null) {
            try {
                a.setAlias(context, str, i);
            } catch (Throwable unused) {
            }
        }
    }

    @Override // com.bytedance.push.third.AbstractC21918b
    public void trackPush(Context context, int i, Object obj) {
        AbstractC21918b a = C21922f.m41214a(context).mo35672a(i);
        if (a != null) {
            try {
                a.trackPush(context, i, obj);
            } catch (Throwable unused) {
            }
        }
    }
}
