package com.facebook.p1814a;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.util.Patterns;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.facebook.C24872m;
import com.facebook.internal.C24693ad;
import com.facebook.internal.C24699ae;
import com.facebook.internal.p1894a.p1896b.C24677a;
import com.facebook.p1814a.p1815a.C23871c;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.a.p */
public class C24002p {

    /* renamed from: a */
    public static AtomicBoolean f56818a = new AtomicBoolean(false);

    /* renamed from: b */
    static final ConcurrentHashMap<String, String> f56819b = new ConcurrentHashMap<>();

    /* renamed from: c */
    private static final String f56820c = C24002p.class.getSimpleName();

    /* renamed from: d */
    private static SharedPreferences f56821d;

    /* renamed from: e */
    private static final ConcurrentHashMap<String, String> f56822e = new ConcurrentHashMap<>();

    /* renamed from: c */
    static /* synthetic */ AtomicBoolean m45398c() {
        if (C24677a.m47209a(C24002p.class)) {
            return null;
        }
        try {
            return f56818a;
        } catch (Throwable th) {
            C24677a.m47208a(th, C24002p.class);
            return null;
        }
    }

    /* renamed from: d */
    static /* synthetic */ SharedPreferences m45399d() {
        if (C24677a.m47209a(C24002p.class)) {
            return null;
        }
        try {
            return f56821d;
        } catch (Throwable th) {
            C24677a.m47208a(th, C24002p.class);
            return null;
        }
    }

    static {
        Covode.recordClassIndex(28123);
    }

    /* renamed from: a */
    public static String m45395a() {
        if (C24677a.m47209a(C24002p.class)) {
            return null;
        }
        try {
            if (!f56818a.get()) {
                m45397b();
            }
            HashMap hashMap = new HashMap();
            hashMap.putAll(f56822e);
            hashMap.putAll(m45400e());
            return C24693ad.m47238a(hashMap);
        } catch (Throwable th) {
            C24677a.m47208a(th, C24002p.class);
            return null;
        }
    }

    /* renamed from: e */
    private static Map<String, String> m45400e() {
        if (C24677a.m47209a(C24002p.class)) {
            return null;
        }
        try {
            HashMap hashMap = new HashMap();
            Set<String> e = C23871c.m45132e();
            for (String str : f56819b.keySet()) {
                if (e.contains(str)) {
                    hashMap.put(str, f56819b.get(str));
                }
            }
            return hashMap;
        } catch (Throwable th) {
            C24677a.m47208a(th, C24002p.class);
            return null;
        }
    }

    /* renamed from: b */
    public static synchronized void m45397b() {
        synchronized (C24002p.class) {
            MethodCollector.m26663i(6748);
            if (C24677a.m47209a(C24002p.class)) {
                MethodCollector.m26664o(6748);
                return;
            }
            try {
                if (f56818a.get()) {
                    MethodCollector.m26664o(6748);
                    return;
                }
                C24699ae.m47299a();
                SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(C24872m.f59047g);
                f56821d = defaultSharedPreferences;
                String string = defaultSharedPreferences.getString("com.facebook.appevents.UserDataStore.userData", "");
                String string2 = f56821d.getString("com.facebook.appevents.UserDataStore.internalUserData", "");
                f56822e.putAll(C24693ad.m47282e(string));
                f56819b.putAll(C24693ad.m47282e(string2));
                f56818a.set(true);
                MethodCollector.m26664o(6748);
            } catch (Throwable th) {
                C24677a.m47208a(th, C24002p.class);
                MethodCollector.m26664o(6748);
            }
        }
    }

    /* renamed from: a */
    static String m45396a(String str, String str2) {
        String str3;
        if (C24677a.m47209a(C24002p.class)) {
            return null;
        }
        try {
            String lowerCase = str2.trim().toLowerCase();
            if ("em".equals(str)) {
                if (Patterns.EMAIL_ADDRESS.matcher(lowerCase).matches()) {
                    return lowerCase;
                }
                return "";
            } else if ("ph".equals(str)) {
                return lowerCase.replaceAll("[^0-9]", "");
            } else {
                if (!"ge".equals(str)) {
                    return lowerCase;
                }
                if (lowerCase.length() > 0) {
                    str3 = lowerCase.substring(0, 1);
                } else {
                    str3 = "";
                }
                if ("f".equals(str3) || "m".equals(str3)) {
                    return str3;
                }
                return "";
            }
        } catch (Throwable th) {
            C24677a.m47208a(th, C24002p.class);
            return null;
        }
    }
}
