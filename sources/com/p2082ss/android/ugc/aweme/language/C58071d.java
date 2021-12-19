package com.p2082ss.android.ugc.aweme.language;

import android.content.ClipboardManager;
import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.p2082ss.android.common.util.NetworkUtils;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import com.p2082ss.android.ugc.aweme.p2227aa.C31299b;
import com.p2082ss.android.ugc.aweme.setting.services.SettingServiceImpl;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;

/* renamed from: com.ss.android.ugc.aweme.language.d */
public class C58071d {

    /* renamed from: a */
    static List<String> f132306a = Arrays.asList("JP", "HK", "ID", "MO", "TW", "KR", "VN", "TH", "PH", "MY", "SG", "KH", "LA", "MM", "CN");

    /* renamed from: b */
    private static volatile String f132307b = "";

    /* renamed from: c */
    private static volatile List<String> f132308c;

    /* renamed from: d */
    private static HashSet<String> f132309d;

    /* renamed from: e */
    private static Resources f132310e = null;

    /* renamed from: c */
    public static boolean m104909c() {
        return m104917k().contains(m104907a());
    }

    /* renamed from: a */
    public static String m104907a() {
        if (!TextUtils.isEmpty(f132307b)) {
            return f132307b;
        }
        m104908b();
        return f132307b;
    }

    /* renamed from: d */
    public static boolean m104910d() {
        if ("RU".equalsIgnoreCase(m104914h()) || "RU".equalsIgnoreCase(m104913g())) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public static boolean m104911e() {
        if (Locale.KOREA.getCountry() == null || !Locale.KOREA.getCountry().equalsIgnoreCase(m104913g())) {
            return false;
        }
        return true;
    }

    /* renamed from: i */
    public static final boolean m104915i() {
        if (Locale.JAPAN.getCountry() == null || !Locale.JAPAN.getCountry().equalsIgnoreCase(m104913g())) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    static void m104908b() {
        MethodCollector.m26663i(1939);
        synchronized (C58071d.class) {
            try {
                if (TextUtils.isEmpty(f132307b)) {
                    f132307b = SettingsManager.m29616a().mo25398a("priority_region", "");
                }
                if (TextUtils.isEmpty(f132307b)) {
                    f132307b = m104916j();
                }
            } finally {
                MethodCollector.m26664o(1939);
            }
        }
    }

    /* renamed from: f */
    public static boolean m104912f() {
        if (Locale.US.getCountry() == null) {
            return false;
        }
        if (Locale.US.getCountry().equalsIgnoreCase(m104914h()) || Locale.US.getCountry().equalsIgnoreCase(m104913g())) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public static final String m104913g() {
        String h = m104914h();
        if (TextUtils.isEmpty(h)) {
            h = SettingServiceImpl.m120782v().mo108876l();
            if (TextUtils.isEmpty(h)) {
                h = SettingServiceImpl.m120782v().mo108877m();
            }
        }
        if (TextUtils.isEmpty(h)) {
            h = "";
        }
        return h.toUpperCase(Locale.US);
    }

    /* renamed from: h */
    public static final String m104914h() {
        String str;
        try {
            str = ((TelephonyManager) m104906a(C17867d.m33078a(), "phone")).getSimCountryIso();
        } catch (Exception e) {
            e.printStackTrace();
            str = "";
        }
        if (!TextUtils.isEmpty(str)) {
            return str.toUpperCase(Locale.US);
        }
        return str;
    }

    /* renamed from: j */
    private static String m104916j() {
        String h = m104914h();
        if (TextUtils.isEmpty(h)) {
            String networkOperatorCode = NetworkUtils.getNetworkOperatorCode(C17867d.m33078a());
            try {
                if (!TextUtils.isEmpty(networkOperatorCode) && !networkOperatorCode.equals("unkown") && networkOperatorCode.length() >= 3) {
                    h = C31299b.f75016a.get(Integer.valueOf(Integer.parseInt(networkOperatorCode.substring(0, 3))));
                }
            } catch (NumberFormatException e) {
                e.printStackTrace();
            }
            if (TextUtils.isEmpty(h)) {
                h = SettingServiceImpl.m120782v().mo108876l();
                if (TextUtils.isEmpty(h)) {
                    h = SettingServiceImpl.m120782v().mo108877m();
                }
            }
        }
        if (TextUtils.isEmpty(h)) {
            h = "";
        }
        return h.toUpperCase(Locale.US);
    }

    /* renamed from: k */
    private static List<String> m104917k() {
        MethodCollector.m26663i(1986);
        if (f132308c == null || f132308c.size() <= 0) {
            synchronized (C58071d.class) {
                try {
                    if (f132308c == null || f132308c.size() <= 0) {
                        f132308c = new ArrayList();
                        if (!TextUtils.isEmpty(SettingsManager.m29616a().mo25398a("tt_regions", ""))) {
                            f132308c.addAll(Arrays.asList(SettingsManager.m29616a().mo25398a("tt_regions", "").split(",")));
                        } else {
                            f132308c.addAll(f132306a);
                        }
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(1986);
                    throw th;
                }
            }
            List<String> list = f132308c;
            MethodCollector.m26664o(1986);
            return list;
        }
        List<String> list2 = f132308c;
        MethodCollector.m26664o(1986);
        return list2;
    }

    static {
        Covode.recordClassIndex(68114);
        SettingsManager.m29616a().mo25399a(C58072e.f132311a);
        HashSet<String> hashSet = new HashSet<>();
        f132309d = hashSet;
        hashSet.add("EG");
        f132309d.add("SD");
        f132309d.add("DZ");
        f132309d.add("MA");
        f132309d.add("IQ");
        f132309d.add("SA");
        f132309d.add("YE");
        f132309d.add("SY");
        f132309d.add("TD");
        f132309d.add("TN");
        f132309d.add("SO");
        f132309d.add("LY");
        f132309d.add("JO");
        f132309d.add("ER");
        f132309d.add("AE");
        f132309d.add("LB");
        f132309d.add("MR");
        f132309d.add("KW");
        f132309d.add("OM");
        f132309d.add("QA");
        f132309d.add("DJ");
        f132309d.add("BH");
        f132309d.add("KM");
    }

    /* renamed from: a */
    private static Object m104906a(Context context, String str) {
        Object obj;
        MethodCollector.m26663i(2022);
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
                    MethodCollector.m26664o(2022);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }
}
