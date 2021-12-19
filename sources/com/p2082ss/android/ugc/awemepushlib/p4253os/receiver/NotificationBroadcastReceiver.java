package com.p2082ss.android.ugc.awemepushlib.p4253os.receiver;

import android.app.NotificationManager;
import android.content.BroadcastReceiver;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import com.bytedance.common.utility.Logger;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.kakao.usermgmt.StringSet;
import com.p2082ss.android.ugc.aweme.common.C39161q;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import com.p2082ss.android.ugc.tiktok.security.p4333a.C84349a;
import java.lang.reflect.Field;
import java.util.Map;

/* renamed from: com.ss.android.ugc.awemepushlib.os.receiver.NotificationBroadcastReceiver */
public class NotificationBroadcastReceiver extends BroadcastReceiver {
    static {
        Covode.recordClassIndex(95324);
    }

    /* renamed from: com_ss_android_ugc_awemepushlib_os_receiver_NotificationBroadcastReceiver_com_ss_android_ugc_tiktok_security_lancet_ContextLancet_startActivity */
    public static void m141845x9a76da02(Context context, Intent intent) {
        C84349a.m145093a(intent, context);
        context.startActivity(intent);
    }

    /* renamed from: com_ss_android_ugc_awemepushlib_os_receiver_NotificationBroadcastReceiver_com_ss_android_ugc_aweme_lancet_GetSystemServiceLancet_getSystemService */
    public static Object m141844x3bbb83ec(Context context, String str) {
        Object obj;
        MethodCollector.m26663i(10264);
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
                    MethodCollector.m26664o(10264);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }

    public void onReceive(Context context, Intent intent) {
        if (context != null && intent != null) {
            String action = intent.getAction();
            int intExtra = intent.getIntExtra(StringSet.type, -1);
            if (intExtra != -1) {
                ((NotificationManager) m141844x3bbb83ec(context, "notification")).cancel(intExtra);
            }
            Intent intent2 = (Intent) intent.getParcelableExtra("contentIntentURI");
            if ("notification_clicked".equals(action)) {
                Logger.debug();
                if (intent2 != null) {
                    try {
                        intent2.getDataString();
                        m141845x9a76da02(context, intent2);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
            if ("notification_cancelled".equals(action)) {
                Logger.debug();
                Map map = null;
                if (intent2 != null) {
                    map = (Map) intent2.getSerializableExtra("log_data_extra_to_adsapp");
                }
                C39161q.m79451a("push_clear", map);
            }
        }
    }
}
