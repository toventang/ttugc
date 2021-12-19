package com.bytedance.common.utility;

import android.content.BroadcastReceiver;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.telephony.TelephonyManager;
import android.util.Pair;
import com.bytedance.android.livesdk.livesetting.wallet.LiveRechargeAgeThresholdSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.InteractFirstFrameTimeOutDurationSetting;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import com.p2082ss.android.ugc.aweme.lancet.C58029j;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import com.p2082ss.android.ugc.aweme.lancet.p3387d.C58017a;
import com.p2082ss.android.ugc.aweme.net.p3492e.C61338a;
import com.p2082ss.android.ugc.playerkit.model.C84224v;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Field;
import java.net.URLEncoder;
import java.util.List;

/* renamed from: com.bytedance.common.utility.l */
public final class C13624l {

    /* renamed from: a */
    public static AbstractC13626b f33103a;

    /* renamed from: b */
    static EnumC13625a f33104b = EnumC13625a.UNKNOWN;

    /* renamed from: c */
    private static boolean f33105c;

    /* renamed from: d */
    private static long f33106d;

    /* renamed from: com.bytedance.common.utility.l$b */
    public interface AbstractC13626b {
        static {
            Covode.recordClassIndex(15653);
        }

        /* renamed from: a */
        EnumC13625a mo21885a();
    }

    /* renamed from: a */
    public static boolean m24484a(int i) {
        return i > 4900 && i < 5900;
    }

    /* renamed from: com.bytedance.common.utility.l$a */
    public enum EnumC13625a {
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
        final int f33108a;

        public final int getValue() {
            return this.f33108a;
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
            Covode.recordClassIndex(15652);
        }

        private EnumC13625a(int i) {
            this.f33108a = i;
        }
    }

    static {
        Covode.recordClassIndex(15651);
    }

    /* renamed from: a */
    private static NetworkInfo m24478a(ConnectivityManager connectivityManager) {
        try {
            return connectivityManager.getActiveNetworkInfo();
        } catch (Exception e) {
            C51423a.m95790a((Throwable) e);
            return C61338a.m111034a();
        }
    }

    /* renamed from: c */
    public static EnumC13625a m24487c(Context context) {
        m24491g(context);
        m24492h(context);
        return f33104b;
    }

    /* renamed from: f */
    public static String m24490f(Context context) {
        return m24481a(m24479a(context));
    }

    /* renamed from: j */
    private static Context m24494j(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (C58003a.f132201c && applicationContext == null) {
            return C58003a.f132199a;
        }
        return applicationContext;
    }

    /* renamed from: h */
    private static void m24492h(Context context) {
        if (System.currentTimeMillis() - f33106d > InteractFirstFrameTimeOutDurationSetting.DEFAULT) {
            f33104b = m24479a(context);
            f33106d = System.currentTimeMillis();
        }
    }

    /* renamed from: a */
    private static int m24476a(TelephonyManager telephonyManager) {
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

    /* renamed from: g */
    private static void m24491g(Context context) {
        AbstractC13626b bVar = f33103a;
        if (bVar == null || bVar.mo21885a() == EnumC13625a.NONE) {
            m24493i(context);
            if (f33104b == EnumC13625a.UNKNOWN) {
                f33104b = m24479a(context);
                return;
            }
            return;
        }
        f33104b = f33103a.mo21885a();
    }

    /* renamed from: i */
    private static void m24493i(Context context) {
        if (!f33105c && context != null) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
            intentFilter.addAction("android.net.wifi.WIFI_STATE_CHANGED");
            intentFilter.addAction("android.net.wifi.STATE_CHANGE");
            m24485b(m24494j(context), new C13623k(), intentFilter);
            f33105c = true;
        }
    }

    /* renamed from: a */
    public static EnumC13625a m24479a(Context context) {
        if (C58029j.f132251c != EnumC13625a.UNKNOWN && C58029j.m104846b() && !C58029j.m104847c()) {
            return C58029j.f132251c;
        }
        EnumC13625a d = m24488d(context);
        C58029j.f132251c = d;
        return d;
    }

    /* renamed from: b */
    public static boolean m24486b(Context context) {
        try {
            NetworkInfo a = m24478a((ConnectivityManager) m24480a(context, "connectivity"));
            if (a != null) {
                if (a.isAvailable()) {
                    AbstractC13626b bVar = f33103a;
                    if (bVar == null || bVar.mo21885a() == EnumC13625a.NONE) {
                        if (1 == a.getType()) {
                            return true;
                        }
                    } else if (f33103a.mo21885a() == EnumC13625a.WIFI) {
                        return true;
                    } else {
                        return false;
                    }
                }
            }
        } catch (Exception unused) {
        }
        return false;
    }

    /* renamed from: d */
    public static EnumC13625a m24488d(Context context) {
        try {
            NetworkInfo a = m24478a((ConnectivityManager) m24480a(context, "connectivity"));
            if (a == null || !a.isAvailable()) {
                return EnumC13625a.NONE;
            }
            int type = a.getType();
            if (1 == type) {
                return EnumC13625a.WIFI;
            }
            if (type != 0) {
                return EnumC13625a.MOBILE;
            }
            int a2 = m24476a((TelephonyManager) m24480a(context, "phone"));
            if (a2 != 3) {
                if (a2 == 20) {
                    return EnumC13625a.MOBILE_5G;
                }
                if (!(a2 == 5 || a2 == 6)) {
                    switch (a2) {
                        case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 8}*/:
                        case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 9}*/:
                        case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 10}*/:
                            break;
                        default:
                            switch (a2) {
                                case ABRConfig.ABR_DEFAULT_WIFI_BITRATE /*{ENCODED_INT: 12}*/:
                                case ABRConfig.ABR_SELECT_SCENE /*{ENCODED_INT: 14}*/:
                                case 15:
                                    break;
                                case ABRConfig.ABR_STARTUP_MAX_BITRATE /*{ENCODED_INT: 13}*/:
                                    return EnumC13625a.MOBILE_4G;
                                default:
                                    return EnumC13625a.MOBILE;
                            }
                    }
                }
            }
            return EnumC13625a.MOBILE_3G;
        } catch (Throwable unused) {
            return EnumC13625a.MOBILE;
        }
    }

    /* renamed from: e */
    public static String m24489e(Context context) {
        boolean z;
        try {
            NetworkInfo a = m24478a((ConnectivityManager) m24480a(context, "connectivity"));
            if (a == null || !a.isAvailable()) {
                return "none";
            }
            int type = a.getType();
            if (1 == type) {
                if (Build.VERSION.SDK_INT >= 21) {
                    z = m24484a(((WifiManager) m24480a(m24494j(context), "wifi")).getConnectionInfo().getFrequency());
                } else {
                    z = false;
                }
                if (z) {
                    return "wifi5g";
                }
                return "wifi";
            } else if (type != 0) {
                return "unknown";
            } else {
                TelephonyManager telephonyManager = (TelephonyManager) m24480a(context, "phone");
                switch (m24476a(telephonyManager)) {
                    case 1:
                        return "gprs";
                    case 2:
                        return "edge";
                    case 3:
                        return "umts";
                    case 4:
                        return "cdma";
                    case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                        return "evdo_0";
                    case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                        return "evdo_a";
                    case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY /*{ENCODED_INT: 7}*/:
                        return "1xrtt";
                    case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 8}*/:
                        return "hsdpa";
                    case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 9}*/:
                        return "hsupa";
                    case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 10}*/:
                        return "hspa";
                    case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 11}*/:
                        return "iden";
                    case ABRConfig.ABR_DEFAULT_WIFI_BITRATE /*{ENCODED_INT: 12}*/:
                        return "evdo_b";
                    case ABRConfig.ABR_STARTUP_MAX_BITRATE /*{ENCODED_INT: 13}*/:
                        return "lte";
                    case ABRConfig.ABR_SELECT_SCENE /*{ENCODED_INT: 14}*/:
                        return "ehrpd";
                    case 15:
                        return "hspap";
                    case 16:
                        return "gsm";
                    case 17:
                        return "td_scdma";
                    case LiveRechargeAgeThresholdSetting.DEFAULT:
                    default:
                        return String.valueOf(m24476a(telephonyManager));
                    case 19:
                        return "lte_ca";
                    case C84224v.f188239U /*{ENCODED_INT: 20}*/:
                        return "nr";
                }
            }
        } catch (Throwable unused) {
            return "unknown";
        }
    }

    /* renamed from: a */
    public static String m24481a(EnumC13625a aVar) {
        if (aVar == EnumC13625a.WIFI) {
            return "wifi";
        }
        if (aVar == EnumC13625a.WIFI_24GHZ) {
            return "wifi24ghz";
        }
        if (aVar == EnumC13625a.WIFI_5GHZ) {
            return "wifi5ghz";
        }
        if (aVar == EnumC13625a.MOBILE_2G) {
            return "2g";
        }
        if (aVar == EnumC13625a.MOBILE_3G) {
            return "3g";
        }
        if (aVar == EnumC13625a.MOBILE_3G_H) {
            return "3gh";
        }
        if (aVar == EnumC13625a.MOBILE_3G_HP) {
            return "3ghp";
        }
        if (aVar == EnumC13625a.MOBILE_4G) {
            return "4g";
        }
        if (aVar == EnumC13625a.MOBILE_5G) {
            return "5g";
        }
        if (aVar == EnumC13625a.MOBILE) {
            return "mobile";
        }
        return "";
    }

    /* renamed from: a */
    private static Object m24480a(Context context, String str) {
        Object obj;
        MethodCollector.m26663i(12591);
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
                    MethodCollector.m26664o(12591);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }

    /* renamed from: a */
    private static String m24482a(String str, String str2) {
        if (str2 == null) {
            str2 = "ISO-8859-1";
        }
        try {
            return URLEncoder.encode(str, str2);
        } catch (UnsupportedEncodingException e) {
            throw new IllegalArgumentException(e);
        }
    }

    /* renamed from: a */
    public static String m24483a(List<Pair<String, String>> list, String str) {
        String str2;
        StringBuilder sb = new StringBuilder();
        for (Pair<String, String> pair : list) {
            String a = m24482a((String) pair.first, str);
            String str3 = (String) pair.second;
            if (str3 != null) {
                str2 = m24482a(str3, str);
            } else {
                str2 = "";
            }
            if (sb.length() > 0) {
                sb.append("&");
            }
            sb.append(a);
            sb.append("=");
            sb.append(str2);
        }
        return sb.toString();
    }

    /* renamed from: a */
    private static Intent m24477a(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
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
    private static android.content.Intent m24485b(android.content.Context r1, android.content.BroadcastReceiver r2, android.content.IntentFilter r3) {
        /*
            android.app.Application r0 = com.bytedance.ies.ugc.appcontext.C17879g.m33104a()
            com.p2082ss.android.ugc.aweme.lancet.receiver.C58039a.m104863a(r0)
            android.content.Intent r0 = m24477a(r1, r2, r3)     // Catch:{ Exception -> 0x000c }
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
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.common.utility.C13624l.m24485b(android.content.Context, android.content.BroadcastReceiver, android.content.IntentFilter):android.content.Intent");
    }
}
