package com.bytedance.push.p1600k;

import android.os.Build;
import com.bytedance.common.utility.C13627m;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.common.util.C29843f;

/* renamed from: com.bytedance.push.k.d */
public class C21858d {

    /* renamed from: a */
    public static String f51781a;

    /* renamed from: b */
    private static final String f51782b;

    /* renamed from: c */
    private static final C21860f f51783c;

    /* renamed from: d */
    private static String f51784d;

    /* renamed from: a */
    public static boolean m40949a() {
        if (!C29843f.m60136c()) {
            return false;
        }
        try {
            if (Integer.parseInt(f51783c.mo35538a("ro.miui.ui.version.name").substring(1)) >= 12) {
                return true;
            }
            return false;
        } catch (Exception unused) {
        }
    }

    /* renamed from: b */
    private static boolean m40950b() {
        String str = Build.MANUFACTURER;
        if (!C13627m.m24498a(str)) {
            return str.toLowerCase().contains("oppo");
        }
        return false;
    }

    /* renamed from: c */
    private static boolean m40951c() {
        try {
            String a = f51783c.mo35538a("ro.build.version.emui");
            f51784d = a;
            if (C13627m.m24498a(a)) {
                return false;
            }
            f51784d = f51784d.toLowerCase();
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    static {
        Covode.recordClassIndex(25510);
        String valueOf = String.valueOf(Build.VERSION.SDK);
        f51782b = valueOf;
        C21860f fVar = new C21860f();
        f51783c = fVar;
        f51781a = valueOf;
        try {
            if (m40951c()) {
                if (C13627m.m24498a(f51784d)) {
                    f51784d = fVar.mo35538a("ro.build.version.emui");
                }
                String lowerCase = (f51784d + "_" + Build.DISPLAY).toLowerCase();
                if (!C13627m.m24498a(lowerCase)) {
                    valueOf = lowerCase.toLowerCase();
                }
            } else {
                String a = fVar.mo35538a("ro.vivo.os.build.display.id");
                if (!C13627m.m24498a(a) && a.toLowerCase().contains("funtouch")) {
                    valueOf = (fVar.mo35538a("ro.vivo.os.build.display.id") + "_" + fVar.mo35538a("ro.vivo.product.version")).toLowerCase();
                } else if (m40950b()) {
                    if (m40950b()) {
                        valueOf = ("coloros_" + fVar.mo35538a("ro.build.version.opporom") + "_" + Build.DISPLAY).toLowerCase();
                    }
                } else if (C29843f.m60136c()) {
                    valueOf = ("miui_" + fVar.mo35538a("ro.miui.ui.version.name") + "_" + Build.VERSION.INCREMENTAL).toLowerCase();
                }
            }
        } catch (Throwable unused) {
            valueOf = null;
        }
        if (C13627m.m24498a(valueOf)) {
            valueOf = f51782b;
        }
        f51781a = valueOf;
    }
}
