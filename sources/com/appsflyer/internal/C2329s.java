package com.appsflyer.internal;

import android.content.ClipboardManager;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import com.p2082ss.android.ugc.aweme.net.p3492e.C61338a;
import java.lang.reflect.Field;

/* renamed from: com.appsflyer.internal.s */
public final class C2329s {
    static {
        Covode.recordClassIndex(2601);
    }

    C2329s() {
    }

    /* renamed from: com.appsflyer.internal.s$d */
    public static final class C2331d {

        /* renamed from: ι */
        public static final C2329s f7102 = new C2329s();

        static {
            Covode.recordClassIndex(2603);
        }
    }

    /* renamed from: com_appsflyer_internal_s_com_ss_android_ugc_aweme_net_lancet_ConnecttivityManagerLancet_getActiveNetworkInfo */
    public static NetworkInfo m7138xbe38b84(ConnectivityManager connectivityManager) {
        try {
            return connectivityManager.getActiveNetworkInfo();
        } catch (Exception e) {
            C51423a.m95790a((Throwable) e);
            return C61338a.m111034a();
        }
    }

    /* renamed from: ɩ */
    private static boolean m7142(NetworkInfo networkInfo) {
        if (networkInfo == null || !networkInfo.isConnectedOrConnecting()) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003a, code lost:
        if (r1.getType() == 0) goto L_0x006b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0069, code lost:
        if (r1.getType() == 0) goto L_0x006b;
     */
    /* renamed from: ǃ */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.appsflyer.internal.C2329s.C2330a m7141(android.content.Context r11) {
        /*
        // Method dump skipped, instructions count: 161
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.C2329s.m7141(android.content.Context):com.appsflyer.internal.s$a");
    }

    /* renamed from: com_appsflyer_internal_s_com_ss_android_ugc_aweme_net_lancet_ConnecttivityManagerLancet_getNetworkInfo */
    public static NetworkInfo m7139x1d11ccea(ConnectivityManager connectivityManager, int i) {
        try {
            return connectivityManager.getNetworkInfo(i);
        } catch (Exception e) {
            C51423a.m95790a((Throwable) e);
            return C61338a.m111034a();
        }
    }

    /* renamed from: com_appsflyer_internal_s_com_ss_android_ugc_aweme_net_lancet_ConnecttivityManagerLancet_getNetworkInfo */
    public static NetworkInfo m7140x1d11ccea(ConnectivityManager connectivityManager, Network network) {
        try {
            return connectivityManager.getNetworkInfo(network);
        } catch (Exception e) {
            C51423a.m95790a((Throwable) e);
            return C61338a.m111034a();
        }
    }

    /* renamed from: com_appsflyer_internal_s_com_ss_android_ugc_aweme_lancet_GetSystemServiceLancet_getSystemService */
    public static Object m7137x651eacd8(Context context, String str) {
        Object obj;
        MethodCollector.m26663i(265);
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
                    MethodCollector.m26664o(265);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }

    /* renamed from: com.appsflyer.internal.s$a */
    public static final class C2330a {

        /* renamed from: ı */
        public final String f7099;

        /* renamed from: ɩ */
        public final String f7100;

        /* renamed from: ι */
        public final String f7101;

        static {
            Covode.recordClassIndex(2602);
        }

        C2330a(String str, String str2, String str3) {
            this.f7099 = str;
            this.f7100 = str2;
            this.f7101 = str3;
        }
    }
}
