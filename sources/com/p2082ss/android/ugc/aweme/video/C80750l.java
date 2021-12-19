package com.p2082ss.android.ugc.aweme.video;

import android.content.ClipboardManager;
import android.content.Context;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.telephony.PhoneStateListener;
import android.telephony.TelephonyManager;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.p2082ss.android.common.util.NetworkUtils;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import com.p2082ss.android.ugc.aweme.lancet.C58029j;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import java.lang.reflect.Field;

/* renamed from: com.ss.android.ugc.aweme.video.l */
public class C80750l {

    /* renamed from: d */
    private static final String f180548d = C80750l.class.getSimpleName();

    /* renamed from: e */
    private static C80750l f180549e = null;

    /* renamed from: a */
    public int f180550a = Integer.MIN_VALUE;

    /* renamed from: b */
    public TelephonyManager f180551b;

    /* renamed from: c */
    public PhoneStateListener f180552c;

    static {
        Covode.recordClassIndex(94040);
    }

    /* renamed from: a */
    public static synchronized C80750l m140052a(Context context) {
        C80750l lVar;
        synchronized (C80750l.class) {
            MethodCollector.m26663i(2987);
            if (f180549e == null) {
                f180549e = new C80750l(context);
            }
            lVar = f180549e;
            MethodCollector.m26664o(2987);
        }
        return lVar;
    }

    private C80750l(Context context) {
        if (context != null) {
            Context applicationContext = context.getApplicationContext();
            if (C58003a.f132201c && applicationContext == null) {
                applicationContext = C58003a.f132199a;
            }
            this.f180551b = (TelephonyManager) m140053a(applicationContext, "phone");
        }
    }

    /* renamed from: b */
    public final int mo123955b(Context context) {
        WifiInfo connectionInfo;
        try {
            if (C58029j.f132255g == NetworkUtils.EnumC29835h.NONE || !C58029j.m104846b() || C58029j.m104847c()) {
                C58029j.f132255g = NetworkUtils.getNetworkType(context);
            }
            if (C58029j.f132255g == NetworkUtils.EnumC29835h.WIFI && (connectionInfo = ((WifiManager) m140053a(context, "wifi")).getConnectionInfo()) != null) {
                this.f180550a = connectionInfo.getRssi();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return this.f180550a;
    }

    /* renamed from: a */
    private static Object m140053a(Context context, String str) {
        Object obj;
        MethodCollector.m26663i(3001);
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
                    MethodCollector.m26664o(3001);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }
}
