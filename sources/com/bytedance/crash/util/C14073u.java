package com.bytedance.crash.util;

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
import com.bytedance.crash.p932j.C13907f;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import com.p2082ss.android.ugc.aweme.lancet.p3387d.C58017a;
import com.p2082ss.android.ugc.aweme.net.p3492e.C61338a;
import java.lang.reflect.Field;

/* renamed from: com.bytedance.crash.util.u */
public final class C14073u {
    static {
        Covode.recordClassIndex(16140);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.crash.util.u$1 */
    public static /* synthetic */ class C140741 {

        /* renamed from: a */
        static final /* synthetic */ int[] f34255a;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|14) */
        /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0043 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0017 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0022 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0038 */
        static {
            /*
                r0 = 16141(0x3f0d, float:2.2618E-41)
                com.bytedance.covode.number.Covode.recordClassIndex(r0)
                com.bytedance.crash.j.f$b[] r0 = com.bytedance.crash.p932j.C13907f.EnumC13909b.values()
                int r0 = r0.length
                int[] r2 = new int[r0]
                com.bytedance.crash.util.C14073u.C140741.f34255a = r2
                com.bytedance.crash.j.f$b r0 = com.bytedance.crash.p932j.C13907f.EnumC13909b.WIFI     // Catch:{ NoSuchFieldError -> 0x0017 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0017 }
                r0 = 1
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0017 }
            L_0x0017:
                int[] r2 = com.bytedance.crash.util.C14073u.C140741.f34255a     // Catch:{ NoSuchFieldError -> 0x0022 }
                com.bytedance.crash.j.f$b r0 = com.bytedance.crash.p932j.C13907f.EnumC13909b.MOBILE_2G     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r0 = 2
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                int[] r2 = com.bytedance.crash.util.C14073u.C140741.f34255a     // Catch:{ NoSuchFieldError -> 0x002d }
                com.bytedance.crash.j.f$b r0 = com.bytedance.crash.p932j.C13907f.EnumC13909b.MOBILE_3G     // Catch:{ NoSuchFieldError -> 0x002d }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x002d }
                r0 = 3
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x002d }
            L_0x002d:
                int[] r2 = com.bytedance.crash.util.C14073u.C140741.f34255a     // Catch:{ NoSuchFieldError -> 0x0038 }
                com.bytedance.crash.j.f$b r0 = com.bytedance.crash.p932j.C13907f.EnumC13909b.MOBILE_4G     // Catch:{ NoSuchFieldError -> 0x0038 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0038 }
                r0 = 4
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0038 }
            L_0x0038:
                int[] r2 = com.bytedance.crash.util.C14073u.C140741.f34255a     // Catch:{ NoSuchFieldError -> 0x0043 }
                com.bytedance.crash.j.f$b r0 = com.bytedance.crash.p932j.C13907f.EnumC13909b.MOBILE     // Catch:{ NoSuchFieldError -> 0x0043 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0043 }
                r0 = 5
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0043 }
            L_0x0043:
                int[] r2 = com.bytedance.crash.util.C14073u.C140741.f34255a     // Catch:{ NoSuchFieldError -> 0x004e }
                com.bytedance.crash.j.f$b r0 = com.bytedance.crash.p932j.C13907f.EnumC13909b.MOBILE_5G     // Catch:{ NoSuchFieldError -> 0x004e }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x004e }
                r0 = 6
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x004e }
            L_0x004e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.crash.util.C14073u.C140741.<clinit>():void");
        }
    }

    /* renamed from: a */
    private static NetworkInfo m25645a(ConnectivityManager connectivityManager) {
        try {
            return connectivityManager.getActiveNetworkInfo();
        } catch (Exception e) {
            C51423a.m95790a((Throwable) e);
            return C61338a.m111034a();
        }
    }

    /* renamed from: b */
    public static boolean m25649b(Context context) {
        NetworkInfo a;
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) m25647a(context, "connectivity");
            if (connectivityManager == null || (a = m25645a(connectivityManager)) == null || !a.isAvailable()) {
                return false;
            }
            return true;
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public static String m25648a(C13907f.EnumC13909b bVar) {
        try {
            switch (C140741.f34255a[bVar.ordinal()]) {
                case 1:
                    return "wifi";
                case 2:
                    return "2g";
                case 3:
                    return "3g";
                case 4:
                    return "4g";
                case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                    return "mobile";
                case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                    return "5g";
                default:
                    return "";
            }
        } catch (Exception unused) {
            return "";
        }
    }

    /* renamed from: a */
    public static C13907f.EnumC13909b m25646a(Context context) {
        int i;
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) m25647a(context, "connectivity");
            if (connectivityManager == null) {
                return C13907f.EnumC13909b.NONE;
            }
            NetworkInfo a = m25645a(connectivityManager);
            if (a == null || !a.isAvailable()) {
                return C13907f.EnumC13909b.NONE;
            }
            int type = a.getType();
            if (1 == type) {
                return C13907f.EnumC13909b.WIFI;
            }
            if (type != 0) {
                return C13907f.EnumC13909b.MOBILE;
            }
            TelephonyManager telephonyManager = (TelephonyManager) m25647a(context, "phone");
            if (Build.VERSION.SDK_INT >= 29) {
                if (!C58017a.f132225a.getAndSet(true)) {
                    C58017a.m104840a().mo95542a();
                }
                i = C58017a.m104840a().f132229b.get();
                if (!C58017a.f132227c && i == -1) {
                    return C13907f.EnumC13909b.MOBILE;
                }
            } else {
                i = telephonyManager.getNetworkType();
            }
            if (i != 3) {
                if (i == 20) {
                    return C13907f.EnumC13909b.MOBILE_5G;
                }
                if (!(i == 5 || i == 6)) {
                    switch (i) {
                        case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 8}*/:
                        case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 9}*/:
                        case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 10}*/:
                            break;
                        default:
                            switch (i) {
                                case ABRConfig.ABR_DEFAULT_WIFI_BITRATE /*{ENCODED_INT: 12}*/:
                                case ABRConfig.ABR_SELECT_SCENE /*{ENCODED_INT: 14}*/:
                                case 15:
                                    break;
                                case ABRConfig.ABR_STARTUP_MAX_BITRATE /*{ENCODED_INT: 13}*/:
                                    return C13907f.EnumC13909b.MOBILE_4G;
                                default:
                                    return C13907f.EnumC13909b.MOBILE;
                            }
                    }
                }
            }
            return C13907f.EnumC13909b.MOBILE_3G;
        } catch (Throwable unused) {
            return C13907f.EnumC13909b.MOBILE;
        }
    }

    /* renamed from: a */
    private static Object m25647a(Context context, String str) {
        Object obj;
        MethodCollector.m26663i(1484);
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
                    MethodCollector.m26664o(1484);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }
}
