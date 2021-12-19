package com.bytedance.sdk.p1665b.p1676f;

import android.content.ClipboardManager;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.telephony.TelephonyManager;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.bytedance.sdk.p1665b.C22518a;
import com.bytedance.sdk.p1665b.p1668c.C22539a;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import com.p2082ss.android.ugc.aweme.lancet.p3387d.C58017a;
import com.p2082ss.android.ugc.aweme.net.p3492e.C61338a;
import java.lang.reflect.Field;

/* renamed from: com.bytedance.sdk.b.f.b */
public final class C22585b {

    /* renamed from: a */
    private static int f53363a;

    static {
        Covode.recordClassIndex(26401);
    }

    /* renamed from: a */
    public static int m42612a(Context context) {
        int b = m42617b(context);
        if (!C22518a.m42481e() || b != 6) {
            return b;
        }
        return 1;
    }

    /* renamed from: c */
    private static Context m42618c(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (C58003a.f132201c && applicationContext == null) {
            return C58003a.f132199a;
        }
        return applicationContext;
    }

    /* renamed from: a */
    private static NetworkInfo m42614a(ConnectivityManager connectivityManager) {
        try {
            return connectivityManager.getActiveNetworkInfo();
        } catch (Exception e) {
            C51423a.m95790a((Throwable) e);
            return C61338a.m111034a();
        }
    }

    /* renamed from: a */
    private static int m42613a(TelephonyManager telephonyManager) {
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
    private static int m42617b(Context context) {
        Network activeNetwork;
        NetworkCapabilities networkCapabilities;
        if (context == null) {
            C22539a.m42536d("getNetworkType(Context context, boolean moreInfo):context == null");
            return 0;
        }
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) m42615a(m42618c(context), "connectivity");
            if (!(Build.VERSION.SDK_INT < 23 || (activeNetwork = connectivityManager.getActiveNetwork()) == null || (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) == null)) {
                if (networkCapabilities.hasTransport(0)) {
                    int d = m42619d(context);
                    f53363a = d;
                    return d;
                } else if (networkCapabilities.hasTransport(1)) {
                    f53363a = 6;
                    return 6;
                }
            }
            NetworkInfo a = m42614a(connectivityManager);
            if (a != null) {
                if (a.getType() == 1) {
                    f53363a = 6;
                    return 6;
                } else if (a.getType() == 0) {
                    int d2 = m42619d(context);
                    f53363a = d2;
                    return d2;
                }
            }
        } catch (Throwable th) {
            C22539a.m42536d(th.getMessage());
        }
        f53363a = -1;
        return -1;
    }

    /* renamed from: d */
    private static int m42619d(Context context) {
        switch (m42613a((TelephonyManager) m42615a(m42618c(context), "phone"))) {
            case 1:
            case 2:
            case 4:
            case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY /*{ENCODED_INT: 7}*/:
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 11}*/:
            case 16:
                return 2;
            case 3:
            case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
            case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
            case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 8}*/:
            case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 9}*/:
            case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 10}*/:
            case ABRConfig.ABR_DEFAULT_WIFI_BITRATE /*{ENCODED_INT: 12}*/:
            case ABRConfig.ABR_SELECT_SCENE /*{ENCODED_INT: 14}*/:
            case 15:
            case 17:
                return 3;
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /*{ENCODED_INT: 13}*/:
                return 4;
            default:
                return 1;
        }
    }

    /* renamed from: a */
    public static boolean m42616a(int i) {
        if (C22518a.m42481e() && i == 6) {
            return true;
        }
        if (-1 == i || 6 == i || i == 0) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private static Object m42615a(Context context, String str) {
        Object obj;
        MethodCollector.m26663i(4785);
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
                    MethodCollector.m26664o(4785);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }
}
