package com.p2082ss.android.ugc.trill.abtest.impl;

import android.app.NotificationManager;
import android.content.BroadcastReceiver;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.kakao.usermgmt.StringSet;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.common.MobClick;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import com.p2082ss.android.ugc.tiktok.security.p4333a.C84349a;
import java.lang.reflect.Field;

/* renamed from: com.ss.android.ugc.trill.abtest.impl.NotificationBroadcastReceiver */
public class NotificationBroadcastReceiver extends BroadcastReceiver {
    static {
        Covode.recordClassIndex(99094);
    }

    /* renamed from: a */
    private static Object m146274a(Context context, String str) {
        Object obj;
        MethodCollector.m26663i(3794);
        if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
            if (!C58027i.f132247b && "connectivity".equals(str)) {
                try {
                    new C21708b().mo35361a();
                    C58027i.f132247b = true;
                    obj = context.getSystemService(str);
                } catch (Throwable unused) {
                }
            }
            obj = context.getSystemService(str);
        } else if (C58027i.f132246a) {
            synchronized (ClipboardManager.class) {
                try {
                    obj = context.getSystemService(str);
                    if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                        try {
                            Field declaredField = ClipboardManager.class.getDeclaredField("mHandler");
                            declaredField.setAccessible(true);
                            declaredField.set(obj, new C58027i.HandlerC58028a((Handler) declaredField.get(obj)));
                        } catch (Exception e) {
                            C13849d.m25015a(e, "ClipboardManager Handler Reflect Fail");
                        }
                    }
                    C58027i.f132246a = false;
                } finally {
                    MethodCollector.m26664o(3794);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }

    public void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        if (!TextUtils.isEmpty(action)) {
            int intExtra = intent.getIntExtra(StringSet.type, -1);
            if (intExtra != -1) {
                ((NotificationManager) m146274a(context, "notification")).cancel(intExtra);
            }
            if (action.equals("notification_clicked")) {
                Intent intent2 = new Intent();
                intent2.setClassName(context, "com.ss.android.ugc.aweme.splash.SplashActivity");
                intent2.setFlags(335544320);
                C84349a.m145093a(intent2, context);
                context.startActivity(intent2);
                C39162r.onEvent(MobClick.obtain().setLabelName("click").setEventName("recall_push"));
            }
        }
    }
}
