package com.p2082ss.android.ugc.aweme.utils;

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
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import com.p2082ss.android.ugc.aweme.lancet.p3387d.C58017a;
import com.p2082ss.android.ugc.aweme.net.p3492e.C61338a;
import java.lang.reflect.Field;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.utils.fe */
public final class C80422fe {

    /* renamed from: a */
    public static final C80422fe f179982a = new C80422fe();

    /* renamed from: com.ss.android.ugc.aweme.utils.fe$a */
    public enum EnumC80423a {
        NONE(0),
        MOBILE(1),
        MOBILE_2G(2),
        MOBILE_3G(3),
        WIFI(4),
        MOBILE_4G(5);
        

        /* renamed from: b */
        private final int f179984b;

        public final int getValue() {
            return this.f179984b;
        }

        static {
            Covode.recordClassIndex(93691);
        }

        private EnumC80423a(int i) {
            this.f179984b = i;
        }
    }

    private C80422fe() {
    }

    static {
        Covode.recordClassIndex(93690);
    }

    /* renamed from: a */
    private static NetworkInfo m139423a(ConnectivityManager connectivityManager) {
        try {
            return connectivityManager.getActiveNetworkInfo();
        } catch (Exception e) {
            C51423a.m95790a((Throwable) e);
            return C61338a.m111034a();
        }
    }

    /* renamed from: d */
    public static final boolean m139428d(Context context) {
        C89219l.m154721d(context, "");
        EnumC80423a b = m139426b(context);
        if (EnumC80423a.MOBILE_2G == b || EnumC80423a.MOBILE_3G == b || EnumC80423a.MOBILE_4G == b || EnumC80423a.MOBILE == b) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static final boolean m139425a(Context context) {
        C89219l.m154721d(context, "");
        try {
            Object a = m139424a(context, "connectivity");
            if (a != null) {
                NetworkInfo a2 = m139423a((ConnectivityManager) a);
                if (a2 == null || !a2.isAvailable()) {
                    return false;
                }
                return true;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.net.ConnectivityManager");
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: c */
    public static final boolean m139427c(Context context) {
        C89219l.m154721d(context, "");
        try {
            Object a = m139424a(context, "connectivity");
            if (a != null) {
                NetworkInfo a2 = m139423a((ConnectivityManager) a);
                if (a2 != null) {
                    if (a2.isAvailable()) {
                        if (1 == a2.getType()) {
                            return true;
                        }
                    }
                }
                return false;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.net.ConnectivityManager");
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: b */
    public static final EnumC80423a m139426b(Context context) {
        int i;
        C89219l.m154721d(context, "");
        try {
            Object a = m139424a(context, "connectivity");
            if (a != null) {
                NetworkInfo a2 = m139423a((ConnectivityManager) a);
                if (a2 == null || !a2.isAvailable()) {
                    return EnumC80423a.NONE;
                }
                int type = a2.getType();
                if (1 == type) {
                    return EnumC80423a.WIFI;
                }
                if (type != 0) {
                    return EnumC80423a.MOBILE;
                }
                Object a3 = m139424a(context, "phone");
                if (a3 != null) {
                    TelephonyManager telephonyManager = (TelephonyManager) a3;
                    if (Build.VERSION.SDK_INT >= 29) {
                        if (!C58017a.f132225a.getAndSet(true)) {
                            C58017a.m104840a().mo95542a();
                        }
                        i = C58017a.m104840a().f132229b.get();
                        if (!C58017a.f132227c && i == -1) {
                            return EnumC80423a.MOBILE;
                        }
                    } else {
                        i = telephonyManager.getNetworkType();
                    }
                    switch (i) {
                        case 1:
                        case 2:
                        case 4:
                        case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                        case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY:
                            return EnumC80423a.MOBILE_2G;
                        case 3:
                        case ABRConfig.ABR_STARTUP_MODEL_KEY:
                        case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                        case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY:
                        case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY:
                        case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY:
                        case ABRConfig.ABR_DEFAULT_WIFI_BITRATE:
                        case ABRConfig.ABR_SELECT_SCENE:
                        case 15:
                            return EnumC80423a.MOBILE_3G;
                        case ABRConfig.ABR_STARTUP_MAX_BITRATE:
                            return EnumC80423a.MOBILE_4G;
                    }
                    return EnumC80423a.MOBILE;
                }
                throw new NullPointerException("null cannot be cast to non-null type android.telephony.TelephonyManager");
            }
            throw new NullPointerException("null cannot be cast to non-null type android.net.ConnectivityManager");
        } catch (Throwable unused) {
            return EnumC80423a.MOBILE;
        }
    }

    /* renamed from: a */
    private static Object m139424a(Context context, String str) {
        Object obj;
        MethodCollector.m26663i(14184);
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
                    MethodCollector.m26664o(14184);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }
}
