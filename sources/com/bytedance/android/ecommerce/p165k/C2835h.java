package com.bytedance.android.ecommerce.p165k;

import android.content.BroadcastReceiver;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.telephony.TelephonyManager;
import androidx.core.app.C0569a;
import com.bytedance.android.livesdk.livesetting.watchlive.InteractFirstFrameTimeOutDurationSetting;
import com.bytedance.common.utility.C13623k;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import com.p2082ss.android.ugc.aweme.lancet.p3387d.C58017a;
import com.p2082ss.android.ugc.aweme.net.p3492e.C61338a;
import java.lang.reflect.Field;

/* renamed from: com.bytedance.android.ecommerce.k.h */
public final class C2835h {

    /* renamed from: a */
    private static volatile boolean f8441a;

    /* renamed from: b */
    private static AbstractC2837b f8442b;

    /* renamed from: c */
    private static EnumC2836a f8443c = EnumC2836a.UNKNOWN;

    /* renamed from: d */
    private static boolean f8444d;

    /* renamed from: e */
    private static volatile long f8445e = InteractFirstFrameTimeOutDurationSetting.DEFAULT;

    /* renamed from: f */
    private static long f8446f;

    /* renamed from: com.bytedance.android.ecommerce.k.h$b */
    public interface AbstractC2837b {
        static {
            Covode.recordClassIndex(3263);
        }

        /* renamed from: a */
        EnumC2836a mo7423a();
    }

    /* renamed from: com.bytedance.android.ecommerce.k.h$a */
    public enum EnumC2836a {
        UNKNOWN(-1),
        NONE(0),
        MOBILE(1),
        MOBILE_2G(2),
        MOBILE_3G(3),
        WIFI(4),
        MOBILE_4G(5),
        MOBILE_5G(6),
        WIFI_24GHZ(7),
        WIFI_5GHZ(8),
        MOBILE_3G_H(9),
        MOBILE_3G_HP(10);
        

        /* renamed from: a */
        final int f8448a;

        public final int getValue() {
            return this.f8448a;
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

        public final boolean is4GOrHigher() {
            if (this == MOBILE_4G || this == MOBILE_5G) {
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

        public final boolean is3GOrHigher() {
            if (this == MOBILE_3G || this == MOBILE_3G_H || this == MOBILE_3G_HP || this == MOBILE_4G || this == MOBILE_5G) {
                return true;
            }
            return false;
        }

        static {
            Covode.recordClassIndex(3262);
        }

        private EnumC2836a(int i) {
            this.f8448a = i;
        }
    }

    static {
        Covode.recordClassIndex(3261);
    }

    /* renamed from: a */
    private static NetworkInfo m8109a(ConnectivityManager connectivityManager) {
        try {
            return connectivityManager.getActiveNetworkInfo();
        } catch (Exception e) {
            C51423a.m95790a((Throwable) e);
            return C61338a.m111034a();
        }
    }

    /* renamed from: b */
    public static EnumC2836a m8113b(Context context) {
        if (f8441a) {
            return m8114c(context);
        }
        return m8115d(context);
    }

    /* renamed from: a */
    public static boolean m8111a(Context context) {
        try {
            NetworkInfo a = m8109a((ConnectivityManager) m8110a(context, "connectivity"));
            if (a == null || !a.isConnected()) {
                return false;
            }
            return true;
        } catch (Exception unused) {
        }
    }

    /* renamed from: c */
    private static EnumC2836a m8114c(Context context) {
        AbstractC2837b bVar = f8442b;
        if (bVar == null || bVar.mo7423a() == EnumC2836a.NONE) {
            if (!f8444d && context != null) {
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
                intentFilter.addAction("android.net.wifi.WIFI_STATE_CHANGED");
                intentFilter.addAction("android.net.wifi.STATE_CHANGE");
                Context applicationContext = context.getApplicationContext();
                if (C58003a.f132201c && applicationContext == null) {
                    applicationContext = C58003a.f132199a;
                }
                m8112b(applicationContext, new C13623k(), intentFilter);
                f8444d = true;
            }
            if (f8443c == EnumC2836a.UNKNOWN) {
                f8443c = m8115d(context);
            }
        } else {
            f8443c = f8442b.mo7423a();
        }
        if (System.currentTimeMillis() - f8446f > f8445e) {
            f8443c = m8115d(context);
            f8446f = System.currentTimeMillis();
        }
        return f8443c;
    }

    /* renamed from: d */
    private static EnumC2836a m8115d(Context context) {
        int i;
        try {
            NetworkInfo a = m8109a((ConnectivityManager) m8110a(context, "connectivity"));
            if (a == null || !a.isAvailable()) {
                return EnumC2836a.NONE;
            }
            int type = a.getType();
            if (1 == type) {
                return EnumC2836a.WIFI;
            }
            if (type != 0) {
                return EnumC2836a.MOBILE;
            }
            TelephonyManager telephonyManager = (TelephonyManager) m8110a(context, "phone");
            if (C0569a.m2367a(context, "android.permission.READ_PHONE_STATE") != 0) {
                return EnumC2836a.UNKNOWN;
            }
            if (Build.VERSION.SDK_INT >= 29) {
                if (!C58017a.f132225a.getAndSet(true)) {
                    C58017a.m104840a().mo95542a();
                }
                i = C58017a.m104840a().f132229b.get();
                if (!C58017a.f132227c && i == -1) {
                    return EnumC2836a.MOBILE;
                }
            } else {
                i = telephonyManager.getNetworkType();
            }
            if (i != 3) {
                if (i == 20) {
                    return EnumC2836a.MOBILE_5G;
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
                                    return EnumC2836a.MOBILE_4G;
                                default:
                                    return EnumC2836a.MOBILE;
                            }
                    }
                }
            }
            return EnumC2836a.MOBILE_3G;
        } catch (Throwable unused) {
            return EnumC2836a.MOBILE;
        }
    }

    /* renamed from: a */
    private static Object m8110a(Context context, String str) {
        Object obj;
        MethodCollector.m26663i(2917);
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
                    MethodCollector.m26664o(2917);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }

    /* renamed from: a */
    private static Intent m8108a(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        try {
            return context.registerReceiver(broadcastReceiver, intentFilter);
        } catch (Exception e) {
            if (ReceiverRegisterCrashOptimizer.fixedOpen()) {
                return ReceiverRegisterCrashOptimizer.registerReceiver(broadcastReceiver, intentFilter);
            }
            throw e;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v3, resolved type: java.lang.IllegalArgumentException */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0018, code lost:
        r0 = r2.getMessage().contains("regist too many Broadcast Receivers");
        r2 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0022, code lost:
        if (r0 != false) goto L_0x0025;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0025, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0026, code lost:
        r2 = move-exception;
        r2 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0027, code lost:
        com.bytedance.p890c.p891a.p892a.p893a.C13468b.m24211a(r2, "Register Receiver Exception");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002d, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0010, code lost:
        return com.p2082ss.android.ugc.aweme.lancet.receiver.ReceiverRegisterLancetHelper.registerReceiver(r2, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0011, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0012, code lost:
        r0 = r2.getMessage();
        r2 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0016, code lost:
        if (r0 != null) goto L_0x0018;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:4:0x000c */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.content.Intent m8112b(android.content.Context r1, android.content.BroadcastReceiver r2, android.content.IntentFilter r3) {
        /*
            android.app.Application r0 = com.bytedance.ies.ugc.appcontext.C17879g.m33104a()
            com.p2082ss.android.ugc.aweme.lancet.receiver.C58039a.m104863a(r0)
            android.content.Intent r0 = m8108a(r1, r2, r3)     // Catch:{ Exception -> 0x000c }
            return r0
        L_0x000c:
            android.content.Intent r0 = com.p2082ss.android.ugc.aweme.lancet.receiver.ReceiverRegisterLancetHelper.registerReceiver(r2, r3)     // Catch:{ SecurityException -> 0x0026, IllegalArgumentException -> 0x0011 }
            return r0
        L_0x0011:
            r2 = move-exception
            java.lang.String r0 = r2.getMessage()
            if (r0 == 0) goto L_0x0027
            java.lang.String r1 = r2.getMessage()
            java.lang.String r0 = "regist too many Broadcast Receivers"
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L_0x0025
            goto L_0x0027
        L_0x0025:
            throw r2
        L_0x0026:
            r2 = move-exception
        L_0x0027:
            java.lang.String r0 = "Register Receiver Exception"
            com.bytedance.p890c.p891a.p892a.p893a.C13468b.m24211a(r2, r0)
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.ecommerce.p165k.C2835h.m8112b(android.content.Context, android.content.BroadcastReceiver, android.content.IntentFilter):android.content.Intent");
    }
}
