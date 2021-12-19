package com.bytedance.android.live.core.p218f.p222c;

import android.os.Build;
import android.text.TextUtils;
import com.bytedance.android.live.core.p218f.C3904ad;
import com.bytedance.covode.number.Covode;
import p4623i.p4624a.p4625a.p4626a.p4627a.C89392a;

/* renamed from: com.bytedance.android.live.core.f.c.b */
public final class C3930b extends C89392a {

    /* renamed from: a */
    private static String f10809a;

    /* renamed from: b */
    private static String f10810b;

    /* renamed from: c */
    private static boolean f10811c;

    static {
        boolean z;
        Covode.recordClassIndex(4459);
        if (Build.VERSION.SDK_INT >= 23) {
            z = true;
        } else {
            z = false;
        }
        f10811c = z;
    }

    /* renamed from: a */
    public static String m9570a() {
        if (f10809a == null) {
            if (!TextUtils.isEmpty(C3904ad.m9536a("ro.miui.ui.version.name"))) {
                f10810b = C3904ad.m9536a("ro.miui.ui.version.name");
                f10809a = "MIUI";
            } else if (!TextUtils.isEmpty(C3904ad.m9536a("ro.build.version.emui"))) {
                f10810b = C3904ad.m9536a("ro.build.version.emui");
                f10809a = "EMUI";
            } else if (!TextUtils.isEmpty(C3904ad.m9536a("ro.build.version.opporom"))) {
                f10810b = C3904ad.m9536a("ro.build.version.opporom");
                f10809a = "OPPO";
            } else if (!TextUtils.isEmpty(C3904ad.m9536a("ro.vivo.os.version"))) {
                f10810b = C3904ad.m9536a("ro.vivo.os.version");
                f10809a = "VIVO";
            } else if (!TextUtils.isEmpty(C3904ad.m9536a("ro.smartisan.version"))) {
                f10810b = C3904ad.m9536a("ro.smartisan.version");
                f10809a = "SMARTISAN";
            } else {
                String str = Build.DISPLAY;
                f10810b = str;
                if (str.toUpperCase().contains("FLYME")) {
                    f10809a = "FLYME";
                } else {
                    f10810b = "unknown";
                    f10809a = Build.MANUFACTURER.toUpperCase();
                }
            }
            f10809a.equals("");
        }
        return f10809a;
    }
}
