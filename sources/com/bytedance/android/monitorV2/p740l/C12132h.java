package com.bytedance.android.monitorV2.p740l;

import com.bytedance.android.monitorV2.HybridMultiMonitor;
import com.bytedance.apm.C12397c;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.monitorV2.l.h */
public final class C12132h {
    static {
        Covode.recordClassIndex(13861);
    }

    /* renamed from: a */
    public static String m21661a() {
        try {
            return C12130f.m21657c(C12397c.f29936f, "version_name");
        } catch (Exception unused) {
            HybridMultiMonitor.getInstance().getExceptionHandler();
            return "";
        }
    }

    /* renamed from: b */
    public static int m21662b() {
        try {
            return C12130f.m21647a(C12397c.f29936f, "version_code");
        } catch (Exception unused) {
            HybridMultiMonitor.getInstance().getExceptionHandler();
            return 0;
        }
    }
}
