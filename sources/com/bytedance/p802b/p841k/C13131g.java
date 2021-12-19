package com.bytedance.p802b.p841k;

import android.content.ClipboardManager;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.telephony.TelephonyManager;
import androidx.core.content.C0643b;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import com.p2082ss.android.ugc.aweme.lancet.p3387d.C58017a;
import com.p2082ss.android.ugc.aweme.net.p3492e.C61338a;
import java.lang.reflect.Field;

/* renamed from: com.bytedance.b.k.g */
public final class C13131g {
    static {
        Covode.recordClassIndex(14967);
    }

    /* renamed from: a */
    private static NetworkInfo m23611a(ConnectivityManager connectivityManager) {
        try {
            return connectivityManager.getActiveNetworkInfo();
        } catch (Exception e) {
            C51423a.m95790a((Throwable) e);
            return C61338a.m111034a();
        }
    }

    /* renamed from: a */
    public static int m23610a(Context context) {
        NetworkInfo a;
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) m23612a(context, "connectivity");
            if (C0643b.m2367a(context, "android.permission.ACCESS_NETWORK_STATE") == 0 && (a = m23611a(connectivityManager)) != null) {
                if (a.isAvailable()) {
                    if (a.getType() == 0) {
                        TelephonyManager telephonyManager = (TelephonyManager) m23612a(context, "phone");
                        if (Build.VERSION.SDK_INT < 29) {
                            return telephonyManager.getNetworkType();
                        }
                        if (!C58017a.f132225a.getAndSet(true)) {
                            C58017a.m104840a().mo95542a();
                        }
                        int i = C58017a.m104840a().f132229b.get();
                        if (C58017a.f132227c || i != -1) {
                            return i;
                        }
                        return 0;
                    }
                }
            }
        } catch (Throwable unused) {
        }
        return -10000;
    }

    /* renamed from: a */
    private static Object m23612a(Context context, String str) {
        Object systemService;
        if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
            if (!C58027i.f132247b && "connectivity".equals(str)) {
                try {
                    new C21708b().mo35361a();
                    C58027i.f132247b = true;
                    return context.getSystemService(str);
                } catch (Throwable unused) {
                }
            }
            return context.getSystemService(str);
        } else if (!C58027i.f132246a) {
            return context.getSystemService(str);
        } else {
            synchronized (ClipboardManager.class) {
                systemService = context.getSystemService(str);
                if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                    try {
                        Field declaredField = ClipboardManager.class.getDeclaredField("mHandler");
                        declaredField.setAccessible(true);
                        declaredField.set(systemService, new C58027i.HandlerC58028a((Handler) declaredField.get(systemService)));
                    } catch (Exception e) {
                        C13849d.m25015a(e, "ClipboardManager Handler Reflect Fail");
                    }
                }
                C58027i.f132246a = false;
            }
            return systemService;
        }
    }
}
