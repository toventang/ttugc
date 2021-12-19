package com.bytedance.common.wschannel.server;

import android.content.ClipboardManager;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.telephony.TelephonyManager;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import com.p2082ss.android.ugc.aweme.lancet.p3387d.C58017a;
import com.p2082ss.android.ugc.aweme.net.p3492e.C61338a;
import java.lang.reflect.Field;

/* renamed from: com.bytedance.common.wschannel.server.h */
public final class C13790h {
    static {
        Covode.recordClassIndex(15838);
    }

    /* renamed from: com.bytedance.common.wschannel.server.h$a */
    public enum EnumC13791a {
        NONE(0),
        MOBILE(1),
        MOBILE_2G(2),
        MOBILE_3G(3),
        WIFI(4),
        MOBILE_4G(5);
        

        /* renamed from: a */
        final int f33537a;

        public final int getValue() {
            return this.f33537a;
        }

        static {
            Covode.recordClassIndex(15839);
        }

        private EnumC13791a(int i) {
            this.f33537a = i;
        }
    }

    /* renamed from: a */
    private static NetworkInfo m24887a(ConnectivityManager connectivityManager) {
        try {
            return connectivityManager.getActiveNetworkInfo();
        } catch (Exception e) {
            C51423a.m95790a((Throwable) e);
            return C61338a.m111034a();
        }
    }

    /* renamed from: a */
    public static boolean m24889a(Context context) {
        try {
            NetworkInfo a = m24887a((ConnectivityManager) m24888a(context, "connectivity"));
            if (a == null || !a.isAvailable()) {
                return false;
            }
            return true;
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    private static int m24886a(TelephonyManager telephonyManager) {
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

    /* renamed from: b */
    public static EnumC13791a m24890b(Context context) {
        try {
            NetworkInfo a = m24887a((ConnectivityManager) m24888a(context, "connectivity"));
            if (a == null || !a.isAvailable()) {
                return EnumC13791a.NONE;
            }
            int type = a.getType();
            if (1 == type) {
                return EnumC13791a.WIFI;
            }
            if (type != 0) {
                return EnumC13791a.MOBILE;
            }
            TelephonyManager telephonyManager = (TelephonyManager) m24888a(context, "phone");
            if (telephonyManager == null) {
                return EnumC13791a.MOBILE;
            }
            if (m24886a(telephonyManager) == 3 || m24886a(telephonyManager) == 5 || m24886a(telephonyManager) == 6 || m24886a(telephonyManager) == 8 || m24886a(telephonyManager) == 9 || m24886a(telephonyManager) == 10 || m24886a(telephonyManager) == 12 || m24886a(telephonyManager) == 14 || m24886a(telephonyManager) == 15) {
                return EnumC13791a.MOBILE_3G;
            }
            if (m24886a(telephonyManager) == 13) {
                return EnumC13791a.MOBILE_4G;
            }
            return EnumC13791a.MOBILE;
        } catch (Throwable unused) {
            return EnumC13791a.MOBILE;
        }
    }

    /* renamed from: a */
    private static Object m24888a(Context context, String str) {
        Object obj;
        MethodCollector.m26663i(9496);
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
                    MethodCollector.m26664o(9496);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }
}
