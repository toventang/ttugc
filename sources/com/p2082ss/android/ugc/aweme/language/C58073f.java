package com.p2082ss.android.ugc.aweme.language;

import android.content.ClipboardManager;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import com.p2082ss.android.ugc.aweme.p2387bf.C34822d;
import com.p2082ss.android.ugc.aweme.setting.services.SettingServiceImpl;
import java.lang.reflect.Field;
import java.util.Arrays;

/* renamed from: com.ss.android.ugc.aweme.language.f */
public final class C58073f {
    static {
        Covode.recordClassIndex(68116);
    }

    /* renamed from: a */
    public static final String m104920a() {
        String b = m104922b();
        if (TextUtils.isEmpty(b)) {
            b = SettingServiceImpl.m120782v().mo108876l();
            if (TextUtils.isEmpty(b)) {
                b = SettingServiceImpl.m120782v().mo108877m();
            }
        }
        if (TextUtils.isEmpty(b)) {
            b = "";
        }
        return b.toUpperCase();
    }

    /* renamed from: b */
    public static final String m104922b() {
        String str;
        if (C58070c.m104905a()) {
            String string = C34822d.m71158a(C17867d.m33078a(), "test_setting", 0).getString("pref_carrier", "US");
            if (!TextUtils.isEmpty(string)) {
                return string;
            }
        }
        try {
            str = ((TelephonyManager) m104919a(C17867d.m33078a(), "phone")).getSimCountryIso();
        } catch (Exception e) {
            e.printStackTrace();
            str = "";
        }
        if (!TextUtils.isEmpty(str)) {
            return str.toUpperCase();
        }
        return str;
    }

    /* renamed from: a */
    public static final boolean m104921a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return Arrays.asList("AT", "BE", "BG", "HR", "CY", "CZ", "EE", "FI", "FR", "DE", "GR", "HU", "IE", "IT", "LV", "LT", "LU", "MT", "NL", "PL", "PT", "RO", "SK", "SI", "ES", "SE", "GB").contains(str.toUpperCase());
    }

    /* renamed from: a */
    private static Object m104919a(Context context, String str) {
        Object obj;
        MethodCollector.m26663i(3378);
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
                    MethodCollector.m26664o(3378);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }
}
