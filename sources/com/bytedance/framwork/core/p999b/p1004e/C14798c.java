package com.bytedance.framwork.core.p999b.p1004e;

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

/* renamed from: com.bytedance.framwork.core.b.e.c */
public final class C14798c {

    /* renamed from: a */
    private static EnumC14799a f36068a = EnumC14799a.UNKNOWN;

    /* renamed from: com.bytedance.framwork.core.b.e.c$a */
    public enum EnumC14799a {
        UNKNOWN(-1),
        NONE(0),
        MOBILE(1),
        MOBILE_2G(2),
        MOBILE_3G(3),
        WIFI(4),
        MOBILE_4G(5);
        

        /* renamed from: a */
        final int f36070a;

        public final int getValue() {
            return this.f36070a;
        }

        public final boolean isWifi() {
            if (this == WIFI) {
                return true;
            }
            return false;
        }

        public final boolean is2G() {
            if (this == MOBILE || this == MOBILE_2G) {
                return true;
            }
            return false;
        }

        public final boolean isAvailable() {
            if (this == UNKNOWN || this == NONE) {
                return false;
            }
            return true;
        }

        static {
            Covode.recordClassIndex(16899);
        }

        private EnumC14799a(int i) {
            this.f36070a = i;
        }
    }

    static {
        Covode.recordClassIndex(16898);
    }

    /* renamed from: a */
    private static NetworkInfo m27163a(ConnectivityManager connectivityManager) {
        try {
            return connectivityManager.getActiveNetworkInfo();
        } catch (Exception e) {
            C51423a.m95790a((Throwable) e);
            return C61338a.m111034a();
        }
    }

    /* renamed from: a */
    public static boolean m27165a(Context context) {
        try {
            NetworkInfo a = m27163a((ConnectivityManager) m27164a(context, "connectivity"));
            if (a == null || !a.isConnected()) {
                return false;
            }
            return true;
        } catch (Exception unused) {
        }
    }

    /* renamed from: b */
    public static EnumC14799a m27166b(Context context) {
        int i;
        try {
            NetworkInfo a = m27163a((ConnectivityManager) m27164a(context, "connectivity"));
            if (a == null || !a.isAvailable()) {
                return EnumC14799a.NONE;
            }
            int type = a.getType();
            if (1 == type) {
                return EnumC14799a.WIFI;
            }
            if (type != 0) {
                return EnumC14799a.MOBILE;
            }
            TelephonyManager telephonyManager = (TelephonyManager) m27164a(context, "phone");
            if (Build.VERSION.SDK_INT >= 29) {
                if (!C58017a.f132225a.getAndSet(true)) {
                    C58017a.m104840a().mo95542a();
                }
                i = C58017a.m104840a().f132229b.get();
                if (!C58017a.f132227c && i == -1) {
                    return EnumC14799a.MOBILE;
                }
            } else {
                i = telephonyManager.getNetworkType();
            }
            switch (i) {
                case 3:
                case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 8}*/:
                case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 9}*/:
                case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 10}*/:
                case ABRConfig.ABR_DEFAULT_WIFI_BITRATE /*{ENCODED_INT: 12}*/:
                case ABRConfig.ABR_SELECT_SCENE /*{ENCODED_INT: 14}*/:
                case 15:
                    return EnumC14799a.MOBILE_3G;
                case ABRConfig.ABR_STARTUP_MAX_BITRATE /*{ENCODED_INT: 13}*/:
                    return EnumC14799a.MOBILE_4G;
            }
            return EnumC14799a.MOBILE;
        } catch (Throwable unused) {
            return EnumC14799a.MOBILE;
        }
    }

    /* renamed from: a */
    private static Object m27164a(Context context, String str) {
        Object obj;
        MethodCollector.m26663i(13896);
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
                    MethodCollector.m26664o(13896);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }
}
