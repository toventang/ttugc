package com.p2082ss.android.ugc.aweme.setting.utils;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.p2082ss.android.p2140di.push.C29902a;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import java.lang.reflect.Field;
import java.util.Objects;

/* renamed from: com.ss.android.ugc.aweme.setting.utils.k */
public final class C68696k {

    /* renamed from: a */
    public static final C68696k f153700a = new C68696k();

    private C68696k() {
    }

    static {
        Covode.recordClassIndex(80957);
    }

    /* renamed from: a */
    public static boolean m121133a(String str) {
        NotificationChannel notificationChannel;
        String realChannelId = C29902a.m60273a().getRealChannelId(str);
        Object a = m121132a(C17867d.m33078a(), "notification");
        Objects.requireNonNull(a, "null cannot be cast to non-null type android.app.NotificationManager");
        NotificationManager notificationManager = (NotificationManager) a;
        if (Build.VERSION.SDK_INT < 26 || (notificationChannel = notificationManager.getNotificationChannel(realChannelId)) == null || notificationChannel.getImportance() != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private static Object m121132a(Context context, String str) {
        Object obj;
        MethodCollector.m26663i(8901);
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
                    MethodCollector.m26664o(8901);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }
}
