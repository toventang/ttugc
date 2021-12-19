package com.benchmark.netUtils;

import android.content.ClipboardManager;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.telephony.TelephonyManager;
import com.benchmark.p119c.C2436b;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.bytedance.retrofit2.C22092q;
import com.bytedance.ttnet.utils.RetrofitUtils;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import com.p2082ss.android.ugc.aweme.lancet.p3387d.C58017a;
import com.p2082ss.android.ugc.aweme.net.p3492e.C61338a;
import java.lang.reflect.Field;
import java.util.LinkedHashMap;
import java.util.Map;
import okhttp3.C90208y;

/* renamed from: com.benchmark.netUtils.a */
public class C2496a {

    /* renamed from: d */
    private static volatile C2496a f7565d;

    /* renamed from: a */
    public C22092q f7566a;

    /* renamed from: b */
    public String f7567b;

    /* renamed from: c */
    public C90208y f7568c;

    /* renamed from: e */
    private volatile Map<String, String> f7569e;

    static {
        Covode.recordClassIndex(2854);
    }

    /* renamed from: a */
    public static synchronized C2496a m7360a() {
        C2496a aVar;
        synchronized (C2496a.class) {
            MethodCollector.m26663i(6302);
            if (f7565d == null) {
                f7565d = new C2496a();
            }
            aVar = f7565d;
            MethodCollector.m26664o(6302);
        }
        return aVar;
    }

    /* renamed from: b */
    public final Map<String, String> mo6918b() {
        String str;
        ConnectivityManager connectivityManager;
        int i;
        MethodCollector.m26663i(6601);
        if (this.f7569e == null) {
            synchronized (C2496a.class) {
                try {
                    if (this.f7569e == null) {
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        linkedHashMap.put("sdk_version", "2.4.0-8_mt");
                        linkedHashMap.put("device_type", C2436b.f7319m.f7321b);
                        linkedHashMap.put("device_platform", "android");
                        linkedHashMap.put("status", String.valueOf(C2436b.f7319m.f7322c));
                        linkedHashMap.put("aid", String.valueOf(C2436b.f7319m.f7323d));
                        linkedHashMap.put("app_name", C2436b.f7319m.f7324e);
                        linkedHashMap.put("app_version", C2436b.f7319m.f7325f);
                        linkedHashMap.put("update_version_code", String.valueOf(C2436b.f7319m.f7326g));
                        linkedHashMap.put("device_id", C2436b.f7319m.f7327h);
                        linkedHashMap.put("user_id", C2436b.f7319m.f7328i);
                        Context context = C2436b.f7319m.f7320a;
                        if (!(context == null || (connectivityManager = (ConnectivityManager) m7361a(context, "connectivity")) == null)) {
                            NetworkInfo a = m7359a(connectivityManager);
                            if (a == null || a.getType() != 1) {
                                TelephonyManager telephonyManager = (TelephonyManager) m7361a(context, "phone");
                                if (telephonyManager != null) {
                                    if (Build.VERSION.SDK_INT >= 29) {
                                        if (!C58017a.f132225a.getAndSet(true)) {
                                            C58017a.m104840a().mo95542a();
                                        }
                                        i = C58017a.m104840a().f132229b.get();
                                        if (!C58017a.f132227c && i == -1) {
                                            i = 0;
                                        }
                                    } else {
                                        i = telephonyManager.getNetworkType();
                                    }
                                    switch (i) {
                                        case 1:
                                        case 2:
                                        case 4:
                                        case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY /*{ENCODED_INT: 7}*/:
                                        case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 11}*/:
                                            str = "2G";
                                            break;
                                        case 3:
                                        case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                                        case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                                        case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 8}*/:
                                        case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 9}*/:
                                        case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 10}*/:
                                        case ABRConfig.ABR_DEFAULT_WIFI_BITRATE /*{ENCODED_INT: 12}*/:
                                        case ABRConfig.ABR_SELECT_SCENE /*{ENCODED_INT: 14}*/:
                                        case 15:
                                            str = "3G";
                                            break;
                                        case ABRConfig.ABR_STARTUP_MAX_BITRATE /*{ENCODED_INT: 13}*/:
                                            str = "4G";
                                            break;
                                        default:
                                            str = "unknown";
                                            break;
                                    }
                                    linkedHashMap.put("net_status", str);
                                    this.f7569e = new LinkedHashMap(linkedHashMap);
                                }
                            } else {
                                str = "wifi";
                                linkedHashMap.put("net_status", str);
                                this.f7569e = new LinkedHashMap(linkedHashMap);
                            }
                        }
                        str = "unknown";
                        linkedHashMap.put("net_status", str);
                        this.f7569e = new LinkedHashMap(linkedHashMap);
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(6601);
                    throw th;
                }
            }
        }
        Map<String, String> map = this.f7569e;
        MethodCollector.m26664o(6601);
        return map;
    }

    /* renamed from: a */
    private static NetworkInfo m7359a(ConnectivityManager connectivityManager) {
        try {
            return connectivityManager.getActiveNetworkInfo();
        } catch (Exception e) {
            C51423a.m95790a((Throwable) e);
            return C61338a.m111034a();
        }
    }

    /* renamed from: a */
    public final <T> T mo6917a(Class<T> cls) {
        return (T) this.f7566a.mo35884a(cls);
    }

    /* renamed from: a */
    private static Object m7361a(Context context, String str) {
        Object obj;
        MethodCollector.m26663i(6460);
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
                    MethodCollector.m26664o(6460);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }

    /* renamed from: a */
    public static boolean m7362a(String str, String str2, String str3) {
        try {
            return RetrofitUtils.m43287a(str, str2, str3);
        } catch (Exception unused) {
            return false;
        }
    }
}
