package com.p2082ss.android.common.p2127a;

import android.content.ClipboardManager;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.common.utility.AbstractC13621j;
import com.bytedance.common.utility.C13627m;
import com.bytedance.common.utility.Logger;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.p2082ss.android.common.applog.AppLog;
import com.p2082ss.android.common.applog.C29803q;
import com.p2082ss.android.deviceregister.C29892d;
import com.p2082ss.android.deviceregister.DeviceRegisterManager;
import com.p2082ss.android.deviceregister.p2134a.C29869d;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import java.lang.reflect.Field;
import java.util.TimeZone;
import org.json.JSONObject;

/* renamed from: com.ss.android.common.a.a */
public final class C29743a {
    static {
        Covode.recordClassIndex(36144);
    }

    /* renamed from: com.ss.android.common.a.a$a */
    public static class C29744a extends Thread {

        /* renamed from: a */
        private final boolean f70929a;

        /* renamed from: b */
        private Context f70930b;

        /* renamed from: c */
        private String f70931c;

        static {
            Covode.recordClassIndex(36145);
        }

        public final void run() {
            C29743a.m59929a(this.f70930b, this.f70931c, this.f70929a);
        }

        public C29744a(Context context, String str, boolean z) {
            this.f70930b = context;
            this.f70931c = str;
            this.f70929a = z;
        }
    }

    /* renamed from: a */
    private static Object m59926a(Context context, String str) {
        Object obj;
        MethodCollector.m26663i(9110);
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
                    MethodCollector.m26664o(9110);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }

    /* renamed from: a */
    private static String m59927a(String str, String str2, String str3) {
        try {
            if (TextUtils.isEmpty(str2)) {
                return str;
            }
            return Uri.parse(str).buildUpon().appendQueryParameter(str2, str3).build().toString();
        } catch (Throwable unused) {
            return str;
        }
    }

    /* renamed from: a */
    public static boolean m59929a(Context context, String str, boolean z) {
        boolean z2;
        String str2;
        try {
            StringBuilder sb = new StringBuilder(str);
            if (!z) {
                try {
                    Pair<String, Boolean> a = C29892d.m60259a(context);
                    if (a != null) {
                        if (a.second == null || !((Boolean) a.second).booleanValue()) {
                            z2 = false;
                        } else {
                            z2 = true;
                        }
                        if (z2) {
                            str2 = "1";
                        } else {
                            str2 = "0";
                        }
                        m59928a(sb, "gaid_limited", str2, true);
                        m59928a(sb, "google_aid", (String) a.first, true);
                    }
                } catch (Exception unused) {
                }
            }
            float rawOffset = (((float) TimeZone.getDefault().getRawOffset()) * 1.0f) / 3600000.0f;
            if (rawOffset < -12.0f) {
                rawOffset = -12.0f;
            } else if (rawOffset > 12.0f) {
                rawOffset = 12.0f;
            }
            m59928a(sb, "timezone", String.valueOf(rawOffset), false);
            String str3 = C29869d.f71261o;
            if (!TextUtils.isEmpty(str3)) {
                m59928a(sb, "package", str3, true);
                m59928a(sb, "real_package_name", context.getPackageName(), true);
            }
            TelephonyManager telephonyManager = (TelephonyManager) m59926a(context, "phone");
            m59928a(sb, "carrier", telephonyManager.getNetworkOperatorName(), true);
            m59928a(sb, "mcc_mnc", telephonyManager.getNetworkOperator(), true);
            m59928a(sb, "sim_region", telephonyManager.getSimCountryIso(), true);
            m59928a(sb, "app_version_minor", AppLog.getAppVersionMinor(), true);
            C29803q.m60033a(sb, true);
            String a2 = m59927a(sb.toString(), "req_id", DeviceRegisterManager.getRequestId());
            Logger.debug();
            String a3 = AbstractC13621j.f33100a.mo21870a(a2, null);
            if (C13627m.m24498a(a3) || !"success".equals(new JSONObject(a3).optString("message"))) {
                return false;
            }
            return true;
        } catch (Exception unused2) {
        }
    }

    /* renamed from: a */
    private static void m59928a(StringBuilder sb, String str, String str2, boolean z) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            if (sb.toString().indexOf(63) < 0) {
                sb.append("?");
            } else {
                sb.append("&");
            }
            StringBuilder append = sb.append(str).append("=");
            if (z) {
                str2 = Uri.encode(str2);
            }
            append.append(str2);
        }
    }
}
